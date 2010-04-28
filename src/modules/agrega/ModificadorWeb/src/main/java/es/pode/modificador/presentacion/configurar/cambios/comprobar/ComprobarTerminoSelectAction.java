// license-header java merge-point
package es.pode.modificador.presentacion.configurar.cambios.comprobar;

/**
 * 
 */
public final class ComprobarTerminoSelectAction extends org.apache.struts.action.Action
{
    public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final ComprobarTerminoSelectActionFormImpl specificForm = (ComprobarTerminoSelectActionFormImpl)form;

        org.apache.struts.action.ActionForward forward = null;

        try
        {
            forward = __selectAction(mapping, form, request, response);
        }
        catch (java.lang.Exception exception)
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
            throw exception;
        }
        request.getSession().setAttribute("form", form);


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward _comprobar(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        es.pode.modificador.presentacion.configurar.cambios.comprobar.ComprobarTerminoControllerFactory.getComprobarTerminoControllerInstance().comprobar(mapping, (ComprobarTerminoSelectActionFormImpl)form, request, response);
        forward = mapping.findForward("cerrar");


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward _borrarSesion(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        es.pode.modificador.presentacion.configurar.cambios.comprobar.ComprobarTerminoControllerFactory.getComprobarTerminoControllerInstance().borrarSesion(mapping, (ComprobarTerminoSelectActionFormImpl)form, request, response);
        forward = mapping.findForward("configurar.modificacion");


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward _recuperaIdTermino(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        es.pode.modificador.presentacion.configurar.cambios.comprobar.ComprobarTerminoControllerFactory.getComprobarTerminoControllerInstance().recuperaIdTermino(mapping, (ComprobarTerminoSelectActionFormImpl)form, request, response);
        forward = mapping.findForward("navegar.lom");


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward __selectAction(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final java.lang.String value = java.lang.String.valueOf(es.pode.modificador.presentacion.configurar.cambios.comprobar.ComprobarTerminoControllerFactory.getComprobarTerminoControllerInstance().selectAction(mapping, (ComprobarTerminoSelectActionFormImpl)form, request, response));

        if (value.equals("Aceptar"))
        {
            return _comprobar(mapping, form, request, response);
        }
        if (value.equals("Volver"))
        {
            return _recuperaIdTermino(mapping, form, request, response);
        }
        if (value.equals("Cancelar"))
        {
            return _borrarSesion(mapping, form, request, response);
        }

        // we take the last action in case we have an invalid return value from the controller
        return _borrarSesion(mapping, form, request, response);
    }

}