// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package es.pode.auditoria.negocio.dominio;

/**
 * @see es.pode.auditoria.negocio.dominio.Busqueda
 */
public interface BusquedaDao
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
     * {@link es.pode.auditoria.negocio.servicios.BusquedaVO}.
     */
    public final static int TRANSFORM_BUSQUEDAVO = 1;
    
    
    /**
     * Converts this DAO's entity to an object of type {@link es.pode.auditoria.negocio.servicios.BusquedaVO}.
     * @param entity es.pode.auditoria.negocio.dominio.Busqueda
     * @return es.pode.auditoria.negocio.servicios.BusquedaVO     
     */
    public es.pode.auditoria.negocio.servicios.BusquedaVO toBusquedaVO(es.pode.auditoria.negocio.dominio.Busqueda entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link es.pode.auditoria.negocio.servicios.BusquedaVO}.
     * @param entities java.util.Collection
     */
    public void toBusquedaVOCollection(java.util.Collection entities);

    public es.pode.auditoria.negocio.dominio.Busqueda fromBusquedaVO(es.pode.auditoria.negocio.servicios.BusquedaVO vo);
    
    public void fromBusquedaVO(es.pode.auditoria.negocio.servicios.BusquedaVO vo, es.pode.auditoria.negocio.dominio.Busqueda entity);    


    /**
     * Loads an instance of es.pode.auditoria.negocio.dominio.Busqueda from the persistent store.
     * @param id java.lang.Long
     * @return es.pode.auditoria.negocio.dominio.Busqueda     
     */
    public es.pode.auditoria.negocio.dominio.Busqueda load(java.lang.Long id);

    /**
     * <p>
     *   Does the same thing as {@link #load(java.lang.Long)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     *   optionally transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int   
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);
    
    /**
     * Loads all entities of type {@link es.pode.auditoria.negocio.dominio.Busqueda}. 
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
     * Creates an instance of es.pode.auditoria.negocio.dominio.Busqueda and adds it to the persistent store.
     * @param busqueda es.pode.auditoria.negocio.dominio.Busqueda
     * @return es.pode.auditoria.negocio.dominio.Busqueda     
     */
    public es.pode.auditoria.negocio.dominio.Busqueda create(es.pode.auditoria.negocio.dominio.Busqueda busqueda);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.auditoria.negocio.dominio.Busqueda)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int
     * @param busqueda es.pode.auditoria.negocio.dominio.Busqueda
     * @return Object     
     */
    public Object create(int transform, es.pode.auditoria.negocio.dominio.Busqueda busqueda);

    /**
     * Creates a new instance of es.pode.auditoria.negocio.dominio.Busqueda and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of es.pode.auditoria.negocio.dominio.Busqueda
     *        instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     *   Does the same thing as {@link #create(es.pode.auditoria.negocio.dominio.Busqueda)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int
     * @param entities java.util.Collection
     * @return java.util.Collection        
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     *   Creates a new <code>es.pode.auditoria.negocio.dominio.Busqueda</code>
     *   instance from <strong>all</strong> attributes and adds it to
     *   the persistent store.
     * </p>
					 * @param terminoBuscado java.lang.String  
						    		 * @param usuario java.lang.String  
						    		 * @param tipo_busqueda java.lang.String  
						    		 * @param fecha java.util.Calendar  
						    		 * @param ambito_busqueda java.lang.String  
						    		 * @param tipo java.lang.String  
			     * @return es.pode.auditoria.negocio.dominio.Busqueda
     */
    public es.pode.auditoria.negocio.dominio.Busqueda create(
					java.lang.String terminoBuscado 
						,		java.lang.String usuario 
						,		java.lang.String tipo_busqueda 
						,		java.util.Calendar fecha 
						,		java.lang.String ambito_busqueda 
						,		java.lang.String tipo 
			);



    /**
     * <p>
     *   Does the same thing as {@link #create(java.lang.String, java.lang.String, java.lang.String, java.util.Calendar, java.lang.String, java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   the returned entity will <strong>NOT</strong> be transformed.  If this flag is any of the other constants
     *   defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entity (into a value object for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param int
					 * @param terminoBuscado java.lang.String 
						    		 * @param usuario java.lang.String 
						    		 * @param tipo_busqueda java.lang.String 
						    		 * @param fecha java.util.Calendar 
						    		 * @param ambito_busqueda java.lang.String 
						    		 * @param tipo java.lang.String 
			     * @return Object
     */
    public Object create(int transform,
					java.lang.String terminoBuscado 
						,		java.lang.String usuario 
						,		java.lang.String tipo_busqueda 
						,		java.util.Calendar fecha 
						,		java.lang.String ambito_busqueda 
						,		java.lang.String tipo 
			);



    /**
     * Updates the <code>busqueda</code> instance in the persistent store.
     * @param busqueda es.pode.auditoria.negocio.dominio.Busqueda
     */
    public void update(es.pode.auditoria.negocio.dominio.Busqueda busqueda);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities java.util.Collection
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of es.pode.auditoria.negocio.dominio.Busqueda from the persistent store.
     * @param busqueda es.pode.auditoria.negocio.dominio.Busqueda  
     */
    public void remove(es.pode.auditoria.negocio.dominio.Busqueda busqueda);

    /**
     * Removes the instance of es.pode.auditoria.negocio.dominio.Busqueda having the given
     * <code>identifier</code> from the persistent store.
     * @param id java.lang.Long
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities<code> collection.
     * @param entities java.util.Collection
     */
    public void remove(java.util.Collection entities);

    public java.util.List listarTerminosBuscadosDesdeHasta(java.util.Calendar fechaDesde, java.util.Calendar fechaHasta);

    /**
     * <p>
     *   Does the same thing as {@link #listarTerminosBuscadosDesdeHasta(java.util.Calendar, java.util.Calendar)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #listarTerminosBuscadosDesdeHasta(java.util.Calendar, java.util.Calendar)}.
     * </p>
     * @param queryString String
           * @return java.util.List
     */
    public java.util.List listarTerminosBuscadosDesdeHasta(String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta);

    /**
     * <p>
     *   Does the same thing as {@link #listarTerminosBuscadosDesdeHasta(java.util.Calendar, java.util.Calendar)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int
           * @return java.util.List
     */
    public java.util.List listarTerminosBuscadosDesdeHasta(int transform, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta);

    /**
     * <p>
     *   Does the same thing as {@link #listarTerminosBuscadosDesdeHasta(boolean, java.util.Calendar, java.util.Calendar)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #listarTerminosBuscadosDesdeHasta(int, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta)}.
     * </p>
     * @param transform int
     * @param queryString String     
           * @return java.util.List
     */
    public java.util.List listarTerminosBuscadosDesdeHasta(int transform, String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta);

    public java.lang.Long listarNumBusquedasDesdeHasta(java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String ambito_busqueda);

    /**
     * <p>
     *   Does the same thing as {@link #listarNumBusquedasDesdeHasta(java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #listarNumBusquedasDesdeHasta(java.util.Calendar, java.util.Calendar, java.lang.String)}.
     * </p>
     * @param queryString String
              * @return java.lang.Long
     */
    public java.lang.Long listarNumBusquedasDesdeHasta(String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String ambito_busqueda);

    /**
     * <p>
     *   Does the same thing as {@link #listarNumBusquedasDesdeHasta(java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int
              * @return Object
     */
    public Object listarNumBusquedasDesdeHasta(int transform, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String ambito_busqueda);

    /**
     * <p>
     *   Does the same thing as {@link #listarNumBusquedasDesdeHasta(boolean, java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #listarNumBusquedasDesdeHasta(int, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String ambito_busqueda)}.
     * </p>
     * @param transform int
     * @param queryString String     
              * @return Object
     */
    public Object listarNumBusquedasDesdeHasta(int transform, String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String ambito_busqueda);

    public java.lang.Long obtenerNumTerminosBuscados(java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String terminoBuscado);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerNumTerminosBuscados(java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerNumTerminosBuscados(java.util.Calendar, java.util.Calendar, java.lang.String)}.
     * </p>
     * @param queryString String
              * @return java.lang.Long
     */
    public java.lang.Long obtenerNumTerminosBuscados(String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String terminoBuscado);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerNumTerminosBuscados(java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional flag called <code>transform</code>.  If this flag is set to <code>TRANSFORM_NONE</code> then
     *   finder results will <strong>NOT</strong> be transformed during retrieval.
     *   If this flag is any of the other constants defined here
     *   then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     *   transform the entities (into value objects for example).  By default, transformation does
     *   not occur.
     * </p>
     * @param transform int
              * @return Object
     */
    public Object obtenerNumTerminosBuscados(int transform, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String terminoBuscado);

    /**
     * <p>
     *   Does the same thing as {@link #obtenerNumTerminosBuscados(boolean, java.util.Calendar, java.util.Calendar, java.lang.String)} with an
     *   additional argument called <code>queryString</code>.  This <code>queryString</code>
     *   argument allows you to override the query string defined in {@link #obtenerNumTerminosBuscados(int, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String terminoBuscado)}.
     * </p>
     * @param transform int
     * @param queryString String     
              * @return Object
     */
    public Object obtenerNumTerminosBuscados(int transform, String queryString, java.util.Calendar fechaDesde, java.util.Calendar fechaHasta, java.lang.String terminoBuscado);

}
