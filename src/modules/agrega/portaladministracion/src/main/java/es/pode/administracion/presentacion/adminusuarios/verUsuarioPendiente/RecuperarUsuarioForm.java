// license-header java merge-point
package es.pode.administracion.presentacion.adminusuarios.verUsuarioPendiente;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>recuperarUsuario</code> method, which is located on the
 * <code>es.pode.administracion.presentacion.adminusuarios.verUsuarioPendiente.VerUsuarioPendienteController</code> controller.
 *
 * 
 *
 * @see es.pode.administracion.presentacion.adminusuarios.verUsuarioPendiente.VerUsuarioPendienteController#recuperarUsuario
 */
public interface RecuperarUsuarioForm
{
    /**
     * Sets the <code>id</code> field.
     *
     * 
     */
    public void setId(java.lang.Long id);

    /**
     * Gets the <code>id</code> field.
     *
     * 
     */
    public java.lang.Long getId();
    
    /**
     * Resets the <code>id</code> field.
     */
    public void resetId();

    /**
     * Sets the <code>nombre</code> field.
     *
     * 
     */
    public void setNombre(java.lang.String nombre);

    /**
     * Gets the <code>nombre</code> field.
     *
     * 
     */
    public java.lang.String getNombre();
    
    /**
     * Resets the <code>nombre</code> field.
     */
    public void resetNombre();

    /**
     * Sets the <code>apellido2</code> field.
     *
     * 
     */
    public void setApellido2(java.lang.String apellido2);

    /**
     * Gets the <code>apellido2</code> field.
     *
     * 
     */
    public java.lang.String getApellido2();
    
    /**
     * Resets the <code>apellido2</code> field.
     */
    public void resetApellido2();

    /**
     * Sets the <code>tipoEmpaquetador</code> field.
     *
     * 
     */
    public void setTipoEmpaquetador(java.lang.String tipoEmpaquetador);

    /**
     * Gets the <code>tipoEmpaquetador</code> field.
     *
     * 
     */
    public java.lang.String getTipoEmpaquetador();
    
    /**
     * Resets the <code>tipoEmpaquetador</code> field.
     */
    public void resetTipoEmpaquetador();

    /**
     * Sets the <code>email</code> field.
     *
     * 
     */
    public void setEmail(java.lang.String email);

    /**
     * Gets the <code>email</code> field.
     *
     * 
     */
    public java.lang.String getEmail();
    
    /**
     * Resets the <code>email</code> field.
     */
    public void resetEmail();

    /**
     * Sets the <code>usuario</code> field.
     *
     * 
     */
    public void setUsuario(java.lang.String usuario);

    /**
     * Gets the <code>usuario</code> field.
     *
     * 
     */
    public java.lang.String getUsuario();
    
    /**
     * Resets the <code>usuario</code> field.
     */
    public void resetUsuario();

    /**
     * Sets the <code>apellido1</code> field.
     *
     * 
     */
    public void setApellido1(java.lang.String apellido1);

    /**
     * Gets the <code>apellido1</code> field.
     *
     * 
     */
    public java.lang.String getApellido1();
    
    /**
     * Resets the <code>apellido1</code> field.
     */
    public void resetApellido1();

    /**
     * Sets the <code>idioma</code> field.
     *
     * 
     */
    public void setIdioma(java.lang.String idioma);

    /**
     * Gets the <code>idioma</code> field.
     *
     * 
     */
    public java.lang.String getIdioma();
    
    /**
     * Resets the <code>idioma</code> field.
     */
    public void resetIdioma();

    /**
     * Sets the <code>NIF</code> field.
     *
     * 
     */
    public void setNIF(java.lang.String NIF);

    /**
     * Gets the <code>NIF</code> field.
     *
     * 
     */
    public java.lang.String getNIF();
    
    /**
     * Resets the <code>NIF</code> field.
     */
    public void resetNIF();

    /**
     * Sets the <code>idiomaBusqueda</code> field.
     *
     * 
     */
    public void setIdiomaBusqueda(java.lang.String idiomaBusqueda);

    /**
     * Gets the <code>idiomaBusqueda</code> field.
     *
     * 
     */
    public java.lang.String getIdiomaBusqueda();
    
    /**
     * Resets the <code>idiomaBusqueda</code> field.
     */
    public void resetIdiomaBusqueda();

    /**
     * This field is a collection type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setGrupos#sArray(Object[])
     */
    public void setGrupos(java.util.Collection grupos);

    /**
     * This field is a collection type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getGrupos#sArray()
     */
    public java.util.Collection getGrupos();

    /**
     * This field is a collection type, and this method allows you to set it as an
     * array into the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #setGrupos(java.util.Collection)
     */
    public void setGruposAsArray(Object[] grupos);

    /**
     * This field is a collection type, and this method allows you to get it as an
     * array from the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #getGrupos()
     */
    public java.lang.Object[] getGruposAsArray();

    /**
     * Resets the <code>grupos</code> field.
     */
    public void resetGrupos();

}
