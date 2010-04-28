/* Agrega es una federación de repositorios de objetos digitales educativos formada por todas las Comunidades Autónomas propiedad de Red.es. Este código ha sido desarrollado por la Entidad Pública Empresarial red.es adscrita al Ministerio de Industria,Turismo y Comercio a través de la Secretaría de Estado de Telecomunicaciones y para la Sociedad de la Información, dentro del Programa Internet en el Aula, que se encuadra dentro de las actuaciones previstas en el Plan Avanza (Plan 2006-2010 para el desarrollo de la Sociedad de la Información y de Convergencia con Europa y entre Comunidades Autónomas y Ciudades Autónomas) y ha sido cofinanciado con fondos FEDER del Programa Operativo FEDER 2000-2006 “Sociedad de la Información”

This program is free software: you can redistribute it and/or modify it under the terms of the European Union Public Licence (EUPL v.1.0).  This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the European Union Public Licence (EUPL v.1.0). You should have received a copy of the EUPL licence along with this program.  If not, see http://ec.europa.eu/idabc/en/document/7330.
*/
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package es.pode.dri.negocio.servicios.Sesion;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

import es.pode.dri.negocio.dominio.Sesion;
import es.pode.dri.negocio.dominio.SesionDao;
import es.pode.dri.negocio.servicios.SesionVO;
import es.pode.dri.negocio.servicios.DRI.SesionNoValidaException;
import es.pode.soporte.seguridad.encriptacion.Autenticar;
import es.pode.soporte.seguridad.encriptacion.EncriptacionUtiles;
import es.pode.soporte.utiles.date.DateManager;


/**
 * @see es.pode.dri.negocio.servicios.Sesion.SrvSesionesService
 */

public class SrvSesionesServiceImpl
    extends es.pode.dri.negocio.servicios.Sesion.SrvSesionesServiceBase
{
	private Logger logger = Logger.getLogger(this.getClass());
	
	private final String CLAVE_SESION_ANONIMA = "anonymous";

	private final long tiempoExpirar = 300000;

	 /**
	 * Crea una nueva sesion asociada al usuario.
	 * Chequea contra el autenticador la identidad del usuario que intenta crear una conexion.
     * @param userID Identificador del usuario. 
     * @param password Contraseña del usuario.   
     * @return se retorna el identificador de la sesión creada.
     * @throws Exception
     *      
     */
    protected java.lang.String handleCreateSession(java.lang.String userID, java.lang.String password)
        throws java.lang.Exception
    {
        //TODO Validar el usuario y la clave contra el LDAP sin utilizar la encriptación
    	//Validamos al usuaro contra el sistema.
    	String claveEncriptada = EncriptacionUtiles.encriptar(password);
    	if (Autenticar.validarUsuarioClave(userID, claveEncriptada))
    	{
    		SesionDao sesionDao = this.getSesionDao();
    		SesionVO sesionVO = new SesionVO();
    		sesionVO.setAnonima(new Boolean(false));
    		sesionVO.setFechaCreacion(DateManager.dateToCalendar(new Date(System.currentTimeMillis())));
    		sesionVO.setFechaExpiracion(DateManager.dateToCalendar(new Date(System.currentTimeMillis()+tiempoExpirar)));
    		sesionVO.setUsuario(userID);
    		sesionVO.setClave(claveEncriptada);
    		Sesion sesion = sesionDao.fromSesionVO(sesionVO);
    		sesionDao.create(sesion);
    		logger.info("Sesión creada para usuario["+userID+"] autenticado en la plataforma.");
    		return sesion.getIdSesion();
    	}
    	else // el usuario no esta autenticado en la plataforma.
    	{
    		logger.info("Sesión no creada para usuario["+userID+"] y clave["+password+"]. No esta autenticado en la plataforma.");
    		return null;
    	}
    }

    /**
	 * Crea una sesion sin usuario definido o con usuario anonimo.
     * @param no hay parámetros de entrada.      
     * @return se retorna el identificador de la sesión creada.
     * @throws Exception
     *      
     */
    protected java.lang.String handleCreateAnonymousSession()
        throws java.lang.Exception
    {
    	String anonName = "anonimo";
        SesionDao sesionDao = this.getSesionDao();
        SesionVO sesionVO = new SesionVO();
        sesionVO.setAnonima(new Boolean(true));
        sesionVO.setFechaCreacion(DateManager.dateToCalendar(new Date(System.currentTimeMillis())));
        sesionVO.setFechaExpiracion(DateManager.dateToCalendar(new Date(System.currentTimeMillis()+tiempoExpirar)));
        sesionVO.setUsuario(anonName);
        sesionVO.setClave(this.CLAVE_SESION_ANONIMA);
        Sesion sesion = sesionDao.fromSesionVO(sesionVO);
        sesionDao.create(sesion);
        logger.info("Sesión anonima creada.");
        return sesion.getIdSesion();
    }

    /**
	 * Este metodo limpia las sesiones caducadas almacenadas en la tabla de sesiones.
     * @param no hay parámetros de entrada.      
     * @return no se retorna nada.
     * @throws Exception
     *      
     */
    protected void handleLimpiarSesiones()
        throws java.lang.Exception
    {
    	SesionDao sesionDao = this.getSesionDao();
    	ArrayList allSesions = (ArrayList) sesionDao.loadAll(SesionDao.TRANSFORM_NONE);
    	for (int i=0; i<allSesions.size(); i++) {
    		Sesion sesion = (Sesion) allSesions.get(i);
    		if (sesion.getFechaExpiracion().after(new Date(System.currentTimeMillis()))) {
    			if (logger.isDebugEnabled())
    				logger.debug("Eliminado sesion caducada con fecha expiracion["+sesion.getFechaExpiracion()+"] usuario["+sesion.getUsuario()+"]");
    			sesionDao.remove(sesion);
    		}
    	}
    }

    /**
	 * Borra una sesion del sistema.
     * @param sessionID Identificador de la sesion que se quiere eliminar.     
     * @return no se retorna nada.
     * @throws Exception
     *      
     */
    protected void handleDestroySession(java.lang.String sessionID)
        throws java.lang.Exception
    {
    	SesionDao sesionDao = this.getSesionDao();
    	logger.info("Eliminando sesion con id["+sessionID+"]");
        sesionDao.remove(sessionID);
    }

    /**
	 * Este metodo devuelve una sesion.
     * @param id Identificador de la sesion.     
     * @return se retorna la sesion con el identificador.
     * @throws Exception
     *      
     */
    protected es.pode.dri.negocio.servicios.SesionVO handleConsultaSesion(java.lang.String id)
        throws java.lang.Exception
    {
        SesionDao sesionDao = this.getSesionDao();
        Sesion sesion = sesionDao.load(String.valueOf(id));
		if (sesion!=null) {
			SesionVO sesionVO = (SesionVO) sesionDao.toSesionVO(sesion);
			if (sesionVO.getFechaExpiracion().after(DateManager.dateToCalendar(new Date(System.currentTimeMillis())))) {
				sesion.setFechaExpiracion(DateManager.dateToCalendar(new Date(System.currentTimeMillis()+ tiempoExpirar)));
				sesionDao.update(sesion);
				return sesionVO;
			} else {
				SesionNoValidaException e = new SesionNoValidaException("La sesión ha expirado. ID[" + id+"]");
				logger.warn("Intento de acceso a sesión expirada id["+id+"]",e);
				throw e;
			}	
		} else {
			SesionNoValidaException e = new SesionNoValidaException("No se ha encontrado la sesión con id[" + id+"]");
			logger.warn("No se ha encontrado la sesión con id["+ id+"]", e);
			throw e;
		}
    }

    /**
	 * Este metodo modifica una sesion.
	 * Se tiene que comprobar que dicha sesion existe antes de modificarla.
     * @param sesion Sesion que se tiene que modificar con los parametros modificados.   
     * @return se retorna la sesion modificada.
     * @throws Exception
     *      
     */
    protected es.pode.dri.negocio.servicios.SesionVO handleModificarSesion(es.pode.dri.negocio.servicios.SesionVO sesion)
        throws java.lang.Exception
    {
        SesionDao sesionDao = this.getSesionDao();
        Sesion ses = sesionDao.load(sesion.getIdSesion());
        if(sesion == null)
        {
        	logger.warn("Error intentando modificar sesion con id["+sesion.getIdSesion()+"] de usuario["+sesion.getUsuario()+"]");
        	throw new SesionNoValidaException("Error intentando modificar sesion con id["+sesion.getIdSesion()+"] de usuario["+sesion.getUsuario()+"]");
        }
//        Comprobamos que existen todos los parametros que exigimos para la actualizacion de sesion
        if (sesion.getAnonima() != null && sesion.getFechaCreacion() != null && sesion.getFechaExpiracion() != null &&
        		sesion.getUsuario() != null && sesion.getClave() != null)
        {
        	ses.setAnonima(sesion.getAnonima());
        	ses.setFechaCreacion(sesion.getFechaCreacion());
        	ses.setFechaExpiracion(sesion.getFechaExpiracion());
        	ses.setUsuario(sesion.getUsuario());
        	ses.setClave(EncriptacionUtiles.encriptar(sesion.getClave()));
        	sesionDao.update(ses);
        	logger.info("Error modificando sesion con id["+sesion.getIdSesion()+"]. Algun campo requerido es vacio:anonima["+sesion.getAnonima()
        			+"], fecha creacion["+ sesion.getFechaCreacion()+"] fecha expiracion["+sesion.getFechaExpiracion()
        			+"] usuario["+sesion.getUsuario()+"] clave["+sesion.getClave()+"]");
        	return sesion;
        }
        else
        {
        	String texto = "Error modificando sesion con id["+sesion.getIdSesion()+"]. Algun campo requerido es vacio:anonima["+(sesion.getAnonima()!=null?sesion.getAnonima():null)
			+"], fecha creacion["+ (sesion.getFechaCreacion()!=null?sesion.getFechaCreacion():null)
			+"] fecha expiracion["+(sesion.getFechaExpiracion()!=null?sesion.getFechaExpiracion():null)
			+"] usuario["+(sesion.getUsuario()!=null?sesion.getUsuario():null)
			+"] clave["+(sesion.getClave()!=null?sesion.getClave():null)
			+"]";
        	logger.warn(texto);
        	throw new SesionNoValidaException(texto);
        }
        
    }
}
