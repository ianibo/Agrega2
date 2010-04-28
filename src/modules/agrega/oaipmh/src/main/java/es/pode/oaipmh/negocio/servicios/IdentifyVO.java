// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.oaipmh.negocio.servicios;

/**
 * <p>
 * Value Object con el resultado de la llamada del m�todo Identify.
 * </p>
 * <p>
 * Se puede inlcuir un campo descripci�n, pero para nuestro
 * repositorio no se va a implementar. Para su implementacion
 * consultar:
 * </p>
 * <p>
 * http://www.openarchives.org/OAI/2.0/guidelines.htm
 * </p>
 */
public class IdentifyVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public IdentifyVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param nombreRepositorio  Nombre del repositorio
     * @param urlRepositorio  Url base del repositorio
     * @param versionProtocolo  Versi�n del protocolo oai-pmh
     * @param fechaInicioRepositorio  Fecha de inicio del repositorio
     * @param politicaBorrado  Pol�tica de borrado que sigue el repositorio, puede tener los siguientes valores: no, transient, persistent
     * @param temporalidad  Formato de fechas utilizadas para filtrar las b�squedas en el repositorio
     * @param emailAdmin  Email del administrador del repositorio. �En nuestro caso ser� el mismo que el correo de un administrador de la aplicaci�n?
     * @param descripcionOaiIdentifier  Descripcion del identificador OAI. Contiene tres caracter�sticas:
 Esquema: oai
 Identificador del repositorio: agrega.es
 Delimitador:":"
 Ejemplo del identificador
     */
    public IdentifyVO(
        java.lang.String nombreRepositorio,
        java.lang.String urlRepositorio,
        java.lang.String versionProtocolo,
        java.lang.String fechaInicioRepositorio,
        java.lang.String politicaBorrado,
        java.lang.String temporalidad,
        java.lang.String emailAdmin,
        es.pode.oaipmh.negocio.servicios.DescripcionOaiIdentifierVO descripcionOaiIdentifier)

    {
        this.nombreRepositorio = nombreRepositorio;
        this.urlRepositorio = urlRepositorio;
        this.versionProtocolo = versionProtocolo;
        this.fechaInicioRepositorio = fechaInicioRepositorio;
        this.politicaBorrado = politicaBorrado;
        this.temporalidad = temporalidad;
        this.emailAdmin = emailAdmin;
        this.descripcionOaiIdentifier = descripcionOaiIdentifier;
    }

    /**
     * Copies constructor from other IdentifyVO
     * @param otherBean IdentifyVO 
     */
    public IdentifyVO(IdentifyVO otherBean)
    {
        if (otherBean != null)
        {
            this.nombreRepositorio = otherBean.getNombreRepositorio();
            this.urlRepositorio = otherBean.getUrlRepositorio();
            this.versionProtocolo = otherBean.getVersionProtocolo();
            this.fechaInicioRepositorio = otherBean.getFechaInicioRepositorio();
            this.politicaBorrado = otherBean.getPoliticaBorrado();
            this.temporalidad = otherBean.getTemporalidad();
            this.emailAdmin = otherBean.getEmailAdmin();
            this.descripcionOaiIdentifier = otherBean.getDescripcionOaiIdentifier();
        }
    }

    private java.lang.String nombreRepositorio;

    /**
     * <p>
     * Nombre del repositorio
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getNombreRepositorio()
    {
        return this.nombreRepositorio;
    }

    /**
   * <p>
   * Nombre del repositorio
   * </p>
     *  @param nombreRepositorio  Nombre del repositorio  
     */
    public void setNombreRepositorio(java.lang.String nombreRepositorio)
    {
        this.nombreRepositorio = nombreRepositorio;
    }

    private java.lang.String urlRepositorio;

    /**
     * <p>
     * Url base del repositorio
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getUrlRepositorio()
    {
        return this.urlRepositorio;
    }

    /**
   * <p>
   * Url base del repositorio
   * </p>
     *  @param urlRepositorio  Url base del repositorio  
     */
    public void setUrlRepositorio(java.lang.String urlRepositorio)
    {
        this.urlRepositorio = urlRepositorio;
    }

    private java.lang.String versionProtocolo;

    /**
     * <p>
     * Versi�n del protocolo oai-pmh
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getVersionProtocolo()
    {
        return this.versionProtocolo;
    }

    /**
   * <p>
   * Versi�n del protocolo oai-pmh
   * </p>
     *  @param versionProtocolo  Versi�n del protocolo oai-pmh  
     */
    public void setVersionProtocolo(java.lang.String versionProtocolo)
    {
        this.versionProtocolo = versionProtocolo;
    }

    private java.lang.String fechaInicioRepositorio;

    /**
     * <p>
     * Fecha de inicio del repositorio
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getFechaInicioRepositorio()
    {
        return this.fechaInicioRepositorio;
    }

    /**
   * <p>
   * Fecha de inicio del repositorio
   * </p>
     *  @param fechaInicioRepositorio  Fecha de inicio del repositorio  
     */
    public void setFechaInicioRepositorio(java.lang.String fechaInicioRepositorio)
    {
        this.fechaInicioRepositorio = fechaInicioRepositorio;
    }

    private java.lang.String politicaBorrado;

    /**
     * <p>
     * Pol�tica de borrado que sigue el repositorio, puede tener los
     * siguientes valores: no, transient, persistent
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getPoliticaBorrado()
    {
        return this.politicaBorrado;
    }

    /**
   * <p>
   * Pol�tica de borrado que sigue el repositorio, puede tener los
   * siguientes valores: no, transient, persistent
   * </p>
     *  @param politicaBorrado  Pol�tica de borrado que sigue el repositorio, puede tener los siguientes valores: no, transient, persistent  
     */
    public void setPoliticaBorrado(java.lang.String politicaBorrado)
    {
        this.politicaBorrado = politicaBorrado;
    }

    private java.lang.String temporalidad;

    /**
     * <p>
     * Formato de fechas utilizadas para filtrar las b�squedas en el
     * repositorio
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTemporalidad()
    {
        return this.temporalidad;
    }

    /**
   * <p>
   * Formato de fechas utilizadas para filtrar las b�squedas en el
   * repositorio
   * </p>
     *  @param temporalidad  Formato de fechas utilizadas para filtrar las b�squedas en el repositorio  
     */
    public void setTemporalidad(java.lang.String temporalidad)
    {
        this.temporalidad = temporalidad;
    }

    private java.lang.String emailAdmin;

    /**
     * <p>
     * Email del administrador del repositorio. �En nuestro caso ser�
     * el mismo que el correo de un administrador de la aplicaci�n?
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getEmailAdmin()
    {
        return this.emailAdmin;
    }

    /**
   * <p>
   * Email del administrador del repositorio. �En nuestro caso ser�
   * el mismo que el correo de un administrador de la aplicaci�n?
   * </p>
     *  @param emailAdmin  Email del administrador del repositorio. �En nuestro caso ser� el mismo que el correo de un administrador de la aplicaci�n?  
     */
    public void setEmailAdmin(java.lang.String emailAdmin)
    {
        this.emailAdmin = emailAdmin;
    }

    private es.pode.oaipmh.negocio.servicios.DescripcionOaiIdentifierVO descripcionOaiIdentifier;

    /**
     * <p>
     * Descripcion del identificador OAI. Contiene tres
     * caracter�sticas:
     * </p>
     * <p>
     * Esquema: oai
     * </p>
     * <p>
     * Identificador del repositorio: agrega.es
     * </p>
     * <p>
     * Delimitador:":"
     * </p>
     * <p>
     * Ejemplo del identificador
     * </p>
     * @return es.pode.oaipmh.negocio.servicios.DescripcionOaiIdentifierVO
     */
    public es.pode.oaipmh.negocio.servicios.DescripcionOaiIdentifierVO getDescripcionOaiIdentifier()
    {
        return this.descripcionOaiIdentifier;
    }

    /**
   * <p>
   * Descripcion del identificador OAI. Contiene tres
   * caracter�sticas:
   * </p>
   * <p>
   * Esquema: oai
   * </p>
   * <p>
   * Identificador del repositorio: agrega.es
   * </p>
   * <p>
   * Delimitador:":"
   * </p>
   * <p>
   * Ejemplo del identificador
   * </p>
     *  @param descripcionOaiIdentifier  Descripcion del identificador OAI. Contiene tres caracter�sticas:
 Esquema: oai
 Identificador del repositorio: agrega.es
 Delimitador:":"
 Ejemplo del identificador  
     */
    public void setDescripcionOaiIdentifier(es.pode.oaipmh.negocio.servicios.DescripcionOaiIdentifierVO descripcionOaiIdentifier)
    {
        this.descripcionOaiIdentifier = descripcionOaiIdentifier;
    }

}