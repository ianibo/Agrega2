// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.buscar.negocio.buscar.servicios;

/**
 * 
 */
public class ParametrosBusquedaSimpleVO
    implements java.io.Serializable
{

    public ParametrosBusquedaSimpleVO()
    {
    }

    /**
     * Constructor taking all properties.
     */
    public ParametrosBusquedaSimpleVO(
        java.lang.String palabrasClave,
        java.lang.String idiomaBusqueda,
        java.lang.String idiomaNavegacion,
        java.lang.Integer origenPagina,
        java.lang.Integer resultadosPorPagina,
        java.lang.Integer numeroResultados,
        java.lang.String idBusqueda)

    {
        this.palabrasClave = palabrasClave;
        this.idiomaBusqueda = idiomaBusqueda;
        this.idiomaNavegacion = idiomaNavegacion;
        this.origenPagina = origenPagina;
        this.resultadosPorPagina = resultadosPorPagina;
        this.numeroResultados = numeroResultados;
        this.idBusqueda = idBusqueda;
    }

    /**
     * Copies constructor from other ParametrosBusquedaSimpleVO
     */
    public ParametrosBusquedaSimpleVO(ParametrosBusquedaSimpleVO otherBean)
    {
        if (otherBean != null)
        {
            this.palabrasClave = otherBean.getPalabrasClave();
            this.idiomaBusqueda = otherBean.getIdiomaBusqueda();
            this.idiomaNavegacion = otherBean.getIdiomaNavegacion();
            this.origenPagina = otherBean.getOrigenPagina();
            this.resultadosPorPagina = otherBean.getResultadosPorPagina();
            this.numeroResultados = otherBean.getNumeroResultados();
            this.idBusqueda = otherBean.getIdBusqueda();
        }
    }

    private java.lang.String palabrasClave;

    /**
     * <p>
     * Lista de palabras clave por las que buscar
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

    private java.lang.String idiomaBusqueda;

    /**
     * <p>
     * Idioma por el que se realiza la busqueda.
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

    private java.lang.Integer origenPagina;

    /**
     * <p>
     * Valor en el que empieza la solicitud de pagina
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

    private java.lang.Integer resultadosPorPagina;

    /**
     * <p>
     * Numero de resultados que se desean por pagina
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

    private java.lang.Integer numeroResultados;

    /**
     * <p>
     * Numero maximo de resultados que se quieren devolver
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

    private java.lang.String idBusqueda;

    /**
     * <p>
     * Identificador de una busqueda.
     * </p>
     * <p>
     * De no estar vacio, este identificador hace referencia a una
     * busqueda ya realizada para tener acceso directo a los resultados
     * sin necesidad de buscarlos de nuevo.
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

}