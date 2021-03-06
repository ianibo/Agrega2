// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package es.pode.modificador.negocio.dominio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>es.pode.modificador.negocio.dominio.Modificacion</code>.
 * </p>
 *
 * @see es.pode.modificador.negocio.dominio.Modificacion
 */
public abstract class ModificacionDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements es.pode.modificador.negocio.dominio.ModificacionDao
{



	

	/**
	 * Constant that identifies a mapping between an 
	 * entity (Modificacion) and a VO (ModificacionVO)
	 */
	public final static String DEF_MAPPING_MODIFICACION_MODIFICACIONVO = "DEF_MAPPING_MODIFICACION_MODIFICACIONVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (ModificacionVO) and an entity (Modificacion)
	 */
	public final static String DEF_MAPPING_MODIFICACIONVO_MODIFICACION = "DEF_MAPPING_MODIFICACIONVO_MODIFICACION";
	
	/**
	 * Reference to the dozer bean mapper used in the application (singleton).
	 */
	private MapperIF beanMapper;
	
	/**
	 * Gets the reference to the dozer bean mapper used in the application (singleton).
	 * @return MapperIF
	 */
    protected MapperIF getBeanMapper() {
		return beanMapper;
	}

    /**
     * Sets the instance of the Dozer bean mapper to be used.
     * @param beanMapper
     */
	public void setBeanMapper(MapperIF beanMapper) {
		this.beanMapper = beanMapper;
	}


    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#load(int, java.lang.Long)
     */
    public Object load(final int transform, final java.lang.Long idModificacion)
    {
        if (idModificacion == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.load - 'idModificacion' can not be null");
        }
        final java.util.List list = this.getHibernateTemplate().find(
            "from es.pode.modificador.negocio.dominio.Modificacion as entity where entity.idModificacion = ?", idModificacion);
        final Object entity = list != null && !list.isEmpty() ? list.iterator().next() : null;
        return transformEntity(transform, (es.pode.modificador.negocio.dominio.Modificacion)entity);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#load(java.lang.Long)
     */
    public es.pode.modificador.negocio.dominio.Modificacion load(java.lang.Long idModificacion)
    {
        return (es.pode.modificador.negocio.dominio.Modificacion)this.load(TRANSFORM_NONE, idModificacion);
    }
    
    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }
    
    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(es.pode.modificador.negocio.dominio.ModificacionImpl.class);
        this.transformEntities(transform, results);
        return results;
    }
    

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(es.pode.modificador.negocio.dominio.Modificacion)
     */
    public es.pode.modificador.negocio.dominio.Modificacion create(es.pode.modificador.negocio.dominio.Modificacion modificacion)
    {
        return (es.pode.modificador.negocio.dominio.Modificacion)this.create(TRANSFORM_NONE, modificacion);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(int transform, es.pode.modificador.negocio.dominio.Modificacion)
     */
    public Object create(final int transform, final es.pode.modificador.negocio.dominio.Modificacion modificacion)
    {
        if (modificacion == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.create - 'modificacion' can not be null");
        }
        Object identifier = this.getHibernateTemplate().save(modificacion);
        modificacion.setIdModificacion((java.lang.Long)identifier);
        return this.transformEntity(transform, modificacion);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (es.pode.modificador.negocio.dominio.Modificacion)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(int, java.lang.String,java.lang.String,es.pode.modificador.negocio.utilidades.EstadosTarea,java.lang.String,java.util.Calendar,java.lang.String,java.lang.String,java.util.Calendar)
     */
    public es.pode.modificador.negocio.dominio.Modificacion create(
 java.lang.String nombre, java.lang.String path, es.pode.modificador.negocio.utilidades.EstadosTarea resultado, java.lang.String idPlanificador, java.util.Calendar fechaEjecucion, java.lang.String msgError, java.lang.String user, java.util.Calendar fechaModificacion)
    {
         return (es.pode.modificador.negocio.dominio.Modificacion)this.create(TRANSFORM_NONE,  nombre, path, resultado, idPlanificador, fechaEjecucion, msgError, user, fechaModificacion);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(int, java.lang.String,java.lang.String,es.pode.modificador.negocio.utilidades.EstadosTarea,java.lang.String,java.util.Calendar,java.lang.String,java.lang.String,java.util.Calendar)
     */
    public Object create(
        final int transform,
 java.lang.String nombre, java.lang.String path, es.pode.modificador.negocio.utilidades.EstadosTarea resultado, java.lang.String idPlanificador, java.util.Calendar fechaEjecucion, java.lang.String msgError, java.lang.String user, java.util.Calendar fechaModificacion)
    {
        es.pode.modificador.negocio.dominio.Modificacion entity = new es.pode.modificador.negocio.dominio.ModificacionImpl();
        entity.setNombre(nombre);
        entity.setPath(path);
        entity.setResultado(resultado);
        entity.setIdPlanificador(idPlanificador);
        entity.setFechaEjecucion(fechaEjecucion);
        entity.setMsgError(msgError);
        entity.setUser(user);
        entity.setFechaModificacion(fechaModificacion);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(java.util.Calendar,)java.lang.String,)java.lang.String,)es.pode.modificador.negocio.utilidades.EstadosTarea,)java.util.Collection,)java.lang.String     */
    public es.pode.modificador.negocio.dominio.Modificacion create(
		java.lang.String nombre,
		java.lang.String path,
		es.pode.modificador.negocio.utilidades.EstadosTarea resultado,
		java.lang.String idPlanificador,
		java.util.Calendar fechaEjecucion,
		java.lang.String msgError,
		java.lang.String user,
		java.util.Calendar fechaModificacion,
		java.util.Collection resultados)
    {
        return (es.pode.modificador.negocio.dominio.Modificacion)this.create(TRANSFORM_NONE,
																  nombre,
																  path,
																  resultado,
																  idPlanificador,
																  fechaEjecucion,
																  msgError,
																  user,
																  fechaModificacion,
		                                                          resultados);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#create(int, java.util.Calendar, java.lang.String, java.lang.String, es.pode.modificador.negocio.utilidades.EstadosTarea, es.pode.modificador.negocio.dominio.ResultadoModificacion, java.lang.String)
     */
    public Object create(
        final int transform,
		java.lang.String nombre,
		java.lang.String path,
		es.pode.modificador.negocio.utilidades.EstadosTarea resultado,
		java.lang.String idPlanificador,
		java.util.Calendar fechaEjecucion,
		java.lang.String msgError,
		java.lang.String user,
		java.util.Calendar fechaModificacion,
		java.util.Collection resultados)
    {
        es.pode.modificador.negocio.dominio.Modificacion entity = new es.pode.modificador.negocio.dominio.ModificacionImpl();
		entity.setNombre(nombre);
		entity.setPath(path);
		entity.setResultado(resultado);
		entity.setIdPlanificador(idPlanificador);
		entity.setFechaEjecucion(fechaEjecucion);
		entity.setMsgError(msgError);
		entity.setUser(user);
		entity.setFechaModificacion(fechaModificacion);
		entity.setResultados(resultados);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#update(es.pode.modificador.negocio.dominio.Modificacion)
     */
    public void update(es.pode.modificador.negocio.dominio.Modificacion modificacion)
    {
        if (modificacion == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.update - 'modificacion' can not be null");
        }
        this.getHibernateTemplate().update(modificacion);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((es.pode.modificador.negocio.dominio.Modificacion)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#remove(es.pode.modificador.negocio.dominio.Modificacion)
     */
    public void remove(es.pode.modificador.negocio.dominio.Modificacion modificacion)
    {
        if (modificacion == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.remove - 'modificacion' can not be null");
        }
        this.getHibernateTemplate().delete(modificacion);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long idModificacion)
    {
        if (idModificacion == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.remove - 'idModificacion' can not be null");
        }
        es.pode.modificador.negocio.dominio.Modificacion entity = this.load(idModificacion);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Modificacion.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorEstado(es.pode.modificador.negocio.dominio.ModificacionEstadoCriteria)
     */
    public java.util.Collection obtenerModificacionesPorEstado(es.pode.modificador.negocio.dominio.ModificacionEstadoCriteria resultado)
    {
        return this.obtenerModificacionesPorEstado(TRANSFORM_NONE, resultado);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorEstado(int, java.lang.String, es.pode.modificador.negocio.dominio.ModificacionEstadoCriteria)
     */
    public java.util.Collection obtenerModificacionesPorEstado(final int transform, final es.pode.modificador.negocio.dominio.ModificacionEstadoCriteria resultado)
    {
        try
        {
            es.pode.modificador.CriteriaSearch criteriaSearch = new es.pode.modificador.CriteriaSearch(super.getSession(false), es.pode.modificador.negocio.dominio.ModificacionImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(resultado.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(resultado.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(resultado.getMaximumResultSize());
									            es.pode.modificador.CriteriaSearchParameter parameter1 =
                new es.pode.modificador.CriteriaSearchParameter(
                    resultado.getResultado(),
                    "resultado");
            criteriaSearch.addParameter(parameter1);
									            es.pode.modificador.CriteriaSearchParameter parameter2 =
                new es.pode.modificador.CriteriaSearchParameter(
                    resultado.getFechaModificacion(),
                    "fechaModificacion");
            parameter2.setOrderDirection(es.pode.modificador.CriteriaSearchParameter.ORDER_DESC);
            parameter2.setOrderRelevance(-1);
            criteriaSearch.addParameter(parameter2);
            // Call this method to include any modification to the criteria, default implementation is void.
            criteriaSearch = modifyobtenerModificacionesPorEstado(criteriaSearch);
            java.util.List results = criteriaSearch.executeAsList();
            transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }
    
    /**
     * Defauly implementation. Overrride to include any distinct search.
     * 
     * @param criteriaSearch The criteriaSearch to modify.          
     */
    protected es.pode.modificador.CriteriaSearch modifyobtenerModificacionesPorEstado (es.pode.modificador.CriteriaSearch criteriaSearch){
        return criteriaSearch;
    }
    

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorNombre(java.lang.String)
     */
    public java.util.Collection obtenerModificacionesPorNombre(java.lang.String nombre)
    {
        return this.obtenerModificacionesPorNombre(TRANSFORM_NONE, nombre);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorNombre(java.lang.String, java.lang.String)
     */
    public java.util.Collection obtenerModificacionesPorNombre(final java.lang.String queryString, final java.lang.String nombre)
    {
        return this.obtenerModificacionesPorNombre(TRANSFORM_NONE, queryString, nombre);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorNombre(int, java.lang.String)
     */
    public java.util.Collection obtenerModificacionesPorNombre(final int transform, final java.lang.String nombre)
    {
        return this.obtenerModificacionesPorNombre(transform, "from es.pode.modificador.negocio.dominio.Modificacion as modificacion where modificacion.nombre = :nombre", nombre);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesPorNombre(int, java.lang.String, java.lang.String)
     */
    public java.util.Collection obtenerModificacionesPorNombre(final int transform, final java.lang.String queryString, final java.lang.String nombre)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
            queryObject.setParameter("nombre", nombre);
            java.util.List results = queryObject.list();
            transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesOde(es.pode.modificador.negocio.dominio.ModificacionOdeCriteria)
     */
    public java.util.Collection obtenerModificacionesOde(es.pode.modificador.negocio.dominio.ModificacionOdeCriteria criteria)
    {
        return this.obtenerModificacionesOde(TRANSFORM_NONE, criteria);
    }

    /**
     * @see es.pode.modificador.negocio.dominio.Modificacion#obtenerModificacionesOde(int, java.lang.String, es.pode.modificador.negocio.dominio.ModificacionOdeCriteria)
     */
    public java.util.Collection obtenerModificacionesOde(final int transform, final es.pode.modificador.negocio.dominio.ModificacionOdeCriteria criteria)
    {
        try
        {
            es.pode.modificador.CriteriaSearch criteriaSearch = new es.pode.modificador.CriteriaSearch(super.getSession(false), es.pode.modificador.negocio.dominio.ModificacionImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(criteria.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(criteria.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(criteria.getMaximumResultSize());
									            es.pode.modificador.CriteriaSearchParameter parameter1 =
                new es.pode.modificador.CriteriaSearchParameter(
                    criteria.getPathOriginal(),
                    "resultados.pathOriginal");
            criteriaSearch.addParameter(parameter1);
									            es.pode.modificador.CriteriaSearchParameter parameter2 =
                new es.pode.modificador.CriteriaSearchParameter(
                    criteria.getStatus(),
                    "resultados.status");
            criteriaSearch.addParameter(parameter2);
									            es.pode.modificador.CriteriaSearchParameter parameter3 =
                new es.pode.modificador.CriteriaSearchParameter(
                    criteria.getPathBackup(),
                    "resultados.pathBackup", org.hibernate.criterion.MatchMode.START);
            criteriaSearch.addParameter(parameter3);
            // Call this method to include any modification to the criteria, default implementation is void.
            criteriaSearch = modifyobtenerModificacionesOde(criteriaSearch);
            java.util.List results = criteriaSearch.executeAsList();
            transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }
    
    /**
     * Defauly implementation. Overrride to include any distinct search.
     * 
     * @param criteriaSearch The criteriaSearch to modify.          
     */
    protected es.pode.modificador.CriteriaSearch modifyobtenerModificacionesOde (es.pode.modificador.CriteriaSearch criteriaSearch){
        return criteriaSearch;
    }
    

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>es.pode.modificador.negocio.dominio.ModificacionDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link es.pode.modificador.negocio.dominio.Modificacion} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link es.pode.modificador.negocio.servicio.ModificacionVO} - {@link TRANSFORM_MODIFICACIONVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link es.pode.modificador.negocio.dominio.ModificacionDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    private final Object transformEntity(final int transform, final es.pode.modificador.negocio.dominio.Modificacion entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case es.pode.modificador.negocio.dominio.ModificacionDao.TRANSFORM_MODIFICACIONVO :
                    target = toModificacionVO(entity);
                    break;
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,es.pode.modificador.negocio.dominio.Modificacion)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>es.pode.modificador.negocio.dominio.ModificacionDao</code>
     * @param entities the collection of entities to transform
     * @return the same collection as the argument, but this time containing the transformed entities
     * @see #transformEntity(int,es.pode.modificador.negocio.dominio.Modificacion)
     */
    private final void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case es.pode.modificador.negocio.dominio.ModificacionDao.TRANSFORM_MODIFICACIONVO :
                toModificacionVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#toModificacionVOCollection(java.util.Collection)
     */
    public final void toModificacionVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, MODIFICACIONVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link ModificacionDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.modificador.negocio.dominio.ModificacionDao#toModificacionVO(es.pode.modificador.negocio.dominio.Modificacion)
     */
    protected es.pode.modificador.negocio.servicio.ModificacionVO toModificacionVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.modificador.negocio.servicio.ModificacionVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer MODIFICACIONVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.modificador.negocio.dominio.Modificacion)
                {
                    result = toModificacionVO((es.pode.modificador.negocio.dominio.Modificacion)input);
                }
                else if (input instanceof Object[])
                {
                    result = toModificacionVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.modificador.negocio.dominio.Modificacion fromModificacionVO(final es.pode.modificador.negocio.servicio.ModificacionVO vo) {
        //default mapping between VO and entity
        return (es.pode.modificador.negocio.dominio.Modificacion) 
                  this.getBeanMapper().map(vo, es.pode.modificador.negocio.dominio.ModificacionImpl.class, DEF_MAPPING_MODIFICACIONVO_MODIFICACION);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromModificacionVO(es.pode.modificador.negocio.servicio.ModificacionVO vo, es.pode.modificador.negocio.dominio.Modificacion entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_MODIFICACIONVO_MODIFICACION);
    }
		
		
}