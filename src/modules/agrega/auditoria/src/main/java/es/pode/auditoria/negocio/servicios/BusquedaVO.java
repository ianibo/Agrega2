// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * <p>
 * Informaci�n de los t�rminos buscados, se almacena el t�rmino, el
 * usuario, el �mbito (local, red o dri) y la fecha en la que ha
 * sido buscado
 * </p>
 */
public class BusquedaVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public BusquedaVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param terminoBuscado  
     * @param usuario  
     * @param tipo_busqueda  avanzada o normal
     * @param fecha  
     * @param id  
     * @param ambito_busqueda  local o federada
     * @param tipo  normal, tesauro y areaCurricular
     */
    public BusquedaVO(
        java.lang.String terminoBuscado,
        java.lang.String usuario,
        java.lang.String tipo_busqueda,
        java.util.Calendar fecha,
        java.lang.Long id,
        java.lang.String ambito_busqueda,
        java.lang.String tipo)

    {
        this.terminoBuscado = terminoBuscado;
        this.usuario = usuario;
        this.tipo_busqueda = tipo_busqueda;
        this.fecha = fecha;
        this.id = id;
        this.ambito_busqueda = ambito_busqueda;
        this.tipo = tipo;
    }

    /**
     * Copies constructor from other BusquedaVO
     * @param otherBean BusquedaVO 
     */
    public BusquedaVO(BusquedaVO otherBean)
    {
        if (otherBean != null)
        {
            this.terminoBuscado = otherBean.getTerminoBuscado();
            this.usuario = otherBean.getUsuario();
            this.tipo_busqueda = otherBean.getTipo_busqueda();
            this.fecha = otherBean.getFecha();
            this.id = otherBean.getId();
            this.ambito_busqueda = otherBean.getAmbito_busqueda();
            this.tipo = otherBean.getTipo();
        }
    }

    private java.lang.String terminoBuscado;

    public java.lang.String getTerminoBuscado()
    {
        return this.terminoBuscado;
    }

    public void setTerminoBuscado(java.lang.String terminoBuscado)
    {
        this.terminoBuscado = terminoBuscado;
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

    private java.lang.String tipo_busqueda;

    /**
     * <p>
     * avanzada o normal
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTipo_busqueda()
    {
        return this.tipo_busqueda;
    }

    /**
   * <p>
   * avanzada o normal
   * </p>
     *  @param tipo_busqueda  avanzada o normal  
     */
    public void setTipo_busqueda(java.lang.String tipo_busqueda)
    {
        this.tipo_busqueda = tipo_busqueda;
    }

    private java.util.Calendar fecha;

    public java.util.Calendar getFecha()
    {
        return this.fecha;
    }

    public void setFecha(java.util.Calendar fecha)
    {
        this.fecha = fecha;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String ambito_busqueda;

    /**
     * <p>
     * local o federada
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getAmbito_busqueda()
    {
        return this.ambito_busqueda;
    }

    /**
   * <p>
   * local o federada
   * </p>
     *  @param ambito_busqueda  local o federada  
     */
    public void setAmbito_busqueda(java.lang.String ambito_busqueda)
    {
        this.ambito_busqueda = ambito_busqueda;
    }

    private java.lang.String tipo;

    /**
     * <p>
     * normal, tesauro y areaCurricular
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTipo()
    {
        return this.tipo;
    }

    /**
   * <p>
   * normal, tesauro y areaCurricular
   * </p>
     *  @param tipo  normal, tesauro y areaCurricular  
     */
    public void setTipo(java.lang.String tipo)
    {
        this.tipo = tipo;
    }

}