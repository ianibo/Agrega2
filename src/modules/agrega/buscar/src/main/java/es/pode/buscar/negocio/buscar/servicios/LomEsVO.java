// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.buscar.negocio.buscar.servicios;

/**
 * <p>
 * Objeto de valor que contiene los datos LOMES mas relevantes de
 * un VO.
 * </p>
 */
public class LomEsVO
    implements java.io.Serializable
{

    public LomEsVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public LomEsVO(
        java.lang.String lomES,
        java.lang.Integer ranking,
        java.lang.String titulo,
        java.lang.String descripcion,
        java.lang.String nodo,
        java.lang.String localizacion)

    {
        this.lomES = lomES;
        this.ranking = ranking;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nodo = nodo;
        this.localizacion = localizacion;
    }

    /**
     * Copies constructor from other LomEsVO
     */
    public LomEsVO(LomEsVO otherBean)
    {
        if (otherBean != null)
        {
            this.lomES = otherBean.getLomES();
            this.ranking = otherBean.getRanking();
            this.titulo = otherBean.getTitulo();
            this.descripcion = otherBean.getDescripcion();
            this.nodo = otherBean.getNodo();
            this.localizacion = otherBean.getLocalizacion();
        }
    }

    private java.lang.String lomES;

    /**
     * <p>
     * LOM-ES del resultado.
     * </p>
     */
    public java.lang.String getLomES()
    {
        return this.lomES;
    }

    public void setLomES(java.lang.String lomES)
    {
        this.lomES = lomES;
    }

    private java.lang.Integer ranking;

    /**
     * <p>
     * Valor del ranking del resultado.
     * </p>
     */
    public java.lang.Integer getRanking()
    {
        return this.ranking;
    }

    public void setRanking(java.lang.Integer ranking)
    {
        this.ranking = ranking;
    }

    private java.lang.String titulo;

    /**
     * <p>
     * Titulo del lomes.
     * </p>
     */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripcion del lomes.
     * </p>
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String nodo;

    /**
     * <p>
     * Identificador del nodo que produjo los resultados.
     * </p>
     */
    public java.lang.String getNodo()
    {
        return this.nodo;
    }

    public void setNodo(java.lang.String nodo)
    {
        this.nodo = nodo;
    }

    private java.lang.String localizacion;

    /**
     * <p>
     * La localizacion del nodo SQI
     * </p>
     */
    public java.lang.String getLocalizacion()
    {
        return this.localizacion;
    }

    public void setLocalizacion(java.lang.String localizacion)
    {
        this.localizacion = localizacion;
    }

}