// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.buscar.negocio.monitorizar.dominio;

/**
 * 
 */
public class EstadoNodoVO
    implements java.io.Serializable
{

    public EstadoNodoVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public EstadoNodoVO(
        java.lang.String nodo,
        java.lang.String estado,
        java.lang.String nombreServicio,
        java.lang.String descripcionServicio,
        java.lang.String urlWS)

    {
        this.nodo = nodo;
        this.estado = estado;
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.urlWS = urlWS;
    }

    /**
     * Copies constructor from other EstadoNodoVO
     */
    public EstadoNodoVO(EstadoNodoVO otherBean)
    {
        if (otherBean != null)
        {
            this.nodo = otherBean.getNodo();
            this.estado = otherBean.getEstado();
            this.nombreServicio = otherBean.getNombreServicio();
            this.descripcionServicio = otherBean.getDescripcionServicio();
            this.urlWS = otherBean.getUrlWS();
        }
    }

    private java.lang.String nodo;

    /**
     * 
     */
    public java.lang.String getNodo()
    {
        return this.nodo;
    }

    public void setNodo(java.lang.String nodo)
    {
        this.nodo = nodo;
    }

    private java.lang.String estado;

    /**
     * 
     */
    public java.lang.String getEstado()
    {
        return this.estado;
    }

    public void setEstado(java.lang.String estado)
    {
        this.estado = estado;
    }

    private java.lang.String nombreServicio;

    /**
     * 
     */
    public java.lang.String getNombreServicio()
    {
        return this.nombreServicio;
    }

    public void setNombreServicio(java.lang.String nombreServicio)
    {
        this.nombreServicio = nombreServicio;
    }

    private java.lang.String descripcionServicio;

    /**
     * 
     */
    public java.lang.String getDescripcionServicio()
    {
        return this.descripcionServicio;
    }

    public void setDescripcionServicio(java.lang.String descripcionServicio)
    {
        this.descripcionServicio = descripcionServicio;
    }

    private java.lang.String urlWS;

    /**
     * 
     */
    public java.lang.String getUrlWS()
    {
        return this.urlWS;
    }

    public void setUrlWS(java.lang.String urlWS)
    {
        this.urlWS = urlWS;
    }

}