// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.buscar.negocio.nodosSQI.servicio;

/**
 * <p>
 * Describe un nodo de tipo SQI
 * </p>
 */
public class NodoDescripcionSQIVO
    implements java.io.Serializable
{

    public NodoDescripcionSQIVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public NodoDescripcionSQIVO(
        java.lang.String descripcionNodo,
        java.lang.Long id,
        java.lang.String nombreNodo)

    {
        this.descripcionNodo = descripcionNodo;
        this.id = id;
        this.nombreNodo = nombreNodo;
    }

    /**
     * Copies constructor from other NodoDescripcionSQIVO
     */
    public NodoDescripcionSQIVO(NodoDescripcionSQIVO otherBean)
    {
        if (otherBean != null)
        {
            this.descripcionNodo = otherBean.getDescripcionNodo();
            this.id = otherBean.getId();
            this.nombreNodo = otherBean.getNombreNodo();
        }
    }

    private java.lang.String descripcionNodo;

    /**
     * <p>
     * La descripcion o "nombre" del nodo
     * </p>
     */
    public java.lang.String getDescripcionNodo()
    {
        return this.descripcionNodo;
    }

    public void setDescripcionNodo(java.lang.String descripcionNodo)
    {
        this.descripcionNodo = descripcionNodo;
    }

    private java.lang.Long id;

    /**
     * <p>
     * El identificador del nodo
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

    private java.lang.String nombreNodo;

    /**
     * <p>
     * El nombre del nodo de tipo SQI
     * </p>
     */
    public java.lang.String getNombreNodo()
    {
        return this.nombreNodo;
    }

    public void setNombreNodo(java.lang.String nombreNodo)
    {
        this.nombreNodo = nombreNodo;
    }

}