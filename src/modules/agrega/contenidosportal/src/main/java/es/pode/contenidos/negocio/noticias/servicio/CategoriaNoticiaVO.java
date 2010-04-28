// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.contenidos.negocio.noticias.servicio;

/**
 * <p>
 * VO que encapsula la informaci�n de una categor�a de la noticias.
 * </p>
 */
public class CategoriaNoticiaVO
    implements java.io.Serializable
{

    public CategoriaNoticiaVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public CategoriaNoticiaVO(
        java.lang.Long id,
        java.lang.String nombre,
        java.util.Date fechaPublicacion,
        java.util.Date fechaBaja,
        java.util.Date fechaModificacion,
        es.pode.contenidos.negocio.noticias.servicio.CategoriaIdiomaNoticiaVO[] categoriaIdioma)

    {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaBaja = fechaBaja;
        this.fechaModificacion = fechaModificacion;
        this.categoriaIdioma = categoriaIdioma;
    }

    /**
     * Copies constructor from other CategoriaNoticiaVO
     */
    public CategoriaNoticiaVO(CategoriaNoticiaVO otherBean)
    {
        if (otherBean != null)
        {
            this.id = otherBean.getId();
            this.nombre = otherBean.getNombre();
            this.fechaPublicacion = otherBean.getFechaPublicacion();
            this.fechaBaja = otherBean.getFechaBaja();
            this.fechaModificacion = otherBean.getFechaModificacion();
            this.categoriaIdioma = otherBean.getCategoriaIdioma();
        }
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

    private java.lang.String nombre;

    /**
     * <p>
     * Nombre de la categor�a.
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

    private java.util.Date fechaPublicacion;

    /**
     * <p>
     * Fecha de creaci�n de la categor�a noticia.
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

    private java.util.Date fechaBaja;

    /**
     * <p>
     * Fecha de baja de la categor�a noticia.
     * </p>
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
     * <p>
     * Fecha de modificaci�n de la categor�a noticia.
     * </p>
     */
    public java.util.Date getFechaModificacion()
    {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(java.util.Date fechaModificacion)
    {
        this.fechaModificacion = fechaModificacion;
    }

    private es.pode.contenidos.negocio.noticias.servicio.CategoriaIdiomaNoticiaVO[] categoriaIdioma;

    /**
     * Get the categoriaIdioma
     * 
     */
    public es.pode.contenidos.negocio.noticias.servicio.CategoriaIdiomaNoticiaVO[] getCategoriaIdioma()
    {
        return this.categoriaIdioma;
    }

    /**
     * Set the categoriaIdioma
     */
    public void setCategoriaIdioma(es.pode.contenidos.negocio.noticias.servicio.CategoriaIdiomaNoticiaVO[] categoriaIdioma)
    {
        this.categoriaIdioma = categoriaIdioma;
    }

}