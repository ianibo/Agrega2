// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * 
 */
public class RegistroTareaEjecPlanVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public RegistroTareaEjecPlanVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param descripcion  Descripción de la subtarea del trabajo ejecutado
     * @param fecha  Fecha de ejecución de la subtarea ejecutada
     * @param id  Identificador de la subtarea
     * @param estado  Estado de la subtarea ejecutada
     * @param codigo  Codigo de respuesta de la validación del ODE
     */
    public RegistroTareaEjecPlanVO(
        java.lang.String descripcion,
        java.util.Calendar fecha,
        java.lang.Long id,
        java.lang.String estado,
        java.lang.String codigo)

    {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.id = id;
        this.estado = estado;
        this.codigo = codigo;
    }

    /**
     * Copies constructor from other RegistroTareaEjecPlanVO
     * @param otherBean RegistroTareaEjecPlanVO 
     */
    public RegistroTareaEjecPlanVO(RegistroTareaEjecPlanVO otherBean)
    {
        if (otherBean != null)
        {
            this.descripcion = otherBean.getDescripcion();
            this.fecha = otherBean.getFecha();
            this.id = otherBean.getId();
            this.estado = otherBean.getEstado();
            this.codigo = otherBean.getCodigo();
        }
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripción de la subtarea del trabajo ejecutado
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    /**
   * <p>
   * Descripción de la subtarea del trabajo ejecutado
   * </p>
     *  @param descripcion  Descripción de la subtarea del trabajo ejecutado  
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.util.Calendar fecha;

    /**
     * <p>
     * Fecha de ejecución de la subtarea ejecutada
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFecha()
    {
        return this.fecha;
    }

    /**
   * <p>
   * Fecha de ejecución de la subtarea ejecutada
   * </p>
     *  @param fecha  Fecha de ejecución de la subtarea ejecutada  
     */
    public void setFecha(java.util.Calendar fecha)
    {
        this.fecha = fecha;
    }

    private java.lang.Long id;

    /**
     * <p>
     * Identificador de la subtarea
     * </p>
     * @return java.lang.Long
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    /**
   * <p>
   * Identificador de la subtarea
   * </p>
     *  @param id  Identificador de la subtarea  
     */
    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String estado;

    /**
     * <p>
     * Estado de la subtarea ejecutada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getEstado()
    {
        return this.estado;
    }

    /**
   * <p>
   * Estado de la subtarea ejecutada
   * </p>
     *  @param estado  Estado de la subtarea ejecutada  
     */
    public void setEstado(java.lang.String estado)
    {
        this.estado = estado;
    }

    private java.lang.String codigo;

    /**
     * <p>
     * Codigo de respuesta de la validación del ODE
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getCodigo()
    {
        return this.codigo;
    }

    /**
   * <p>
   * Codigo de respuesta de la validación del ODE
   * </p>
     *  @param codigo  Codigo de respuesta de la validación del ODE  
     */
    public void setCodigo(java.lang.String codigo)
    {
        this.codigo = codigo;
    }

}