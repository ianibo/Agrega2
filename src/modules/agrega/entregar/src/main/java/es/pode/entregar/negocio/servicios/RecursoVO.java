// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.entregar.negocio.servicios;

/**
 * 
 */
public class RecursoVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public RecursoVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param idRec  
     * @param hrefRec  
     */
    public RecursoVO(
        java.lang.String idRec,
        java.lang.String hrefRec)

    {
        this.idRec = idRec;
        this.hrefRec = hrefRec;
    }

    /**
     * Copies constructor from other RecursoVO
     * @param otherBean RecursoVO 
     */
    public RecursoVO(RecursoVO otherBean)
    {
        if (otherBean != null)
        {
            this.idRec = otherBean.getIdRec();
            this.hrefRec = otherBean.getHrefRec();
        }
    }

    private java.lang.String idRec;

    public java.lang.String getIdRec()
    {
        return this.idRec;
    }

    public void setIdRec(java.lang.String idRec)
    {
        this.idRec = idRec;
    }

    private java.lang.String hrefRec;

    public java.lang.String getHrefRec()
    {
        return this.hrefRec;
    }

    public void setHrefRec(java.lang.String hrefRec)
    {
        this.hrefRec = hrefRec;
    }

}