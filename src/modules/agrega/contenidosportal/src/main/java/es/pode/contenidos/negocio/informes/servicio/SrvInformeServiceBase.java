// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.informes.servicio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Spring Service base class for <code>es.pode.contenidos.negocio.informes.servicio.SrvInformeService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService
 */
public abstract class SrvInformeServiceBase
    implements es.pode.contenidos.negocio.informes.servicio.SrvInformeService
{


	
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



    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#listarInformes()
     */
    public es.pode.contenidos.negocio.informes.servicio.InformeVO[] listarInformes()
    {
        try
        {
            return this.handleListarInformes();
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.listarInformes()' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #listarInformes()}
      */
    protected abstract es.pode.contenidos.negocio.informes.servicio.InformeVO[] handleListarInformes()
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#eliminarInforme(java.lang.String[])
     */
    public es.pode.contenidos.negocio.informes.servicio.ValidaBajaInformeVO eliminarInforme(java.lang.String[] ficheros)
    {
        if (ficheros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.contenidos.negocio.informes.servicio.SrvInformeService.eliminarInforme(java.lang.String[] ficheros) - 'ficheros' can not be null");
        }
        try
        {
            return this.handleEliminarInforme(ficheros);
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.eliminarInforme(java.lang.String[] ficheros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #eliminarInforme(java.lang.String[])}
      */
    protected abstract es.pode.contenidos.negocio.informes.servicio.ValidaBajaInformeVO handleEliminarInforme(java.lang.String[] ficheros)
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#recuperarInforme(java.lang.String)
     */
    public javax.activation.DataHandler recuperarInforme(java.lang.String fichero)
    {
        if (fichero == null)
        {
            throw new IllegalArgumentException(
                "es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInforme(java.lang.String fichero) - 'fichero' can not be null");
        }
        try
        {
            return this.handleRecuperarInforme(fichero);
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInforme(java.lang.String fichero)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #recuperarInforme(java.lang.String)}
      */
    protected abstract javax.activation.DataHandler handleRecuperarInforme(java.lang.String fichero)
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#listarInformesMas()
     */
    public es.pode.contenidos.negocio.informes.servicio.InformeVO[] listarInformesMas()
    {
        try
        {
            return this.handleListarInformesMas();
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.listarInformesMas()' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #listarInformesMas()}
      */
    protected abstract es.pode.contenidos.negocio.informes.servicio.InformeVO[] handleListarInformesMas()
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#recuperarInformeMas(java.lang.String)
     */
    public javax.activation.DataHandler recuperarInformeMas(java.lang.String fichero)
    {
        if (fichero == null)
        {
            throw new IllegalArgumentException(
                "es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInformeMas(java.lang.String fichero) - 'fichero' can not be null");
        }
        try
        {
            return this.handleRecuperarInformeMas(fichero);
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInformeMas(java.lang.String fichero)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #recuperarInformeMas(java.lang.String)}
      */
    protected abstract javax.activation.DataHandler handleRecuperarInformeMas(java.lang.String fichero)
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#listarInformesFederados()
     */
    public es.pode.contenidos.negocio.informes.servicio.InformeVO[] listarInformesFederados()
    {
        try
        {
            return this.handleListarInformesFederados();
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.listarInformesFederados()' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #listarInformesFederados()}
      */
    protected abstract es.pode.contenidos.negocio.informes.servicio.InformeVO[] handleListarInformesFederados()
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#eliminarInformeFederado(java.lang.String[])
     */
    public es.pode.contenidos.negocio.informes.servicio.ValidaBajaInformeVO eliminarInformeFederado(java.lang.String[] ficheros)
    {
        if (ficheros == null)
        {
            throw new IllegalArgumentException(
                "es.pode.contenidos.negocio.informes.servicio.SrvInformeService.eliminarInformeFederado(java.lang.String[] ficheros) - 'ficheros' can not be null");
        }
        try
        {
            return this.handleEliminarInformeFederado(ficheros);
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.eliminarInformeFederado(java.lang.String[] ficheros)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #eliminarInformeFederado(java.lang.String[])}
      */
    protected abstract es.pode.contenidos.negocio.informes.servicio.ValidaBajaInformeVO handleEliminarInformeFederado(java.lang.String[] ficheros)
        throws java.lang.Exception;

    /**
     * @see es.pode.contenidos.negocio.informes.servicio.SrvInformeService#recuperarInformesFederados(java.lang.String)
     */
    public javax.activation.DataHandler recuperarInformesFederados(java.lang.String fichero)
    {
        if (fichero == null)
        {
            throw new IllegalArgumentException(
                "es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInformesFederados(java.lang.String fichero) - 'fichero' can not be null");
        }
        try
        {
            return this.handleRecuperarInformesFederados(fichero);
        }
        catch (Throwable th)
        {
            throw new es.pode.contenidos.negocio.informes.servicio.SrvInformeServiceException(
                "Error performing 'es.pode.contenidos.negocio.informes.servicio.SrvInformeService.recuperarInformesFederados(java.lang.String fichero)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #recuperarInformesFederados(java.lang.String)}
      */
    protected abstract javax.activation.DataHandler handleRecuperarInformesFederados(java.lang.String fichero)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return es.pode.contenidos.negocio.PrincipalStore.get();
    }
}