// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.planificador.negocio.servicios;

/**
 * 
 */
public class TareaInformesVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public TareaInformesVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param trabajo  Nombre de la tarea creada
     * @param grupoTrabajo  Nombre del grupo del trabajo si viene a nulo se le asigna uno por defecto
     * @param trigger  Nombre del disparador
     * @param grupoTrigger  Nombre del grupo del disparador. Si viene a nulo se le asigna uno por defecto.
     * @param cron  Cron
     * @param fechaInicio  Fecha de inicio de la tarea
     * @param periodicidad  Periodicidad
     * @param usuario  Usuario que crea la tarea
     * @param tipoTarea  Identificador de la tarea
     * @param msgInforme  Mensaje de la generaci�n del informe
     * @param msgNoInforme  Mensaje de no generaci�n del informe
     * @param msgDescripcionTrabajo  Mensaje de descripci�n de la generaci�n del informe
     * @param informe  Identificador del tipo de informe
     * @param fechaDesde  Fecha de inico del informe
     * @param fechaHasta  Fecha de finalizaci�n del informe
     * @param usuarioInforme  Algunos informes se muestran por usuario
     * @param rango  Algunos informes se les especifica un rango
     * @param formato  Formato de salida del informe
     * @param error  Error
     */
    public TareaInformesVO(
        java.lang.String trabajo,
        java.lang.String grupoTrabajo,
        java.lang.String trigger,
        java.lang.String grupoTrigger,
        java.lang.String cron,
        java.util.Calendar fechaInicio,
        java.lang.String periodicidad,
        java.lang.String usuario,
        java.lang.String tipoTarea,
        java.lang.String msgInforme,
        java.lang.String msgNoInforme,
        java.lang.String msgDescripcionTrabajo,
        java.lang.String informe,
        java.util.Calendar fechaDesde,
        java.util.Calendar fechaHasta,
        java.lang.String usuarioInforme,
        java.lang.Integer rango,
        java.lang.String formato,
        java.lang.String error)

    {
        this.trabajo = trabajo;
        this.grupoTrabajo = grupoTrabajo;
        this.trigger = trigger;
        this.grupoTrigger = grupoTrigger;
        this.cron = cron;
        this.fechaInicio = fechaInicio;
        this.periodicidad = periodicidad;
        this.usuario = usuario;
        this.tipoTarea = tipoTarea;
        this.msgInforme = msgInforme;
        this.msgNoInforme = msgNoInforme;
        this.msgDescripcionTrabajo = msgDescripcionTrabajo;
        this.informe = informe;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.usuarioInforme = usuarioInforme;
        this.rango = rango;
        this.formato = formato;
        this.error = error;
    }

    /**
     * Copies constructor from other TareaInformesVO
     * @param otherBean TareaInformesVO 
     */
    public TareaInformesVO(TareaInformesVO otherBean)
    {
        if (otherBean != null)
        {
            this.trabajo = otherBean.getTrabajo();
            this.grupoTrabajo = otherBean.getGrupoTrabajo();
            this.trigger = otherBean.getTrigger();
            this.grupoTrigger = otherBean.getGrupoTrigger();
            this.cron = otherBean.getCron();
            this.fechaInicio = otherBean.getFechaInicio();
            this.periodicidad = otherBean.getPeriodicidad();
            this.usuario = otherBean.getUsuario();
            this.tipoTarea = otherBean.getTipoTarea();
            this.msgInforme = otherBean.getMsgInforme();
            this.msgNoInforme = otherBean.getMsgNoInforme();
            this.msgDescripcionTrabajo = otherBean.getMsgDescripcionTrabajo();
            this.informe = otherBean.getInforme();
            this.fechaDesde = otherBean.getFechaDesde();
            this.fechaHasta = otherBean.getFechaHasta();
            this.usuarioInforme = otherBean.getUsuarioInforme();
            this.rango = otherBean.getRango();
            this.formato = otherBean.getFormato();
            this.error = otherBean.getError();
        }
    }

    private java.lang.String trabajo;

    /**
     * <p>
     * Nombre de la tarea creada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTrabajo()
    {
        return this.trabajo;
    }

    /**
   * <p>
   * Nombre de la tarea creada
   * </p>
     *  @param trabajo  Nombre de la tarea creada  
     */
    public void setTrabajo(java.lang.String trabajo)
    {
        this.trabajo = trabajo;
    }

    private java.lang.String grupoTrabajo;

    /**
     * <p>
     * Nombre del grupo del trabajo si viene a nulo se le asigna uno
     * por defecto
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getGrupoTrabajo()
    {
        return this.grupoTrabajo;
    }

    /**
   * <p>
   * Nombre del grupo del trabajo si viene a nulo se le asigna uno
   * por defecto
   * </p>
     *  @param grupoTrabajo  Nombre del grupo del trabajo si viene a nulo se le asigna uno por defecto  
     */
    public void setGrupoTrabajo(java.lang.String grupoTrabajo)
    {
        this.grupoTrabajo = grupoTrabajo;
    }

    private java.lang.String trigger;

    /**
     * <p>
     * Nombre del disparador
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTrigger()
    {
        return this.trigger;
    }

    /**
   * <p>
   * Nombre del disparador
   * </p>
     *  @param trigger  Nombre del disparador  
     */
    public void setTrigger(java.lang.String trigger)
    {
        this.trigger = trigger;
    }

    private java.lang.String grupoTrigger;

    /**
     * <p>
     * Nombre del grupo del disparador. Si viene a nulo se le asigna
     * uno por defecto.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getGrupoTrigger()
    {
        return this.grupoTrigger;
    }

    /**
   * <p>
   * Nombre del grupo del disparador. Si viene a nulo se le asigna
   * uno por defecto.
   * </p>
     *  @param grupoTrigger  Nombre del grupo del disparador. Si viene a nulo se le asigna uno por defecto.  
     */
    public void setGrupoTrigger(java.lang.String grupoTrigger)
    {
        this.grupoTrigger = grupoTrigger;
    }

    private java.lang.String cron;

    /**
     * <p>
     * Cron
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getCron()
    {
        return this.cron;
    }

    /**
   * <p>
   * Cron
   * </p>
     *  @param cron  Cron  
     */
    public void setCron(java.lang.String cron)
    {
        this.cron = cron;
    }

    private java.util.Calendar fechaInicio;

    /**
     * <p>
     * Fecha de inicio de la tarea
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicio()
    {
        return this.fechaInicio;
    }

    /**
   * <p>
   * Fecha de inicio de la tarea
   * </p>
     *  @param fechaInicio  Fecha de inicio de la tarea  
     */
    public void setFechaInicio(java.util.Calendar fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    private java.lang.String periodicidad;

    /**
     * <p>
     * Periodicidad
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getPeriodicidad()
    {
        return this.periodicidad;
    }

    /**
   * <p>
   * Periodicidad
   * </p>
     *  @param periodicidad  Periodicidad  
     */
    public void setPeriodicidad(java.lang.String periodicidad)
    {
        this.periodicidad = periodicidad;
    }

    private java.lang.String usuario;

    /**
     * <p>
     * Usuario que crea la tarea
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getUsuario()
    {
        return this.usuario;
    }

    /**
   * <p>
   * Usuario que crea la tarea
   * </p>
     *  @param usuario  Usuario que crea la tarea  
     */
    public void setUsuario(java.lang.String usuario)
    {
        this.usuario = usuario;
    }

    private java.lang.String tipoTarea;

    /**
     * <p>
     * Identificador de la tarea
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTipoTarea()
    {
        return this.tipoTarea;
    }

    /**
   * <p>
   * Identificador de la tarea
   * </p>
     *  @param tipoTarea  Identificador de la tarea  
     */
    public void setTipoTarea(java.lang.String tipoTarea)
    {
        this.tipoTarea = tipoTarea;
    }

    private java.lang.String msgInforme;

    /**
     * <p>
     * Mensaje de la generaci�n del informe
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getMsgInforme()
    {
        return this.msgInforme;
    }

    /**
   * <p>
   * Mensaje de la generaci�n del informe
   * </p>
     *  @param msgInforme  Mensaje de la generaci�n del informe  
     */
    public void setMsgInforme(java.lang.String msgInforme)
    {
        this.msgInforme = msgInforme;
    }

    private java.lang.String msgNoInforme;

    /**
     * <p>
     * Mensaje de no generaci�n del informe
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getMsgNoInforme()
    {
        return this.msgNoInforme;
    }

    /**
   * <p>
   * Mensaje de no generaci�n del informe
   * </p>
     *  @param msgNoInforme  Mensaje de no generaci�n del informe  
     */
    public void setMsgNoInforme(java.lang.String msgNoInforme)
    {
        this.msgNoInforme = msgNoInforme;
    }

    private java.lang.String msgDescripcionTrabajo;

    /**
     * <p>
     * Mensaje de descripci�n de la generaci�n del informe
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getMsgDescripcionTrabajo()
    {
        return this.msgDescripcionTrabajo;
    }

    /**
   * <p>
   * Mensaje de descripci�n de la generaci�n del informe
   * </p>
     *  @param msgDescripcionTrabajo  Mensaje de descripci�n de la generaci�n del informe  
     */
    public void setMsgDescripcionTrabajo(java.lang.String msgDescripcionTrabajo)
    {
        this.msgDescripcionTrabajo = msgDescripcionTrabajo;
    }

    private java.lang.String informe;

    /**
     * <p>
     * Identificador del tipo de informe
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getInforme()
    {
        return this.informe;
    }

    /**
   * <p>
   * Identificador del tipo de informe
   * </p>
     *  @param informe  Identificador del tipo de informe  
     */
    public void setInforme(java.lang.String informe)
    {
        this.informe = informe;
    }

    private java.util.Calendar fechaDesde;

    /**
     * <p>
     * Fecha de inico del informe
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaDesde()
    {
        return this.fechaDesde;
    }

    /**
   * <p>
   * Fecha de inico del informe
   * </p>
     *  @param fechaDesde  Fecha de inico del informe  
     */
    public void setFechaDesde(java.util.Calendar fechaDesde)
    {
        this.fechaDesde = fechaDesde;
    }

    private java.util.Calendar fechaHasta;

    /**
     * <p>
     * Fecha de finalizaci�n del informe
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaHasta()
    {
        return this.fechaHasta;
    }

    /**
   * <p>
   * Fecha de finalizaci�n del informe
   * </p>
     *  @param fechaHasta  Fecha de finalizaci�n del informe  
     */
    public void setFechaHasta(java.util.Calendar fechaHasta)
    {
        this.fechaHasta = fechaHasta;
    }

    private java.lang.String usuarioInforme;

    /**
     * <p>
     * Algunos informes se muestran por usuario
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getUsuarioInforme()
    {
        return this.usuarioInforme;
    }

    /**
   * <p>
   * Algunos informes se muestran por usuario
   * </p>
     *  @param usuarioInforme  Algunos informes se muestran por usuario  
     */
    public void setUsuarioInforme(java.lang.String usuarioInforme)
    {
        this.usuarioInforme = usuarioInforme;
    }

    private java.lang.Integer rango;

    /**
     * <p>
     * Algunos informes se les especifica un rango
     * </p>
     * @return java.lang.Integer
     */
    public java.lang.Integer getRango()
    {
        return this.rango;
    }

    /**
   * <p>
   * Algunos informes se les especifica un rango
   * </p>
     *  @param rango  Algunos informes se les especifica un rango  
     */
    public void setRango(java.lang.Integer rango)
    {
        this.rango = rango;
    }

    private java.lang.String formato;

    /**
     * <p>
     * Formato de salida del informe
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getFormato()
    {
        return this.formato;
    }

    /**
   * <p>
   * Formato de salida del informe
   * </p>
     *  @param formato  Formato de salida del informe  
     */
    public void setFormato(java.lang.String formato)
    {
        this.formato = formato;
    }

    private java.lang.String error;

    /**
     * <p>
     * Error
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getError()
    {
        return this.error;
    }

    /**
   * <p>
   * Error
   * </p>
     *  @param error  Error  
     */
    public void setError(java.lang.String error)
    {
        this.error = error;
    }

}