// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * 
 */
public class TareaEjecutadaPlanVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public TareaEjecutadaPlanVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param id  Identificador del trabajo planificado ejecutado
     * @param trabajo  Trabajo planificado ejecutado
     * @param grupoTrabajo  Grupo de trabajo de la tarea planificada
     * @param descripcion  Descripción de la tarea planificada ejecutada
     * @param fechaInicio  Fecha de inicio de la tarea de la tarea planificada
     * @param fechaFin  Fecha de finalización de la tarea ejecutada
     * @param usuario  Identificador del usuario
     * @param estado  Estado de la tarea planificada ejecutada
     */
    public TareaEjecutadaPlanVO(
        java.lang.Long id,
        java.lang.String trabajo,
        java.lang.String grupoTrabajo,
        java.lang.String descripcion,
        java.util.Calendar fechaInicio,
        java.util.Calendar fechaFin,
        java.lang.String usuario,
        java.lang.String estado)

    {
        this.id = id;
        this.trabajo = trabajo;
        this.grupoTrabajo = grupoTrabajo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.estado = estado;
    }

    /**
     * Copies constructor from other TareaEjecutadaPlanVO
     * @param otherBean TareaEjecutadaPlanVO 
     */
    public TareaEjecutadaPlanVO(TareaEjecutadaPlanVO otherBean)
    {
        if (otherBean != null)
        {
            this.id = otherBean.getId();
            this.trabajo = otherBean.getTrabajo();
            this.grupoTrabajo = otherBean.getGrupoTrabajo();
            this.descripcion = otherBean.getDescripcion();
            this.fechaInicio = otherBean.getFechaInicio();
            this.fechaFin = otherBean.getFechaFin();
            this.usuario = otherBean.getUsuario();
            this.estado = otherBean.getEstado();
        }
    }

    private java.lang.Long id;

    /**
     * <p>
     * Identificador del trabajo planificado ejecutado
     * </p>
     * @return java.lang.Long
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    /**
   * <p>
   * Identificador del trabajo planificado ejecutado
   * </p>
     *  @param id  Identificador del trabajo planificado ejecutado  
     */
    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String trabajo;

    /**
     * <p>
     * Trabajo planificado ejecutado
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTrabajo()
    {
        return this.trabajo;
    }

    /**
   * <p>
   * Trabajo planificado ejecutado
   * </p>
     *  @param trabajo  Trabajo planificado ejecutado  
     */
    public void setTrabajo(java.lang.String trabajo)
    {
        this.trabajo = trabajo;
    }

    private java.lang.String grupoTrabajo;

    /**
     * <p>
     * Grupo de trabajo de la tarea planificada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getGrupoTrabajo()
    {
        return this.grupoTrabajo;
    }

    /**
   * <p>
   * Grupo de trabajo de la tarea planificada
   * </p>
     *  @param grupoTrabajo  Grupo de trabajo de la tarea planificada  
     */
    public void setGrupoTrabajo(java.lang.String grupoTrabajo)
    {
        this.grupoTrabajo = grupoTrabajo;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripción de la tarea planificada ejecutada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    /**
   * <p>
   * Descripción de la tarea planificada ejecutada
   * </p>
     *  @param descripcion  Descripción de la tarea planificada ejecutada  
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.util.Calendar fechaInicio;

    /**
     * <p>
     * Fecha de inicio de la tarea de la tarea planificada
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicio()
    {
        return this.fechaInicio;
    }

    /**
   * <p>
   * Fecha de inicio de la tarea de la tarea planificada
   * </p>
     *  @param fechaInicio  Fecha de inicio de la tarea de la tarea planificada  
     */
    public void setFechaInicio(java.util.Calendar fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    private java.util.Calendar fechaFin;

    /**
     * <p>
     * Fecha de finalización de la tarea ejecutada
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaFin()
    {
        return this.fechaFin;
    }

    /**
   * <p>
   * Fecha de finalización de la tarea ejecutada
   * </p>
     *  @param fechaFin  Fecha de finalización de la tarea ejecutada  
     */
    public void setFechaFin(java.util.Calendar fechaFin)
    {
        this.fechaFin = fechaFin;
    }

    private java.lang.String usuario;

    /**
     * <p>
     * Identificador del usuario
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getUsuario()
    {
        return this.usuario;
    }

    /**
   * <p>
   * Identificador del usuario
   * </p>
     *  @param usuario  Identificador del usuario  
     */
    public void setUsuario(java.lang.String usuario)
    {
        this.usuario = usuario;
    }

    private java.lang.String estado;

    /**
     * <p>
     * Estado de la tarea planificada ejecutada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getEstado()
    {
        return this.estado;
    }

    /**
   * <p>
   * Estado de la tarea planificada ejecutada
   * </p>
     *  @param estado  Estado de la tarea planificada ejecutada  
     */
    public void setEstado(java.lang.String estado)
    {
        this.estado = estado;
    }

}