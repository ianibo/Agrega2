// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.planificador.negocio.servicios;

/**
 * 
 */
public class TareaModificacionVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public TareaModificacionVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param trabajo  Nombre descriptivo de la tarea
     * @param usuario  
     * @param fechaInicio  Fecha de inicio del trabajo / trigger
     * @param idModificacion  Identificador de la tarea de modificación proporcionado por el modulo 'Herramienta de modificación'
     */
    public TareaModificacionVO(
        java.lang.String trabajo,
        java.lang.String usuario,
        java.util.Calendar fechaInicio,
        java.lang.Long idModificacion)

    {
        this.trabajo = trabajo;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.idModificacion = idModificacion;
    }

    /**
     * Copies constructor from other TareaModificacionVO
     * @param otherBean TareaModificacionVO 
     */
    public TareaModificacionVO(TareaModificacionVO otherBean)
    {
        if (otherBean != null)
        {
            this.trabajo = otherBean.getTrabajo();
            this.usuario = otherBean.getUsuario();
            this.fechaInicio = otherBean.getFechaInicio();
            this.idModificacion = otherBean.getIdModificacion();
        }
    }

    private java.lang.String trabajo;

    /**
     * <p>
     * Nombre descriptivo de la tarea
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTrabajo()
    {
        return this.trabajo;
    }

    /**
   * <p>
   * Nombre descriptivo de la tarea
   * </p>
     *  @param trabajo  Nombre descriptivo de la tarea  
     */
    public void setTrabajo(java.lang.String trabajo)
    {
        this.trabajo = trabajo;
    }

    private java.lang.String usuario;

    public java.lang.String getUsuario()
    {
        return this.usuario;
    }

    public void setUsuario(java.lang.String usuario)
    {
        this.usuario = usuario;
    }

    private java.util.Calendar fechaInicio;

    /**
     * <p>
     * Fecha de inicio del trabajo / trigger
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaInicio()
    {
        return this.fechaInicio;
    }

    /**
   * <p>
   * Fecha de inicio del trabajo / trigger
   * </p>
     *  @param fechaInicio  Fecha de inicio del trabajo / trigger  
     */
    public void setFechaInicio(java.util.Calendar fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    private java.lang.Long idModificacion;

    /**
     * <p>
     * Identificador de la tarea de modificación proporcionado por el
     * modulo 'Herramienta de modificación'
     * </p>
     * @return java.lang.Long
     */
    public java.lang.Long getIdModificacion()
    {
        return this.idModificacion;
    }

    /**
   * <p>
   * Identificador de la tarea de modificación proporcionado por el
   * modulo 'Herramienta de modificación'
   * </p>
     *  @param idModificacion  Identificador de la tarea de modificación proporcionado por el modulo 'Herramienta de modificación'  
     */
    public void setIdModificacion(java.lang.Long idModificacion)
    {
        this.idModificacion = idModificacion;
    }

}