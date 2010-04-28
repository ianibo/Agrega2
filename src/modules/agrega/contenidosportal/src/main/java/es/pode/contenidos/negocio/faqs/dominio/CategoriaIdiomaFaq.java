// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * 
 */
public abstract class CategoriaIdiomaFaq
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 4907686768740702246L;

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

    private java.lang.String nombre;

    /**
     * 
     */
    public java.lang.String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(java.lang.String nombre)
    {
        this.nombre = nombre;
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

    /**
     * Returns <code>true</code> if the argument is an CategoriaIdiomaFaq instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof CategoriaIdiomaFaq))
        {
            return false;
        }
        final CategoriaIdiomaFaq that = (CategoriaIdiomaFaq)object;
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
     * Constructs new instances of {@link es.pode.contenidos.negocio.faqs.dominio.CategoriaIdiomaFaq}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.contenidos.negocio.faqs.dominio.CategoriaIdiomaFaq}.
         */
        public static es.pode.contenidos.negocio.faqs.dominio.CategoriaIdiomaFaq newInstance()
        {
            return new es.pode.contenidos.negocio.faqs.dominio.CategoriaIdiomaFaqImpl();
        }
    }

// HibernateEntity.vsl merge-point
}