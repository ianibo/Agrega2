// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.entregar.negocio.servicios;

/**
 * 
 */
public class PaquetePifVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public PaquetePifVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param resultadoValidacion  
     * @param href  
     */
    public PaquetePifVO(
        es.pode.entregar.negocio.servicios.CBValidoVO resultadoValidacion,
        java.lang.String href)

    {
        this.resultadoValidacion = resultadoValidacion;
        this.href = href;
    }

    /**
     * Copies constructor from other PaquetePifVO
     * @param otherBean PaquetePifVO 
     */
    public PaquetePifVO(PaquetePifVO otherBean)
    {
        if (otherBean != null)
        {
            this.resultadoValidacion = otherBean.getResultadoValidacion();
            this.href = otherBean.getHref();
        }
    }

    private es.pode.entregar.negocio.servicios.CBValidoVO resultadoValidacion;

    public es.pode.entregar.negocio.servicios.CBValidoVO getResultadoValidacion()
    {
        return this.resultadoValidacion;
    }

    public void setResultadoValidacion(es.pode.entregar.negocio.servicios.CBValidoVO resultadoValidacion)
    {
        this.resultadoValidacion = resultadoValidacion;
    }

    private java.lang.String href;

    public java.lang.String getHref()
    {
        return this.href;
    }

    public void setHref(java.lang.String href)
    {
        this.href = href;
    }

}