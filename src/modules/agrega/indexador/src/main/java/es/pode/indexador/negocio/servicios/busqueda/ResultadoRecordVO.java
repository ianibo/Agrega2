// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.indexador.negocio.servicios.busqueda;

/**
 * <p>
 * Este objeto de valor representa la informacion relativa a un
 * registro del indice que satisface los campos necesarios en el
 * Dublin Core que estan indexados en el repositorio.
 * </p>
 */
public class ResultadoRecordVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public ResultadoRecordVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param identificador  Identificador del ODE dentro del repositorio.
     * @param titulo  Titulo del ODE.
     * @param idioma  Iidoma de catalogacion del ODE.
     * @param descripcion  Descripcion del ODE.
     * @param tema  Palabras clave del ODE.
     * @param ambito  Ambitos del ODE.
     * @param tipo  Tipo de recurso.
     * @param fecha  Fecha de publicacion del ODE.
     * @param autores  Autores del ODE.
     * @param formatos  Formatos presentes en el ODE.
     * @param derechos  Licencias a las que esta sujeto el contenido del ODE.
     * @param contribuidor  Contribuciones al ODE.
     * @param publicador  Publicadores del ODE.
     * @param relacion  Relaciones del ODE con otros elementos.
     * @param fuente  Identificadores de elementos que pueden considerarse fuente del ODE.
     */
    public ResultadoRecordVO(
        java.lang.String identificador,
        java.lang.String titulo,
        java.lang.String idioma,
        java.lang.String descripcion,
        java.lang.String[] tema,
        java.lang.String[] ambito,
        java.lang.String[] tipo,
        java.lang.String fecha,
        java.lang.String[] autores,
        java.lang.String[] formatos,
        java.lang.String[] derechos,
        java.lang.String[] contribuidor,
        java.lang.String[] publicador,
        java.lang.String[] relacion,
        java.lang.String[] fuente)

    {
        this.identificador = identificador;
        this.titulo = titulo;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.tema = tema;
        this.ambito = ambito;
        this.tipo = tipo;
        this.fecha = fecha;
        this.autores = autores;
        this.formatos = formatos;
        this.derechos = derechos;
        this.contribuidor = contribuidor;
        this.publicador = publicador;
        this.relacion = relacion;
        this.fuente = fuente;
    }

    /**
     * Copies constructor from other ResultadoRecordVO
     * @param otherBean ResultadoRecordVO 
     */
    public ResultadoRecordVO(ResultadoRecordVO otherBean)
    {
        if (otherBean != null)
        {
            this.identificador = otherBean.getIdentificador();
            this.titulo = otherBean.getTitulo();
            this.idioma = otherBean.getIdioma();
            this.descripcion = otherBean.getDescripcion();
            this.tema = otherBean.getTema();
            this.ambito = otherBean.getAmbito();
            this.tipo = otherBean.getTipo();
            this.fecha = otherBean.getFecha();
            this.autores = otherBean.getAutores();
            this.formatos = otherBean.getFormatos();
            this.derechos = otherBean.getDerechos();
            this.contribuidor = otherBean.getContribuidor();
            this.publicador = otherBean.getPublicador();
            this.relacion = otherBean.getRelacion();
            this.fuente = otherBean.getFuente();
        }
    }

    private java.lang.String identificador;

    /**
     * <p>
     * Identificador del ODE dentro del repositorio.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdentificador()
    {
        return this.identificador;
    }

    /**
   * <p>
   * Identificador del ODE dentro del repositorio.
   * </p>
     *  @param identificador  Identificador del ODE dentro del repositorio.  
     */
    public void setIdentificador(java.lang.String identificador)
    {
        this.identificador = identificador;
    }

    private java.lang.String titulo;

    /**
     * <p>
     * Titulo del ODE.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    /**
   * <p>
   * Titulo del ODE.
   * </p>
     *  @param titulo  Titulo del ODE.  
     */
    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

    private java.lang.String idioma;

    /**
     * <p>
     * Iidoma de catalogacion del ODE.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdioma()
    {
        return this.idioma;
    }

    /**
   * <p>
   * Iidoma de catalogacion del ODE.
   * </p>
     *  @param idioma  Iidoma de catalogacion del ODE.  
     */
    public void setIdioma(java.lang.String idioma)
    {
        this.idioma = idioma;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripcion del ODE.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    /**
   * <p>
   * Descripcion del ODE.
   * </p>
     *  @param descripcion  Descripcion del ODE.  
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String[] tema;

    /**
     * <p>
     * Palabras clave del ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getTema()
    {
        return this.tema;
    }

    /**
   * <p>
   * Palabras clave del ODE.
   * </p>
     *  @param tema  Palabras clave del ODE.  
     */
    public void setTema(java.lang.String[] tema)
    {
        this.tema = tema;
    }

    private java.lang.String[] ambito;

    /**
     * <p>
     * Ambitos del ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getAmbito()
    {
        return this.ambito;
    }

    /**
   * <p>
   * Ambitos del ODE.
   * </p>
     *  @param ambito  Ambitos del ODE.  
     */
    public void setAmbito(java.lang.String[] ambito)
    {
        this.ambito = ambito;
    }

    private java.lang.String[] tipo;

    /**
     * <p>
     * Tipo de recurso.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getTipo()
    {
        return this.tipo;
    }

    /**
   * <p>
   * Tipo de recurso.
   * </p>
     *  @param tipo  Tipo de recurso.  
     */
    public void setTipo(java.lang.String[] tipo)
    {
        this.tipo = tipo;
    }

    private java.lang.String fecha;

    /**
     * <p>
     * Fecha de publicacion del ODE.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getFecha()
    {
        return this.fecha;
    }

    /**
   * <p>
   * Fecha de publicacion del ODE.
   * </p>
     *  @param fecha  Fecha de publicacion del ODE.  
     */
    public void setFecha(java.lang.String fecha)
    {
        this.fecha = fecha;
    }

    private java.lang.String[] autores;

    /**
     * <p>
     * Autores del ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getAutores()
    {
        return this.autores;
    }

    /**
   * <p>
   * Autores del ODE.
   * </p>
     *  @param autores  Autores del ODE.  
     */
    public void setAutores(java.lang.String[] autores)
    {
        this.autores = autores;
    }

    private java.lang.String[] formatos;

    /**
     * <p>
     * Formatos presentes en el ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getFormatos()
    {
        return this.formatos;
    }

    /**
   * <p>
   * Formatos presentes en el ODE.
   * </p>
     *  @param formatos  Formatos presentes en el ODE.  
     */
    public void setFormatos(java.lang.String[] formatos)
    {
        this.formatos = formatos;
    }

    private java.lang.String[] derechos;

    /**
     * <p>
     * Licencias a las que esta sujeto el contenido del ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getDerechos()
    {
        return this.derechos;
    }

    /**
   * <p>
   * Licencias a las que esta sujeto el contenido del ODE.
   * </p>
     *  @param derechos  Licencias a las que esta sujeto el contenido del ODE.  
     */
    public void setDerechos(java.lang.String[] derechos)
    {
        this.derechos = derechos;
    }

    private java.lang.String[] contribuidor;

    /**
     * <p>
     * Contribuciones al ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getContribuidor()
    {
        return this.contribuidor;
    }

    /**
   * <p>
   * Contribuciones al ODE.
   * </p>
     *  @param contribuidor  Contribuciones al ODE.  
     */
    public void setContribuidor(java.lang.String[] contribuidor)
    {
        this.contribuidor = contribuidor;
    }

    private java.lang.String[] publicador;

    /**
     * <p>
     * Publicadores del ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getPublicador()
    {
        return this.publicador;
    }

    /**
   * <p>
   * Publicadores del ODE.
   * </p>
     *  @param publicador  Publicadores del ODE.  
     */
    public void setPublicador(java.lang.String[] publicador)
    {
        this.publicador = publicador;
    }

    private java.lang.String[] relacion;

    /**
     * <p>
     * Relaciones del ODE con otros elementos.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getRelacion()
    {
        return this.relacion;
    }

    /**
   * <p>
   * Relaciones del ODE con otros elementos.
   * </p>
     *  @param relacion  Relaciones del ODE con otros elementos.  
     */
    public void setRelacion(java.lang.String[] relacion)
    {
        this.relacion = relacion;
    }

    private java.lang.String[] fuente;

    /**
     * <p>
     * Identificadores de elementos que pueden considerarse fuente del
     * ODE.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getFuente()
    {
        return this.fuente;
    }

    /**
   * <p>
   * Identificadores de elementos que pueden considerarse fuente del
   * ODE.
   * </p>
     *  @param fuente  Identificadores de elementos que pueden considerarse fuente del ODE.  
     */
    public void setFuente(java.lang.String[] fuente)
    {
        this.fuente = fuente;
    }

}