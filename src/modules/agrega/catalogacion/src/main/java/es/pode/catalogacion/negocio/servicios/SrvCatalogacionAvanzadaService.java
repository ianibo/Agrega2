// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.catalogacion.negocio.servicios;

/**
 * 
 */
public interface SrvCatalogacionAvanzadaService
{
  /**
   * <p>
   * Realmente haria falta este metodo? no vamos a ver todo el Lom a
   * la vez; lo veremos, modificaremos y/o aņadiremos de categoria en
   * categoria, pero podria interesarnos
   * </p>
            * @return es.pode.catalogacion.negocio.servicios.LomAvanzadoVO
   */
    public es.pode.catalogacion.negocio.servicios.LomAvanzadoVO obtenerLomAvanzado(java.lang.String identificador, java.lang.String usuario, java.lang.String idioma);

    public es.pode.catalogacion.negocio.servicios.LomAvanzadoVO generarMetadatos(java.lang.String identificador, java.lang.String usuario, es.pode.catalogacion.negocio.servicios.LomAvanzadoVO lomAvanzado, java.lang.String idioma);

    public java.lang.String cargarObjLom(java.lang.String identificador, java.lang.String usuario, javax.activation.DataHandler lom);

    public void eliminarObjLoms(java.lang.String[] ids);

    public es.pode.catalogacion.negocio.servicios.IdLomVO[] obtenerObjLoms(java.lang.String[] ids);

    public javax.activation.DataHandler exportarLomes(java.lang.String identificador, java.lang.String usuario, es.pode.catalogacion.negocio.servicios.LomAvanzadoVO lomAvanzado, java.lang.String idioma);

    public es.pode.catalogacion.negocio.servicios.LomAvanzadoVO importarLomes(javax.activation.DataHandler ficheroLomes);

    public javax.activation.DataHandler exportarLomesDesdeLom(java.lang.String identificador, java.lang.String usuario, java.lang.String idioma, javax.activation.DataHandler lom);

}
