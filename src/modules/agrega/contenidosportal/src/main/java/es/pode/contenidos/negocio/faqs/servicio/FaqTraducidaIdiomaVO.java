// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.contenidos.negocio.faqs.servicio;

/**
 * 
 */
public class FaqTraducidaIdiomaVO
    implements java.io.Serializable
{

    public FaqTraducidaIdiomaVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public FaqTraducidaIdiomaVO(
        java.lang.Long id,
        java.lang.String pregunta,
        java.lang.String respuesta,
        java.lang.String idioma,
        java.lang.String categoria,
        java.lang.Integer posicion,
        java.util.Date fechaPublicacion,
        java.lang.Long idCategoria)

    {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.idioma = idioma;
        this.categoria = categoria;
        this.posicion = posicion;
        this.fechaPublicacion = fechaPublicacion;
        this.idCategoria = idCategoria;
    }

    /**
     * Copies constructor from other FaqTraducidaIdiomaVO
     */
    public FaqTraducidaIdiomaVO(FaqTraducidaIdiomaVO otherBean)
    {
        if (otherBean != null)
        {
            this.id = otherBean.getId();
            this.pregunta = otherBean.getPregunta();
            this.respuesta = otherBean.getRespuesta();
            this.idioma = otherBean.getIdioma();
            this.categoria = otherBean.getCategoria();
            this.posicion = otherBean.getPosicion();
            this.fechaPublicacion = otherBean.getFechaPublicacion();
            this.idCategoria = otherBean.getIdCategoria();
        }
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String pregunta;

    /**
     * 
     */
    public java.lang.String getPregunta()
    {
        return this.pregunta;
    }

    public void setPregunta(java.lang.String pregunta)
    {
        this.pregunta = pregunta;
    }

    private java.lang.String respuesta;

    /**
     * 
     */
    public java.lang.String getRespuesta()
    {
        return this.respuesta;
    }

    public void setRespuesta(java.lang.String respuesta)
    {
        this.respuesta = respuesta;
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

    private java.lang.String categoria;

    /**
     * 
     */
    public java.lang.String getCategoria()
    {
        return this.categoria;
    }

    public void setCategoria(java.lang.String categoria)
    {
        this.categoria = categoria;
    }

    private java.lang.Integer posicion;

    /**
     * 
     */
    public java.lang.Integer getPosicion()
    {
        return this.posicion;
    }

    public void setPosicion(java.lang.Integer posicion)
    {
        this.posicion = posicion;
    }

    private java.util.Date fechaPublicacion;

    /**
     * 
     */
    public java.util.Date getFechaPublicacion()
    {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(java.util.Date fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    private java.lang.Long idCategoria;

    /**
     * 
     */
    public java.lang.Long getIdCategoria()
    {
        return this.idCategoria;
    }

    public void setIdCategoria(java.lang.Long idCategoria)
    {
        this.idCategoria = idCategoria;
    }

}