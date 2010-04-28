// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.publicacion.negocio.servicios;

/**
 * 
 */
public class EstadoVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public EstadoVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param nombre  Nombre del Estado.
     * @param clave  Clave del estado.
     */
    public EstadoVO(
        java.lang.String nombre,
        java.lang.String clave)

    {
        this.nombre = nombre;
        this.clave = clave;
    }

    /**
     * Copies constructor from other EstadoVO
     * @param otherBean EstadoVO 
     */
    public EstadoVO(EstadoVO otherBean)
    {
        if (otherBean != null)
        {
            this.nombre = otherBean.getNombre();
            this.clave = otherBean.getClave();
        }
    }

    private java.lang.String nombre;

    /**
     * <p>
     * Nombre del Estado.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getNombre()
    {
        return this.nombre;
    }

    /**
   * <p>
   * Nombre del Estado.
   * </p>
     *  @param nombre  Nombre del Estado.  
     */
    public void setNombre(java.lang.String nombre)
    {
        this.nombre = nombre;
    }

    private java.lang.String clave;

    /**
     * <p>
     * Clave del estado.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getClave()
    {
        return this.clave;
    }

    /**
   * <p>
   * Clave del estado.
   * </p>
     *  @param clave  Clave del estado.  
     */
    public void setClave(java.lang.String clave)
    {
        this.clave = clave;
    }

}