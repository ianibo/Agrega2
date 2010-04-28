// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.fuentestaxonomicas.negocio.servicio;

/**
 * <p>
 * ValueObject que representa un termino de un vocabulario
 * controlado de LOM-ES. Consta de los atributos idVocabulario,
 * nomTermino, idiomaTermino e idTermino.
 * </p>
 */
public class TerminoYPadreVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public TerminoYPadreVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param idVocabulario  Identificador de uno de los vocabularios controlados dentro del fichero xml expresado en vdex que contiene todos los vocabularios de LOM-ES. Se corresponde con el identificador dado en la especificacion LOM-ES para dicho vocabulario.
     * @param nomTermino  Valor de un termino de un vocabulario controlado de LOM-ES traducido al idioma indicado en el atributo idiomtaTermino.
     * @param idiomaTermino  Idioma en el que se encuentra traducido el termino recogido en el atributo nomTermino.
     * @param idTermino  Identificador del termino perteneciente a un vocabulario controlado de LOM-ES.
     */
    public TerminoYPadreVO(
        java.lang.String idVocabulario,
        java.lang.String nomTermino,
        java.lang.String idiomaTermino,
        java.lang.String idTermino)

    {
        this.idVocabulario = idVocabulario;
        this.nomTermino = nomTermino;
        this.idiomaTermino = idiomaTermino;
        this.idTermino = idTermino;
    }

    /**
     * Copies constructor from other TerminoYPadreVO
     * @param otherBean TerminoYPadreVO 
     */
    public TerminoYPadreVO(TerminoYPadreVO otherBean)
    {
        if (otherBean != null)
        {
            this.idVocabulario = otherBean.getIdVocabulario();
            this.nomTermino = otherBean.getNomTermino();
            this.idiomaTermino = otherBean.getIdiomaTermino();
            this.idTermino = otherBean.getIdTermino();
        }
    }

    private java.lang.String idVocabulario;

    /**
     * <p>
     * Identificador de uno de los vocabularios controlados dentro del
     * fichero xml expresado en vdex que contiene todos los
     * vocabularios de LOM-ES. Se corresponde con el identificador dado
     * en la especificacion LOM-ES para dicho vocabulario.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdVocabulario()
    {
        return this.idVocabulario;
    }

    /**
   * <p>
   * Identificador de uno de los vocabularios controlados dentro del
   * fichero xml expresado en vdex que contiene todos los
   * vocabularios de LOM-ES. Se corresponde con el identificador dado
   * en la especificacion LOM-ES para dicho vocabulario.
   * </p>
     *  @param idVocabulario  Identificador de uno de los vocabularios controlados dentro del fichero xml expresado en vdex que contiene todos los vocabularios de LOM-ES. Se corresponde con el identificador dado en la especificacion LOM-ES para dicho vocabulario.  
     */
    public void setIdVocabulario(java.lang.String idVocabulario)
    {
        this.idVocabulario = idVocabulario;
    }

    private java.lang.String nomTermino;

    /**
     * <p>
     * Valor de un termino de un vocabulario controlado de LOM-ES
     * traducido al idioma indicado en el atributo idiomtaTermino.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getNomTermino()
    {
        return this.nomTermino;
    }

    /**
   * <p>
   * Valor de un termino de un vocabulario controlado de LOM-ES
   * traducido al idioma indicado en el atributo idiomtaTermino.
   * </p>
     *  @param nomTermino  Valor de un termino de un vocabulario controlado de LOM-ES traducido al idioma indicado en el atributo idiomtaTermino.  
     */
    public void setNomTermino(java.lang.String nomTermino)
    {
        this.nomTermino = nomTermino;
    }

    private java.lang.String idiomaTermino;

    /**
     * <p>
     * Idioma en el que se encuentra traducido el termino recogido en
     * el atributo nomTermino.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdiomaTermino()
    {
        return this.idiomaTermino;
    }

    /**
   * <p>
   * Idioma en el que se encuentra traducido el termino recogido en
   * el atributo nomTermino.
   * </p>
     *  @param idiomaTermino  Idioma en el que se encuentra traducido el termino recogido en el atributo nomTermino.  
     */
    public void setIdiomaTermino(java.lang.String idiomaTermino)
    {
        this.idiomaTermino = idiomaTermino;
    }

    private java.lang.String idTermino;

    /**
     * <p>
     * Identificador del termino perteneciente a un vocabulario
     * controlado de LOM-ES.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdTermino()
    {
        return this.idTermino;
    }

    /**
   * <p>
   * Identificador del termino perteneciente a un vocabulario
   * controlado de LOM-ES.
   * </p>
     *  @param idTermino  Identificador del termino perteneciente a un vocabulario controlado de LOM-ES.  
     */
    public void setIdTermino(java.lang.String idTermino)
    {
        this.idTermino = idTermino;
    }

}