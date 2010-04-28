// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.adminusuarios.negocio.servicios;

/**
 * 
 */
public class GrupoTrabajoVO
    implements java.io.Serializable
{

    public GrupoTrabajoVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public GrupoTrabajoVO(
        java.lang.Long identificador,
        java.lang.String nombre,
        java.lang.String descripcion)

    {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Copies constructor from other GrupoTrabajoVO
     */
    public GrupoTrabajoVO(GrupoTrabajoVO otherBean)
    {
        if (otherBean != null)
        {
            this.identificador = otherBean.getIdentificador();
            this.nombre = otherBean.getNombre();
            this.descripcion = otherBean.getDescripcion();
        }
    }

    private java.lang.Long identificador;

    /**
     * 
     */
    public java.lang.Long getIdentificador()
    {
        return this.identificador;
    }

    public void setIdentificador(java.lang.Long identificador)
    {
        this.identificador = identificador;
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

}