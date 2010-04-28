// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.descargas.dominio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>es.pode.contenidos.negocio.descargas.dominio.DescDescarga</code>.
 * </p>
 *
 * @see es.pode.contenidos.negocio.descargas.dominio.DescDescarga
 */
public abstract class DescDescargaDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao
{



	
	/**
	 * Constant that identifies a mapping between an 
	 * entity (DescDescarga) and a VO (DescDescargaVO)
	 */
	public final static String DEF_MAPPING_DESCDESCARGA_DESCDESCARGAVO = "DEF_MAPPING_DESCDESCARGA_DESCDESCARGAVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (DescDescargaVO) and an entity (DescDescarga)
	 */
	public final static String DEF_MAPPING_DESCDESCARGAVO_DESCDESCARGA = "DEF_MAPPING_DESCDESCARGA_DESCDESCARGAVOPRIME";
	
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
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#load(int, java.lang.Long)
     */
    public Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.load - 'id' can not be null");
        }
        final java.util.List list = this.getHibernateTemplate().find(
            "from es.pode.contenidos.negocio.descargas.dominio.DescDescarga as entity where entity.id = ?", id);
        final Object entity = list != null && !list.isEmpty() ? list.iterator().next() : null;
        return transformEntity(transform, (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)entity);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#load(java.lang.Long)
     */
    public es.pode.contenidos.negocio.descargas.dominio.DescDescarga load(java.lang.Long id)
    {
        return (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)this.load(TRANSFORM_NONE, id);
    }
    
    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }
    
    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(es.pode.contenidos.negocio.descargas.dominio.DescDescargaImpl.class);
        this.transformEntities(transform, results);
        return results;
    }
    

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    public es.pode.contenidos.negocio.descargas.dominio.DescDescarga create(es.pode.contenidos.negocio.descargas.dominio.DescDescarga descDescarga)
    {
        return (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)this.create(TRANSFORM_NONE, descDescarga);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(int transform, es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    public Object create(final int transform, final es.pode.contenidos.negocio.descargas.dominio.DescDescarga descDescarga)
    {
        if (descDescarga == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.create - 'descDescarga' can not be null");
        }
        Object identifier = this.getHibernateTemplate().save(descDescarga);
        descDescarga.setId((java.lang.Long)identifier);
        return this.transformEntity(transform, descDescarga);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(java.lang.String, java.lang.String, java.lang.String)
     */
    public es.pode.contenidos.negocio.descargas.dominio.DescDescarga create(
        java.lang.String idioma,
        java.lang.String descripcion,
        java.lang.String titulo)
    {
        return (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)this.create(TRANSFORM_NONE, idioma, descripcion, titulo);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(int, java.lang.String, java.lang.String, java.lang.String)
     */
    public Object create(
        final int transform,
        java.lang.String idioma,
        java.lang.String descripcion,
        java.lang.String titulo)
    {
        es.pode.contenidos.negocio.descargas.dominio.DescDescarga entity = new es.pode.contenidos.negocio.descargas.dominio.DescDescargaImpl();
        entity.setIdioma(idioma);
        entity.setDescripcion(descripcion);
        entity.setTitulo(titulo);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(es.pode.contenidos.negocio.descargas.dominio.Descarga, java.lang.String, java.lang.String, java.lang.String)
     */
    public es.pode.contenidos.negocio.descargas.dominio.DescDescarga create(
        es.pode.contenidos.negocio.descargas.dominio.Descarga descarga,
        java.lang.String descripcion,
        java.lang.String idioma,
        java.lang.String titulo)
    {
        return (es.pode.contenidos.negocio.descargas.dominio.DescDescarga)this.create(TRANSFORM_NONE, descarga, descripcion, idioma, titulo);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#create(int, es.pode.contenidos.negocio.descargas.dominio.Descarga, java.lang.String, java.lang.String, java.lang.String)
     */
    public Object create(
        final int transform,
        es.pode.contenidos.negocio.descargas.dominio.Descarga descarga,
        java.lang.String descripcion,
        java.lang.String idioma,
        java.lang.String titulo)
    {
        es.pode.contenidos.negocio.descargas.dominio.DescDescarga entity = new es.pode.contenidos.negocio.descargas.dominio.DescDescargaImpl();
        entity.setDescarga(descarga);
        entity.setDescripcion(descripcion);
        entity.setIdioma(idioma);
        entity.setTitulo(titulo);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#update(es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    public void update(es.pode.contenidos.negocio.descargas.dominio.DescDescarga descDescarga)
    {
        if (descDescarga == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.update - 'descDescarga' can not be null");
        }
        this.getHibernateTemplate().update(descDescarga);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((es.pode.contenidos.negocio.descargas.dominio.DescDescarga)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#remove(es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    public void remove(es.pode.contenidos.negocio.descargas.dominio.DescDescarga descDescarga)
    {
        if (descDescarga == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.remove - 'descDescarga' can not be null");
        }
        this.getHibernateTemplate().delete(descDescarga);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.remove - 'id' can not be null");
        }
        es.pode.contenidos.negocio.descargas.dominio.DescDescarga entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "DescDescarga.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescarga#obtenerDescDescarga(es.pode.contenidos.negocio.descargas.dominio.DescDescargaCriteria)
     */
    public java.util.Collection obtenerDescDescarga(es.pode.contenidos.negocio.descargas.dominio.DescDescargaCriteria criteria)
    {
        return this.obtenerDescDescarga(TRANSFORM_NONE, criteria);
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescarga#obtenerDescDescarga(int, java.lang.String, es.pode.contenidos.negocio.descargas.dominio.DescDescargaCriteria)
     */
    public java.util.Collection obtenerDescDescarga(final int transform, final es.pode.contenidos.negocio.descargas.dominio.DescDescargaCriteria criteria)
    {
        try
        {
            es.pode.contenidos.negocio.CriteriaSearch criteriaSearch = new es.pode.contenidos.negocio.CriteriaSearch(super.getSession(false), es.pode.contenidos.negocio.descargas.dominio.DescDescargaImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(criteria.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(criteria.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(criteria.getMaximumResultSize());
            es.pode.contenidos.negocio.CriteriaSearchParameter parameter1 =
                new es.pode.contenidos.negocio.CriteriaSearchParameter(
                    criteria.getIdentificador(),
                    "descarga.identificador");
            criteriaSearch.addParameter(parameter1);
            es.pode.contenidos.negocio.CriteriaSearchParameter parameter2 =
                new es.pode.contenidos.negocio.CriteriaSearchParameter(
                    criteria.getIdioma(),
                    "idioma");
            criteriaSearch.addParameter(parameter2);
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
     * flag is set to one of the constants defined in <code>es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link es.pode.contenidos.negocio.descargas.dominio.DescDescarga} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link es.pode.contenidos.negocio.descargas.servicio.DescDescargaVO} - {@link TRANSFORM_DESCDESCARGAVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    private final Object transformEntity(final int transform, final es.pode.contenidos.negocio.descargas.dominio.DescDescarga entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao.TRANSFORM_DESCDESCARGAVO :
                    target = toDescDescargaVO(entity);
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
     * {@link #transformEntity(int,es.pode.contenidos.negocio.descargas.dominio.DescDescarga)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao</code>
     * @param entities the collection of entities to transform
     * @return the same collection as the argument, but this time containing the transformed entities
     * @see #transformEntity(int,es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    private final void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao.TRANSFORM_DESCDESCARGAVO :
                toDescDescargaVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#toDescDescargaVOCollection(java.util.Collection)
     */
    public final void toDescDescargaVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, DESCDESCARGAVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link DescDescargaDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.contenidos.negocio.descargas.dominio.DescDescargaDao#toDescDescargaVO(es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
     */
    protected es.pode.contenidos.negocio.descargas.servicio.DescDescargaVO toDescDescargaVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.contenidos.negocio.descargas.servicio.DescDescargaVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer DESCDESCARGAVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.contenidos.negocio.descargas.dominio.DescDescarga)
                {
                    result = toDescDescargaVO((es.pode.contenidos.negocio.descargas.dominio.DescDescarga)input);
                }
                else if (input instanceof Object[])
                {
                    result = toDescDescargaVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.contenidos.negocio.descargas.dominio.DescDescarga fromDescDescargaVO(final es.pode.contenidos.negocio.descargas.servicio.DescDescargaVO vo) {
        //default mapping between VO and entity
        return (es.pode.contenidos.negocio.descargas.dominio.DescDescarga) 
                  this.getBeanMapper().map(vo, es.pode.contenidos.negocio.descargas.dominio.DescDescargaImpl.class, DEF_MAPPING_DESCDESCARGAVO_DESCDESCARGA);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromDescDescargaVO(es.pode.contenidos.negocio.descargas.servicio.DescDescargaVO vo, es.pode.contenidos.negocio.descargas.dominio.DescDescarga entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_DESCDESCARGAVO_DESCDESCARGA);
    }
		
		
}