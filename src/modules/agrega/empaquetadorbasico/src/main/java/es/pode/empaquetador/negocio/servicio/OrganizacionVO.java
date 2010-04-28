// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.empaquetador.negocio.servicio;

/**
 * <p>
 * Objeto que representa una orgacización de un manifiesto
 * SCORM2004. Esta clase representa a un objeto Organization.
 * </p>
 */
public class OrganizacionVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public OrganizacionVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param title  Título de la organización. Representa el atributo title de la clase Organization.
     * @param identifier  Identificador de la organizacion. Representa el atributo identifier de la clase Organization.
     * @param grupos  Conjunto de grupos contenidos en la organizacion. Se corresponde con el atributo Item de la clase Organization.
     * @param secuencia  Secuencia asociada a la organizacion. Para obtener la secuencia de la clase Organizacion es necesario extraerla de array organization.getGrp_any().getAny_object().
     * @param lom  
     */
    public OrganizacionVO(
        java.lang.String title,
        java.lang.String identifier,
        es.pode.empaquetador.negocio.servicio.GrupoVO[] grupos,
        es.pode.empaquetador.negocio.servicio.SecuenciaVO[] secuencia,
        es.pode.empaquetador.negocio.servicio.LomVO lom)

    {
        this.title = title;
        this.identifier = identifier;
        this.grupos = grupos;
        this.secuencia = secuencia;
        this.lom = lom;
    }

    /**
     * Copies constructor from other OrganizacionVO
     * @param otherBean OrganizacionVO 
     */
    public OrganizacionVO(OrganizacionVO otherBean)
    {
        if (otherBean != null)
        {
            this.title = otherBean.getTitle();
            this.identifier = otherBean.getIdentifier();
            this.grupos = otherBean.getGrupos();
            this.secuencia = otherBean.getSecuencia();
            this.lom = otherBean.getLom();
        }
    }

    private java.lang.String title;

    /**
     * <p>
     * Título de la organización. Representa el atributo title de la
     * clase Organization.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTitle()
    {
        return this.title;
    }

    /**
   * <p>
   * Título de la organización. Representa el atributo title de la
   * clase Organization.
   * </p>
     *  @param title  Título de la organización. Representa el atributo title de la clase Organization.  
     */
    public void setTitle(java.lang.String title)
    {
        this.title = title;
    }

    private java.lang.String identifier;

    /**
     * <p>
     * Identificador de la organizacion. Representa el atributo
     * identifier de la clase Organization.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdentifier()
    {
        return this.identifier;
    }

    /**
   * <p>
   * Identificador de la organizacion. Representa el atributo
   * identifier de la clase Organization.
   * </p>
     *  @param identifier  Identificador de la organizacion. Representa el atributo identifier de la clase Organization.  
     */
    public void setIdentifier(java.lang.String identifier)
    {
        this.identifier = identifier;
    }

    /**
   * <p>
   * Clase que representa un elemento dentro de una organizacion. Se
   * corresponde con la clase Item.
   * </p>
     */
    private es.pode.empaquetador.negocio.servicio.GrupoVO[] grupos;

    /**
     * Getter of grupos.  
     * @return es.pode.empaquetador.negocio.servicio.GrupoVO[]  Clase que representa un elemento dentro de una organizacion. Se corresponde con la clase Item.
     */
    public es.pode.empaquetador.negocio.servicio.GrupoVO[] getGrupos()
    {
        return this.grupos;
    }

  /**
   * Setter of grupos  
   *  @param grupos  Clase que representa un elemento dentro de una organizacion. Se corresponde con la clase Item. 
   */
    public void setGrupos(es.pode.empaquetador.negocio.servicio.GrupoVO[] grupos)
    {
        this.grupos = grupos;
    }

    /**
   * <p>
   * Clase que representa una secuencia IMS simplificada. Se
   * corresponde con la clase Sequencing.
   * </p>
     */
    private es.pode.empaquetador.negocio.servicio.SecuenciaVO[] secuencia;

    /**
     * Getter of secuencia.  
     * @return es.pode.empaquetador.negocio.servicio.SecuenciaVO[]  Clase que representa una secuencia IMS simplificada. Se corresponde con la clase Sequencing.
     */
    public es.pode.empaquetador.negocio.servicio.SecuenciaVO[] getSecuencia()
    {
        return this.secuencia;
    }

  /**
   * Setter of secuencia  
   *  @param secuencia  Clase que representa una secuencia IMS simplificada. Se corresponde con la clase Sequencing. 
   */
    public void setSecuencia(es.pode.empaquetador.negocio.servicio.SecuenciaVO[] secuencia)
    {
        this.secuencia = secuencia;
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