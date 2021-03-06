// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.faqs.servicio;

/**
 * <p>
 * Servicio que ofrece los metodos de negocio para la gesti�n de
 * preguntas frecuentes (FAQs).
 * </p>
 */
public interface SrvFaqService
{
    /**
     * <p>
     * Obtener todas las FAQs disponibles.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqVO[] obtenerFaqs();

    /**
     * <p>
     * Crea una nueva FAQ.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqVO crearFaq(es.pode.contenidos.negocio.faqs.servicio.FaqVO faq);

    /**
     * <p>
     * Actualiza los contenidos de una FAQ existente.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqVO modificarFaq(es.pode.contenidos.negocio.faqs.servicio.FaqVO faq);

    /**
     * <p>
     * Elimina una o varias FAQ existentes.
     * </p>
     */
    public void eliminarFaqs(java.lang.Long[] faqIDs);

    /**
     * <p>
     * Obtiene una FAQ identificada por su ID.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqVO consultaFaq(java.lang.Long id);

    /**
     * <p>
     * Obtiene un listado de FAQs filtradas por idioma.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaVO[] obtenerFaqsPorIdioma(java.lang.String idioma);

    /**
     * <p>
     * devuelve todas las categorias disponibles para las faqs
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.servicio.CategoriaTraducidaVO[] obtenCategoriasFaqs(java.lang.String idioma);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaVO[] obtenFaqsPorIdiomaCategoria(java.lang.String idioma, java.lang.Long categoria);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaVO obtenerFaqTraducida(java.lang.Long id, java.lang.String idioma);

    /**
     * 
     */
    public java.lang.Long crearCategoria(es.pode.contenidos.negocio.faqs.servicio.CategoriaFaqVO categoria);

    /**
     * 
     */
    public void modificarCategoria(es.pode.contenidos.negocio.faqs.servicio.CategoriaFaqVO categoria);

    /**
     * 
     */
    public void eliminarCategoria(java.lang.Long id);

    /**
     * 
     */
    public void eliminarCategorias(java.lang.Long[] ids);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.CategoriaFaqVO[] listarCategorias();

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.CategoriaFaqVO obtenerCategoria(java.lang.Long id);

    /**
     * 
     */
    public void limpiarCategoria(java.lang.Long id);

    /**
     * 
     */
    public void limpiarFaq(java.lang.Long id);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.CategoriaFaqVO[] obtenerCategorias();

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.CategoriaTraducidaVO[] obtenerCategoriasTraducidas(java.lang.String[] idiomasTraducibles);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaVO[] obtenerFaqsFromIdCategoria(java.lang.Long idCategoria, java.lang.String[] idiomasTraducibles);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaVO[] obtenerFaqsTraducidas(java.lang.String[] idiomasTraducibles);

    /**
     * 
     */
    public void eliminarFaq(java.lang.Long id);

    /**
     * 
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqTraducidaIdiomaVO[] obtenerFaqsBloquesIdiomas(java.lang.String[] idiomasTraducibles);

}
