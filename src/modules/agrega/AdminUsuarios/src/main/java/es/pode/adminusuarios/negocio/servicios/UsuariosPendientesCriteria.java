// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SearchCriteria.vsl in andromda-spring-cartridge.
//
package es.pode.adminusuarios.negocio.servicios;

/**
 * 
 */
public class UsuariosPendientesCriteria
    implements java.io.Serializable
{

    public UsuariosPendientesCriteria()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public UsuariosPendientesCriteria(
        java.util.Date fechaBaja,
        java.util.Date[] fechaAlta,
        java.lang.String usuario)

    {
        this.fechaBaja = fechaBaja;
        this.fechaAlta = fechaAlta;
        this.usuario = usuario;
    }

    /**
     * Copies constructor from other UsuariosPendientesCriteria
     */
    public UsuariosPendientesCriteria(UsuariosPendientesCriteria otherBean)
    {
        if (otherBean != null)
        {
            this.fechaBaja = otherBean.getFechaBaja();
            this.fechaAlta = otherBean.getFechaAlta();
            this.usuario = otherBean.getUsuario();
        }
    }

    /**
     * The first result to retrieve.
     */
    private java.lang.Integer firstResult;

    /**
     * Gets the first result to retrieve.
     *
     * @return the first result to retrieve
     */
    public java.lang.Integer getFirstResult()
    {
        return this.firstResult;
    }

    /**
     * Sets the first result to retrieve.
     *
     * @param firstResult the first result to retrieve
     */
    public void setFirstResult(java.lang.Integer firstResult)
    {
        this.firstResult = firstResult;
    }

    /**
     * The fetch size.
     */
    private java.lang.Integer fetchSize;

    /**
     * Gets the fetch size.
     *
     * @return the fetch size
     */
    public java.lang.Integer getFetchSize()
    {
        return this.fetchSize;
    }

    /**
     * Sets the fetch size.
     *
     * @param fetchSize the fetch size
     */
    public void setFetchSize(java.lang.Integer fetchSize)
    {
        this.fetchSize = fetchSize;
    }

    /**
     * The maximum size of the result set.
     */
    private java.lang.Integer maximumResultSize;

    /**
     * Gets the maximum size of the search result.
     *
     * @return the maximum size of the search result.
     */
    public java.lang.Integer getMaximumResultSize()
    {
        return this.maximumResultSize;
    }

    /**
     * Sets the maxmimum size of the result.
     *
     * @param maximumResultSize A number indicating how many results will be returned.
     */
    public void setMaximumResultSize(java.lang.Integer maximumResultSize)
    {
        this.maximumResultSize = maximumResultSize;
    }

    private java.util.Date fechaBaja;

    /**
     * 
     */
    public java.util.Date getFechaBaja()
    {
        return this.fechaBaja;
    }

    public void setFechaBaja(java.util.Date fechaBaja)
    {
        this.fechaBaja = fechaBaja;
    }

    private java.util.Date[] fechaAlta;

    /**
     * 
     */
    public java.util.Date[] getFechaAlta()
    {
        return this.fechaAlta;
    }

    public void setFechaAlta(java.util.Date[] fechaAlta)
    {
        this.fechaAlta = fechaAlta;
    }

    private java.lang.String usuario;

    /**
     * 
     */
    public java.lang.String getUsuario()
    {
        return this.usuario;
    }

    public void setUsuario(java.lang.String usuario)
    {
        this.usuario = usuario;
    }

}