// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.validador.negocio.servicio;

/**
 * <p>
 * El servicio contiene metodos para las siguientes tareas:
 * </p>
 * <p>
 * A) obtenerValidacionTesauro:
 * </p>
 * <p>
 * recibe como parámetro la ruta al xml que se quiere validar. 
 * realiza la validacion contra esquemas requerida y devuelve un VO
 * ValidaVdexVO con el resultado de la validacion.
 * </p>
 * <p>
 * valida contra el esquema imsvdex_v1p0_thesaurus.xsd
 * </p>
 * <p>
 * B) obtenerValidacionTaxonomia::
 * </p>
 * <p>
 * recibe como parámetro la ruta al xml que se quiere validar. 
 * realiza la validacion contra esquemas requerida y devuelve un VO
 * ValidaVdexVO con el resultado de la validacion.
 * </p>
 * <p>
 * valida contra el esquema imsvdex_v1p0_hierarchical.xsd
 * </p>
 */
public interface SrvValidadorVDEXService
{
    public es.pode.validador.negocio.servicio.ValidaVdexVO obtenerValidacionTesauro(java.lang.String rutaVdex);

    public es.pode.validador.negocio.servicio.ValidaVdexVO obtenerValidacionTaxonomia(java.lang.String rutaVdex);

    public es.pode.validador.negocio.servicio.ValidaVdexVO obtenerValidacionVdex(java.lang.String rutaVdex);

}
