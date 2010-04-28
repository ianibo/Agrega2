// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package es.pode.valoracion.negocio.servicios;

import net.sf.dozer.util.mapping.MapperIF;

import org.apache.log4j.Logger;


/**
 * <p>
 * Spring Service base class for <code>es.pode.valoracion.negocio.servicios.SrvValoracionService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see es.pode.valoracion.negocio.servicios.SrvValoracionService
 */
public abstract class SrvValoracionServiceBase
    implements es.pode.valoracion.negocio.servicios.SrvValoracionService
{

		 protected static final Logger logger = Logger.getLogger(SrvValoracionServiceBase.class);


	
	/**
	 * Reference to the dozer bean mapper used in the application (singleton).
	 */
	private MapperIF beanMapper;
	
	/**
	 * Gets the reference to the dozer bean mapper used in the application (singleton).
	 * @return MapperIF
	 */
    protected MapperIF getBeanMapper() {
		return beanMapper;
	}

    /**
     * Sets the instance of the Dozer bean mapper to be used.
     * @param beanMapper
     */
	public void setBeanMapper(MapperIF beanMapper) {
		this.beanMapper = beanMapper;
	}


	
			
    protected final es.pode.publicacion.negocio.servicios.SrvPublicacionService getSrvPublicacionService()
	        throws java.lang.Exception
	    {
            String srvPublicacionServiceFile="importedServices.properties";	    
	          java.io.InputStream srvPublicacionServiceInputStream=SrvValoracionServiceBase.class.getClassLoader().getResourceAsStream(srvPublicacionServiceFile);
	          java.util.Properties srvPublicacionServiceProperties = new java.util.Properties();
	          srvPublicacionServiceProperties.load(srvPublicacionServiceInputStream);
	          String srvPublicacionServiceEndPointAddress="";
	          srvPublicacionServiceEndPointAddress=(String) srvPublicacionServiceProperties.get("srvPublicacionServicePort");
			  logger.debug("srvPublicacionServiceEndPointAddress del fichero --> " + srvPublicacionServiceEndPointAddress);
			  es.pode.publicacion.negocio.servicios.SrvPublicacionServiceService srvPublicacionService = new es.pode.publicacion.negocio.servicios.SrvPublicacionServiceServiceLocator();                                                                                                                                                                                                                                                    
            if (srvPublicacionServiceEndPointAddress.length()>0) 
					  ((es.pode.publicacion.negocio.servicios.SrvPublicacionServiceServiceLocator)srvPublicacionService).setSrvPublicacionServiceEndpointAddress(srvPublicacionServiceEndPointAddress);
	    	    es.pode.publicacion.negocio.servicios.SrvPublicacionService port = srvPublicacionService.getSrvPublicacionService();	    
	          return port;
	    }

    
    
    private es.pode.valoracion.negocio.dominio.ComentarioDao comentarioDao;

    /**
     * Sets the reference to <code>comentario</code>'s DAO.
     */
    public void setComentarioDao(es.pode.valoracion.negocio.dominio.ComentarioDao comentarioDao)
    {
        this.comentarioDao = comentarioDao;
    }

    /**
     * Gets the reference to <code>comentario</code>'s DAO.
     */
    protected es.pode.valoracion.negocio.dominio.ComentarioDao getComentarioDao()
    {
        return this.comentarioDao;
    }

    private es.pode.valoracion.negocio.dominio.ValoracionDao valoracionDao;

    /**
     * Sets the reference to <code>valoracion</code>'s DAO.
     */
    public void setValoracionDao(es.pode.valoracion.negocio.dominio.ValoracionDao valoracionDao)
    {
        this.valoracionDao = valoracionDao;
    }

    /**
     * Gets the reference to <code>valoracion</code>'s DAO.
     */
    protected es.pode.valoracion.negocio.dominio.ValoracionDao getValoracionDao()
    {
        return this.valoracionDao;
    }


    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#introducirComentario(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public void introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario) - 'idODE' can not be null");
        }
        if (comentario == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario) - 'comentario' can not be null");
        }
        if (idiomaODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario) - 'idiomaODE' can not be null");
        }
        if (usuario == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario) - 'usuario' can not be null");
        }
        try
        {
            this.handleIntroducirComentario(idODE, comentario, idiomaODE, usuario);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #introducirComentario(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
      */
    protected abstract void handleIntroducirComentario(java.lang.String idODE, java.lang.String comentario, java.lang.String idiomaODE, java.lang.String usuario)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#consultarValoracion(java.lang.String)
     */
    public java.lang.Float consultarValoracion(java.lang.String idODE)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.consultarValoracion(java.lang.String idODE) - 'idODE' can not be null");
        }
        try
        {
            return this.handleConsultarValoracion(idODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.consultarValoracion(java.lang.String idODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #consultarValoracion(java.lang.String)}
      */
    protected abstract java.lang.Float handleConsultarValoracion(java.lang.String idODE)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#recalcularValoracionODE(java.lang.String)
     */
    public java.lang.String recalcularValoracionODE(java.lang.String idODE)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.recalcularValoracionODE(java.lang.String idODE) - 'idODE' can not be null");
        }
        try
        {
            return this.handleRecalcularValoracionODE(idODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.recalcularValoracionODE(java.lang.String idODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #recalcularValoracionODE(java.lang.String)}
      */
    protected abstract java.lang.String handleRecalcularValoracionODE(java.lang.String idODE)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#obtenerComentarios(java.lang.String)
     */
    public es.pode.valoracion.negocio.servicios.ComentarioVO[] obtenerComentarios(java.lang.String idODE)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenerComentarios(java.lang.String idODE) - 'idODE' can not be null");
        }
        try
        {
            return this.handleObtenerComentarios(idODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenerComentarios(java.lang.String idODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #obtenerComentarios(java.lang.String)}
      */
    protected abstract es.pode.valoracion.negocio.servicios.ComentarioVO[] handleObtenerComentarios(java.lang.String idODE)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#eliminarComentarios(java.lang.Long[])
     */
    public java.lang.String eliminarComentarios(java.lang.Long[] id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarComentarios(java.lang.Long[] id) - 'id' can not be null");
        }
        try
        {
            return this.handleEliminarComentarios(id);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarComentarios(java.lang.Long[] id)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #eliminarComentarios(java.lang.Long[])}
      */
    protected abstract java.lang.String handleEliminarComentarios(java.lang.Long[] id)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#consultaValoracionDesdeHasta(java.lang.String, java.util.Calendar, java.util.Calendar)
     */
    public java.lang.Float consultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.consultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'idODE' can not be null");
        }
        if (fechaDesde == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.consultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'fechaDesde' can not be null");
        }
        if (fechaHasta == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.consultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'fechaHasta' can not be null");
        }
        try
        {
            return this.handleConsultaValoracionDesdeHasta(idODE, fechaDesde, fechaHasta);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.consultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #consultaValoracionDesdeHasta(java.lang.String, java.util.Calendar, java.util.Calendar)}
      */
    protected abstract java.lang.Float handleConsultaValoracionDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#obtenValoracionODEDesdeHasta(java.lang.String, java.util.Calendar, java.util.Calendar)
     */
    public es.pode.valoracion.negocio.servicios.auditoria.ValoracionODEVO obtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'idODE' can not be null");
        }
        if (fechaDesde == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'fechaDesde' can not be null");
        }
        if (fechaHasta == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta) - 'fechaHasta' can not be null");
        }
        try
        {
            return this.handleObtenValoracionODEDesdeHasta(idODE, fechaDesde, fechaHasta);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.obtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #obtenValoracionODEDesdeHasta(java.lang.String, java.util.Calendar, java.util.Calendar)}
      */
    protected abstract es.pode.valoracion.negocio.servicios.auditoria.ValoracionODEVO handleObtenValoracionODEDesdeHasta(java.lang.String idODE, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#introducirValoracion(java.lang.Float, java.lang.String, java.lang.String, java.lang.String)
     */
    public void introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE)
    {
        if (valoracion == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE) - 'valoracion' can not be null");
        }
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE) - 'idODE' can not be null");
        }
        if (autor == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE) - 'autor' can not be null");
        }
        if (idiomaODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE) - 'idiomaODE' can not be null");
        }
        try
        {
            this.handleIntroducirValoracion(valoracion, idODE, autor, idiomaODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.introducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #introducirValoracion(java.lang.Float, java.lang.String, java.lang.String, java.lang.String)}
      */
    protected abstract void handleIntroducirValoracion(java.lang.Float valoracion, java.lang.String idODE, java.lang.String autor, java.lang.String idiomaODE)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#eliminarTodasValoraciones(java.lang.String)
     */
    public java.lang.String eliminarTodasValoraciones(java.lang.String idODE)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarTodasValoraciones(java.lang.String idODE) - 'idODE' can not be null");
        }
        try
        {
            return this.handleEliminarTodasValoraciones(idODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarTodasValoraciones(java.lang.String idODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #eliminarTodasValoraciones(java.lang.String)}
      */
    protected abstract java.lang.String handleEliminarTodasValoraciones(java.lang.String idODE)
        throws java.lang.Exception;

    /**
     * @see es.pode.valoracion.negocio.servicios.SrvValoracionService#eliminarTodosComentarios(java.lang.String)
     */
    public java.lang.String eliminarTodosComentarios(java.lang.String idODE)
    {
        if (idODE == null)
        {
            throw new IllegalArgumentException(
                "es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarTodosComentarios(java.lang.String idODE) - 'idODE' can not be null");
        }
        try
        {
            return this.handleEliminarTodosComentarios(idODE);
        }
        catch (Throwable th)
        {
            throw new es.pode.valoracion.negocio.servicios.SrvValoracionServiceException(
                "Error performing 'es.pode.valoracion.negocio.servicios.SrvValoracionService.eliminarTodosComentarios(java.lang.String idODE)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #eliminarTodosComentarios(java.lang.String)}
      */
    protected abstract java.lang.String handleEliminarTodosComentarios(java.lang.String idODE)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return es.pode.PrincipalStore.get();
    }
}