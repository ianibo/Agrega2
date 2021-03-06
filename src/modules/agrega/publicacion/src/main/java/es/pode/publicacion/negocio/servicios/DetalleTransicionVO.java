// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.publicacion.negocio.servicios;

/**
 * <p>
 * Este value object contiene la informacion de detalle que se
 * necesita para una transicion.
 * </p>
 */
public class DetalleTransicionVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public DetalleTransicionVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param titulo  Titulo del ODE.
     * @param fechaTransicion  Fecha en la que se realizo la transicion.
     */
    public DetalleTransicionVO(
        java.lang.String titulo,
        java.util.Calendar fechaTransicion)

    {
        this.titulo = titulo;
        this.fechaTransicion = fechaTransicion;
    }

    /**
     * Copies constructor from other DetalleTransicionVO
     * @param otherBean DetalleTransicionVO 
     */
    public DetalleTransicionVO(DetalleTransicionVO otherBean)
    {
        if (otherBean != null)
        {
            this.titulo = otherBean.getTitulo();
            this.fechaTransicion = otherBean.getFechaTransicion();
        }
    }

    private java.lang.String titulo;

    /**
     * <p>
     * Titulo del ODE.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    /**
   * <p>
   * Titulo del ODE.
   * </p>
     *  @param titulo  Titulo del ODE.  
     */
    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

    private java.util.Calendar fechaTransicion;

    /**
     * <p>
     * Fecha en la que se realizo la transicion.
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaTransicion()
    {
        return this.fechaTransicion;
    }

    /**
   * <p>
   * Fecha en la que se realizo la transicion.
   * </p>
     *  @param fechaTransicion  Fecha en la que se realizo la transicion.  
     */
    public void setFechaTransicion(java.util.Calendar fechaTransicion)
    {
        this.fechaTransicion = fechaTransicion;
    }

}