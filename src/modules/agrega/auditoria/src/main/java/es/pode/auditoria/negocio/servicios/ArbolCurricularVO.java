// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * 
 */
public class ArbolCurricularVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public ArbolCurricularVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param idNodo  identificador del nodo
     * @param nombreNodo  nombre del nodo
     */
    public ArbolCurricularVO(
        java.lang.String idNodo,
        java.lang.String nombreNodo)

    {
        this.idNodo = idNodo;
        this.nombreNodo = nombreNodo;
    }

    /**
     * Copies constructor from other ArbolCurricularVO
     * @param otherBean ArbolCurricularVO 
     */
    public ArbolCurricularVO(ArbolCurricularVO otherBean)
    {
        if (otherBean != null)
        {
            this.idNodo = otherBean.getIdNodo();
            this.nombreNodo = otherBean.getNombreNodo();
        }
    }

    private java.lang.String idNodo;

    /**
     * <p>
     * identificador del nodo
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdNodo()
    {
        return this.idNodo;
    }

    /**
   * <p>
   * identificador del nodo
   * </p>
     *  @param idNodo  identificador del nodo  
     */
    public void setIdNodo(java.lang.String idNodo)
    {
        this.idNodo = idNodo;
    }

    private java.lang.String nombreNodo;

    /**
     * <p>
     * nombre del nodo
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getNombreNodo()
    {
        return this.nombreNodo;
    }

    /**
   * <p>
   * nombre del nodo
   * </p>
     *  @param nombreNodo  nombre del nodo  
     */
    public void setNombreNodo(java.lang.String nombreNodo)
    {
        this.nombreNodo = nombreNodo;
    }

}