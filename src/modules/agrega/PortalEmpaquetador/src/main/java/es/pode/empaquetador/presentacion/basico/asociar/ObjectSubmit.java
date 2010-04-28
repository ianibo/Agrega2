// license-header java merge-point
package es.pode.empaquetador.presentacion.basico.asociar;

/**
 * 
 */
public final class ObjectSubmit extends org.apache.struts.action.Action
{
    public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final ObjectSubmitFormImpl specificForm = (ObjectSubmitFormImpl)form;

        org.apache.struts.action.ActionForward forward = null;

        try
        {
            forward = __selectActionObject(mapping, form, request, response);
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
     * <p>
     * Crear un archivo cuyo contenido sea
     * <html><body>[objecto_embebido]</body></html> y meter en sesion
     * el FileVO al archivo generado
     * </p>
     */
    private org.apache.struts.action.ActionForward _crearObject(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        es.pode.empaquetador.presentacion.basico.asociar.AsociarControllerFactory.getAsociarControllerInstance().crearObject(mapping, (ObjectSubmitFormImpl)form, request, response);
        forward = mapping.findForward("crear.asociacion");


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward __selectActionObject(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final java.lang.String value = java.lang.String.valueOf(es.pode.empaquetador.presentacion.basico.asociar.AsociarControllerFactory.getAsociarControllerInstance().selectActionObject(mapping, (ObjectSubmitFormImpl)form, request, response));

        if (value.equals("Cancelar"))
        {
            return mapping.findForward("seleccionar");
        }
        if (value.equals("Aceptar"))
        {
            return _crearObject(mapping, form, request, response);
        }

        // we take the last action in case we have an invalid return value from the controller
        return _crearObject(mapping, form, request, response);
    }

}
