// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceLocator.vsl in andromda-spring-cartridge.
//
package es.pode.empaquetador.negocio;

/**
 * Locates and provides all available application services.
 */
public class ServiceLocator
{

    private ServiceLocator()
    {
        // shouldn't be instantiated
    }

    /**
     * The shared instance of this ServiceLocator.
     */
    private final static ServiceLocator instance = new ServiceLocator();

    /**
     * Gets the shared instance of this Class
     *
     * @return the shared service locator instance.
     */
    public static final ServiceLocator instance()
    {
        return instance;
    }

    /**
     * The bean factory reference instance.
     */
    private org.springframework.beans.factory.access.BeanFactoryReference beanFactoryReference;
    
    /**
     * The bean factory reference location.
     */
    private String beanFactoryReferenceLocation;
    
    /**
     * The bean factory reference id.
     */
    private String beanRefFactoryReferenceId;

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocation the location of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocation, final String beanRefFactoryReferenceId)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocation;
        this.beanRefFactoryReferenceId = beanRefFactoryReferenceId;
        this.beanFactoryReference = null;
    }

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocation the location of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocation)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocation;
        this.beanFactoryReference = null;
    }
    
    /**
     * The default bean reference factory location.
     */
    private final String DEFAULT_BEAN_REFERENCE_LOCATION = "beanRefFactory_empaquetadorbasico.xml";
    
    /**
     * The default bean reference factory ID.
     */
    private final String DEFAULT_BEAN_REFERENCE_ID = "beanRefFactory";

    /**
     * Gets the Spring ApplicationContext.
     */
    protected synchronized org.springframework.context.ApplicationContext getContext()
    {
        if (this.beanFactoryReference == null)
        {
            if (this.beanFactoryReferenceLocation == null)
            {
                this.beanFactoryReferenceLocation = DEFAULT_BEAN_REFERENCE_LOCATION;
            }
            if (this.beanRefFactoryReferenceId == null)
            {
                this.beanRefFactoryReferenceId = DEFAULT_BEAN_REFERENCE_ID;
            }
        
            org.springframework.beans.factory.access.BeanFactoryLocator beanFactoryLocator =
                org.springframework.context.access.ContextSingletonBeanFactoryLocator.getInstance(
                    this.beanFactoryReferenceLocation);
            this.beanFactoryReference = beanFactoryLocator.useBeanFactory(this.beanRefFactoryReferenceId);
        }
        return (org.springframework.context.ApplicationContext)this.beanFactoryReference.getFactory();
    }

    /**
     * Shuts down the ServiceLocator and releases any used resources.
     */
    public synchronized void shutdown()
    {
        if (this.beanFactoryReference != null)
        {
            this.beanFactoryReference.release();
            this.beanFactoryReference = null;
        }
    }

    /**
     * Gets an instance of {@link es.pode.empaquetador.negocio.servicio.SrvGestorArchivosService}.
     */
    public final es.pode.empaquetador.negocio.servicio.SrvGestorArchivosService getSrvGestorArchivosService()
    {
        return (es.pode.empaquetador.negocio.servicio.SrvGestorArchivosService)
            getContext().getBean("srvGestorArchivosService");
    }

    /**
     * Gets an instance of {@link es.pode.empaquetador.negocio.servicio.SrvGestorManifestService}.
     */
    public final es.pode.empaquetador.negocio.servicio.SrvGestorManifestService getSrvGestorManifestService()
    {
        return (es.pode.empaquetador.negocio.servicio.SrvGestorManifestService)
            getContext().getBean("srvGestorManifestService");
    }

    /**
     * Gets an instance of {@link es.pode.empaquetador.negocio.servicio.SrvEmpaquetadorBasicoService}.
     */
    public final es.pode.empaquetador.negocio.servicio.SrvEmpaquetadorBasicoService getSrvEmpaquetadorBasicoService()
    {
        return (es.pode.empaquetador.negocio.servicio.SrvEmpaquetadorBasicoService)
            getContext().getBean("srvEmpaquetadorBasicoService");
    }

    /**
     * Gets an instance of {@link es.pode.empaquetador.negocio.servicio.SrvFachadaAgregarService}.
     */
    public final es.pode.empaquetador.negocio.servicio.SrvFachadaAgregarService getSrvFachadaAgregarService()
    {
        return (es.pode.empaquetador.negocio.servicio.SrvFachadaAgregarService)
            getContext().getBean("srvFachadaAgregarService");
    }



    /**
     * Gets an instance of {@link es.pode.parseadorXML.SCORM2004Dao}.  
     */
    //public final es.pode.empaquetador.negocio.externos.ScormDao getScormDao()
    public final es.pode.parseadorXML.SCORM2004Dao getScormDao()
    {
        
        
        return (es.pode.parseadorXML.SCORM2004Dao)
            getContext().getBean("ScormDao");
    }

    /**
     * Gets an instance of {@link es.pode.soporte.zip.TrueZipDaoImpl}.  
     */
    //public final es.pode.empaquetador.negocio.externos.ZipDao getZipDao()
    public final es.pode.soporte.zip.TrueZipDaoImpl getZipDao()
    {
        
        
        return (es.pode.soporte.zip.TrueZipDaoImpl)
            getContext().getBean("ZipDao");
    }

    /**
     * Gets an instance of {@link es.pode.empaquetador.negocio.gestionficheros.FicheroDaoImpl}.  
     */
    //public final es.pode.empaquetador.negocio.externos.FicheroDao getFicheroDao()
    public final es.pode.empaquetador.negocio.gestionficheros.FicheroDaoImpl getFicheroDao()
    {
        
        
        return (es.pode.empaquetador.negocio.gestionficheros.FicheroDaoImpl)
            getContext().getBean("FicheroDao");
    }


	/**
	 * Gets the reference to the dozer bean mapper used in the application (singleton).
	 * @return MapperIF
	 */
    public final net.sf.dozer.util.mapping.MapperIF getBeanMapper()
    {
        return (net.sf.dozer.util.mapping.MapperIF) 
                           getContext().getBean("beanMapper");
    }
}