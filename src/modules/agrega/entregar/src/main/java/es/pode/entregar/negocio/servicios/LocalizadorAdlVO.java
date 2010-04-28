// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.entregar.negocio.servicios;

/**
 * 
 */
public class LocalizadorAdlVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public LocalizadorAdlVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param path  
     * @param url  
     * @param identificador  
     * @param idUsuario  
     */
    public LocalizadorAdlVO(
        java.lang.String path,
        java.lang.String url,
        java.lang.String identificador,
        java.lang.String idUsuario)

    {
        this.path = path;
        this.url = url;
        this.identificador = identificador;
        this.idUsuario = idUsuario;
    }

    /**
     * Copies constructor from other LocalizadorAdlVO
     * @param otherBean LocalizadorAdlVO 
     */
    public LocalizadorAdlVO(LocalizadorAdlVO otherBean)
    {
        if (otherBean != null)
        {
            this.path = otherBean.getPath();
            this.url = otherBean.getUrl();
            this.identificador = otherBean.getIdentificador();
            this.idUsuario = otherBean.getIdUsuario();
        }
    }

    private java.lang.String path;

    public java.lang.String getPath()
    {
        return this.path;
    }

    public void setPath(java.lang.String path)
    {
        this.path = path;
    }

    private java.lang.String url;

    public java.lang.String getUrl()
    {
        return this.url;
    }

    public void setUrl(java.lang.String url)
    {
        this.url = url;
    }

    private java.lang.String identificador;

    public java.lang.String getIdentificador()
    {
        return this.identificador;
    }

    public void setIdentificador(java.lang.String identificador)
    {
        this.identificador = identificador;
    }

    private java.lang.String idUsuario;

    public java.lang.String getIdUsuario()
    {
        return this.idUsuario;
    }

    public void setIdUsuario(java.lang.String idUsuario)
    {
        this.idUsuario = idUsuario;
    }

}