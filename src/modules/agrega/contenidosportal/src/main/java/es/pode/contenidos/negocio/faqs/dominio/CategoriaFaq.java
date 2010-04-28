// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * 
 */
public abstract class CategoriaFaq
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -8391406240378973850L;

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
     * <p>
     * el nombre de la categoria de la faq
     * </p>
     */
    public java.lang.String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(java.lang.String nombre)
    {
        this.nombre = nombre;
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

    private java.util.Date fechaModificacion;

    /**
     * 
     */
    public java.util.Date getFechaModificacion()
    {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(java.util.Date fechaModificacion)
    {
        this.fechaModificacion = fechaModificacion;
    }

    private java.util.Date fechaAlta;

    /**
     * 
     */
    public java.util.Date getFechaAlta()
    {
        return this.fechaAlta;
    }

    public void setFechaAlta(java.util.Date fechaAlta)
    {
        this.fechaAlta = fechaAlta;
    }

    private java.util.Collection categoriaIdioma = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getCategoriaIdioma()
    {
        return this.categoriaIdioma;
    }

    public void setCategoriaIdioma(java.util.Collection categoriaIdioma)
    {
        this.categoriaIdioma = categoriaIdioma;
    }

    /**
     * Returns <code>true</code> if the argument is an CategoriaFaq instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof CategoriaFaq))
        {
            return false;
        }
        final CategoriaFaq that = (CategoriaFaq)object;
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
     * Constructs new instances of {@link es.pode.contenidos.negocio.faqs.dominio.CategoriaFaq}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.contenidos.negocio.faqs.dominio.CategoriaFaq}.
         */
        public static es.pode.contenidos.negocio.faqs.dominio.CategoriaFaq newInstance()
        {
            return new es.pode.contenidos.negocio.faqs.dominio.CategoriaFaqImpl();
        }
    }

// HibernateEntity.vsl merge-point
}