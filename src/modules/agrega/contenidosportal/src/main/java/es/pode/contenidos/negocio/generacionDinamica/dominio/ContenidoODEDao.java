// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.generacionDinamica.dominio;

/**
 * @see es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE
 */
public interface ContenidoODEDao
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
     * {@link es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO}.
     */
    public final static int TRANSFORM_CONTENIDOODEVO = 1;

    /**
     * Converts this DAO's entity to an object of type {@link es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO}.
     */
    public es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO toContenidoODEVO(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO}.
     */
    public void toContenidoODEVOCollection(java.util.Collection entities);

    public es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE fromContenidoODEVO(es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO vo);
    
    public void fromContenidoODEVO(es.pode.contenidos.negocio.generacionDinamica.servicio.ContenidoODEVO vo, es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE entity);    


    /**
     * Loads an instance of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE from the persistent store.
     */
    public es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE load(java.lang.Long id);

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
     * Loads all entities of type {@link es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE}. 
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
     * Creates an instance of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE and adds it to the persistent store.
     */
    public es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE create(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE contenidoODE);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(int transform, es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE contenidoODE);

    /**
     * Creates a new instance of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE
     *        instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE)} with an
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
     *   Creates a new <code>es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE</code>
     *   instance from <strong>all</strong> attributes and adds it to
     *   the persistent store.
     * </p>
     */
    public es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE create(
        java.lang.String idODE,
        java.lang.String idioma,
        java.lang.String urlImagen,
        java.util.Date fecha);

    /**
     * <p>
     *   Does the same thing as {@link #create(java.lang.String, java.lang.String, java.lang.String, java.util.Date)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String idODE,
        java.lang.String idioma,
        java.lang.String urlImagen,
        java.util.Date fecha);


    /**
     * Updates the <code>contenidoODE</code> instance in the persistent store.
     */
    public void update(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE contenidoODE);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE from the persistent store.
     */
    public void remove(es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE contenidoODE);

    /**
     * Removes the instance of es.pode.contenidos.negocio.generacionDinamica.dominio.ContenidoODE having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities<code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * <p>
     * Este metodo busca el ODE que satisface el criterio de busqueda.
     * </p>
     */
    public java.util.List buscarODEPorCriterioFecha(es.pode.contenidos.negocio.generacionDinamica.dominio.FechaCriteria criterio);

    /**
     * <p>
     *   Does the same thing as {@link #buscarODEPorCriterioFecha(es.pode.contenidos.negocio.generacionDinamica.dominio.FechaCriteria)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List buscarODEPorCriterioFecha(final int transform, final es.pode.contenidos.negocio.generacionDinamica.dominio.FechaCriteria criterio);

    /**
     * 
     */
    public java.util.List buscarODEPorCriterioFechaDia(es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria fechaInicio, es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria fechaFin);

    /**
     * <p>
     *   Does the same thing as {@link #buscarODEPorCriterioFechaDia(es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria, es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     */
    public java.util.List buscarODEPorCriterioFechaDia(final int transform, final es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria fechaInicio, final es.pode.contenidos.negocio.generacionDinamica.dominio.FechaDiaCriteria fechaFin);

}
