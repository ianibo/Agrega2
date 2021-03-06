// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * @see es.pode.contenidos.negocio.faqs.dominio.Faq
 */
public interface FaqDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p/>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p/>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link es.pode.contenidos.negocio.faqs.servicio.FaqVO}.
     */
    public final static int TRANSFORM_FAQVO = 1;

    /**
     * Converts this DAO's entity to an object of type {@link es.pode.contenidos.negocio.faqs.servicio.FaqVO}.
     */
    public es.pode.contenidos.negocio.faqs.servicio.FaqVO toFaqVO(es.pode.contenidos.negocio.faqs.dominio.Faq entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link es.pode.contenidos.negocio.faqs.servicio.FaqVO}.
     */
    public void toFaqVOCollection(java.util.Collection entities);

    public es.pode.contenidos.negocio.faqs.dominio.Faq fromFaqVO(es.pode.contenidos.negocio.faqs.servicio.FaqVO vo);
    
    public void fromFaqVO(es.pode.contenidos.negocio.faqs.servicio.FaqVO vo, es.pode.contenidos.negocio.faqs.dominio.Faq entity);    


    /**
     * Loads an instance of es.pode.contenidos.negocio.faqs.dominio.Faq from the persistent store.
     */
    public es.pode.contenidos.negocio.faqs.dominio.Faq load(java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #load(java.lang.Long)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     *   optionally transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);
    
    /**
     * Loads all entities of type {@link es.pode.contenidos.negocio.faqs.dominio.Faq}. 
     * 
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();
    
    /** 
     * <p>
     *   Does the same thing as {@link #loadAll()} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     * 
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * Creates an instance of es.pode.contenidos.negocio.faqs.dominio.Faq and adds it to the persistent store.
     */
    public es.pode.contenidos.negocio.faqs.dominio.Faq create(es.pode.contenidos.negocio.faqs.dominio.Faq faq);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.faqs.dominio.Faq)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(int transform, es.pode.contenidos.negocio.faqs.dominio.Faq faq);

    /**
     * Creates a new instance of es.pode.contenidos.negocio.faqs.dominio.Faq and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of es.pode.contenidos.negocio.faqs.dominio.Faq
     *        instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.faqs.dominio.Faq)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     *   Creates a new <code>es.pode.contenidos.negocio.faqs.dominio.Faq</code>
     *   instance from <strong>all</strong> attributes and adds it to
     *   the persistent store.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.dominio.Faq create(
        java.util.Date fechaModificacion,
        java.util.Date fechaBaja,
        java.util.Date fechaPublicacion,
        java.lang.String param);

    /**
     * <p>
     *   Does the same thing as {@link #create(java.util.Date, java.util.Date, java.util.Date, java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.util.Date fechaModificacion,
        java.util.Date fechaBaja,
        java.util.Date fechaPublicacion,
        java.lang.String param);

    /**
     * <p>
     *  Creates a new <code>es.pode.contenidos.negocio.faqs.dominio.Faq</code>
     *  instance from only <strong>required</strong> properties (attributes
     *  and association ends) and adds it to the persistent store.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.dominio.Faq create(
        es.pode.contenidos.negocio.faqs.dominio.CategoriaFaq categoria,
        java.util.Collection descripcionFaq);

    /**
     * <p>
     *   Does the same thing as {@link #create()} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(
        int transform,
        es.pode.contenidos.negocio.faqs.dominio.CategoriaFaq categoria,
        java.util.Collection descripcionFaq);

    /**
     * Updates the <code>faq</code> instance in the persistent store.
     */
    public void update(es.pode.contenidos.negocio.faqs.dominio.Faq faq);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of es.pode.contenidos.negocio.faqs.dominio.Faq from the persistent store.
     */
    public void remove(es.pode.contenidos.negocio.faqs.dominio.Faq faq);

    /**
     * Removes the instance of es.pode.contenidos.negocio.faqs.dominio.Faq having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities<code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * <p>
     * Obtiene un listado de las FAQs existentes.
     * </p>
     */
    public java.util.List obtenerFaqs();

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqs()} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqs()}.
     * </p>
     */
    public java.util.List obtenerFaqs(String queryString);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqs()} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerFaqs(int transform);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqs(boolean)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqs(int)}.
     * </p>
     */
    public java.util.List obtenerFaqs(int transform, String queryString);

    /**
     * <p>
     * Obtiene las FAQs almacenadas en el intervalo de posiciones
     * indicado.
     * </p>
     */
    public java.util.List obtenerIntervaloFaqs(es.pode.contenidos.negocio.faqs.dominio.IntervaloCriteria criterio);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIntervaloFaqs(es.pode.contenidos.negocio.faqs.dominio.IntervaloCriteria)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerIntervaloFaqs(final int transform, final es.pode.contenidos.negocio.faqs.dominio.IntervaloCriteria criterio);

    /**
     * <p>
     * Obtiene las preguntas escritas en el idioma deseado.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdioma(java.lang.String param);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdioma(java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdioma(java.lang.String)}.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdioma(String queryString, java.lang.String param);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdioma(java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdioma(int transform, java.lang.String param);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdioma(boolean, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdioma(int, java.lang.String param)}.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdioma(int transform, String queryString, java.lang.String param);

    /**
     * 
     */
    public java.util.Collection obtenerFaqsPorIdiomaCategoria(java.lang.String param, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdiomaCategoria(java.lang.String, java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdiomaCategoria(java.lang.String, java.lang.Long)}.
     * </p>
     */
    public java.util.Collection obtenerFaqsPorIdiomaCategoria(String queryString, java.lang.String param, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdiomaCategoria(java.lang.String, java.lang.Long)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.Collection obtenerFaqsPorIdiomaCategoria(int transform, java.lang.String param, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdiomaCategoria(boolean, java.lang.String, java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdiomaCategoria(int, java.lang.String param, java.lang.Long id)}.
     * </p>
     */
    public java.util.Collection obtenerFaqsPorIdiomaCategoria(int transform, String queryString, java.lang.String param, java.lang.Long id);

    /**
     * 
     */
    public java.util.List obtenerIdiomasPorIdFaq(java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomasPorIdFaq(java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerIdiomasPorIdFaq(java.lang.Long)}.
     * </p>
     */
    public java.util.List obtenerIdiomasPorIdFaq(String queryString, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomasPorIdFaq(java.lang.Long)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerIdiomasPorIdFaq(int transform, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomasPorIdFaq(boolean, java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerIdiomasPorIdFaq(int, java.lang.Long id)}.
     * </p>
     */
    public java.util.List obtenerIdiomasPorIdFaq(int transform, String queryString, java.lang.Long id);

    /**
     * 
     */
    public java.util.List obtenerFaqsPorIdCategoria(java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdCategoria(java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdCategoria(java.lang.Long)}.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdCategoria(String queryString, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdCategoria(java.lang.Long)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdCategoria(int transform, java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsPorIdCategoria(boolean, java.lang.Long)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsPorIdCategoria(int, java.lang.Long id)}.
     * </p>
     */
    public java.util.List obtenerFaqsPorIdCategoria(int transform, String queryString, java.lang.Long id);

    /**
     * 
     */
    public java.util.List obtenerFaqsOrdenadosIdioma();

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsOrdenadosIdioma()} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsOrdenadosIdioma()}.
     * </p>
     */
    public java.util.List obtenerFaqsOrdenadosIdioma(String queryString);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsOrdenadosIdioma()} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerFaqsOrdenadosIdioma(int transform);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsOrdenadosIdioma(boolean)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsOrdenadosIdioma(int)}.
     * </p>
     */
    public java.util.List obtenerFaqsOrdenadosIdioma(int transform, String queryString);

}
