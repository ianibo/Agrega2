// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.contenidos.negocio.noticias.servicio;

/**
 * <p>
 * Value Object conteniendo la imagen de noticias suministrada para
 * su almacenaje..
 * </p>
 */
public class ImagenVO
    implements java.io.Serializable
{

    public ImagenVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public ImagenVO(
        java.lang.String nombre,
        java.lang.String mimeType,
        javax.activation.DataHandler datos)

    {
        this.nombre = nombre;
        this.mimeType = mimeType;
        this.datos = datos;
    }

    /**
     * Copies constructor from other ImagenVO
     */
    public ImagenVO(ImagenVO otherBean)
    {
        if (otherBean != null)
        {
            this.nombre = otherBean.getNombre();
            this.mimeType = otherBean.getMimeType();
            this.datos = otherBean.getDatos();
        }
    }

    private java.lang.String nombre;

    /**
     * <p>
     * Nombre de la imagen.
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

    private java.lang.String mimeType;

    /**
     * <p>
     * Tipo mime
     * </p>
     */
    public java.lang.String getMimeType()
    {
        return this.mimeType;
    }

    public void setMimeType(java.lang.String mimeType)
    {
        this.mimeType = mimeType;
    }

    private javax.activation.DataHandler datos;

    /**
     * <p>
     * DataHandler conteniendo la imagen serializada.
     * </p>
     */
    public javax.activation.DataHandler getDatos()
    {
        return this.datos;
    }

    public void setDatos(javax.activation.DataHandler datos)
    {
        this.datos = datos;
    }

}