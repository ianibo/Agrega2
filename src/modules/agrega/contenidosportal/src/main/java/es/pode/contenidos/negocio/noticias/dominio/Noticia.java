// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.contenidos.negocio.noticias.dominio;

/**
 * <p>
 * Entidad que representa una noticia persistente en base de datos.
 * La funcionalidad asociada a esta entidad permite listar las
 * entidades Noticia mediante los criterios de busqueda y
 * ordenaci�n requeridos. Esta entidad tiene una relacion (Foreign
 * Key) con la entidad Categor�a.
 * </p>
 */
public abstract class Noticia
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8060379635058200100L;

    private java.util.Date fechaPublicacion;

    /**
     * <p>
     * Fecha de publicacion de la noticia.
     * </p>
     */
    public java.util.Date getFechaPublicacion()
    {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(java.util.Date fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    private java.lang.String URLImagen;

    /**
     * <p>
     * Direccion URL de la  imagen.
     * </p>
     */
    public java.lang.String getURLImagen()
    {
        return this.URLImagen;
    }

    public void setURLImagen(java.lang.String URLImagen)
    {
        this.URLImagen = URLImagen;
    }

    private java.lang.Integer alineamientoImg;

    /**
     * <p>
     * Alineamiento de la imagen en la presentacion de la noticia. El
     * valor entero es interpretado por los modulos de presentacion
     * para alinear la imagen.
     * </p>
     */
    public java.lang.Integer getAlineamientoImg()
    {
        return this.alineamientoImg;
    }

    public void setAlineamientoImg(java.lang.Integer alineamientoImg)
    {
        this.alineamientoImg = alineamientoImg;
    }

    private java.lang.Boolean activa;

    /**
     * <p>
     * Flag que permite considerar una noticia como activa o inactiva.
     * </p>
     */
    public java.lang.Boolean getActiva()
    {
        return this.activa;
    }

    public void setActiva(java.lang.Boolean activa)
    {
        this.activa = activa;
    }

    private java.lang.Long id;

    /**
     * <p>
     * Identificador autogenerado por la base de datos.
     * </p>
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String autor;

    /**
     * 
     */
    public java.lang.String getAutor()
    {
        return this.autor;
    }

    public void setAutor(java.lang.String autor)
    {
        this.autor = autor;
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

    private java.util.Collection descripcionNoticia = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getDescripcionNoticia()
    {
        return this.descripcionNoticia;
    }

    public void setDescripcionNoticia(java.util.Collection descripcionNoticia)
    {
        this.descripcionNoticia = descripcionNoticia;
    }

    private es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia categoria;

    /**
     * <p>
     * Categoria a la que pertenece la noticia.
     * </p>
     */
    public es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia getCategoria()
    {
        return this.categoria;
    }

    public void setCategoria(es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia categoria)
    {
        this.categoria = categoria;
    }

    /**
     * Returns <code>true</code> if the argument is an Noticia instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Noticia))
        {
            return false;
        }
        final Noticia that = (Noticia)object;
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
     * Constructs new instances of {@link es.pode.contenidos.negocio.noticias.dominio.Noticia}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.contenidos.negocio.noticias.dominio.Noticia}.
         */
        public static es.pode.contenidos.negocio.noticias.dominio.Noticia newInstance()
        {
            return new es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl();
        }
    }

// HibernateEntity.vsl merge-point
}