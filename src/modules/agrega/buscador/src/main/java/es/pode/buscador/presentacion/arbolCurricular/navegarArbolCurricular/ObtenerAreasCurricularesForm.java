// license-header java merge-point
package es.pode.buscador.presentacion.arbolCurricular.navegarArbolCurricular;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>obtenerAreasCurriculares</code> method, which is located on the
 * <code>es.pode.buscador.presentacion.arbolCurricular.navegarArbolCurricular.NavegarArbolCurricularController</code> controller.
 *
 * <p>
 * Esta actividad solicita la taxonomía del arbol para el idioma
 * del usuario publicado en el contexto de seguridad.
 * </p>
 * <p>
 * Cuando se selecciona un area curricular para navegar a un nivel
 * más profundo o superior, se pasa un string con el código del
 * área curricular para que el servicio de taxonomías nos
 * devuelva sus hijos, y que el servicio de búsqueda nos devuleva
 * el número de objetos coincidentes en el índice con ese área
 * curricular.
 * </p>
 *
 * @see es.pode.buscador.presentacion.arbolCurricular.navegarArbolCurricular.NavegarArbolCurricularController#obtenerAreasCurriculares
 */
public interface ObtenerAreasCurricularesForm
{
    /**
     * This field is a collection type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setNodos#sArray(Object[])
     */
    public void setNodos(java.util.Collection nodos);

    /**
     * This field is a collection type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getNodos#sArray()
     */
    public java.util.Collection getNodos();

    /**
     * This field is a collection type, and this method allows you to set it as an
     * array into the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #setNodos(java.util.Collection)
     */
    public void setNodosAsArray(Object[] nodos);

    /**
     * This field is a collection type, and this method allows you to get it as an
     * array from the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #getNodos()
     */
    public java.lang.Object[] getNodosAsArray();

    /**
     * Resets the <code>nodos</code> field.
     */
    public void resetNodos();

    /**
     * Sets the <code>areaCurricularBusqueda</code> field.
     *
     * 
     */
    public void setAreaCurricularBusqueda(java.lang.String areaCurricularBusqueda);

    /**
     * Gets the <code>areaCurricularBusqueda</code> field.
     *
     * 
     */
    public java.lang.String getAreaCurricularBusqueda();
    
    /**
     * Resets the <code>areaCurricularBusqueda</code> field.
     */
    public void resetAreaCurricularBusqueda();

    /**
     * Sets the <code>tipoBusquedaArbol</code> field.
     *
     * 
     */
    public void setTipoBusquedaArbol(java.lang.String tipoBusquedaArbol);

    /**
     * Gets the <code>tipoBusquedaArbol</code> field.
     *
     * 
     */
    public java.lang.String getTipoBusquedaArbol();
    
    /**
     * Resets the <code>tipoBusquedaArbol</code> field.
     */
    public void resetTipoBusquedaArbol();

    /**
     * This field is a collection type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setRutaArbol#sArray(Object[])
     */
    public void setRutaArbol(java.util.Collection rutaArbol);

    /**
     * This field is a collection type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getRutaArbol#sArray()
     */
    public java.util.Collection getRutaArbol();

    /**
     * This field is a collection type, and this method allows you to set it as an
     * array into the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #setRutaArbol(java.util.Collection)
     */
    public void setRutaArbolAsArray(Object[] rutaArbol);

    /**
     * This field is a collection type, and this method allows you to get it as an
     * array from the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #getRutaArbol()
     */
    public java.lang.Object[] getRutaArbolAsArray();

    /**
     * Resets the <code>rutaArbol</code> field.
     */
    public void resetRutaArbol();

    /**
     * The <code>rutaArbol</code> field can be selected from a list,
     * this method allows you to retrieve the current elements from that list.
     * <p/>
     * <i>Please note that the elements from that list are key value pairs, so you will
     * need to call <code>getLabel()</code> and <code>getValue()</code> to get the label and
     * value for this entry respectively.</i>
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolValueList()
     * @see #getRutaArbolLabelList()
     * @see #setRutaArbolLabelList(java.util.Collection,java.lang.String,java.lang.String)
     */
    public java.lang.Object[] getRutaArbolBackingList();

    /**
     * Convenient method to quickly set the value and label backinglist for the
     * rutaArbol property. This method takes a collection of objects, as well as
     * the property names to query on these objects in order to find the corresponding
     * values and labels.
     * <p/>
     * Let's say you have a set of value objects with the following properties:
     * <ul>
     *  <li><code>id</code></li>
     *  <li><code>code</code></li>
     *  <li><code>name</code></li>
     *  <li><code>description</code></li>
     * </ul>
     * But you need to populate the rutaArbol backing list with the <code>id</code> properties as the values and the
     * <code>name</code> properties as the labels then you would make a call like this:
     * <code>setRutaArbolBackingList(valueObjects, "id", "name")</code>
     * <p/>
     * This method knows how to handle primitive property types as it simply delegates to
     * <code>org.apache.commons.beanutils.PropertyUtils.getProperty(Object, String)</code>.
     *
     * @param items The items from which to read the properties, if this argument is <code>null</code> this method
     *        will simply clear the existing values and labels
     * @param valueProperty the name of the property to query on each object to retrieve
     *        the corresponding value, cannot be <code>null</code>
     * @throws java.lang.IllegalArgumentException if the valueProperty or labelProperty is <code>null</code>
     * @throws java.lang.RuntimeException if one of the items in the collection is <code>null</code>, or
     *         if the caller does not have access one of the object's properties, if an exception was thrown while
     *         accessing a property or if the property does not exist on at least one of the items
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolValueList()
     * @see #getRutaArbolLabelList()
     * @see #getRutaArbolLabelList()
     */
    public void setRutaArbolBackingList(java.util.Collection items, String valueProperty, String labelProperty);

    /**
     * The <code>rutaArbol</code> field can be selected from a list,
     * this method allows you to retrieve the values from that list.
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolBackingList()
     */
    public java.lang.Object[] getRutaArbolValueList();

    /**
     * The <code>rutaArbol</code> field can be selected from a list,
     * this method allows you to set the values for that list.
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolBackingList()
     */
    public void setRutaArbolValueList(java.lang.Object[] rutaArbolValueList);

    /**
     * The <code>rutaArbol</code> field can be selected from a list,
     * this method allows you to retrieve the labels from that list.
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolBackingList()
     */
    public java.lang.Object[] getRutaArbolLabelList();

    /**
     * The <code>rutaArbol</code> field can be selected from a list,
     * this method allows you to set the labels for that list.
     *
     * @see #getRutaArbol()
     * @see #getRutaArbolBackingList()
     */
    public void setRutaArbolLabelList(java.lang.Object[] rutaArbolLabelList);

    /**
     * Sets the <code>tipoLayoutBuscador</code> field.
     *
     * 
     */
    public void setTipoLayoutBuscador(java.lang.String tipoLayoutBuscador);

    /**
     * Gets the <code>tipoLayoutBuscador</code> field.
     *
     * 
     */
    public java.lang.String getTipoLayoutBuscador();
    
    /**
     * Resets the <code>tipoLayoutBuscador</code> field.
     */
    public void resetTipoLayoutBuscador();

    /**
     * Sets the <code>numeroResultados</code> field.
     *
     * 
     */
    public void setNumeroResultados(java.lang.Integer numeroResultados);

    /**
     * Gets the <code>numeroResultados</code> field.
     *
     * 
     */
    public java.lang.Integer getNumeroResultados();
    
    /**
     * Resets the <code>numeroResultados</code> field.
     */
    public void resetNumeroResultados();

    /**
     * Sets the <code>tipoBusqueda</code> field.
     *
     * 
     */
    public void setTipoBusqueda(java.lang.String tipoBusqueda);

    /**
     * Gets the <code>tipoBusqueda</code> field.
     *
     * 
     */
    public java.lang.String getTipoBusqueda();
    
    /**
     * Resets the <code>tipoBusqueda</code> field.
     */
    public void resetTipoBusqueda();

    /**
     * Sets the <code>idiomaBuscador</code> field.
     *
     * 
     */
    public void setIdiomaBuscador(java.lang.String idiomaBuscador);

    /**
     * Gets the <code>idiomaBuscador</code> field.
     *
     * 
     */
    public java.lang.String getIdiomaBuscador();
    
    /**
     * Resets the <code>idiomaBuscador</code> field.
     */
    public void resetIdiomaBuscador();

    /**
     * The <code>idiomaBuscador</code> field can be selected from a list,
     * this method allows you to retrieve the current elements from that list.
     * <p/>
     * <i>Please note that the elements from that list are key value pairs, so you will
     * need to call <code>getLabel()</code> and <code>getValue()</code> to get the label and
     * value for this entry respectively.</i>
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorValueList()
     * @see #getIdiomaBuscadorLabelList()
     * @see #setIdiomaBuscadorLabelList(java.util.Collection,java.lang.String,java.lang.String)
     */
    public java.lang.Object[] getIdiomaBuscadorBackingList();

    /**
     * Convenient method to quickly set the value and label backinglist for the
     * idiomaBuscador property. This method takes a collection of objects, as well as
     * the property names to query on these objects in order to find the corresponding
     * values and labels.
     * <p/>
     * Let's say you have a set of value objects with the following properties:
     * <ul>
     *  <li><code>id</code></li>
     *  <li><code>code</code></li>
     *  <li><code>name</code></li>
     *  <li><code>description</code></li>
     * </ul>
     * But you need to populate the idiomaBuscador backing list with the <code>id</code> properties as the values and the
     * <code>name</code> properties as the labels then you would make a call like this:
     * <code>setIdiomaBuscadorBackingList(valueObjects, "id", "name")</code>
     * <p/>
     * This method knows how to handle primitive property types as it simply delegates to
     * <code>org.apache.commons.beanutils.PropertyUtils.getProperty(Object, String)</code>.
     *
     * @param items The items from which to read the properties, if this argument is <code>null</code> this method
     *        will simply clear the existing values and labels
     * @param valueProperty the name of the property to query on each object to retrieve
     *        the corresponding value, cannot be <code>null</code>
     * @throws java.lang.IllegalArgumentException if the valueProperty or labelProperty is <code>null</code>
     * @throws java.lang.RuntimeException if one of the items in the collection is <code>null</code>, or
     *         if the caller does not have access one of the object's properties, if an exception was thrown while
     *         accessing a property or if the property does not exist on at least one of the items
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorValueList()
     * @see #getIdiomaBuscadorLabelList()
     * @see #getIdiomaBuscadorLabelList()
     */
    public void setIdiomaBuscadorBackingList(java.util.Collection items, String valueProperty, String labelProperty);

    /**
     * The <code>idiomaBuscador</code> field can be selected from a list,
     * this method allows you to retrieve the values from that list.
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorBackingList()
     */
    public java.lang.Object[] getIdiomaBuscadorValueList();

    /**
     * The <code>idiomaBuscador</code> field can be selected from a list,
     * this method allows you to set the values for that list.
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorBackingList()
     */
    public void setIdiomaBuscadorValueList(java.lang.Object[] idiomaBuscadorValueList);

    /**
     * The <code>idiomaBuscador</code> field can be selected from a list,
     * this method allows you to retrieve the labels from that list.
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorBackingList()
     */
    public java.lang.Object[] getIdiomaBuscadorLabelList();

    /**
     * The <code>idiomaBuscador</code> field can be selected from a list,
     * this method allows you to set the labels for that list.
     *
     * @see #getIdiomaBuscador()
     * @see #getIdiomaBuscadorBackingList()
     */
    public void setIdiomaBuscadorLabelList(java.lang.Object[] idiomaBuscadorLabelList);

}
