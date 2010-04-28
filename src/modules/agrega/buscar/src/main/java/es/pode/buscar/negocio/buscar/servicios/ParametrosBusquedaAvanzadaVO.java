// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.buscar.negocio.buscar.servicios;

/**
 * <p>
 * Esta clase encapsula todos los parametros configurables para la
 * realizacion de una busqueda en el servicio de Buscar.
 * </p>
 */
public class ParametrosBusquedaAvanzadaVO
    implements java.io.Serializable
{

    public ParametrosBusquedaAvanzadaVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public ParametrosBusquedaAvanzadaVO(
        java.lang.String valoracion,
        java.lang.String titulo,
        java.lang.Boolean secuencia,
        java.lang.String recurso,
        java.lang.String procesoCognitivo,
        java.lang.String palabrasClave,
        java.lang.Integer origenPagina,
        java.lang.Integer numeroResultados,
        java.lang.String areaCurricular,
        java.lang.String idiomaNavegacion,
        java.lang.String idiomaBusqueda,
        java.lang.String idBusqueda,
        java.lang.String formato,
        java.lang.String fechaPublicacion,
        java.lang.String edad,
        java.lang.String descripcion,
        java.lang.String contexto,
        java.lang.String[] comunidadesSeleccionadas,
        java.lang.String autor,
        java.lang.Integer resultadosPorPagina,
        java.lang.String comunidadPeticion,
        java.lang.String idTesauro,
        java.lang.String busquedaSimpleAvanzada,
        java.lang.String nivelAgregacion,
        java.lang.String arbolCurricularVigente,
        java.lang.String destinatarios,
        java.lang.String keyword,
        java.lang.String ambito,
		java.util.HashMap searchFilters)

    {
        this.valoracion = valoracion;
        this.titulo = titulo;
        this.secuencia = secuencia;
        this.recurso = recurso;
        this.procesoCognitivo = procesoCognitivo;
        this.palabrasClave = palabrasClave;
        this.origenPagina = origenPagina;
        this.numeroResultados = numeroResultados;
        this.areaCurricular = areaCurricular;
        this.idiomaNavegacion = idiomaNavegacion;
        this.idiomaBusqueda = idiomaBusqueda;
        this.idBusqueda = idBusqueda;
        this.formato = formato;
        this.fechaPublicacion = fechaPublicacion;
        this.edad = edad;
        this.descripcion = descripcion;
        this.contexto = contexto;
        this.comunidadesSeleccionadas = comunidadesSeleccionadas;
        this.autor = autor;
        this.resultadosPorPagina = resultadosPorPagina;
        this.comunidadPeticion = comunidadPeticion;
        this.idTesauro = idTesauro;
        this.busquedaSimpleAvanzada = busquedaSimpleAvanzada;
        this.nivelAgregacion = nivelAgregacion;
        this.arbolCurricularVigente = arbolCurricularVigente;
        this.destinatarios = destinatarios;
        this.keyword = keyword;
        this.ambito = ambito;
		this.searchFilters = searchFilters;
    }

    /**
     * Copies constructor from other ParametrosBusquedaAvanzadaVO
     */
    public ParametrosBusquedaAvanzadaVO(ParametrosBusquedaAvanzadaVO otherBean)
    {
        if (otherBean != null)
        {
            this.valoracion = otherBean.getValoracion();
            this.titulo = otherBean.getTitulo();
            this.secuencia = otherBean.getSecuencia();
            this.recurso = otherBean.getRecurso();
            this.procesoCognitivo = otherBean.getProcesoCognitivo();
            this.palabrasClave = otherBean.getPalabrasClave();
            this.origenPagina = otherBean.getOrigenPagina();
            this.numeroResultados = otherBean.getNumeroResultados();
            this.areaCurricular = otherBean.getAreaCurricular();
            this.idiomaNavegacion = otherBean.getIdiomaNavegacion();
            this.idiomaBusqueda = otherBean.getIdiomaBusqueda();
            this.idBusqueda = otherBean.getIdBusqueda();
            this.formato = otherBean.getFormato();
            this.fechaPublicacion = otherBean.getFechaPublicacion();
            this.edad = otherBean.getEdad();
            this.descripcion = otherBean.getDescripcion();
            this.contexto = otherBean.getContexto();
            this.comunidadesSeleccionadas = otherBean.getComunidadesSeleccionadas();
            this.autor = otherBean.getAutor();
            this.resultadosPorPagina = otherBean.getResultadosPorPagina();
            this.comunidadPeticion = otherBean.getComunidadPeticion();
            this.idTesauro = otherBean.getIdTesauro();
            this.busquedaSimpleAvanzada = otherBean.getBusquedaSimpleAvanzada();
            this.nivelAgregacion = otherBean.getNivelAgregacion();
            this.arbolCurricularVigente = otherBean.getArbolCurricularVigente();
            this.destinatarios = otherBean.getDestinatarios();
            this.keyword = otherBean.getKeyword();
            this.ambito = otherBean.getAmbito();
			this.searchFilters = otherBean.getSearchFilters();
        }
    }

    private java.lang.String valoracion;

    /**
     * <p>
     * Valoracion del ODE dentro de la plataforma.
     * </p>
     */
    public java.lang.String getValoracion()
    {
        return this.valoracion;
    }

    public void setValoracion(java.lang.String valoracion)
    {
        this.valoracion = valoracion;
    }

    private java.lang.String titulo;

    /**
     * <p>
     * Titulo del ODE.
     * </p>
     */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }

    private java.lang.Boolean secuencia;

    /**
     * <p>
     * Con secuencia o sin secuencia.
     * </p>
     */
    public java.lang.Boolean getSecuencia()
    {
        return this.secuencia;
    }

    public void setSecuencia(java.lang.Boolean secuencia)
    {
        this.secuencia = secuencia;
    }

    private java.lang.String recurso;

    /**
     * <p>
     * Recurso del ODE.
     * </p>
     */
    public java.lang.String getRecurso()
    {
        return this.recurso;
    }

    public void setRecurso(java.lang.String recurso)
    {
        this.recurso = recurso;
    }

    private java.lang.String procesoCognitivo;

    /**
     * <p>
     * Proceso cognitivo del ODE.
     * </p>
     */
    public java.lang.String getProcesoCognitivo()
    {
        return this.procesoCognitivo;
    }

    public void setProcesoCognitivo(java.lang.String procesoCognitivo)
    {
        this.procesoCognitivo = procesoCognitivo;
    }

    private java.lang.String palabrasClave;

    /**
     * <p>
     * Se trata de las palabras clave por las que se quiere buscar.
     * </p>
     */
    public java.lang.String getPalabrasClave()
    {
        return this.palabrasClave;
    }

    public void setPalabrasClave(java.lang.String palabrasClave)
    {
        this.palabrasClave = palabrasClave;
    }

    private java.lang.Integer origenPagina;

    /**
     * <p>
     * Indice del conjunto total de resultados a partir del cual se
     * quieren obtener un conjunto de resultados.
     * </p>
     */
    public java.lang.Integer getOrigenPagina()
    {
        return this.origenPagina;
    }

    public void setOrigenPagina(java.lang.Integer origenPagina)
    {
        this.origenPagina = origenPagina;
    }

    private java.lang.Integer numeroResultados;

    /**
     * <p>
     * Numero de resultados maximo que se quieren devolver.
     * </p>
     */
    public java.lang.Integer getNumeroResultados()
    {
        return this.numeroResultados;
    }

    public void setNumeroResultados(java.lang.Integer numeroResultados)
    {
        this.numeroResultados = numeroResultados;
    }

    private java.lang.String areaCurricular;

    /**
     * <p>
     * El nivel educativo del ODE.
     * </p>
     */
    public java.lang.String getAreaCurricular()
    {
        return this.areaCurricular;
    }

    public void setAreaCurricular(java.lang.String areaCurricular)
    {
        this.areaCurricular = areaCurricular;
    }

    private java.lang.String idiomaNavegacion;

    /**
     * <p>
     * Se trata del idioma con el que el usuario navega por la
     * aplicacion.
     * </p>
     */
    public java.lang.String getIdiomaNavegacion()
    {
        return this.idiomaNavegacion;
    }

    public void setIdiomaNavegacion(java.lang.String idiomaNavegacion)
    {
        this.idiomaNavegacion = idiomaNavegacion;
    }

    private java.lang.String idiomaBusqueda;

    /**
     * <p>
     * Idioma por el que se quiere configurar la busqueda.
     * </p>
     */
    public java.lang.String getIdiomaBusqueda()
    {
        return this.idiomaBusqueda;
    }

    public void setIdiomaBusqueda(java.lang.String idiomaBusqueda)
    {
        this.idiomaBusqueda = idiomaBusqueda;
    }

    private java.lang.String idBusqueda;

    /**
     * <p>
     * El identificador de la busqueda en el caso de que el cliente que
     * invoca la misma ya la haya realizado anteriormente y solo quiera
     * paginar sobre los resultados de la misma.
     * </p>
     */
    public java.lang.String getIdBusqueda()
    {
        return this.idBusqueda;
    }

    public void setIdBusqueda(java.lang.String idBusqueda)
    {
        this.idBusqueda = idBusqueda;
    }

    private java.lang.String formato;

    /**
     * <p>
     * Formato del ODE.
     * </p>
     */
    public java.lang.String getFormato()
    {
        return this.formato;
    }

    public void setFormato(java.lang.String formato)
    {
        this.formato = formato;
    }

    private java.lang.String fechaPublicacion;

    /**
     * <p>
     * Fecha de publicacion del ODE.
     * </p>
     */
    public java.lang.String getFechaPublicacion()
    {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(java.lang.String fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    private java.lang.String edad;

    /**
     * <p>
     * Edad de los destinatarios de la accion lectiva del ODE.
     * </p>
     */
    public java.lang.String getEdad()
    {
        return this.edad;
    }

    public void setEdad(java.lang.String edad)
    {
        this.edad = edad;
    }

    private java.lang.String descripcion;

    /**
     * <p>
     * Descripcion del ODE.
     * </p>
     */
    public java.lang.String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(java.lang.String descripcion)
    {
        this.descripcion = descripcion;
    }

    private java.lang.String contexto;

    /**
     * <p>
     * Contexto del ODE.
     * </p>
     */
    public java.lang.String getContexto()
    {
        return this.contexto;
    }

    public void setContexto(java.lang.String contexto)
    {
        this.contexto = contexto;
    }

    private java.lang.String[] comunidadesSeleccionadas;

    /**
     * <p>
     * Comunidades en las que se busca el ODE.
     * </p>
     */
    public java.lang.String[] getComunidadesSeleccionadas()
    {
        return this.comunidadesSeleccionadas;
    }

    public void setComunidadesSeleccionadas(java.lang.String[] comunidadesSeleccionadas)
    {
        this.comunidadesSeleccionadas = comunidadesSeleccionadas;
    }

    private java.lang.String autor;

    /**
     * <p>
     * Autor del ODE.
     * </p>
     */
    public java.lang.String getAutor()
    {
        return this.autor;
    }

    public void setAutor(java.lang.String autor)
    {
        this.autor = autor;
    }

    private java.lang.Integer resultadosPorPagina;

    /**
     * <p>
     * El numero de resultados por pagina en el que se esta interesado.
     * </p>
     */
    public java.lang.Integer getResultadosPorPagina()
    {
        return this.resultadosPorPagina;
    }

    public void setResultadosPorPagina(java.lang.Integer resultadosPorPagina)
    {
        this.resultadosPorPagina = resultadosPorPagina;
    }

    private java.lang.String comunidadPeticion;

    /**
     * 
     */
    public java.lang.String getComunidadPeticion()
    {
        return this.comunidadPeticion;
    }

    public void setComunidadPeticion(java.lang.String comunidadPeticion)
    {
        this.comunidadPeticion = comunidadPeticion;
    }

    private java.lang.String idTesauro;

    /**
     * 
     */
    public java.lang.String getIdTesauro()
    {
        return this.idTesauro;
    }

    public void setIdTesauro(java.lang.String idTesauro)
    {
        this.idTesauro = idTesauro;
    }

    private java.lang.String busquedaSimpleAvanzada;

    /**
     * 
     */
    public java.lang.String getBusquedaSimpleAvanzada()
    {
        return this.busquedaSimpleAvanzada;
    }

    public void setBusquedaSimpleAvanzada(java.lang.String busquedaSimpleAvanzada)
    {
        this.busquedaSimpleAvanzada = busquedaSimpleAvanzada;
    }

    private java.lang.String nivelAgregacion;

    /**
     * 
     */
    public java.lang.String getNivelAgregacion()
    {
        return this.nivelAgregacion;
    }

    public void setNivelAgregacion(java.lang.String nivelAgregacion)
    {
        this.nivelAgregacion = nivelAgregacion;
    }

    private java.lang.String arbolCurricularVigente;

    /**
     * 
     */
    public java.lang.String getArbolCurricularVigente()
    {
        return this.arbolCurricularVigente;
    }

    public void setArbolCurricularVigente(java.lang.String arbolCurricularVigente)
    {
        this.arbolCurricularVigente = arbolCurricularVigente;
    }

    private java.lang.String destinatarios;

    /**
     * 
     */
    public java.lang.String getDestinatarios()
    {
        return this.destinatarios;
    }

    public void setDestinatarios(java.lang.String destinatarios)
    {
        this.destinatarios = destinatarios;
    }

    private java.lang.String keyword;

    /**
     * 
     */
    public java.lang.String getKeyword()
    {
        return this.keyword;
    }

    public void setKeyword(java.lang.String keyword)
    {
        this.keyword = keyword;
    }

    private java.lang.String ambito;

    /**
     * 
     */
    public java.lang.String getAmbito()
    {
        return this.ambito;
    }

    public void setAmbito(java.lang.String ambito)
    {
        this.ambito = ambito;
    }

    /* Search filters as key-value pairs. */
    private java.util.HashMap searchFilters;

    /**
     * Gets the searchFilters value for this ParametrosBusquedaAvanzadaVO.
     * 
     * @return searchFilters Search filters as key-value pairs.
     */
    public java.util.HashMap getSearchFilters() {
        return searchFilters;
    }


    /**
     * Sets the searchFilters value for this ParametrosBusquedaAvanzadaVO.
     * 
     * @param searchFilters Search filters as key-value pairs.
     */
    public void setSearchFilters(java.util.HashMap searchFilters) {
        this.searchFilters = searchFilters;
    }

}