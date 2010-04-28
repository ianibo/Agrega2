// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.publicacion.negocio.servicios;

/**
 * <p>
 * Este objeto de valor representa el resultado de una operacion
 * ejecutada por el servicio de publicacion.
 * </p>
 * <p>
 * Contiene el resultado de la operacion en el caso de exito y de
 * error.
 * </p>
 */
public class ResultadoOperacionVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public ResultadoOperacionVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param idResultado  Identificador alfanumerico del tipo de incidencia que se ha detectado y que se reporta.
     * @param descripcion  Descripcion del resultado de la operacion realizada.
     * @param idODE  El identificador del ODE
     * @param tamainoODE  El tamaino que el ODE ocupa en disco.
     */
    public ResultadoOperacionVO(
        java.lang.String idResultado,
        java.lang.String descripcion,
        java.lang.String idODE,
        java.lang.Long tamainoODE)

    {
        this.idResultado = idResultado;
        this.descripcion = descripcion;
        this.idODE = idODE;
        this.tamainoODE = tamainoODE;
    }

    /**
     * Copies constructor from other ResultadoOperacionVO
     * @param otherBean ResultadoOperacionVO 
     */
    public ResultadoOperacionVO(ResultadoOperacionVO otherBean)
    {
        if (otherBean != null)
        {
            this.idResultado = otherBean.getIdResultado();
            this.descripcion = otherBean.getDescripcion();
            this.idODE = otherBean.getIdODE();
            this.tamainoODE = otherBean.getTamainoODE();
        }
    }

    private java.lang.String idResultado;

    /**
     * <p>
     * Identificador alfanumerico del tipo de incidencia que se ha
     * detectado y que se reporta.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdResultado()
    {
        return this.idResultado;
    }

    /**
   * <p>
   * Identificador alfanumerico del tipo de incidencia que se ha
   * detectado y que se reporta.
   * </p>
     *  @param idResultado  Identificador alfanumerico del tipo de incidencia que se ha detectado y que se reporta.  
     */
    public void setIdResultado(java.lang.String idResultado)
    {
        this.idResultado = idResultado;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripcion del resultado de la operacion realizada.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    /**
   * <p>
   * Descripcion del resultado de la operacion realizada.
   * </p>
     *  @param descripcion  Descripcion del resultado de la operacion realizada.  
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String idODE;

    /**
     * <p>
     * El identificador del ODE
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdODE()
    {
        return this.idODE;
    }

    /**
   * <p>
   * El identificador del ODE
   * </p>
     *  @param idODE  El identificador del ODE  
     */
    public void setIdODE(java.lang.String idODE)
    {
        this.idODE = idODE;
    }

    private java.lang.Long tamainoODE;

    /**
     * <p>
     * El tamaino que el ODE ocupa en disco.
     * </p>
     * @return java.lang.Long
     */
    public java.lang.Long getTamainoODE()
    {
        return this.tamainoODE;
    }

    /**
   * <p>
   * El tamaino que el ODE ocupa en disco.
   * </p>
     *  @param tamainoODE  El tamaino que el ODE ocupa en disco.  
     */
    public void setTamainoODE(java.lang.Long tamainoODE)
    {
        this.tamainoODE = tamainoODE;
    }

}