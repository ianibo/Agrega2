// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.faqs.dominio;

/**
 * @see es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq
 */
public interface DescripcionFaqDao
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
     * {@link es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO}.
     */
    public final static int TRANSFORM_DESCRIPCIONFAQVO = 1;

    /**
     * Converts this DAO's entity to an object of type {@link es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO}.
     */
    public es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO toDescripcionFaqVO(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO}.
     */
    public void toDescripcionFaqVOCollection(java.util.Collection entities);

    public es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq fromDescripcionFaqVO(es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO vo);
    
    public void fromDescripcionFaqVO(es.pode.contenidos.negocio.faqs.servicio.DescripcionFaqVO vo, es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq entity);    


    /**
     * Loads an instance of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq from the persistent store.
     */
    public es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq load(java.lang.Long id);

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
     * Loads all entities of type {@link es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq}. 
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
     * Creates an instance of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq and adds it to the persistent store.
     */
    public es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq create(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq descripcionFaq);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(int transform, es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq descripcionFaq);

    /**
     * Creates a new instance of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq
     *        instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq)} with an
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
     *   Creates a new <code>es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq</code>
     *   instance from <strong>all</strong> attributes and adds it to
     *   the persistent store.
     * </p>
     */
    public es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq create(
        java.lang.String pregunta,
        java.lang.String respuesta,
        java.lang.String idioma,
        java.lang.Integer posicion);

    /**
     * <p>
     *   Does the same thing as {@link #create(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String pregunta,
        java.lang.String respuesta,
        java.lang.String idioma,
        java.lang.Integer posicion);


    /**
     * Updates the <code>descripcionFaq</code> instance in the persistent store.
     */
    public void update(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq descripcionFaq);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq from the persistent store.
     */
    public void remove(es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq descripcionFaq);

    /**
     * Removes the instance of es.pode.contenidos.negocio.faqs.dominio.DescripcionFaq having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities<code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * 
     */
    public java.util.List obtenerFaqsDesde(java.lang.Integer posicion, java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsDesde(java.lang.Integer, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsDesde(java.lang.Integer, java.lang.String)}.
     * </p>
     */
    public java.util.List obtenerFaqsDesde(String queryString, java.lang.Integer posicion, java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsDesde(java.lang.Integer, java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerFaqsDesde(int transform, java.lang.Integer posicion, java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerFaqsDesde(boolean, java.lang.Integer, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerFaqsDesde(int, java.lang.Integer posicion, java.lang.String idioma)}.
     * </p>
     */
    public java.util.List obtenerFaqsDesde(int transform, String queryString, java.lang.Integer posicion, java.lang.String idioma);

    /**
     * 
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
     * 
     */
    public java.util.List obtenerDescripcionesPorIdioma(java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerDescripcionesPorIdioma(java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerDescripcionesPorIdioma(java.lang.String)}.
     * </p>
     */
    public java.util.List obtenerDescripcionesPorIdioma(String queryString, java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerDescripcionesPorIdioma(java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerDescripcionesPorIdioma(int transform, java.lang.String idioma);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerDescripcionesPorIdioma(boolean, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerDescripcionesPorIdioma(int, java.lang.String idioma)}.
     * </p>
     */
    public java.util.List obtenerDescripcionesPorIdioma(int transform, String queryString, java.lang.String idioma);

    /**
     * 
     */
    public java.util.List obtenerIdiomas();

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomas()} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerIdiomas()}.
     * </p>
     */
    public java.util.List obtenerIdiomas(String queryString);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomas()} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List obtenerIdiomas(int transform);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerIdiomas(boolean)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerIdiomas(int)}.
     * </p>
     */
    public java.util.List obtenerIdiomas(int transform, String queryString);

}