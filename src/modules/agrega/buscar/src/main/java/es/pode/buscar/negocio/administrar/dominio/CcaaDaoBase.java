// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package es.pode.buscar.negocio.administrar.dominio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>es.pode.buscar.negocio.administrar.dominio.Ccaa</code>.
 * </p>
 *
 * @see es.pode.buscar.negocio.administrar.dominio.Ccaa
 */
public abstract class CcaaDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements es.pode.buscar.negocio.administrar.dominio.CcaaDao
{



	
	/**
	 * Constant that identifies a mapping between an 
	 * entity (Ccaa) and a VO (CcaaVO)
	 */
	public final static String DEF_MAPPING_CCAA_CCAAVO = "DEF_MAPPING_CCAA_CCAAVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (CcaaVO) and an entity (Ccaa)
	 */
	public final static String DEF_MAPPING_CCAAVO_CCAA = "DEF_MAPPING_CCAA_CCAAVOPRIME";
	
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
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#load(int, java.lang.Long)
     */
    public Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.load - 'id' can not be null");
        }
        final java.util.List list = this.getHibernateTemplate().find(
            "from es.pode.buscar.negocio.administrar.dominio.Ccaa as entity where entity.id = ?", id);
        final Object entity = list != null && !list.isEmpty() ? list.iterator().next() : null;
        return transformEntity(transform, (es.pode.buscar.negocio.administrar.dominio.Ccaa)entity);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#load(java.lang.Long)
     */
    public es.pode.buscar.negocio.administrar.dominio.Ccaa load(java.lang.Long id)
    {
        return (es.pode.buscar.negocio.administrar.dominio.Ccaa)this.load(TRANSFORM_NONE, id);
    }
    
    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }
    
    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(es.pode.buscar.negocio.administrar.dominio.CcaaImpl.class);
        this.transformEntities(transform, results);
        return results;
    }
    

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    public es.pode.buscar.negocio.administrar.dominio.Ccaa create(es.pode.buscar.negocio.administrar.dominio.Ccaa ccaa)
    {
        return (es.pode.buscar.negocio.administrar.dominio.Ccaa)this.create(TRANSFORM_NONE, ccaa);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(int transform, es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    public Object create(final int transform, final es.pode.buscar.negocio.administrar.dominio.Ccaa ccaa)
    {
        if (ccaa == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.create - 'ccaa' can not be null");
        }
        Object identifier = this.getHibernateTemplate().save(ccaa);
        ccaa.setId((java.lang.Long)identifier);
        return this.transformEntity(transform, ccaa);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (es.pode.buscar.negocio.administrar.dominio.Ccaa)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(java.lang.String, java.lang.String)
     */
    public es.pode.buscar.negocio.administrar.dominio.Ccaa create(
        java.lang.String codigo,
        java.lang.String descripcion)
    {
        return (es.pode.buscar.negocio.administrar.dominio.Ccaa)this.create(TRANSFORM_NONE, codigo, descripcion);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#create(int, java.lang.String, java.lang.String)
     */
    public Object create(
        final int transform,
        java.lang.String codigo,
        java.lang.String descripcion)
    {
        es.pode.buscar.negocio.administrar.dominio.Ccaa entity = new es.pode.buscar.negocio.administrar.dominio.CcaaImpl();
        entity.setCodigo(codigo);
        entity.setDescripcion(descripcion);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#update(es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    public void update(es.pode.buscar.negocio.administrar.dominio.Ccaa ccaa)
    {
        if (ccaa == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.update - 'ccaa' can not be null");
        }
        this.getHibernateTemplate().update(ccaa);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((es.pode.buscar.negocio.administrar.dominio.Ccaa)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#remove(es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    public void remove(es.pode.buscar.negocio.administrar.dominio.Ccaa ccaa)
    {
        if (ccaa == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.remove - 'ccaa' can not be null");
        }
        this.getHibernateTemplate().delete(ccaa);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.remove - 'id' can not be null");
        }
        es.pode.buscar.negocio.administrar.dominio.Ccaa entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Ccaa.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.Ccaa#obtenerCCAAs()
     */
    public java.util.List obtenerCCAAs()
    {
        return this.obtenerCCAAs(TRANSFORM_NONE);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.Ccaa#obtenerCCAAs(java.lang.String)
     */
    public java.util.List obtenerCCAAs(final java.lang.String queryString)
    {
        return this.obtenerCCAAs(TRANSFORM_NONE, queryString);
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.Ccaa#obtenerCCAAs(int)
     */
    public java.util.List obtenerCCAAs(final int transform)
    {
        return this.obtenerCCAAs(transform, "from es.pode.buscar.negocio.administrar.dominio.Ccaa ccaa order by ccaa.descripcion asc");
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.Ccaa#obtenerCCAAs(int, java.lang.String)
     */
    public java.util.List obtenerCCAAs(final int transform, final java.lang.String queryString)
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
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>es.pode.buscar.negocio.administrar.dominio.CcaaDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link es.pode.buscar.negocio.administrar.dominio.Ccaa} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link es.pode.buscar.negocio.administrar.servicio.CcaaVO} - {@link TRANSFORM_CCAAVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link es.pode.buscar.negocio.administrar.dominio.CcaaDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    private final Object transformEntity(final int transform, final es.pode.buscar.negocio.administrar.dominio.Ccaa entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case es.pode.buscar.negocio.administrar.dominio.CcaaDao.TRANSFORM_CCAAVO :
                    target = toCcaaVO(entity);
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
     * {@link #transformEntity(int,es.pode.buscar.negocio.administrar.dominio.Ccaa)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>es.pode.buscar.negocio.administrar.dominio.CcaaDao</code>
     * @param entities the collection of entities to transform
     * @return the same collection as the argument, but this time containing the transformed entities
     * @see #transformEntity(int,es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    private final void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case es.pode.buscar.negocio.administrar.dominio.CcaaDao.TRANSFORM_CCAAVO :
                toCcaaVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#toCcaaVOCollection(java.util.Collection)
     */
    public final void toCcaaVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, CCAAVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link CcaaDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.buscar.negocio.administrar.dominio.CcaaDao#toCcaaVO(es.pode.buscar.negocio.administrar.dominio.Ccaa)
     */
    protected es.pode.buscar.negocio.administrar.servicio.CcaaVO toCcaaVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.buscar.negocio.administrar.servicio.CcaaVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer CCAAVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.buscar.negocio.administrar.dominio.Ccaa)
                {
                    result = toCcaaVO((es.pode.buscar.negocio.administrar.dominio.Ccaa)input);
                }
                else if (input instanceof Object[])
                {
                    result = toCcaaVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.buscar.negocio.administrar.dominio.Ccaa fromCcaaVO(final es.pode.buscar.negocio.administrar.servicio.CcaaVO vo) {
        //default mapping between VO and entity
        return (es.pode.buscar.negocio.administrar.dominio.Ccaa) 
                  this.getBeanMapper().map(vo, es.pode.buscar.negocio.administrar.dominio.CcaaImpl.class, DEF_MAPPING_CCAAVO_CCAA);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromCcaaVO(es.pode.buscar.negocio.administrar.servicio.CcaaVO vo, es.pode.buscar.negocio.administrar.dominio.Ccaa entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_CCAAVO_CCAA);
    }
		
		
}