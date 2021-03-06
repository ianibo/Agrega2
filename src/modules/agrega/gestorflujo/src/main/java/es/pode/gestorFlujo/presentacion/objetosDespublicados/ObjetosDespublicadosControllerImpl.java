/* Agrega es una federaci�n de repositorios de objetos digitales educativos formada por todas las Comunidades Aut�nomas propiedad de Red.es. Este c�digo ha sido desarrollado por la Entidad P�blica Empresarial red.es adscrita al Ministerio de Industria,Turismo y Comercio a trav�s de la Secretar�a de Estado de Telecomunicaciones y para la Sociedad de la Informaci�n, dentro del Programa Internet en el Aula, que se encuadra dentro de las actuaciones previstas en el Plan Avanza (Plan 2006-2010 para el desarrollo de la Sociedad de la Informaci�n y de Convergencia con Europa y entre Comunidades Aut�nomas y Ciudades Aut�nomas) y ha sido cofinanciado con fondos FEDER del Programa Operativo FEDER 2000-2006 �Sociedad de la Informaci�n�

This program is free software: you can redistribute it and/or modify it under the terms of the European Union Public Licence (EUPL v.1.0).  This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the European Union Public Licence (EUPL v.1.0). You should have received a copy of the EUPL licence along with this program.  If not, see http://ec.europa.eu/idabc/en/document/7330.
*/
// license-header java merge-point
package es.pode.gestorFlujo.presentacion.objetosDespublicados;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.GrantedAuthority;
import org.apache.commons.validator.ValidatorException;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMapping;

import es.pode.adminusuarios.negocio.servicios.SrvAdminUsuariosService;
import es.pode.publicacion.negocio.servicios.SrvPublicacionService;
import es.pode.publicacion.negocio.servicios.TransicionVO;
import es.pode.soporte.seguridad.ldap.LdapUserDetailsUtils;



/**
 * @see es.pode.gestorFlujo.presentacion.objetosDespublicados.ObjetosDespublicadosController
 */
public class ObjetosDespublicadosControllerImpl extends ObjetosDespublicadosController
{




	private Logger logger = Logger.getLogger(ObjetosDespublicadosController.class);

    /**
     * @see es.pode.gestorFlujo.presentacion.objetosDespublicados.ObjetosDespublicadosController#cargarODESDespublicados(org.apache.struts.action.ActionMapping, es.pode.gestorFlujo.presentacion.objetosDespublicados.CargarODESDespublicadosForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void cargarODESDespublicados(ActionMapping mapping,
			es.pode.gestorFlujo.presentacion.objetosDespublicados.CargarODESDespublicadosForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(logger.isDebugEnabled())
    		logger.debug("Cargando objetos Despublicados");
		SrvPublicacionService publi = this.getSrvPublicacionService();
		SrvAdminUsuariosService admin=this.getSrvAdminUsuariosService();
		TransicionVO[] odes =null;
		try {
			if(logger.isDebugEnabled())
	    		logger.debug("Recogemos los usuarios");
			String[] todosUsuariosGrupos=admin.obtenerListaUsuariosGrupoTrabajo(LdapUserDetailsUtils.getUsuario());
			
			if(todosUsuariosGrupos!=null && todosUsuariosGrupos.length>0){
				logger.info("Obtenidos lista de usuarios de los grupos pertenecientes de usuario:["+LdapUserDetailsUtils.getUsuario()+"Numero de usuarios:["+todosUsuariosGrupos.length);
				 odes = publi.obtenODEsDespublicadosPorUsuarios(todosUsuariosGrupos);
				logger.info("Obtenidos odes de esos usuarios, numero de odes despublicados ["+odes.length);
			}else{
				logger.info("Obtenidos lista de todos los ODES, pues el usuario:["+LdapUserDetailsUtils.getUsuario()+" es parte de todos los grupos");
				odes=publi.obtenODEsDespublicados();
				logger.info("Obtenidos odes de todos los usuarios, numero de odes despublicados["+odes.length);
			}
			
			form.setListaODESAsArray(odes);
		} catch (Exception ex) {
			logger.error("Imposible obtener los odes despublicados", ex);
			throw new ValidatorException("{gestorFlujo.error.inesperado}");
		}
		form.setIdUsuario(LdapUserDetailsUtils.getUsuario());

		// Como estamos en administraci�n damos por sentado que esta autenticado
		form.setTipoUsuario(tipo_usuario(LdapUserDetailsUtils.getRoles()));
		
		form.setEsDespublicado(new Boolean(true));
		logger.debug("cargarODESDespublicados-El objeto es despublicado?"+form.getEsDespublicado().booleanValue());
		logger.info("Objetos Despublicados cargados correctamente");
	}


    /**
	 * Devuelve los permisos que tiene el usuario en forma de c�digo num�rico,
	 * aunque para manejarlo mejor le damos el tipo String: 0 - ninguno 1 -
	 * catalogador 2 - publicador 3 - ambos
	 */
    private String tipo_usuario(GrantedAuthority[] tipoUsuarios) {
		int resultado = 0;
		String role_publi = "ROLE_PUBLICADOR";
		for (int i = 0; i < tipoUsuarios.length; i++) {
			if(logger.isDebugEnabled())
			logger.debug("tipo user = " + tipoUsuarios[i].getAuthority());
			if (tipoUsuarios[i].getAuthority().equalsIgnoreCase("ROLE_CATALOGADOR")) {
				if (resultado == 0) {
					resultado = 1;
				}
				// si no es 0 es que ya somos publicador
				else {
					resultado = 3;
				}
			}
			if (tipoUsuarios[i].getAuthority().equalsIgnoreCase(role_publi)) {
				if (resultado == 0) {
					resultado = 2;
				}
				// si no es 0 es que ya somos catalogador
				else {
					resultado = 3;
				}
			}
		}
		if(logger.isDebugEnabled())
		logger.debug("tipo usuario = " + resultado);
		return String.valueOf(resultado);

	}


	/**
	 * 
	 * Este m�todo sirve simplemente para resolver un bug de ibuilder: la
	 * imposibilidad de enviar en la misma llamada un idoRowSelection y otro
	 * par�metro.
	 * 
	 */
	
		public void submitArchivos(ActionMapping mapping, SubmitArchivosForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	// 		Comprobamos que hay odes seleccionados
			if (form.getIdODERowSelection()== null)
				throw new ValidatorException("{gestorFlujo.error.eliminar.seleccione}");
			form.setOrigen("despublicados");			
			String[] lOdes = new String[form.getIdODERowSelection().size()];
			form.getIdODERowSelection().toArray(lOdes);
			form.setListODEs(lOdes);			
		
		}

}