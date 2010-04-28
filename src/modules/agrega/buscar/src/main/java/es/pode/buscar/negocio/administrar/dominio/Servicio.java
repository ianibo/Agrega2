// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.buscar.negocio.administrar.dominio;

/**
 * 
 */
public abstract class Servicio
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8275417374388326789L;

    private java.lang.String descripcion;

    /**
     * 
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String url;

    /**
     * 
     */
    public java.lang.String getUrl()
    {
        return this.url;
    }

    public void setUrl(java.lang.String url)
    {
        this.url = url;
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

    /**
     * Returns <code>true</code> if the argument is an Servicio instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Servicio))
        {
            return false;
        }
        final Servicio that = (Servicio)object;
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
     * Constructs new instances of {@link es.pode.buscar.negocio.administrar.dominio.Servicio}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.buscar.negocio.administrar.dominio.Servicio}.
         */
        public static es.pode.buscar.negocio.administrar.dominio.Servicio newInstance()
        {
            return new es.pode.buscar.negocio.administrar.dominio.ServicioImpl();
        }
    }

// HibernateEntity.vsl merge-point
}