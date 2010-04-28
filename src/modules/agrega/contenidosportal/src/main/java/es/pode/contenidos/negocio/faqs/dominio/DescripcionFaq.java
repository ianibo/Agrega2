// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * 
 */
public abstract class DescripcionFaq
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -5586152931661849879L;

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

    /**
     * Returns <code>true</code> if the argument is an DescripcionFaq instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof DescripcionFaq))
        {
            return false;
        }
        final DescripcionFaq that = (DescripcionFaq)object;
        if (this.id == null || that.id == null || !this.id.equals(that.id))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq}.
         */
        public static es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq newInstance()
        {
            return new es.pode.contenidos.negocio.faqs.dominio.DescripcionFaqImpl();
        }
    }

// HibernateEntity.vsl merge-point
}