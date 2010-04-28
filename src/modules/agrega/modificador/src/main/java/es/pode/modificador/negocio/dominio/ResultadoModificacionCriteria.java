// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SearchCriteria.vsl in andromda-spring-cartridge.
//
package es.pode.modificador.negocio.dominio;

/**
 * 
 */
public class ResultadoModificacionCriteria
    implements java.io.Serializable
{

  /**
   * Constructor por defecto
   */
    public ResultadoModificacionCriteria()
    {
    }

    /**
     * Constructor taking all properties.
      * @param idModificacion java.lang.Long
      * @param id java.lang.Long
     */
    public ResultadoModificacionCriteria(
        java.lang.Long idModificacion,
        java.lang.Long id)

    {
        this.idModificacion = idModificacion;
        this.id = id;
    }

    /**
     * Copies constructor from other ResultadoModificacionCriteria
      * @param otherBean ResultadoModificacionCriteria
     */
    public ResultadoModificacionCriteria(ResultadoModificacionCriteria otherBean)
    {
        if (otherBean != null)
        {
            this.idModificacion = otherBean.getIdModificacion();
            this.id = otherBean.getId();
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

    private java.lang.Long idModificacion;

    public java.lang.Long getIdModificacion()
    {
        return this.idModificacion;
    }

    public void setIdModificacion(java.lang.Long idModificacion)
    {
        this.idModificacion = idModificacion;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

}