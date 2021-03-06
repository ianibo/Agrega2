// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.empaquetador.negocio.servicio;

/**
 * <p>
 * Clase que representa un fichero contenido en un recurso. Se
 * mapea de la clase es.pode.parseadorXML.scorm2004.File.
 * </p>
 */
public class FileVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public FileVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param href  Ruta relativa del fichero. Se corresponde con el atributo href de la clase es.pode.parseadorXML.scorm2004.File.
     * @param url  
     * @param lom  
     */
    public FileVO(
        java.lang.String href,
        java.lang.String url,
        es.pode.empaquetador.negocio.servicio.LomVO lom)

    {
        this.href = href;
        this.url = url;
        this.lom = lom;
    }

    /**
     * Copies constructor from other FileVO
     * @param otherBean FileVO 
     */
    public FileVO(FileVO otherBean)
    {
        if (otherBean != null)
        {
            this.href = otherBean.getHref();
            this.url = otherBean.getUrl();
            this.lom = otherBean.getLom();
        }
    }

    private java.lang.String href;

    /**
     * <p>
     * Ruta relativa del fichero. Se corresponde con el atributo href
     * de la clase es.pode.parseadorXML.scorm2004.File.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getHref()
    {
        return this.href;
    }

    /**
   * <p>
   * Ruta relativa del fichero. Se corresponde con el atributo href
   * de la clase es.pode.parseadorXML.scorm2004.File.
   * </p>
     *  @param href  Ruta relativa del fichero. Se corresponde con el atributo href de la clase es.pode.parseadorXML.scorm2004.File.  
     */
    public void setHref(java.lang.String href)
    {
        this.href = href;
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

    /**
   * <p>
   * Informacion basica del Lom. Se almacenara el titulo idioma y
   * descripcion de la entidad catalogada.
   * </p>
     */
    private es.pode.empaquetador.negocio.servicio.LomVO lom;

    /**
     * Getter of lom.  
     * @return es.pode.empaquetador.negocio.servicio.LomVO  Informacion basica del Lom. Se almacenara el titulo idioma y descripcion de la entidad catalogada.
     */
    public es.pode.empaquetador.negocio.servicio.LomVO getLom()
    {
        return this.lom;
    }

  /**
   * Setter of lom  
   *  @param lom  Informacion basica del Lom. Se almacenara el titulo idioma y descripcion de la entidad catalogada. 
   */
    public void setLom(es.pode.empaquetador.negocio.servicio.LomVO lom)
    {
        this.lom = lom;
    }

}