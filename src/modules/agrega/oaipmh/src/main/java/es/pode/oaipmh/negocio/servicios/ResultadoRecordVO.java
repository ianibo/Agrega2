// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.oaipmh.negocio.servicios;

/**
 * <p>
 * Clase de objeto de valor que almacena las caracteristicas
 * extraibles de cada registro del repositorio. Esta directamente
 * relacionado con el formato Dublin Core y los valores almacenados
 * en el indice de la plataforma.
 * </p>
 * <p>
 * En este VO no estamos recogiendo la siguiente información:
 * creator, contributor, subject, source y descripcion
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
     * @param titulo  Título del ode
     * @param fecha  Fecha publicación del recurso dentro del repositorio.
     * @param idioma  Idioma del registro.
     * @param tipo  Tipo del registro: texto, video,....
     * @param autores  Autores del recurso dentro del repositorio.
     * @param ambito  Ambito del registro.
     * @param descripcion  Descripcion del recurso.
     * @param derechos  Derechos del registro dentro del repositorio.
     * @param identificador  Identificador del recurso dentro del repositorio.
     * @param formatos  Fornatos de los que esta compuesto el recurso.
     * @param tema  Tema del registro (palabras clave del ODE).
     * @param relacion  
     * @param publicador  
     * @param fuente  
     * @param contribuidor  
     * @param idRepositorio  Identificador del repositorio con la sintaxis: scheme ":" namespace-identifier ":" local-identifier.
     */
    public ResultadoRecordVO(
        java.lang.String titulo,
        java.lang.String fecha,
        java.lang.String idioma,
        java.lang.String[] tipo,
        java.lang.String[] autores,
        java.lang.String[] ambito,
        java.lang.String descripcion,
        java.lang.String[] derechos,
        java.lang.String[] identificador,
        java.lang.String[] formatos,
        java.lang.String[] tema,
        java.lang.String[] relacion,
        java.lang.String[] publicador,
        java.lang.String[] fuente,
        java.lang.String[] contribuidor,
        java.lang.String idRepositorio)

    {
        this.titulo = titulo;
        this.fecha = fecha;
        this.idioma = idioma;
        this.tipo = tipo;
        this.autores = autores;
        this.ambito = ambito;
        this.descripcion = descripcion;
        this.derechos = derechos;
        this.identificador = identificador;
        this.formatos = formatos;
        this.tema = tema;
        this.relacion = relacion;
        this.publicador = publicador;
        this.fuente = fuente;
        this.contribuidor = contribuidor;
        this.idRepositorio = idRepositorio;
    }

    /**
     * Copies constructor from other ResultadoRecordVO
     * @param otherBean ResultadoRecordVO 
     */
    public ResultadoRecordVO(ResultadoRecordVO otherBean)
    {
        if (otherBean != null)
        {
            this.titulo = otherBean.getTitulo();
            this.fecha = otherBean.getFecha();
            this.idioma = otherBean.getIdioma();
            this.tipo = otherBean.getTipo();
            this.autores = otherBean.getAutores();
            this.ambito = otherBean.getAmbito();
            this.descripcion = otherBean.getDescripcion();
            this.derechos = otherBean.getDerechos();
            this.identificador = otherBean.getIdentificador();
            this.formatos = otherBean.getFormatos();
            this.tema = otherBean.getTema();
            this.relacion = otherBean.getRelacion();
            this.publicador = otherBean.getPublicador();
            this.fuente = otherBean.getFuente();
            this.contribuidor = otherBean.getContribuidor();
            this.idRepositorio = otherBean.getIdRepositorio();
        }
    }

    private java.lang.String titulo;

    /**
     * <p>
     * Título del ode
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    /**
   * <p>
   * Título del ode
   * </p>
     *  @param titulo  Título del ode  
     */
    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

    private java.lang.String fecha;

    /**
     * <p>
     * Fecha publicación del recurso dentro del repositorio.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getFecha()
    {
        return this.fecha;
    }

    /**
   * <p>
   * Fecha publicación del recurso dentro del repositorio.
   * </p>
     *  @param fecha  Fecha publicación del recurso dentro del repositorio.  
     */
    public void setFecha(java.lang.String fecha)
    {
        this.fecha = fecha;
    }

    private java.lang.String idioma;

    /**
     * <p>
     * Idioma del registro.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdioma()
    {
        return this.idioma;
    }

    /**
   * <p>
   * Idioma del registro.
   * </p>
     *  @param idioma  Idioma del registro.  
     */
    public void setIdioma(java.lang.String idioma)
    {
        this.idioma = idioma;
    }

    private java.lang.String[] tipo;

    /**
     * <p>
     * Tipo del registro: texto, video,....
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getTipo()
    {
        return this.tipo;
    }

    /**
   * <p>
   * Tipo del registro: texto, video,....
   * </p>
     *  @param tipo  Tipo del registro: texto, video,....  
     */
    public void setTipo(java.lang.String[] tipo)
    {
        this.tipo = tipo;
    }

    private java.lang.String[] autores;

    /**
     * <p>
     * Autores del recurso dentro del repositorio.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getAutores()
    {
        return this.autores;
    }

    /**
   * <p>
   * Autores del recurso dentro del repositorio.
   * </p>
     *  @param autores  Autores del recurso dentro del repositorio.  
     */
    public void setAutores(java.lang.String[] autores)
    {
        this.autores = autores;
    }

    private java.lang.String[] ambito;

    /**
     * <p>
     * Ambito del registro.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getAmbito()
    {
        return this.ambito;
    }

    /**
   * <p>
   * Ambito del registro.
   * </p>
     *  @param ambito  Ambito del registro.  
     */
    public void setAmbito(java.lang.String[] ambito)
    {
        this.ambito = ambito;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripcion del recurso.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    /**
   * <p>
   * Descripcion del recurso.
   * </p>
     *  @param descripcion  Descripcion del recurso.  
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String[] derechos;

    /**
     * <p>
     * Derechos del registro dentro del repositorio.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getDerechos()
    {
        return this.derechos;
    }

    /**
   * <p>
   * Derechos del registro dentro del repositorio.
   * </p>
     *  @param derechos  Derechos del registro dentro del repositorio.  
     */
    public void setDerechos(java.lang.String[] derechos)
    {
        this.derechos = derechos;
    }

    private java.lang.String[] identificador;

    /**
     * <p>
     * Identificador del recurso dentro del repositorio.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getIdentificador()
    {
        return this.identificador;
    }

    /**
   * <p>
   * Identificador del recurso dentro del repositorio.
   * </p>
     *  @param identificador  Identificador del recurso dentro del repositorio.  
     */
    public void setIdentificador(java.lang.String[] identificador)
    {
        this.identificador = identificador;
    }

    private java.lang.String[] formatos;

    /**
     * <p>
     * Fornatos de los que esta compuesto el recurso.
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getFormatos()
    {
        return this.formatos;
    }

    /**
   * <p>
   * Fornatos de los que esta compuesto el recurso.
   * </p>
     *  @param formatos  Fornatos de los que esta compuesto el recurso.  
     */
    public void setFormatos(java.lang.String[] formatos)
    {
        this.formatos = formatos;
    }

    private java.lang.String[] tema;

    /**
     * <p>
     * Tema del registro (palabras clave del ODE).
     * </p>
     * @return java.lang.String[]
     */
    public java.lang.String[] getTema()
    {
        return this.tema;
    }

    /**
   * <p>
   * Tema del registro (palabras clave del ODE).
   * </p>
     *  @param tema  Tema del registro (palabras clave del ODE).  
     */
    public void setTema(java.lang.String[] tema)
    {
        this.tema = tema;
    }

    private java.lang.String[] relacion;

    public java.lang.String[] getRelacion()
    {
        return this.relacion;
    }

    public void setRelacion(java.lang.String[] relacion)
    {
        this.relacion = relacion;
    }

    private java.lang.String[] publicador;

    public java.lang.String[] getPublicador()
    {
        return this.publicador;
    }

    public void setPublicador(java.lang.String[] publicador)
    {
        this.publicador = publicador;
    }

    private java.lang.String[] fuente;

    public java.lang.String[] getFuente()
    {
        return this.fuente;
    }

    public void setFuente(java.lang.String[] fuente)
    {
        this.fuente = fuente;
    }

    private java.lang.String[] contribuidor;

    public java.lang.String[] getContribuidor()
    {
        return this.contribuidor;
    }

    public void setContribuidor(java.lang.String[] contribuidor)
    {
        this.contribuidor = contribuidor;
    }

    private java.lang.String idRepositorio;

    /**
     * <p>
     * Identificador del repositorio con la sintaxis: scheme ":"
     * namespace-identifier ":" local-identifier.
     * </p>
     * @return java.lang.String
     */
    public java.lang.String getIdRepositorio()
    {
        return this.idRepositorio;
    }

    /**
   * <p>
   * Identificador del repositorio con la sintaxis: scheme ":"
   * namespace-identifier ":" local-identifier.
   * </p>
     *  @param idRepositorio  Identificador del repositorio con la sintaxis: scheme ":" namespace-identifier ":" local-identifier.  
     */
    public void setIdRepositorio(java.lang.String idRepositorio)
    {
        this.idRepositorio = idRepositorio;
    }

}