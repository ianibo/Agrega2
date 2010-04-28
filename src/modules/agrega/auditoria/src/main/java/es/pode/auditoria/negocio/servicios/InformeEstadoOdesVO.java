// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * <p>
 * Almacena informaci�n del n�mero de odes que se encuentran en un
 * determinado estado entre dos fechas concretas.
 * </p>
 */
public class InformeEstadoOdesVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public InformeEstadoOdesVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param estadoFinal  
     * @param cantidad  
     * @param estadoTransicion  
     */
    public InformeEstadoOdesVO(
        java.lang.String estadoFinal,
        int cantidad,
        java.lang.String estadoTransicion)

    {
        this.estadoFinal = estadoFinal;
        this.cantidad = cantidad;
        this.estadoTransicion = estadoTransicion;
    }

    /**
     * Copies constructor from other InformeEstadoOdesVO
     * @param otherBean InformeEstadoOdesVO 
     */
    public InformeEstadoOdesVO(InformeEstadoOdesVO otherBean)
    {
        if (otherBean != null)
        {
            this.estadoFinal = otherBean.getEstadoFinal();
            this.cantidad = otherBean.getCantidad();
            this.estadoTransicion = otherBean.getEstadoTransicion();
        }
    }

    private java.lang.String estadoFinal;

    public java.lang.String getEstadoFinal()
    {
        return this.estadoFinal;
    }

    public void setEstadoFinal(java.lang.String estadoFinal)
    {
        this.estadoFinal = estadoFinal;
    }

    private int cantidad;

    public int getCantidad()
    {
        return this.cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    private java.lang.String estadoTransicion;

    public java.lang.String getEstadoTransicion()
    {
        return this.estadoTransicion;
    }

    public void setEstadoTransicion(java.lang.String estadoTransicion)
    {
        this.estadoTransicion = estadoTransicion;
    }

}