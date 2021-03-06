// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SearchCriteria.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * <p>
 * Criteria para la busqueda de FAQs en un intervalo de posiciones
 * dado.
 * </p>
 */
public class IntervaloCriteria
    implements java.io.Serializable
{

    public IntervaloCriteria()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public IntervaloCriteria(
        java.lang.Integer posicionInicial,
        java.lang.Integer posicionFinal,
        java.lang.String idioma)

    {
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
        this.idioma = idioma;
    }

    /**
     * Copies constructor from other IntervaloCriteria
     */
    public IntervaloCriteria(IntervaloCriteria otherBean)
    {
        if (otherBean != null)
        {
            this.posicionInicial = otherBean.getPosicionInicial();
            this.posicionFinal = otherBean.getPosicionFinal();
            this.idioma = otherBean.getIdioma();
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

    private java.lang.Integer posicionInicial;

    /**
     * <p>
     * Posicion inicial del intervalo (inclusive).
     * </p>
     */
    public java.lang.Integer getPosicionInicial()
    {
        return this.posicionInicial;
    }

    public void setPosicionInicial(java.lang.Integer posicionInicial)
    {
        this.posicionInicial = posicionInicial;
    }

    private java.lang.Integer posicionFinal;

    /**
     * <p>
     * Posicion final del intervalo (inclusive).
     * </p>
     */
    public java.lang.Integer getPosicionFinal()
    {
        return this.posicionFinal;
    }

    public void setPosicionFinal(java.lang.Integer posicionFinal)
    {
        this.posicionFinal = posicionFinal;
    }

    private java.lang.String idioma;

    /**
     * 
     */
    public java.lang.String getIdioma()
    {
        return this.idioma;
    }

    public void setIdioma(java.lang.String idioma)
    {
        this.idioma = idioma;
    }

}