// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package es.pode.contenidos.negocio.noticias.dominio;

import net.sf.dozer.util.mapping.MapperIF;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>es.pode.contenidos.negocio.noticias.dominio.Noticia</code>.
 * </p>
 *
 * @see es.pode.contenidos.negocio.noticias.dominio.Noticia
 */
public abstract class NoticiaDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements es.pode.contenidos.negocio.noticias.dominio.NoticiaDao
{



	
	/**
	 * Constant that identifies a mapping between an 
	 * entity (Noticia) and a VO (NoticiaVO)
	 */
	public final static String DEF_MAPPING_NOTICIA_NOTICIAVO = "DEF_MAPPING_NOTICIA_NOTICIAVO";
	
	/**
	 * Constant that identifies a mapping between a 
	 * VO (NoticiaVO) and an entity (Noticia)
	 */
	public final static String DEF_MAPPING_NOTICIAVO_NOTICIA = "DEF_MAPPING_NOTICIA_NOTICIAVOPRIME";
	
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
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#load(int, java.lang.Long)
     */
    public Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Noticia.load - 'id' can not be null");
        }
        final java.util.List list = this.getHibernateTemplate().find(
            "from es.pode.contenidos.negocio.noticias.dominio.Noticia as entity where entity.id = ?", id);
        final Object entity = list != null && !list.isEmpty() ? list.iterator().next() : null;
        return transformEntity(transform, (es.pode.contenidos.negocio.noticias.dominio.Noticia)entity);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#load(java.lang.Long)
     */
    public es.pode.contenidos.negocio.noticias.dominio.Noticia load(java.lang.Long id)
    {
        return (es.pode.contenidos.negocio.noticias.dominio.Noticia)this.load(TRANSFORM_NONE, id);
    }
    
    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }
    
    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        final java.util.Collection results = this.getHibernateTemplate().loadAll(es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl.class);
        this.transformEntities(transform, results);
        return results;
    }
    

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    public es.pode.contenidos.negocio.noticias.dominio.Noticia create(es.pode.contenidos.negocio.noticias.dominio.Noticia noticia)
    {
        return (es.pode.contenidos.negocio.noticias.dominio.Noticia)this.create(TRANSFORM_NONE, noticia);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(int transform, es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    public Object create(final int transform, final es.pode.contenidos.negocio.noticias.dominio.Noticia noticia)
    {
        if (noticia == null)
        {
            throw new IllegalArgumentException(
                "Noticia.create - 'noticia' can not be null");
        }
        Object identifier = this.getHibernateTemplate().save(noticia);
        noticia.setId((java.lang.Long)identifier);
        return this.transformEntity(transform, noticia);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Noticia.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (es.pode.contenidos.negocio.noticias.dominio.Noticia)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(java.util.Date, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.util.Date, java.util.Date)
     */
    public es.pode.contenidos.negocio.noticias.dominio.Noticia create(
        java.util.Date fechaPublicacion,
        java.lang.String URLImagen,
        java.lang.Integer alineamientoImg,
        java.lang.Boolean activa,
        java.lang.String autor,
        java.util.Date fechaBaja,
        java.util.Date fechaModificacion)
    {
        return (es.pode.contenidos.negocio.noticias.dominio.Noticia)this.create(TRANSFORM_NONE, fechaPublicacion, URLImagen, alineamientoImg, activa, autor, fechaBaja, fechaModificacion);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(int, java.util.Date, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.util.Date, java.util.Date)
     */
    public Object create(
        final int transform,
        java.util.Date fechaPublicacion,
        java.lang.String URLImagen,
        java.lang.Integer alineamientoImg,
        java.lang.Boolean activa,
        java.lang.String autor,
        java.util.Date fechaBaja,
        java.util.Date fechaModificacion)
    {
        es.pode.contenidos.negocio.noticias.dominio.Noticia entity = new es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl();
        entity.setFechaPublicacion(fechaPublicacion);
        entity.setURLImagen(URLImagen);
        entity.setAlineamientoImg(alineamientoImg);
        entity.setActiva(activa);
        entity.setAutor(autor);
        entity.setFechaBaja(fechaBaja);
        entity.setFechaModificacion(fechaModificacion);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia, es.pode.contenidos.negocio.noticias.dominio.DescripcionNoticia)
     */
    public es.pode.contenidos.negocio.noticias.dominio.Noticia create(
        es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia categoria,
        java.util.Collection descripcionNoticia)
    {
        return (es.pode.contenidos.negocio.noticias.dominio.Noticia)this.create(TRANSFORM_NONE, categoria, descripcionNoticia);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#create(int, es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia, es.pode.contenidos.negocio.noticias.dominio.DescripcionNoticia)
     */
    public Object create(
        final int transform,
        es.pode.contenidos.negocio.noticias.dominio.CategoriaNoticia categoria,
        java.util.Collection descripcionNoticia)
    {
        es.pode.contenidos.negocio.noticias.dominio.Noticia entity = new es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl();
        entity.setCategoria(categoria);
        entity.setDescripcionNoticia(descripcionNoticia);
        return this.create(transform, entity);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#update(es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    public void update(es.pode.contenidos.negocio.noticias.dominio.Noticia noticia)
    {
        if (noticia == null)
        {
            throw new IllegalArgumentException(
                "Noticia.update - 'noticia' can not be null");
        }
        this.getHibernateTemplate().update(noticia);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Noticia.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((es.pode.contenidos.negocio.noticias.dominio.Noticia)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#remove(es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    public void remove(es.pode.contenidos.negocio.noticias.dominio.Noticia noticia)
    {
        if (noticia == null)
        {
            throw new IllegalArgumentException(
                "Noticia.remove - 'noticia' can not be null");
        }
        this.getHibernateTemplate().delete(noticia);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "Noticia.remove - 'id' can not be null");
        }
        es.pode.contenidos.negocio.noticias.dominio.Noticia entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "Noticia.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdioma(java.lang.String)
     */
    public java.util.List obtenerNoticiasActivasPorIdioma(java.lang.String autor)
    {
        return this.obtenerNoticiasActivasPorIdioma(TRANSFORM_NONE, autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdioma(java.lang.String, java.lang.String)
     */
    public java.util.List obtenerNoticiasActivasPorIdioma(final java.lang.String queryString, final java.lang.String autor)
    {
        return this.obtenerNoticiasActivasPorIdioma(TRANSFORM_NONE, queryString, autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdioma(int, java.lang.String)
     */
    public java.util.List obtenerNoticiasActivasPorIdioma(final int transform, final java.lang.String autor)
    {
        return this.obtenerNoticiasActivasPorIdioma(transform, "from es.pode.contenidos.negocio.noticias.dominio.Noticia as noticias where noticias.descripcionNoticia.idioma= :autor and noticias.activa='t'", autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdioma(int, java.lang.String, java.lang.String)
     */
    public java.util.List obtenerNoticiasActivasPorIdioma(final int transform, final java.lang.String queryString, final java.lang.String autor)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("autor", autor);            	
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdiomayCategoria(java.lang.String, java.lang.Long)
     */
    public java.util.Collection obtenerNoticiasActivasPorIdiomayCategoria(java.lang.String autor, java.lang.Long id)
    {
        return this.obtenerNoticiasActivasPorIdiomayCategoria(TRANSFORM_NONE, autor, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdiomayCategoria(java.lang.String, java.lang.String, java.lang.Long)
     */
    public java.util.Collection obtenerNoticiasActivasPorIdiomayCategoria(final java.lang.String queryString, final java.lang.String autor, final java.lang.Long id)
    {
        return this.obtenerNoticiasActivasPorIdiomayCategoria(TRANSFORM_NONE, queryString, autor, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdiomayCategoria(int, java.lang.String, java.lang.Long)
     */
    public java.util.Collection obtenerNoticiasActivasPorIdiomayCategoria(final int transform, final java.lang.String autor, final java.lang.Long id)
    {
        return this.obtenerNoticiasActivasPorIdiomayCategoria(transform, "from es.pode.contenidos.negocio.noticias.dominio.Noticia as noticias where noticias.descripcionNoticia.idioma= :autor and noticias.activa='t' and noticias.categoria.id= :id", autor, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivasPorIdiomayCategoria(int, java.lang.String, java.lang.String, java.lang.Long)
     */
    public java.util.Collection obtenerNoticiasActivasPorIdiomayCategoria(final int transform, final java.lang.String queryString, final java.lang.String autor, final java.lang.Long id)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("autor", autor);            	
			queryObject.setParameter("id", id);            	
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticias()
     */
    public java.util.List obtenerNoticias()
    {
        return this.obtenerNoticias(TRANSFORM_NONE);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticias(java.lang.String)
     */
    public java.util.List obtenerNoticias(final java.lang.String queryString)
    {
        return this.obtenerNoticias(TRANSFORM_NONE, queryString);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticias(int)
     */
    public java.util.List obtenerNoticias(final int transform)
    {
        return this.obtenerNoticias(transform, "from es.pode.contenidos.negocio.noticias.dominio.Noticia noticia order by noticia.fechaPublicacion desc");
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticias(int, java.lang.String)
     */
    public java.util.List obtenerNoticias(final int transform, final java.lang.String queryString)
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivas(es.pode.contenidos.negocio.noticias.dominio.NoticiasActivasFechaCriteria)
     */
    public java.util.List obtenerNoticiasActivas(es.pode.contenidos.negocio.noticias.dominio.NoticiasActivasFechaCriteria criterio)
    {
        return this.obtenerNoticiasActivas(TRANSFORM_NONE, criterio);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasActivas(int, java.lang.String, es.pode.contenidos.negocio.noticias.dominio.NoticiasActivasFechaCriteria)
     */
    public java.util.List obtenerNoticiasActivas(final int transform, final es.pode.contenidos.negocio.noticias.dominio.NoticiasActivasFechaCriteria criterio)
    {
        try
        {
            es.pode.contenidos.negocio.CriteriaSearch criteriaSearch = new es.pode.contenidos.negocio.CriteriaSearch(super.getSession(false), es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl.class);
            criteriaSearch.getConfiguration().setFirstResult(criterio.getFirstResult());
            criteriaSearch.getConfiguration().setFetchSize(criterio.getFetchSize());
            criteriaSearch.getConfiguration().setMaximumResultSize(criterio.getMaximumResultSize());
            es.pode.contenidos.negocio.CriteriaSearchParameter parameter1 =
                new es.pode.contenidos.negocio.CriteriaSearchParameter(
                    criterio.getFechaPublicacion(),
                    "fechaPublicacion");
            parameter1.setOrderDirection(es.pode.contenidos.negocio.CriteriaSearchParameter.ORDER_DESC);
            parameter1.setOrderRelevance(-1);
            criteriaSearch.addParameter(parameter1);
            es.pode.contenidos.negocio.CriteriaSearchParameter parameter2 =
                new es.pode.contenidos.negocio.CriteriaSearchParameter(
                    criterio.getActiva(),
                    "activa", es.pode.contenidos.negocio.CriteriaSearchParameter.EQUAL_COMPARATOR);
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasPorIdioma(java.lang.String)
     */
    public java.util.List obtenerNoticiasPorIdioma(java.lang.String autor)
    {
        return this.obtenerNoticiasPorIdioma(TRANSFORM_NONE, autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasPorIdioma(java.lang.String, java.lang.String)
     */
    public java.util.List obtenerNoticiasPorIdioma(final java.lang.String queryString, final java.lang.String autor)
    {
        return this.obtenerNoticiasPorIdioma(TRANSFORM_NONE, queryString, autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasPorIdioma(int, java.lang.String)
     */
    public java.util.List obtenerNoticiasPorIdioma(final int transform, final java.lang.String autor)
    {
        return this.obtenerNoticiasPorIdioma(transform, "from es.pode.contenidos.negocio.noticias.dominio.Noticia as noticias where noticias.descripcionNoticia.idioma= :autor ", autor);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasPorIdioma(int, java.lang.String, java.lang.String)
     */
    public java.util.List obtenerNoticiasPorIdioma(final int transform, final java.lang.String queryString, final java.lang.String autor)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("autor", autor);            	
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerIdiomasFromIdNoticia(java.lang.Long)
     */
    public java.util.List obtenerIdiomasFromIdNoticia(java.lang.Long id)
    {
        return this.obtenerIdiomasFromIdNoticia(TRANSFORM_NONE, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerIdiomasFromIdNoticia(java.lang.String, java.lang.Long)
     */
    public java.util.List obtenerIdiomasFromIdNoticia(final java.lang.String queryString, final java.lang.Long id)
    {
        return this.obtenerIdiomasFromIdNoticia(TRANSFORM_NONE, queryString, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerIdiomasFromIdNoticia(int, java.lang.Long)
     */
    public java.util.List obtenerIdiomasFromIdNoticia(final int transform, final java.lang.Long id)
    {
        return this.obtenerIdiomasFromIdNoticia(transform, "select noti.descripcionNoticia.idioma from es.pode.contenidos.negocio.noticias.dominio.Noticia as noti where noti.id=:id", id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerIdiomasFromIdNoticia(int, java.lang.String, java.lang.Long)
     */
    public java.util.List obtenerIdiomasFromIdNoticia(final int transform, final java.lang.String queryString, final java.lang.Long id)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);            	
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
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasByIdCategoria(java.lang.Long)
     */
    public java.util.List obtenerNoticiasByIdCategoria(java.lang.Long id)
    {
        return this.obtenerNoticiasByIdCategoria(TRANSFORM_NONE, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasByIdCategoria(java.lang.String, java.lang.Long)
     */
    public java.util.List obtenerNoticiasByIdCategoria(final java.lang.String queryString, final java.lang.Long id)
    {
        return this.obtenerNoticiasByIdCategoria(TRANSFORM_NONE, queryString, id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasByIdCategoria(int, java.lang.Long)
     */
    public java.util.List obtenerNoticiasByIdCategoria(final int transform, final java.lang.Long id)
    {
        return this.obtenerNoticiasByIdCategoria(transform, "from es.pode.contenidos.negocio.noticias.dominio.Noticia as noticias where noticias.categoria.id= :id", id);
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.Noticia#obtenerNoticiasByIdCategoria(int, java.lang.String, java.lang.Long)
     */
    public java.util.List obtenerNoticiasByIdCategoria(final int transform, final java.lang.String queryString, final java.lang.Long id)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);            	
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
     * flag is set to one of the constants defined in <code>es.pode.contenidos.negocio.noticias.dominio.NoticiaDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p/>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link es.pode.contenidos.negocio.noticias.dominio.Noticia} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link es.pode.contenidos.negocio.noticias.servicio.NoticiaVO} - {@link TRANSFORM_NOTICIAVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link es.pode.contenidos.negocio.noticias.dominio.NoticiaDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    private final Object transformEntity(final int transform, final es.pode.contenidos.negocio.noticias.dominio.Noticia entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case es.pode.contenidos.negocio.noticias.dominio.NoticiaDao.TRANSFORM_NOTICIAVO :
                    target = toNoticiaVO(entity);
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
     * {@link #transformEntity(int,es.pode.contenidos.negocio.noticias.dominio.Noticia)}
     * method. This method does not instantiate a new collection.
     * <p/>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>es.pode.contenidos.negocio.noticias.dominio.NoticiaDao</code>
     * @param entities the collection of entities to transform
     * @return the same collection as the argument, but this time containing the transformed entities
     * @see #transformEntity(int,es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    private final void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case es.pode.contenidos.negocio.noticias.dominio.NoticiaDao.TRANSFORM_NOTICIAVO :
                toNoticiaVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#toNoticiaVOCollection(java.util.Collection)
     */
    public final void toNoticiaVOCollection(java.util.Collection entities)
    {
        if (entities == null)
        {
            entities = java.util.Collections.EMPTY_LIST;
        }
        else
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, NOTICIAVO_TRANSFORMER);
        }
    }

    /**
     * Base implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link NoticiaDaoImpl} class if you intend to use reporting queries.
     * @see es.pode.contenidos.negocio.noticias.dominio.NoticiaDao#toNoticiaVO(es.pode.contenidos.negocio.noticias.dominio.Noticia)
     */
    protected es.pode.contenidos.negocio.noticias.servicio.NoticiaVO toNoticiaVO(Object[] row)
    {
        return null;
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link es.pode.contenidos.negocio.noticias.servicio.NoticiaVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private final org.apache.commons.collections.Transformer NOTICIAVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof es.pode.contenidos.negocio.noticias.dominio.Noticia)
                {
                    result = toNoticiaVO((es.pode.contenidos.negocio.noticias.dominio.Noticia)input);
                }
                else if (input instanceof Object[])
                {
                    result = toNoticiaVO((Object[])input);
                }
                return result;
            }
        };

	/**
	 * Copy a VO to a new entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @return A new entity created with the values extracted from the vo.
	 */
	public es.pode.contenidos.negocio.noticias.dominio.Noticia fromNoticiaVO(final es.pode.contenidos.negocio.noticias.servicio.NoticiaVO vo) {
        //default mapping between VO and entity
        return (es.pode.contenidos.negocio.noticias.dominio.Noticia) 
                  this.getBeanMapper().map(vo, es.pode.contenidos.negocio.noticias.dominio.NoticiaImpl.class, DEF_MAPPING_NOTICIAVO_NOTICIA);
    }

	/**
	 * Copy a VO to an existing entity using the default Dozer mappings.
	 * @param vo The source bean (VO)
	 * @param entity The destination bean (an existing entity)
	 */
    public void fromNoticiaVO(es.pode.contenidos.negocio.noticias.servicio.NoticiaVO vo, es.pode.contenidos.negocio.noticias.dominio.Noticia entity) {
        //default mapping between VO and entity
        this.getBeanMapper().map(vo, entity, DEF_MAPPING_NOTICIAVO_NOTICIA);
    }
		
		
}