// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.fuentestaxonomicas.negocio.servicio;

/**
 * <p>
 * Servicio para la administracion de distintas Estructuras
 * Educativas. Permite administrar ficheros xml que describen
 * diferentes estructuras educativas como:
 * </p>
 * <p>
 * -Tesauros
 * </p>
 * <p>
 * -Taxonomias
 * </p>
 * <p>
 * -Arbol Curricular
 * </p>
 */
public interface SrvEstructurasEducativasService
{
    public java.lang.Boolean chequearIdiomaArbolCurricular(java.lang.String nombre);

    public java.lang.Boolean chequearIdiomaTesauro(java.lang.String nombre);

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] listarArbolCurricular();

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] listarTesauros();

    public int[] eliminarArbolesCurriculares(java.lang.String[] nombres);

    public int[] eliminarTesauros(java.lang.String[] nombres);

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] subirArbolesCurriculares(es.pode.fuentestaxonomicas.negocio.servicio.ParamVdexVO[] arboles);

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] subirTesauros(es.pode.fuentestaxonomicas.negocio.servicio.ParamVdexVO[] tesauros);

    public int[] eliminarBackups(java.lang.String[] nombres);

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] listarBackups();

    public es.pode.fuentestaxonomicas.negocio.servicio.VdexVO[] subirBackups(es.pode.fuentestaxonomicas.negocio.servicio.ParamVdexVO[] listaVdex);

    public javax.activation.DataHandler exportarVdex(java.lang.String nombre, es.pode.fuentestaxonomicas.negocio.servicio.TipoVdex tipoVdex);

}