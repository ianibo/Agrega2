// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package es.pode.dri.negocio.servicios.SQI;

import net.sf.dozer.util.mapping.MapperIF;

import org.apache.log4j.Logger;


/**
 * <p>
 * Spring Service base class for <code>es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService
 */
public abstract class SrvSQIAsincronoServiceBase
    implements es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService
{

		 protected static final Logger logger = Logger.getLogger(SrvSQIAsincronoServiceBase.class);


	
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


	
	        
    
	    	    private es.pode.dri.negocio.servicios.Sesion.SrvSesionesService srvSesionesService;
	
	    /**
	     * Sets the reference to <code>srvSesionesService</code>.
	     */
	    public void setSrvSesionesService(es.pode.dri.negocio.servicios.Sesion.SrvSesionesService srvSesionesService)
	    {
	        this.srvSesionesService = srvSesionesService;
	    }
	
	    /**
	     * Gets the reference to <code>srvSesionesService</code>.
	     */
	    protected es.pode.dri.negocio.servicios.Sesion.SrvSesionesService getSrvSesionesService()
	    {
	        return this.srvSesionesService;
	    }
	    
	        
    private es.pode.dri.negocio.dominio.ConsultaDao consultaDao;

    /**
     * Sets the reference to <code>consulta</code>'s DAO.
     */
    public void setConsultaDao(es.pode.dri.negocio.dominio.ConsultaDao consultaDao)
    {
        this.consultaDao = consultaDao;
    }

    /**
     * Gets the reference to <code>consulta</code>'s DAO.
     */
    protected es.pode.dri.negocio.dominio.ConsultaDao getConsultaDao()
    {
        return this.consultaDao;
    }


    /**
     * @see es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService#asynchronousQuery(java.lang.String, java.lang.String, java.lang.String)
     */
    public void asynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID)
    {
        if (targetSessionID == null)
        {
            throw new IllegalArgumentException(
                "es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService.asynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID) - 'targetSessionID' can not be null");
        }
        if (queryStatement == null)
        {
            throw new IllegalArgumentException(
                "es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService.asynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID) - 'queryStatement' can not be null");
        }
        if (queryID == null)
        {
            throw new IllegalArgumentException(
                "es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService.asynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID) - 'queryID' can not be null");
        }
        try
        {
            this.handleAsynchronousQuery(targetSessionID, queryStatement, queryID);
        }
        catch (Throwable th)
        {
            throw new es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoServiceException(
                "Error performing 'es.pode.dri.negocio.servicios.SQI.SrvSQIAsincronoService.asynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #asynchronousQuery(java.lang.String, java.lang.String, java.lang.String)}
      */
    protected abstract void handleAsynchronousQuery(java.lang.String targetSessionID, java.lang.String queryStatement, java.lang.String queryID)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return es.pode.dri.negocio.PrincipalStore.get();
    }
}