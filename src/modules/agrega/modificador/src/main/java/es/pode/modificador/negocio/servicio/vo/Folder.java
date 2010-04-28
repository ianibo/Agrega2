// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.modificador.negocio.servicio.vo;

/**
 * 
 */
public class Folder
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public Folder()
    {
    }

    /**
     * Constructor taking all properties.
     * @param path  
     * @param titulo  
     */
    public Folder(
        java.lang.String path,
        java.lang.String titulo)

    {
        this.path = path;
        this.titulo = titulo;
    }

    /**
     * Copies constructor from other Folder
     * @param otherBean Folder 
     */
    public Folder(Folder otherBean)
    {
        if (otherBean != null)
        {
            this.path = otherBean.getPath();
            this.titulo = otherBean.getTitulo();
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

    private java.lang.String titulo;

    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

}