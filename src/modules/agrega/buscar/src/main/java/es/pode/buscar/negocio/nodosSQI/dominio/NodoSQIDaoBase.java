// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package es.pode.buscar.negocio.nodosSQI.dominio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI</code>.
 * </p>
 *
 * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI
 */
public abstract class NodoSQIDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao
{



	
	/**
	 * Constant that identifies a mapping between an 
	 * entity (NodoSQI) and a VO (NodoSQIVO)
	 */
	public final static String DEF_MAPPING_NODOSQI_NODOSQIVO = "DEF_MAPPING_NODOSQI_NODOSQIVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (NodoSQIVO) and an entity (NodoSQI)
	 */
	public final static String DEF_MAPPING_NODOSQIVO_NODOSQI = "DEF_MAPPING_NODOSQI_NODOSQIVOPRIME";
	
	/**
	 * Constant that identifies a mapping between an 
	 * entity (NodoSQI) and a VO (NodoDescripcionSQIVO)
	 */
	public final static String DEF_MAPPING_NODOSQI_NODODESCRIPCIONSQIVO = "DEF_MAPPING_NODOSQI_NODODESCRIPCIONSQIVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (NodoDescripcionSQIVO) and an entity (NodoSQI)
	 */
	public final static String DEF_MAPPING_NODODESCRIPCIONSQIVO_NODOSQI = "DEF_MAPPING_NODOSQI_NODODESCRIPCIONSQIVOPRIME";
	
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
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#load(int, java.lang.Long)
     */
    public Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.load - 'id' can not be null");
        }
        final java.util.List list = this.getHibernateTemplate().find(
            "from es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI as entity where entity.id = ?", id);
        final Object entity = list != null && !list.isEmpty() ? list.iterator().next() : null;
        return transformEntity(transform, (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)entity);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#load(java.lang.Long)
     */
    public es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI load(java.lang.Long id)
    {
        return (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)this.load(TRANSFORM_NONE, id);
    }
    
    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }
    
    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIImpl.class);
        this.transformEntities(transform, results);
        return results;
    }
    

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    public es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI create(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI nodoSQI)
    {
        return (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)this.create(TRANSFORM_NONE, nodoSQI);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(int transform, es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    public Object create(final int transform, final es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI nodoSQI)
    {
        if (nodoSQI == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.create - 'nodoSQI' can not be null");
        }
        Object identifier = this.getHibernateTemplate().save(nodoSQI);
        nodoSQI.setId((java.lang.Long)identifier);
        return this.transformEntity(transform, nodoSQI);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI create(
        java.lang.String urlServicio,
        java.lang.String gestorSesion,
        java.lang.String lenguajeConsulta,
        java.lang.String lenguajeRespuesta,
        java.lang.String descripcionNodo,
        java.lang.String usuario,
        java.lang.String clave,
        java.lang.String identificadorSesion,
        java.lang.String nombreNodo)
    {
        return (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)this.create(TRANSFORM_NONE, urlServicio, gestorSesion, lenguajeConsulta, lenguajeRespuesta, descripcionNodo, usuario, clave, identificadorSesion, nombreNodo);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#create(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public Object create(
        final int transform,
        java.lang.String urlServicio,
        java.lang.String gestorSesion,
        java.lang.String lenguajeConsulta,
        java.lang.String lenguajeRespuesta,
        java.lang.String descripcionNodo,
        java.lang.String usuario,
        java.lang.String clave,
        java.lang.String identificadorSesion,
        java.lang.String nombreNodo)
    {
        es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI entity = new es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIImpl();
        entity.setUrlServicio(urlServicio);
        entity.setGestorSesion(gestorSesion);
        entity.setLenguajeConsulta(lenguajeConsulta);
        entity.setLenguajeRespuesta(lenguajeRespuesta);
        entity.setDescripcionNodo(descripcionNodo);
        entity.setUsuario(usuario);
        entity.setClave(clave);
        entity.setIdentificadorSesion(identificadorSesion);
        entity.setNombreNodo(nombreNodo);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#update(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    public void update(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI nodoSQI)
    {
        if (nodoSQI == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.update - 'nodoSQI' can not be null");
        }
        this.getHibernateTemplate().update(nodoSQI);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#remove(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    public void remove(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI nodoSQI)
    {
        if (nodoSQI == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.remove - 'nodoSQI' can not be null");
        }
        this.getHibernateTemplate().delete(nodoSQI);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.remove - 'id' can not be null");
        }
        es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "NodoSQI.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#listarNodosSQI()
     */
    public java.util.List listarNodosSQI()
    {
        return this.listarNodosSQI(TRANSFORM_NONE);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#listarNodosSQI(java.lang.String)
     */
    public java.util.List listarNodosSQI(final java.lang.String queryString)
    {
        return this.listarNodosSQI(TRANSFORM_NONE, queryString);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#listarNodosSQI(int)
     */
    public java.util.List listarNodosSQI(final int transform)
    {
        return this.listarNodosSQI(transform, "from es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI nodo order by nodo.nombreNodo asc");
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#listarNodosSQI(int, java.lang.String)
     */
    public java.util.List listarNodosSQI(final int transform, final java.lang.String queryString)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
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
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#consultarNodosSQI(es.pode.buscar.negocio.nodosSQI.dominio.NodosSQIPorIDCriteria)
     */
    public java.util.List consultarNodosSQI(es.pode.buscar.negocio.nodosSQI.dominio.NodosSQIPorIDCriteria criterio)
    {
        return this.consultarNodosSQI(TRANSFORM_NONE, criterio);
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI#consultarNodosSQI(int, java.lang.String, es.pode.buscar.negocio.nodosSQI.dominio.NodosSQIPorIDCriteria)
     */
    public java.util.List consultarNodosSQI(final int transform, final es.pode.buscar.negocio.nodosSQI.dominio.NodosSQIPorIDCriteria criterio)
    {
        try
        {
            es.pode.buscar.negocio.CriteriaSearch criteriaSearch = new es.pode.buscar.negocio.CriteriaSearch(super.getSession(false), es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(criterio.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(criterio.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(criterio.getMaximumResultSize());
            es.pode.buscar.negocio.CriteriaSearchParameter parameter1 =
                new es.pode.buscar.negocio.CriteriaSearchParameter(
                    criterio.getIds(),
                    "id", es.pode.buscar.negocio.CriteriaSearchParameter.EQUAL_COMPARATOR);
            criteriaSearch.addParameter(parameter1);
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
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link es.pode.buscar.negocio.nodosSQI.servicio.NodoSQIVO} - {@link TRANSFORM_NODOSQIVO}</li>
     *   <li>{@link es.pode.buscar.negocio.nodosSQI.servicio.NodoDescripcionSQIVO} - {@link TRANSFORM_NODODESCRIPCIONSQIVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    private final Object transformEntity(final int transform, final es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao.TRANSFORM_NODOSQIVO :
                    target = toNodoSQIVO(entity);
                    break;
                case es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao.TRANSFORM_NODODESCRIPCIONSQIVO :
                    target = toNodoDescripcionSQIVO(entity);
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
     * {@link #transformEntity(int,es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao</code>
     * @param entities the collection of entities to transform
     * @return the same collection as the argument, but this time containing the transformed entities
     * @see #transformEntity(int,es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    private final void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao.TRANSFORM_NODOSQIVO :
                toNodoSQIVOCollection(entities);
                break;
            case es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao.TRANSFORM_NODODESCRIPCIONSQIVO :
                toNodoDescripcionSQIVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#toNodoSQIVOCollection(java.util.Collection)
     */
    public final void toNodoSQIVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, NODOSQIVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link NodoSQIDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#toNodoSQIVO(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    protected es.pode.buscar.negocio.nodosSQI.servicio.NodoSQIVO toNodoSQIVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.buscar.negocio.nodosSQI.servicio.NodoSQIVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer NODOSQIVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
                {
                    result = toNodoSQIVO((es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)input);
                }
                else if (input instanceof Object[])
                {
                    result = toNodoSQIVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI fromNodoSQIVO(final es.pode.buscar.negocio.nodosSQI.servicio.NodoSQIVO vo) {
        //default mapping between VO and entity
        return (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI) 
                  this.getBeanMapper().map(vo, es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIImpl.class, DEF_MAPPING_NODOSQIVO_NODOSQI);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromNodoSQIVO(es.pode.buscar.negocio.nodosSQI.servicio.NodoSQIVO vo, es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_NODOSQIVO_NODOSQI);
    }
		
		
    /**
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#toNodoDescripcionSQIVOCollection(java.util.Collection)
     */
    public final void toNodoDescripcionSQIVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, NODODESCRIPCIONSQIVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link NodoSQIDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIDao#toNodoDescripcionSQIVO(es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
     */
    protected es.pode.buscar.negocio.nodosSQI.servicio.NodoDescripcionSQIVO toNodoDescripcionSQIVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.buscar.negocio.nodosSQI.servicio.NodoDescripcionSQIVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer NODODESCRIPCIONSQIVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)
                {
                    result = toNodoDescripcionSQIVO((es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI)input);
                }
                else if (input instanceof Object[])
                {
                    result = toNodoDescripcionSQIVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI fromNodoDescripcionSQIVO(final es.pode.buscar.negocio.nodosSQI.servicio.NodoDescripcionSQIVO vo) {
        //default mapping between VO and entity
        return (es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI) 
                  this.getBeanMapper().map(vo, es.pode.buscar.negocio.nodosSQI.dominio.NodoSQIImpl.class, DEF_MAPPING_NODODESCRIPCIONSQIVO_NODOSQI);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromNodoDescripcionSQIVO(es.pode.buscar.negocio.nodosSQI.servicio.NodoDescripcionSQIVO vo, es.pode.buscar.negocio.nodosSQI.dominio.NodoSQI entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_NODODESCRIPCIONSQIVO_NODOSQI);
    }
		
		
}