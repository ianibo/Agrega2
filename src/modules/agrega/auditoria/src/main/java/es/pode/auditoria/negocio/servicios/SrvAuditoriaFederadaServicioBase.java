// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package es.pode.auditoria.negocio.servicios;

import net.sf.dozer.util.mapping.MapperIF;

import org.apache.log4j.Logger;


/**
 * <p>
 * Spring Service base class for <code>es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio
 */
public abstract class SrvAuditoriaFederadaServicioBase
    implements es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio
{

		 protected static final Logger logger = Logger.getLogger(SrvAuditoriaFederadaServicioBase.class);


	
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


	
			
    protected final es.pode.buscar.negocio.administrar.servicio.SrvNodoService getSrvNodoService()
	        throws java.lang.Exception
	    {
            String srvNodoServiceFile="importedServices.properties";	    
	          java.io.InputStream srvNodoServiceInputStream=SrvAuditoriaFederadaServicioBase.class.getClassLoader().getResourceAsStream(srvNodoServiceFile);
	          java.util.Properties srvNodoServiceProperties = new java.util.Properties();
	          srvNodoServiceProperties.load(srvNodoServiceInputStream);
	          String srvNodoServiceEndPointAddress="";
	          srvNodoServiceEndPointAddress=(String) srvNodoServiceProperties.get("srvNodoServicePort");
			  logger.debug("srvNodoServiceEndPointAddress del fichero --> " + srvNodoServiceEndPointAddress);
			  es.pode.buscar.negocio.administrar.servicio.SrvNodoServiceService srvNodoService = new es.pode.buscar.negocio.administrar.servicio.SrvNodoServiceServiceLocator();                                                                                                                                                                                                                                                    
            if (srvNodoServiceEndPointAddress.length()>0) 
					  ((es.pode.buscar.negocio.administrar.servicio.SrvNodoServiceServiceLocator)srvNodoService).setSrvNodoServiceEndpointAddress(srvNodoServiceEndPointAddress);
	    	    es.pode.buscar.negocio.administrar.servicio.SrvNodoService port = srvNodoService.getSrvNodoService();	    
	          return port;
	    }

    
    
	
			
    protected final es.pode.indexador.negocio.servicios.auditoria.SrvAuditoriaIndexadorService getSrvAuditoriaIndexadorService()
	        throws java.lang.Exception
	    {
            String srvAuditoriaIndexadorServiceFile="importedServices.properties";	    
	          java.io.InputStream srvAuditoriaIndexadorServiceInputStream=SrvAuditoriaFederadaServicioBase.class.getClassLoader().getResourceAsStream(srvAuditoriaIndexadorServiceFile);
	          java.util.Properties srvAuditoriaIndexadorServiceProperties = new java.util.Properties();
	          srvAuditoriaIndexadorServiceProperties.load(srvAuditoriaIndexadorServiceInputStream);
	          String srvAuditoriaIndexadorServiceEndPointAddress="";
	          srvAuditoriaIndexadorServiceEndPointAddress=(String) srvAuditoriaIndexadorServiceProperties.get("srvAuditoriaIndexadorServicePort");
			  logger.debug("srvAuditoriaIndexadorServiceEndPointAddress del fichero --> " + srvAuditoriaIndexadorServiceEndPointAddress);
			  es.pode.indexador.negocio.servicios.auditoria.SrvAuditoriaIndexadorServiceService srvAuditoriaIndexadorService = new es.pode.indexador.negocio.servicios.auditoria.SrvAuditoriaIndexadorServiceServiceLocator();                                                                                                                                                                                                                                                    
            if (srvAuditoriaIndexadorServiceEndPointAddress.length()>0) 
					  ((es.pode.indexador.negocio.servicios.auditoria.SrvAuditoriaIndexadorServiceServiceLocator)srvAuditoriaIndexadorService).setSrvAuditoriaIndexadorServiceEndpointAddress(srvAuditoriaIndexadorServiceEndPointAddress);
	    	    es.pode.indexador.negocio.servicios.auditoria.SrvAuditoriaIndexadorService port = srvAuditoriaIndexadorService.getSrvAuditoriaIndexadorService();	    
	          return port;
	    }

    
    
	
			
    protected final es.pode.fuentestaxonomicas.negocio.servicio.SrvTaxonomiaService getSrvTaxonomiaService()
	        throws java.lang.Exception
	    {
            String srvTaxonomiaServiceFile="importedServices.properties";	    
	          java.io.InputStream srvTaxonomiaServiceInputStream=SrvAuditoriaFederadaServicioBase.class.getClassLoader().getResourceAsStream(srvTaxonomiaServiceFile);
	          java.util.Properties srvTaxonomiaServiceProperties = new java.util.Properties();
	          srvTaxonomiaServiceProperties.load(srvTaxonomiaServiceInputStream);
	          String srvTaxonomiaServiceEndPointAddress="";
	          srvTaxonomiaServiceEndPointAddress=(String) srvTaxonomiaServiceProperties.get("srvTaxonomiaServicePort");
			  logger.debug("srvTaxonomiaServiceEndPointAddress del fichero --> " + srvTaxonomiaServiceEndPointAddress);
			  es.pode.fuentestaxonomicas.negocio.servicio.SrvTaxonomiaServiceService srvTaxonomiaService = new es.pode.fuentestaxonomicas.negocio.servicio.SrvTaxonomiaServiceServiceLocator();                                                                                                                                                                                                                                                    
            if (srvTaxonomiaServiceEndPointAddress.length()>0) 
					  ((es.pode.fuentestaxonomicas.negocio.servicio.SrvTaxonomiaServiceServiceLocator)srvTaxonomiaService).setSrvTaxonomiaServiceEndpointAddress(srvTaxonomiaServiceEndPointAddress);
	    	    es.pode.fuentestaxonomicas.negocio.servicio.SrvTaxonomiaService port = srvTaxonomiaService.getSrvTaxonomiaService();	    
	          return port;
	    }

    
    
	
			
    protected final es.pode.publicacion.negocio.servicios.SrvAuditaPublicacionService getSrvAuditaPublicacionService()
	        throws java.lang.Exception
	    {
            String srvAuditaPublicacionServiceFile="importedServices.properties";	    
	          java.io.InputStream srvAuditaPublicacionServiceInputStream=SrvAuditoriaFederadaServicioBase.class.getClassLoader().getResourceAsStream(srvAuditaPublicacionServiceFile);
	          java.util.Properties srvAuditaPublicacionServiceProperties = new java.util.Properties();
	          srvAuditaPublicacionServiceProperties.load(srvAuditaPublicacionServiceInputStream);
	          String srvAuditaPublicacionServiceEndPointAddress="";
	          srvAuditaPublicacionServiceEndPointAddress=(String) srvAuditaPublicacionServiceProperties.get("srvAuditaPublicacionServicePort");
			  logger.debug("srvAuditaPublicacionServiceEndPointAddress del fichero --> " + srvAuditaPublicacionServiceEndPointAddress);
			  es.pode.publicacion.negocio.servicios.SrvAuditaPublicacionServiceService srvAuditaPublicacionService = new es.pode.publicacion.negocio.servicios.SrvAuditaPublicacionServiceServiceLocator();                                                                                                                                                                                                                                                    
            if (srvAuditaPublicacionServiceEndPointAddress.length()>0) 
					  ((es.pode.publicacion.negocio.servicios.SrvAuditaPublicacionServiceServiceLocator)srvAuditaPublicacionService).setSrvAuditaPublicacionServiceEndpointAddress(srvAuditaPublicacionServiceEndPointAddress);
	    	    es.pode.publicacion.negocio.servicios.SrvAuditaPublicacionService port = srvAuditaPublicacionService.getSrvAuditaPublicacionService();	    
	          return port;
	    }

    
    

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#informeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeAgregacionFederadaVO[] informeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleInformeNivelAgregacionFederado(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #informeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeAgregacionFederadaVO[] handleInformeNivelAgregacionFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#nivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeAgregacionFederadaVO nivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.nivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleNivelAgregacionFederadoLocal(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.nivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #nivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeAgregacionFederadaVO handleNivelAgregacionFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#informeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeCoberturaFederadoVO[] informeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleInformeCoberturaFederado(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #informeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeCoberturaFederadoVO[] handleInformeCoberturaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#coberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeCoberturaFederadoVO coberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.coberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleCoberturaFederadoLocal(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.coberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #coberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeCoberturaFederadoVO handleCoberturaFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#informeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeOdesPublicadosFederadaVO[] informeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleInformeOdesPublicadosFederado(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #informeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeOdesPublicadosFederadaVO[] handleInformeOdesPublicadosFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#odesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeOdesPublicadosFederadaVO odesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.odesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleOdesPublicadosFederadoLocal(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.odesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #odesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeOdesPublicadosFederadaVO handleOdesPublicadosFederadoLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#informeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeOdesIdiomaFederadoVO[] informeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleInformeOdesIdiomaFederado(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #informeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeOdesIdiomaFederadoVO[] handleInformeOdesIdiomaFederado(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * @see es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio#informeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)
     */
    public es.pode.auditoria.negocio.servicios.InformeOdesIdiomaFederadoVO informeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
    {
        if (parametros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros) - 'parametros' can not be null");
        }
        try
        {
            return this.handleInformeOdesIdiomaLocal(parametros);
        }
        catch (Throwable th)
        {
            throw new es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicioException(
                "Error performing 'es.pode.auditoria.negocio.servicios.SrvAuditoriaFederadaServicio.informeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #informeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO)}
      */
    protected abstract es.pode.auditoria.negocio.servicios.InformeOdesIdiomaFederadoVO handleInformeOdesIdiomaLocal(es.pode.auditoria.negocio.servicios.ParametrosInformeFederadoVO parametros)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return es.pode.auditoria.PrincipalStore.get();
    }
}