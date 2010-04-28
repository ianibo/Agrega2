// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.auditoria.negocio.servicios;

/**
 * <p>
 * VO con el n�mero de odes que hay en cada rama del �rbol
 * curricular
 * </p>
 */
public class CoberturaCurricularContenido
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public CoberturaCurricularContenido()
    {
    }

    /**
     * Constructor taking all properties.
     * @param coberturaCurricular  Identificador del �rbol curricular
     * @param totalOdes  N�mero de odes existentes en la rama del �rbol curricular
     */
    public CoberturaCurricularContenido(
        java.lang.String coberturaCurricular,
        long totalOdes)

    {
        this.coberturaCurricular = coberturaCurricular;
        this.totalOdes = totalOdes;
    }

    /**
     * Copies constructor from other CoberturaCurricularContenido
     * @param otherBean CoberturaCurricularContenido 
     */
    public CoberturaCurricularContenido(CoberturaCurricularContenido otherBean)
    {
        if (otherBean != null)
        {
            this.coberturaCurricular = otherBean.getCoberturaCurricular();
            this.totalOdes = otherBean.getTotalOdes();
        }
    }

    private java.lang.String coberturaCurricular;

    /**
     * <p>
     * Identificador del �rbol curricular
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getCoberturaCurricular()
    {
        return this.coberturaCurricular;
    }

    /**
   * <p>
   * Identificador del �rbol curricular
   * </p>
     *  @param coberturaCurricular  Identificador del �rbol curricular  
     */
    public void setCoberturaCurricular(java.lang.String coberturaCurricular)
    {
        this.coberturaCurricular = coberturaCurricular;
    }

    private long totalOdes;

    /**
     * <p>
     * N�mero de odes existentes en la rama del �rbol curricular
     * </p>
     * @return long
     */
    public long getTotalOdes()
    {
        return this.totalOdes;
    }

    /**
   * <p>
   * N�mero de odes existentes en la rama del �rbol curricular
   * </p>
     *  @param totalOdes  N�mero de odes existentes en la rama del �rbol curricular  
     */
    public void setTotalOdes(long totalOdes)
    {
        this.totalOdes = totalOdes;
    }

}