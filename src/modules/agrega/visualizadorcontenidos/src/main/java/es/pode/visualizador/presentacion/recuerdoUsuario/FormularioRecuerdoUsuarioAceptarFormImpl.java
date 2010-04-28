// license-header java merge-point
package es.pode.visualizador.presentacion.recuerdoUsuario;

public class FormularioRecuerdoUsuarioAceptarFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , es.pode.visualizador.presentacion.recuerdoUsuario.NuevaClaveForm
{
    private java.lang.String nif;
    private java.lang.Object[] nifValueList;
    private java.lang.Object[] nifLabelList;
    private java.lang.String email;
    private java.lang.Object[] emailValueList;
    private java.lang.Object[] emailLabelList;
    private java.lang.String resultadoNuevaClave;
    private java.lang.Object[] resultadoNuevaClaveValueList;
    private java.lang.Object[] resultadoNuevaClaveLabelList;

    public FormularioRecuerdoUsuarioAceptarFormImpl()
    {
    }

    /**
     * Resets the given <code>nif</code>.
     */
    public void resetNif()
    {
        this.nif = null;
    }

    public void setNif(java.lang.String nif)
    {
        this.nif = nif;
    }

    /**
     * 
     */
    public java.lang.String getNif()
    {
        return this.nif;
    }
    
    public java.lang.Object[] getNifBackingList()
    {
        java.lang.Object[] values = this.nifValueList;
        java.lang.Object[] labels = this.nifLabelList;

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

    public java.lang.Object[] getNifValueList()
    {
        return this.nifValueList;
    }

    public void setNifValueList(java.lang.Object[] nifValueList)
    {
        this.nifValueList = nifValueList;
    }

    public java.lang.Object[] getNifLabelList()
    {
        return this.nifLabelList;
    }

    public void setNifLabelList(java.lang.Object[] nifLabelList)
    {
        this.nifLabelList = nifLabelList;
    }

    public void setNifBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioRecuerdoUsuarioAceptarFormImpl.setNifBackingList requires non-null property arguments");
        }

        this.nifValueList = null;
        this.nifLabelList = null;

        if (items != null)
        {
            this.nifValueList = new java.lang.Object[items.size()];
            this.nifLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.nifValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.nifLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioRecuerdoUsuarioAceptarFormImpl.setNifBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>email</code>.
     */
    public void resetEmail()
    {
        this.email = null;
    }

    public void setEmail(java.lang.String email)
    {
        this.email = email;
    }

    /**
     * 
     */
    public java.lang.String getEmail()
    {
        return this.email;
    }
    
    public java.lang.Object[] getEmailBackingList()
    {
        java.lang.Object[] values = this.emailValueList;
        java.lang.Object[] labels = this.emailLabelList;

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

    public java.lang.Object[] getEmailValueList()
    {
        return this.emailValueList;
    }

    public void setEmailValueList(java.lang.Object[] emailValueList)
    {
        this.emailValueList = emailValueList;
    }

    public java.lang.Object[] getEmailLabelList()
    {
        return this.emailLabelList;
    }

    public void setEmailLabelList(java.lang.Object[] emailLabelList)
    {
        this.emailLabelList = emailLabelList;
    }

    public void setEmailBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioRecuerdoUsuarioAceptarFormImpl.setEmailBackingList requires non-null property arguments");
        }

        this.emailValueList = null;
        this.emailLabelList = null;

        if (items != null)
        {
            this.emailValueList = new java.lang.Object[items.size()];
            this.emailLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.emailValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.emailLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioRecuerdoUsuarioAceptarFormImpl.setEmailBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>resultadoNuevaClave</code>.
     */
    public void resetResultadoNuevaClave()
    {
        this.resultadoNuevaClave = null;
    }

    public void setResultadoNuevaClave(java.lang.String resultadoNuevaClave)
    {
        this.resultadoNuevaClave = resultadoNuevaClave;
    }

    /**
     * 
     */
    public java.lang.String getResultadoNuevaClave()
    {
        return this.resultadoNuevaClave;
    }
    
    public java.lang.Object[] getResultadoNuevaClaveBackingList()
    {
        java.lang.Object[] values = this.resultadoNuevaClaveValueList;
        java.lang.Object[] labels = this.resultadoNuevaClaveLabelList;

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

    public java.lang.Object[] getResultadoNuevaClaveValueList()
    {
        return this.resultadoNuevaClaveValueList;
    }

    public void setResultadoNuevaClaveValueList(java.lang.Object[] resultadoNuevaClaveValueList)
    {
        this.resultadoNuevaClaveValueList = resultadoNuevaClaveValueList;
    }

    public java.lang.Object[] getResultadoNuevaClaveLabelList()
    {
        return this.resultadoNuevaClaveLabelList;
    }

    public void setResultadoNuevaClaveLabelList(java.lang.Object[] resultadoNuevaClaveLabelList)
    {
        this.resultadoNuevaClaveLabelList = resultadoNuevaClaveLabelList;
    }

    public void setResultadoNuevaClaveBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioRecuerdoUsuarioAceptarFormImpl.setResultadoNuevaClaveBackingList requires non-null property arguments");
        }

        this.resultadoNuevaClaveValueList = null;
        this.resultadoNuevaClaveLabelList = null;

        if (items != null)
        {
            this.resultadoNuevaClaveValueList = new java.lang.Object[items.size()];
            this.resultadoNuevaClaveLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.resultadoNuevaClaveValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.resultadoNuevaClaveLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioRecuerdoUsuarioAceptarFormImpl.setResultadoNuevaClaveBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("nif", this.nif);
        builder.append("email", this.email);
        builder.append("resultadoNuevaClave", this.resultadoNuevaClave);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.nif = null;
        this.nifValueList = null;
        this.nifLabelList = null;
        this.email = null;
        this.emailValueList = null;
        this.emailLabelList = null;
        this.resultadoNuevaClave = null;
        this.resultadoNuevaClaveValueList = null;
        this.resultadoNuevaClaveLabelList = null;
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