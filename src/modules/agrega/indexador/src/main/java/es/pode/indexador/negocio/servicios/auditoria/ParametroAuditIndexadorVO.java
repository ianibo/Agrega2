// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.indexador.negocio.servicios.auditoria;

/**
 * <p>
 * Esta clase alberta todos los parametros necesarios para la
 * ejecucion de los metodos de auditoria.
 * </p>
 */
public class ParametroAuditIndexadorVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public ParametroAuditIndexadorVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param fechaDesde  Fecha desde del periodo en el que se esta interesado.
     * @param fechaHasta  Fecha hasta del periodo en el que se esta interesado.
     * @param idNodo  Lista de identificadores de los nodos del arbol curricular del que se quiere calcular la cobertura.
     * @param idLicencias  Lista de licencias que se quieren buscar.
     */
    public ParametroAuditIndexadorVO(
        java.util.Calendar fechaDesde,
        java.util.Calendar fechaHasta,
        java.lang.String[] idNodo,
        java.lang.String[] idLicencias)

    {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.idNodo = idNodo;
        this.idLicencias = idLicencias;
    }

    /**
     * Copies constructor from other ParametroAuditIndexadorVO
     * @param otherBean ParametroAuditIndexadorVO 
     */
    public ParametroAuditIndexadorVO(ParametroAuditIndexadorVO otherBean)
    {
        if (otherBean != null)
        {
            this.fechaDesde = otherBean.getFechaDesde();
            this.fechaHasta = otherBean.getFechaHasta();
            this.idNodo = otherBean.getIdNodo();
            this.idLicencias = otherBean.getIdLicencias();
        }
    }

    private java.util.Calendar fechaDesde;

    /**
     * <p>
     * Fecha desde del periodo en el que se esta interesado.
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaDesde()
    {
        return this.fechaDesde;
    }

    /**
   * <p>
   * Fecha desde del periodo en el que se esta interesado.
   * </p>
     *  @param fechaDesde  Fecha desde del periodo en el que se esta interesado.  
     */
    public void setFechaDesde(java.util.Calendar fechaDesde)
    {
        this.fechaDesde = fechaDesde;
    }

    private java.util.Calendar fechaHasta;

    /**
     * <p>
     * Fecha hasta del periodo en el que se esta interesado.
     * </p>
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaHasta()
    {
        return this.fechaHasta;
    }

    /**
   * <p>
   * Fecha hasta del periodo en el que se esta interesado.
   * </p>
     *  @param fechaHasta  Fecha hasta del periodo en el que se esta interesado.  
     */
    public void setFechaHasta(java.util.Calendar fechaHasta)
    {
        this.fechaHasta = fechaHasta;
    }

    private java.lang.String[] idNodo;

    /**
     * <p>
     * Lista de identificadores de los nodos del arbol curricular del
     * que se quiere calcular la cobertura.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getIdNodo()
    {
        return this.idNodo;
    }

    /**
   * <p>
   * Lista de identificadores de los nodos del arbol curricular del
   * que se quiere calcular la cobertura.
   * </p>
     *  @param idNodo  Lista de identificadores de los nodos del arbol curricular del que se quiere calcular la cobertura.  
     */
    public void setIdNodo(java.lang.String[] idNodo)
    {
        this.idNodo = idNodo;
    }

    private java.lang.String[] idLicencias;

    /**
     * <p>
     * Lista de licencias que se quieren buscar.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getIdLicencias()
    {
        return this.idLicencias;
    }

    /**
   * <p>
   * Lista de licencias que se quieren buscar.
   * </p>
     *  @param idLicencias  Lista de licencias que se quieren buscar.  
     */
    public void setIdLicencias(java.lang.String[] idLicencias)
    {
        this.idLicencias = idLicencias;
    }

}