// license-header java merge-point
package es.pode.visualizador.presentacion.feeds.agregadorFeeds;

public class FormularioQueEsEstoVolverFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , es.pode.visualizador.presentacion.feeds.agregadorFeeds.ObtenerFeedsForm
{
    private es.pode.agregador.negocio.agregador.servicio.FeedVO[] feeds;
    private java.lang.Object[] feedsValueList;
    private java.lang.Object[] feedsLabelList;

    public FormularioQueEsEstoVolverFormImpl()
    {
    }

    /**
     * Resets the given <code>feeds</code>.
     */
    public void resetFeeds()
    {
        this.feeds = null;
    }

    public void setFeeds(es.pode.agregador.negocio.agregador.servicio.FeedVO[] feeds)
    {
        this.feeds = feeds;
    }

    /**
     * 
     */
    public es.pode.agregador.negocio.agregador.servicio.FeedVO[] getFeeds()
    {
        return this.feeds;
    }
    
    public java.lang.Object[] getFeedsBackingList()
    {
        java.lang.Object[] values = this.feedsValueList;
        java.lang.Object[] labels = this.feedsLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getFeedsValueList()
    {
        return this.feedsValueList;
    }

    public void setFeedsValueList(java.lang.Object[] feedsValueList)
    {
        this.feedsValueList = feedsValueList;
    }

    public java.lang.Object[] getFeedsLabelList()
    {
        return this.feedsLabelList;
    }

    public void setFeedsLabelList(java.lang.Object[] feedsLabelList)
    {
        this.feedsLabelList = feedsLabelList;
    }

    public void setFeedsBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioQueEsEstoVolverFormImpl.setFeedsBackingList requires non-null property arguments");
        }

        this.feedsValueList = null;
        this.feedsLabelList = null;

        if (items != null)
        {
            this.feedsValueList = new java.lang.Object[items.size()];
            this.feedsLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.feedsValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.feedsLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioQueEsEstoVolverFormImpl.setFeedsBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        this.feeds = null;
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("feeds", this.feeds);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.feeds = null;
        this.feedsValueList = null;
        this.feedsLabelList = null;
    }

    /**
     * Override to provide population of current form with request parameters when validation fails.
     *
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public org.apache.struts.action.ActionErrors validate(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        final org.apache.struts.action.ActionErrors errors = super.validate(mapping, request);
        if (errors != null && !errors.isEmpty())
        {
            // we populate the current form with only the request parameters
            Object currentForm = request.getSession().getAttribute("form");
            // if we can't get the 'form' from the session, try from the request
            if (currentForm == null)
            {
                currentForm = request.getAttribute("form");
            }
            if (currentForm != null)
            {
                final java.util.Map parameters = new java.util.HashMap();
                for (final java.util.Enumeration names = request.getParameterNames(); names.hasMoreElements();)
                {
                    final String name = String.valueOf(names.nextElement());
                    parameters.put(name, request.getParameter(name));
                }
                try
                {
                    org.apache.commons.beanutils.BeanUtils.populate(currentForm, parameters);
                }
                catch (java.lang.Exception populateException)
                {
                    // ignore if we have an exception here (we just don't populate).
                }
            }
        }
        return errors;
    }

    public final static class LabelValue
    {
        private java.lang.Object label = null;
        private java.lang.Object value = null;

        public LabelValue(Object label, java.lang.Object value)
        {
            this.label = label;
            this.value = value;
        }

        public java.lang.Object getLabel()
        {
            return this.label;
        }

        public java.lang.Object getValue()
        {
            return this.value;
        }

        public java.lang.String toString()
        {
            return label + "=" + value;
        }
    }
}