// license-header java merge-point
package es.pode.administracion.presentacion.planificador.modificarTarea;

public class FormularioNoDisponiblesIIAceptarFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , es.pode.administracion.presentacion.planificador.modificarTarea.ModificarTareaNoDisponiblesForm
{
    private java.lang.String anioHasta;
    private java.lang.Object[] anioHastaValueList;
    private java.lang.Object[] anioHastaLabelList;
    private java.lang.String anio;
    private java.lang.Object[] anioValueList;
    private java.lang.Object[] anioLabelList;
    private java.lang.String minutos;
    private java.lang.Object[] minutosValueList;
    private java.lang.Object[] minutosLabelList;
    private java.lang.String trigger;
    private java.lang.Object[] triggerValueList;
    private java.lang.Object[] triggerLabelList;
    private java.lang.String grupoTrigger;
    private java.lang.Object[] grupoTriggerValueList;
    private java.lang.Object[] grupoTriggerLabelList;
    private java.lang.String grupoTrabajo;
    private java.lang.Object[] grupoTrabajoValueList;
    private java.lang.Object[] grupoTrabajoLabelList;
    private java.lang.String tipoTarea;
    private java.lang.Object[] tipoTareaValueList;
    private java.lang.Object[] tipoTareaLabelList;
    private java.lang.String dia;
    private java.lang.Object[] diaValueList;
    private java.lang.Object[] diaLabelList;
    private java.lang.String msgNoEliminado;
    private java.lang.Object[] msgNoEliminadoValueList;
    private java.lang.Object[] msgNoEliminadoLabelList;
    private java.lang.String diaHasta;
    private java.lang.Object[] diaHastaValueList;
    private java.lang.Object[] diaHastaLabelList;
    private java.lang.String anioDesde;
    private java.lang.Object[] anioDesdeValueList;
    private java.lang.Object[] anioDesdeLabelList;
    private java.lang.String msgEliminado;
    private java.lang.Object[] msgEliminadoValueList;
    private java.lang.Object[] msgEliminadoLabelList;
    private java.lang.String hora;
    private java.lang.Object[] horaValueList;
    private java.lang.Object[] horaLabelList;
    private java.lang.String msgDescTrabajo;
    private java.lang.Object[] msgDescTrabajoValueList;
    private java.lang.Object[] msgDescTrabajoLabelList;
    private java.lang.String trabajo;
    private java.lang.Object[] trabajoValueList;
    private java.lang.Object[] trabajoLabelList;
    private java.lang.String mes;
    private java.lang.Object[] mesValueList;
    private java.lang.Object[] mesLabelList;
    private java.lang.String tareaModificada;
    private java.lang.Object[] tareaModificadaValueList;
    private java.lang.Object[] tareaModificadaLabelList;
    private java.lang.String periodicidad;
    private java.lang.Object[] periodicidadValueList;
    private java.lang.Object[] periodicidadLabelList;
    private java.lang.String mesHasta;
    private java.lang.Object[] mesHastaValueList;
    private java.lang.Object[] mesHastaLabelList;
    private java.lang.String mesDesde;
    private java.lang.Object[] mesDesdeValueList;
    private java.lang.Object[] mesDesdeLabelList;
    private java.lang.String diaDesde;
    private java.lang.Object[] diaDesdeValueList;
    private java.lang.Object[] diaDesdeLabelList;

    public FormularioNoDisponiblesIIAceptarFormImpl()
    {
    }

    /**
     * Resets the given <code>anioHasta</code>.
     */
    public void resetAnioHasta()
    {
        this.anioHasta = null;
    }

    public void setAnioHasta(java.lang.String anioHasta)
    {
        this.anioHasta = anioHasta;
    }

    /**
     * 
     */
    public java.lang.String getAnioHasta()
    {
        return this.anioHasta;
    }
    
    public java.lang.Object[] getAnioHastaBackingList()
    {
        java.lang.Object[] values = this.anioHastaValueList;
        java.lang.Object[] labels = this.anioHastaLabelList;

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

    public java.lang.Object[] getAnioHastaValueList()
    {
        return this.anioHastaValueList;
    }

    public void setAnioHastaValueList(java.lang.Object[] anioHastaValueList)
    {
        this.anioHastaValueList = anioHastaValueList;
    }

    public java.lang.Object[] getAnioHastaLabelList()
    {
        return this.anioHastaLabelList;
    }

    public void setAnioHastaLabelList(java.lang.Object[] anioHastaLabelList)
    {
        this.anioHastaLabelList = anioHastaLabelList;
    }

    public void setAnioHastaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioHastaBackingList requires non-null property arguments");
        }

        this.anioHastaValueList = null;
        this.anioHastaLabelList = null;

        if (items != null)
        {
            this.anioHastaValueList = new java.lang.Object[items.size()];
            this.anioHastaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.anioHastaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.anioHastaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioHastaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>anio</code>.
     */
    public void resetAnio()
    {
        this.anio = null;
    }

    public void setAnio(java.lang.String anio)
    {
        this.anio = anio;
    }

    /**
     * 
     */
    public java.lang.String getAnio()
    {
        return this.anio;
    }
    
    public java.lang.Object[] getAnioBackingList()
    {
        java.lang.Object[] values = this.anioValueList;
        java.lang.Object[] labels = this.anioLabelList;

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

    public java.lang.Object[] getAnioValueList()
    {
        return this.anioValueList;
    }

    public void setAnioValueList(java.lang.Object[] anioValueList)
    {
        this.anioValueList = anioValueList;
    }

    public java.lang.Object[] getAnioLabelList()
    {
        return this.anioLabelList;
    }

    public void setAnioLabelList(java.lang.Object[] anioLabelList)
    {
        this.anioLabelList = anioLabelList;
    }

    public void setAnioBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioBackingList requires non-null property arguments");
        }

        this.anioValueList = null;
        this.anioLabelList = null;

        if (items != null)
        {
            this.anioValueList = new java.lang.Object[items.size()];
            this.anioLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.anioValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.anioLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>minutos</code>.
     */
    public void resetMinutos()
    {
        this.minutos = null;
    }

    public void setMinutos(java.lang.String minutos)
    {
        this.minutos = minutos;
    }

    /**
     * 
     */
    public java.lang.String getMinutos()
    {
        return this.minutos;
    }
    
    public java.lang.Object[] getMinutosBackingList()
    {
        java.lang.Object[] values = this.minutosValueList;
        java.lang.Object[] labels = this.minutosLabelList;

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

    public java.lang.Object[] getMinutosValueList()
    {
        return this.minutosValueList;
    }

    public void setMinutosValueList(java.lang.Object[] minutosValueList)
    {
        this.minutosValueList = minutosValueList;
    }

    public java.lang.Object[] getMinutosLabelList()
    {
        return this.minutosLabelList;
    }

    public void setMinutosLabelList(java.lang.Object[] minutosLabelList)
    {
        this.minutosLabelList = minutosLabelList;
    }

    public void setMinutosBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMinutosBackingList requires non-null property arguments");
        }

        this.minutosValueList = null;
        this.minutosLabelList = null;

        if (items != null)
        {
            this.minutosValueList = new java.lang.Object[items.size()];
            this.minutosLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.minutosValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.minutosLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMinutosBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>trigger</code>.
     */
    public void resetTrigger()
    {
        this.trigger = null;
    }

    public void setTrigger(java.lang.String trigger)
    {
        this.trigger = trigger;
    }

    /**
     * 
     */
    public java.lang.String getTrigger()
    {
        return this.trigger;
    }
    
    public java.lang.Object[] getTriggerBackingList()
    {
        java.lang.Object[] values = this.triggerValueList;
        java.lang.Object[] labels = this.triggerLabelList;

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

    public java.lang.Object[] getTriggerValueList()
    {
        return this.triggerValueList;
    }

    public void setTriggerValueList(java.lang.Object[] triggerValueList)
    {
        this.triggerValueList = triggerValueList;
    }

    public java.lang.Object[] getTriggerLabelList()
    {
        return this.triggerLabelList;
    }

    public void setTriggerLabelList(java.lang.Object[] triggerLabelList)
    {
        this.triggerLabelList = triggerLabelList;
    }

    public void setTriggerBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setTriggerBackingList requires non-null property arguments");
        }

        this.triggerValueList = null;
        this.triggerLabelList = null;

        if (items != null)
        {
            this.triggerValueList = new java.lang.Object[items.size()];
            this.triggerLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.triggerValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.triggerLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setTriggerBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>grupoTrigger</code>.
     */
    public void resetGrupoTrigger()
    {
        this.grupoTrigger = null;
    }

    public void setGrupoTrigger(java.lang.String grupoTrigger)
    {
        this.grupoTrigger = grupoTrigger;
    }

    /**
     * 
     */
    public java.lang.String getGrupoTrigger()
    {
        return this.grupoTrigger;
    }
    
    public java.lang.Object[] getGrupoTriggerBackingList()
    {
        java.lang.Object[] values = this.grupoTriggerValueList;
        java.lang.Object[] labels = this.grupoTriggerLabelList;

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

    public java.lang.Object[] getGrupoTriggerValueList()
    {
        return this.grupoTriggerValueList;
    }

    public void setGrupoTriggerValueList(java.lang.Object[] grupoTriggerValueList)
    {
        this.grupoTriggerValueList = grupoTriggerValueList;
    }

    public java.lang.Object[] getGrupoTriggerLabelList()
    {
        return this.grupoTriggerLabelList;
    }

    public void setGrupoTriggerLabelList(java.lang.Object[] grupoTriggerLabelList)
    {
        this.grupoTriggerLabelList = grupoTriggerLabelList;
    }

    public void setGrupoTriggerBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setGrupoTriggerBackingList requires non-null property arguments");
        }

        this.grupoTriggerValueList = null;
        this.grupoTriggerLabelList = null;

        if (items != null)
        {
            this.grupoTriggerValueList = new java.lang.Object[items.size()];
            this.grupoTriggerLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.grupoTriggerValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.grupoTriggerLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setGrupoTriggerBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>grupoTrabajo</code>.
     */
    public void resetGrupoTrabajo()
    {
        this.grupoTrabajo = null;
    }

    public void setGrupoTrabajo(java.lang.String grupoTrabajo)
    {
        this.grupoTrabajo = grupoTrabajo;
    }

    /**
     * 
     */
    public java.lang.String getGrupoTrabajo()
    {
        return this.grupoTrabajo;
    }
    
    public java.lang.Object[] getGrupoTrabajoBackingList()
    {
        java.lang.Object[] values = this.grupoTrabajoValueList;
        java.lang.Object[] labels = this.grupoTrabajoLabelList;

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

    public java.lang.Object[] getGrupoTrabajoValueList()
    {
        return this.grupoTrabajoValueList;
    }

    public void setGrupoTrabajoValueList(java.lang.Object[] grupoTrabajoValueList)
    {
        this.grupoTrabajoValueList = grupoTrabajoValueList;
    }

    public java.lang.Object[] getGrupoTrabajoLabelList()
    {
        return this.grupoTrabajoLabelList;
    }

    public void setGrupoTrabajoLabelList(java.lang.Object[] grupoTrabajoLabelList)
    {
        this.grupoTrabajoLabelList = grupoTrabajoLabelList;
    }

    public void setGrupoTrabajoBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setGrupoTrabajoBackingList requires non-null property arguments");
        }

        this.grupoTrabajoValueList = null;
        this.grupoTrabajoLabelList = null;

        if (items != null)
        {
            this.grupoTrabajoValueList = new java.lang.Object[items.size()];
            this.grupoTrabajoLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.grupoTrabajoValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.grupoTrabajoLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setGrupoTrabajoBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>tipoTarea</code>.
     */
    public void resetTipoTarea()
    {
        this.tipoTarea = null;
    }

    public void setTipoTarea(java.lang.String tipoTarea)
    {
        this.tipoTarea = tipoTarea;
    }

    /**
     * 
     */
    public java.lang.String getTipoTarea()
    {
        return this.tipoTarea;
    }
    
    public java.lang.Object[] getTipoTareaBackingList()
    {
        java.lang.Object[] values = this.tipoTareaValueList;
        java.lang.Object[] labels = this.tipoTareaLabelList;

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

    public java.lang.Object[] getTipoTareaValueList()
    {
        return this.tipoTareaValueList;
    }

    public void setTipoTareaValueList(java.lang.Object[] tipoTareaValueList)
    {
        this.tipoTareaValueList = tipoTareaValueList;
    }

    public java.lang.Object[] getTipoTareaLabelList()
    {
        return this.tipoTareaLabelList;
    }

    public void setTipoTareaLabelList(java.lang.Object[] tipoTareaLabelList)
    {
        this.tipoTareaLabelList = tipoTareaLabelList;
    }

    public void setTipoTareaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setTipoTareaBackingList requires non-null property arguments");
        }

        this.tipoTareaValueList = null;
        this.tipoTareaLabelList = null;

        if (items != null)
        {
            this.tipoTareaValueList = new java.lang.Object[items.size()];
            this.tipoTareaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.tipoTareaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.tipoTareaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setTipoTareaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>dia</code>.
     */
    public void resetDia()
    {
        this.dia = null;
    }

    public void setDia(java.lang.String dia)
    {
        this.dia = dia;
    }

    /**
     * 
     */
    public java.lang.String getDia()
    {
        return this.dia;
    }
    
    public java.lang.Object[] getDiaBackingList()
    {
        java.lang.Object[] values = this.diaValueList;
        java.lang.Object[] labels = this.diaLabelList;

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

    public java.lang.Object[] getDiaValueList()
    {
        return this.diaValueList;
    }

    public void setDiaValueList(java.lang.Object[] diaValueList)
    {
        this.diaValueList = diaValueList;
    }

    public java.lang.Object[] getDiaLabelList()
    {
        return this.diaLabelList;
    }

    public void setDiaLabelList(java.lang.Object[] diaLabelList)
    {
        this.diaLabelList = diaLabelList;
    }

    public void setDiaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaBackingList requires non-null property arguments");
        }

        this.diaValueList = null;
        this.diaLabelList = null;

        if (items != null)
        {
            this.diaValueList = new java.lang.Object[items.size()];
            this.diaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.diaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.diaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>msgNoEliminado</code>.
     */
    public void resetMsgNoEliminado()
    {
        this.msgNoEliminado = null;
    }

    public void setMsgNoEliminado(java.lang.String msgNoEliminado)
    {
        this.msgNoEliminado = msgNoEliminado;
    }

    /**
     * 
     */
    public java.lang.String getMsgNoEliminado()
    {
        return this.msgNoEliminado;
    }
    
    public java.lang.Object[] getMsgNoEliminadoBackingList()
    {
        java.lang.Object[] values = this.msgNoEliminadoValueList;
        java.lang.Object[] labels = this.msgNoEliminadoLabelList;

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

    public java.lang.Object[] getMsgNoEliminadoValueList()
    {
        return this.msgNoEliminadoValueList;
    }

    public void setMsgNoEliminadoValueList(java.lang.Object[] msgNoEliminadoValueList)
    {
        this.msgNoEliminadoValueList = msgNoEliminadoValueList;
    }

    public java.lang.Object[] getMsgNoEliminadoLabelList()
    {
        return this.msgNoEliminadoLabelList;
    }

    public void setMsgNoEliminadoLabelList(java.lang.Object[] msgNoEliminadoLabelList)
    {
        this.msgNoEliminadoLabelList = msgNoEliminadoLabelList;
    }

    public void setMsgNoEliminadoBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgNoEliminadoBackingList requires non-null property arguments");
        }

        this.msgNoEliminadoValueList = null;
        this.msgNoEliminadoLabelList = null;

        if (items != null)
        {
            this.msgNoEliminadoValueList = new java.lang.Object[items.size()];
            this.msgNoEliminadoLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.msgNoEliminadoValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.msgNoEliminadoLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgNoEliminadoBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>diaHasta</code>.
     */
    public void resetDiaHasta()
    {
        this.diaHasta = null;
    }

    public void setDiaHasta(java.lang.String diaHasta)
    {
        this.diaHasta = diaHasta;
    }

    /**
     * 
     */
    public java.lang.String getDiaHasta()
    {
        return this.diaHasta;
    }
    
    public java.lang.Object[] getDiaHastaBackingList()
    {
        java.lang.Object[] values = this.diaHastaValueList;
        java.lang.Object[] labels = this.diaHastaLabelList;

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

    public java.lang.Object[] getDiaHastaValueList()
    {
        return this.diaHastaValueList;
    }

    public void setDiaHastaValueList(java.lang.Object[] diaHastaValueList)
    {
        this.diaHastaValueList = diaHastaValueList;
    }

    public java.lang.Object[] getDiaHastaLabelList()
    {
        return this.diaHastaLabelList;
    }

    public void setDiaHastaLabelList(java.lang.Object[] diaHastaLabelList)
    {
        this.diaHastaLabelList = diaHastaLabelList;
    }

    public void setDiaHastaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaHastaBackingList requires non-null property arguments");
        }

        this.diaHastaValueList = null;
        this.diaHastaLabelList = null;

        if (items != null)
        {
            this.diaHastaValueList = new java.lang.Object[items.size()];
            this.diaHastaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.diaHastaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.diaHastaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaHastaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>anioDesde</code>.
     */
    public void resetAnioDesde()
    {
        this.anioDesde = null;
    }

    public void setAnioDesde(java.lang.String anioDesde)
    {
        this.anioDesde = anioDesde;
    }

    /**
     * 
     */
    public java.lang.String getAnioDesde()
    {
        return this.anioDesde;
    }
    
    public java.lang.Object[] getAnioDesdeBackingList()
    {
        java.lang.Object[] values = this.anioDesdeValueList;
        java.lang.Object[] labels = this.anioDesdeLabelList;

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

    public java.lang.Object[] getAnioDesdeValueList()
    {
        return this.anioDesdeValueList;
    }

    public void setAnioDesdeValueList(java.lang.Object[] anioDesdeValueList)
    {
        this.anioDesdeValueList = anioDesdeValueList;
    }

    public java.lang.Object[] getAnioDesdeLabelList()
    {
        return this.anioDesdeLabelList;
    }

    public void setAnioDesdeLabelList(java.lang.Object[] anioDesdeLabelList)
    {
        this.anioDesdeLabelList = anioDesdeLabelList;
    }

    public void setAnioDesdeBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioDesdeBackingList requires non-null property arguments");
        }

        this.anioDesdeValueList = null;
        this.anioDesdeLabelList = null;

        if (items != null)
        {
            this.anioDesdeValueList = new java.lang.Object[items.size()];
            this.anioDesdeLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.anioDesdeValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.anioDesdeLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setAnioDesdeBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>msgEliminado</code>.
     */
    public void resetMsgEliminado()
    {
        this.msgEliminado = null;
    }

    public void setMsgEliminado(java.lang.String msgEliminado)
    {
        this.msgEliminado = msgEliminado;
    }

    /**
     * 
     */
    public java.lang.String getMsgEliminado()
    {
        return this.msgEliminado;
    }
    
    public java.lang.Object[] getMsgEliminadoBackingList()
    {
        java.lang.Object[] values = this.msgEliminadoValueList;
        java.lang.Object[] labels = this.msgEliminadoLabelList;

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

    public java.lang.Object[] getMsgEliminadoValueList()
    {
        return this.msgEliminadoValueList;
    }

    public void setMsgEliminadoValueList(java.lang.Object[] msgEliminadoValueList)
    {
        this.msgEliminadoValueList = msgEliminadoValueList;
    }

    public java.lang.Object[] getMsgEliminadoLabelList()
    {
        return this.msgEliminadoLabelList;
    }

    public void setMsgEliminadoLabelList(java.lang.Object[] msgEliminadoLabelList)
    {
        this.msgEliminadoLabelList = msgEliminadoLabelList;
    }

    public void setMsgEliminadoBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgEliminadoBackingList requires non-null property arguments");
        }

        this.msgEliminadoValueList = null;
        this.msgEliminadoLabelList = null;

        if (items != null)
        {
            this.msgEliminadoValueList = new java.lang.Object[items.size()];
            this.msgEliminadoLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.msgEliminadoValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.msgEliminadoLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgEliminadoBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>hora</code>.
     */
    public void resetHora()
    {
        this.hora = null;
    }

    public void setHora(java.lang.String hora)
    {
        this.hora = hora;
    }

    /**
     * 
     */
    public java.lang.String getHora()
    {
        return this.hora;
    }
    
    public java.lang.Object[] getHoraBackingList()
    {
        java.lang.Object[] values = this.horaValueList;
        java.lang.Object[] labels = this.horaLabelList;

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

    public java.lang.Object[] getHoraValueList()
    {
        return this.horaValueList;
    }

    public void setHoraValueList(java.lang.Object[] horaValueList)
    {
        this.horaValueList = horaValueList;
    }

    public java.lang.Object[] getHoraLabelList()
    {
        return this.horaLabelList;
    }

    public void setHoraLabelList(java.lang.Object[] horaLabelList)
    {
        this.horaLabelList = horaLabelList;
    }

    public void setHoraBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setHoraBackingList requires non-null property arguments");
        }

        this.horaValueList = null;
        this.horaLabelList = null;

        if (items != null)
        {
            this.horaValueList = new java.lang.Object[items.size()];
            this.horaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.horaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.horaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setHoraBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>msgDescTrabajo</code>.
     */
    public void resetMsgDescTrabajo()
    {
        this.msgDescTrabajo = null;
    }

    public void setMsgDescTrabajo(java.lang.String msgDescTrabajo)
    {
        this.msgDescTrabajo = msgDescTrabajo;
    }

    /**
     * 
     */
    public java.lang.String getMsgDescTrabajo()
    {
        return this.msgDescTrabajo;
    }
    
    public java.lang.Object[] getMsgDescTrabajoBackingList()
    {
        java.lang.Object[] values = this.msgDescTrabajoValueList;
        java.lang.Object[] labels = this.msgDescTrabajoLabelList;

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

    public java.lang.Object[] getMsgDescTrabajoValueList()
    {
        return this.msgDescTrabajoValueList;
    }

    public void setMsgDescTrabajoValueList(java.lang.Object[] msgDescTrabajoValueList)
    {
        this.msgDescTrabajoValueList = msgDescTrabajoValueList;
    }

    public java.lang.Object[] getMsgDescTrabajoLabelList()
    {
        return this.msgDescTrabajoLabelList;
    }

    public void setMsgDescTrabajoLabelList(java.lang.Object[] msgDescTrabajoLabelList)
    {
        this.msgDescTrabajoLabelList = msgDescTrabajoLabelList;
    }

    public void setMsgDescTrabajoBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgDescTrabajoBackingList requires non-null property arguments");
        }

        this.msgDescTrabajoValueList = null;
        this.msgDescTrabajoLabelList = null;

        if (items != null)
        {
            this.msgDescTrabajoValueList = new java.lang.Object[items.size()];
            this.msgDescTrabajoLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.msgDescTrabajoValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.msgDescTrabajoLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMsgDescTrabajoBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>trabajo</code>.
     */
    public void resetTrabajo()
    {
        this.trabajo = null;
    }

    public void setTrabajo(java.lang.String trabajo)
    {
        this.trabajo = trabajo;
    }

    /**
     * 
     */
    public java.lang.String getTrabajo()
    {
        return this.trabajo;
    }
    
    public java.lang.Object[] getTrabajoBackingList()
    {
        java.lang.Object[] values = this.trabajoValueList;
        java.lang.Object[] labels = this.trabajoLabelList;

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

    public java.lang.Object[] getTrabajoValueList()
    {
        return this.trabajoValueList;
    }

    public void setTrabajoValueList(java.lang.Object[] trabajoValueList)
    {
        this.trabajoValueList = trabajoValueList;
    }

    public java.lang.Object[] getTrabajoLabelList()
    {
        return this.trabajoLabelList;
    }

    public void setTrabajoLabelList(java.lang.Object[] trabajoLabelList)
    {
        this.trabajoLabelList = trabajoLabelList;
    }

    public void setTrabajoBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setTrabajoBackingList requires non-null property arguments");
        }

        this.trabajoValueList = null;
        this.trabajoLabelList = null;

        if (items != null)
        {
            this.trabajoValueList = new java.lang.Object[items.size()];
            this.trabajoLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.trabajoValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.trabajoLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setTrabajoBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>mes</code>.
     */
    public void resetMes()
    {
        this.mes = null;
    }

    public void setMes(java.lang.String mes)
    {
        this.mes = mes;
    }

    /**
     * 
     */
    public java.lang.String getMes()
    {
        return this.mes;
    }
    
    public java.lang.Object[] getMesBackingList()
    {
        java.lang.Object[] values = this.mesValueList;
        java.lang.Object[] labels = this.mesLabelList;

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

    public java.lang.Object[] getMesValueList()
    {
        return this.mesValueList;
    }

    public void setMesValueList(java.lang.Object[] mesValueList)
    {
        this.mesValueList = mesValueList;
    }

    public java.lang.Object[] getMesLabelList()
    {
        return this.mesLabelList;
    }

    public void setMesLabelList(java.lang.Object[] mesLabelList)
    {
        this.mesLabelList = mesLabelList;
    }

    public void setMesBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMesBackingList requires non-null property arguments");
        }

        this.mesValueList = null;
        this.mesLabelList = null;

        if (items != null)
        {
            this.mesValueList = new java.lang.Object[items.size()];
            this.mesLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.mesValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.mesLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMesBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>tareaModificada</code>.
     */
    public void resetTareaModificada()
    {
        this.tareaModificada = null;
    }

    public void setTareaModificada(java.lang.String tareaModificada)
    {
        this.tareaModificada = tareaModificada;
    }

    /**
     * 
     */
    public java.lang.String getTareaModificada()
    {
        return this.tareaModificada;
    }
    
    public java.lang.Object[] getTareaModificadaBackingList()
    {
        java.lang.Object[] values = this.tareaModificadaValueList;
        java.lang.Object[] labels = this.tareaModificadaLabelList;

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

    public java.lang.Object[] getTareaModificadaValueList()
    {
        return this.tareaModificadaValueList;
    }

    public void setTareaModificadaValueList(java.lang.Object[] tareaModificadaValueList)
    {
        this.tareaModificadaValueList = tareaModificadaValueList;
    }

    public java.lang.Object[] getTareaModificadaLabelList()
    {
        return this.tareaModificadaLabelList;
    }

    public void setTareaModificadaLabelList(java.lang.Object[] tareaModificadaLabelList)
    {
        this.tareaModificadaLabelList = tareaModificadaLabelList;
    }

    public void setTareaModificadaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setTareaModificadaBackingList requires non-null property arguments");
        }

        this.tareaModificadaValueList = null;
        this.tareaModificadaLabelList = null;

        if (items != null)
        {
            this.tareaModificadaValueList = new java.lang.Object[items.size()];
            this.tareaModificadaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.tareaModificadaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.tareaModificadaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setTareaModificadaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>periodicidad</code>.
     */
    public void resetPeriodicidad()
    {
        this.periodicidad = null;
    }

    public void setPeriodicidad(java.lang.String periodicidad)
    {
        this.periodicidad = periodicidad;
    }

    /**
     * 
     */
    public java.lang.String getPeriodicidad()
    {
        return this.periodicidad;
    }
    
    public java.lang.Object[] getPeriodicidadBackingList()
    {
        java.lang.Object[] values = this.periodicidadValueList;
        java.lang.Object[] labels = this.periodicidadLabelList;

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

    public java.lang.Object[] getPeriodicidadValueList()
    {
        return this.periodicidadValueList;
    }

    public void setPeriodicidadValueList(java.lang.Object[] periodicidadValueList)
    {
        this.periodicidadValueList = periodicidadValueList;
    }

    public java.lang.Object[] getPeriodicidadLabelList()
    {
        return this.periodicidadLabelList;
    }

    public void setPeriodicidadLabelList(java.lang.Object[] periodicidadLabelList)
    {
        this.periodicidadLabelList = periodicidadLabelList;
    }

    public void setPeriodicidadBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setPeriodicidadBackingList requires non-null property arguments");
        }

        this.periodicidadValueList = null;
        this.periodicidadLabelList = null;

        if (items != null)
        {
            this.periodicidadValueList = new java.lang.Object[items.size()];
            this.periodicidadLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.periodicidadValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.periodicidadLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setPeriodicidadBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>mesHasta</code>.
     */
    public void resetMesHasta()
    {
        this.mesHasta = null;
    }

    public void setMesHasta(java.lang.String mesHasta)
    {
        this.mesHasta = mesHasta;
    }

    /**
     * 
     */
    public java.lang.String getMesHasta()
    {
        return this.mesHasta;
    }
    
    public java.lang.Object[] getMesHastaBackingList()
    {
        java.lang.Object[] values = this.mesHastaValueList;
        java.lang.Object[] labels = this.mesHastaLabelList;

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

    public java.lang.Object[] getMesHastaValueList()
    {
        return this.mesHastaValueList;
    }

    public void setMesHastaValueList(java.lang.Object[] mesHastaValueList)
    {
        this.mesHastaValueList = mesHastaValueList;
    }

    public java.lang.Object[] getMesHastaLabelList()
    {
        return this.mesHastaLabelList;
    }

    public void setMesHastaLabelList(java.lang.Object[] mesHastaLabelList)
    {
        this.mesHastaLabelList = mesHastaLabelList;
    }

    public void setMesHastaBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMesHastaBackingList requires non-null property arguments");
        }

        this.mesHastaValueList = null;
        this.mesHastaLabelList = null;

        if (items != null)
        {
            this.mesHastaValueList = new java.lang.Object[items.size()];
            this.mesHastaLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.mesHastaValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.mesHastaLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMesHastaBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>mesDesde</code>.
     */
    public void resetMesDesde()
    {
        this.mesDesde = null;
    }

    public void setMesDesde(java.lang.String mesDesde)
    {
        this.mesDesde = mesDesde;
    }

    /**
     * 
     */
    public java.lang.String getMesDesde()
    {
        return this.mesDesde;
    }
    
    public java.lang.Object[] getMesDesdeBackingList()
    {
        java.lang.Object[] values = this.mesDesdeValueList;
        java.lang.Object[] labels = this.mesDesdeLabelList;

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

    public java.lang.Object[] getMesDesdeValueList()
    {
        return this.mesDesdeValueList;
    }

    public void setMesDesdeValueList(java.lang.Object[] mesDesdeValueList)
    {
        this.mesDesdeValueList = mesDesdeValueList;
    }

    public java.lang.Object[] getMesDesdeLabelList()
    {
        return this.mesDesdeLabelList;
    }

    public void setMesDesdeLabelList(java.lang.Object[] mesDesdeLabelList)
    {
        this.mesDesdeLabelList = mesDesdeLabelList;
    }

    public void setMesDesdeBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setMesDesdeBackingList requires non-null property arguments");
        }

        this.mesDesdeValueList = null;
        this.mesDesdeLabelList = null;

        if (items != null)
        {
            this.mesDesdeValueList = new java.lang.Object[items.size()];
            this.mesDesdeLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.mesDesdeValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.mesDesdeLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setMesDesdeBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>diaDesde</code>.
     */
    public void resetDiaDesde()
    {
        this.diaDesde = null;
    }

    public void setDiaDesde(java.lang.String diaDesde)
    {
        this.diaDesde = diaDesde;
    }

    /**
     * 
     */
    public java.lang.String getDiaDesde()
    {
        return this.diaDesde;
    }
    
    public java.lang.Object[] getDiaDesdeBackingList()
    {
        java.lang.Object[] values = this.diaDesdeValueList;
        java.lang.Object[] labels = this.diaDesdeLabelList;

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

    public java.lang.Object[] getDiaDesdeValueList()
    {
        return this.diaDesdeValueList;
    }

    public void setDiaDesdeValueList(java.lang.Object[] diaDesdeValueList)
    {
        this.diaDesdeValueList = diaDesdeValueList;
    }

    public java.lang.Object[] getDiaDesdeLabelList()
    {
        return this.diaDesdeLabelList;
    }

    public void setDiaDesdeLabelList(java.lang.Object[] diaDesdeLabelList)
    {
        this.diaDesdeLabelList = diaDesdeLabelList;
    }

    public void setDiaDesdeBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaDesdeBackingList requires non-null property arguments");
        }

        this.diaDesdeValueList = null;
        this.diaDesdeLabelList = null;

        if (items != null)
        {
            this.diaDesdeValueList = new java.lang.Object[items.size()];
            this.diaDesdeLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.diaDesdeValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.diaDesdeLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("FormularioNoDisponiblesIIAceptarFormImpl.setDiaDesdeBackingList encountered an exception", ex);
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
        builder.append("anioHasta", this.anioHasta);
        builder.append("anio", this.anio);
        builder.append("minutos", this.minutos);
        builder.append("trigger", this.trigger);
        builder.append("grupoTrigger", this.grupoTrigger);
        builder.append("grupoTrabajo", this.grupoTrabajo);
        builder.append("tipoTarea", this.tipoTarea);
        builder.append("dia", this.dia);
        builder.append("msgNoEliminado", this.msgNoEliminado);
        builder.append("diaHasta", this.diaHasta);
        builder.append("anioDesde", this.anioDesde);
        builder.append("msgEliminado", this.msgEliminado);
        builder.append("hora", this.hora);
        builder.append("msgDescTrabajo", this.msgDescTrabajo);
        builder.append("trabajo", this.trabajo);
        builder.append("mes", this.mes);
        builder.append("tareaModificada", this.tareaModificada);
        builder.append("periodicidad", this.periodicidad);
        builder.append("mesHasta", this.mesHasta);
        builder.append("mesDesde", this.mesDesde);
        builder.append("diaDesde", this.diaDesde);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.anioHasta = null;
        this.anioHastaValueList = null;
        this.anioHastaLabelList = null;
        this.anio = null;
        this.anioValueList = null;
        this.anioLabelList = null;
        this.minutos = null;
        this.minutosValueList = null;
        this.minutosLabelList = null;
        this.trigger = null;
        this.triggerValueList = null;
        this.triggerLabelList = null;
        this.grupoTrigger = null;
        this.grupoTriggerValueList = null;
        this.grupoTriggerLabelList = null;
        this.grupoTrabajo = null;
        this.grupoTrabajoValueList = null;
        this.grupoTrabajoLabelList = null;
        this.tipoTarea = null;
        this.tipoTareaValueList = null;
        this.tipoTareaLabelList = null;
        this.dia = null;
        this.diaValueList = null;
        this.diaLabelList = null;
        this.msgNoEliminado = null;
        this.msgNoEliminadoValueList = null;
        this.msgNoEliminadoLabelList = null;
        this.diaHasta = null;
        this.diaHastaValueList = null;
        this.diaHastaLabelList = null;
        this.anioDesde = null;
        this.anioDesdeValueList = null;
        this.anioDesdeLabelList = null;
        this.msgEliminado = null;
        this.msgEliminadoValueList = null;
        this.msgEliminadoLabelList = null;
        this.hora = null;
        this.horaValueList = null;
        this.horaLabelList = null;
        this.msgDescTrabajo = null;
        this.msgDescTrabajoValueList = null;
        this.msgDescTrabajoLabelList = null;
        this.trabajo = null;
        this.trabajoValueList = null;
        this.trabajoLabelList = null;
        this.mes = null;
        this.mesValueList = null;
        this.mesLabelList = null;
        this.tareaModificada = null;
        this.tareaModificadaValueList = null;
        this.tareaModificadaLabelList = null;
        this.periodicidad = null;
        this.periodicidadValueList = null;
        this.periodicidadLabelList = null;
        this.mesHasta = null;
        this.mesHastaValueList = null;
        this.mesHastaLabelList = null;
        this.mesDesde = null;
        this.mesDesdeValueList = null;
        this.mesDesdeLabelList = null;
        this.diaDesde = null;
        this.diaDesdeValueList = null;
        this.diaDesdeLabelList = null;
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