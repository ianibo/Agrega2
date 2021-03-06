// license-header java merge-point
package es.pode.catalogadorWeb.presentacion.catalogadorBasico;

/**
 * 
 */
public final class CatalogadorBasico extends org.apache.struts.action.Action
{
    public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final CatalogadorBasicoFormImpl specificForm = (CatalogadorBasicoFormImpl)form;

        final Object previousFormObject = request.getSession().getAttribute("form");

        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.catalogadorBasico.ImportarLomesSubmitFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.catalogadorBasico.ImportarLomesSubmitFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.catalogadorBasico.ImportarLomesSubmitFormImpl)previousFormObject;
        }
        else
        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaExportarSubmitFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaExportarSubmitFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaExportarSubmitFormImpl)previousFormObject;
        }
        else
        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.catalogadorBasico.GuardarpresGuardarDatosFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.catalogadorBasico.GuardarpresGuardarDatosFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.catalogadorBasico.GuardarpresGuardarDatosFormImpl)previousFormObject;
        }
        else
        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaImportarSubmitFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaImportarSubmitFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.catalogadorBasico.AdvertenciaImportarSubmitFormImpl)previousFormObject;
        }
        else
        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.taxonomias.TaxonomiaAsociarFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.taxonomias.TaxonomiaAsociarFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.taxonomias.TaxonomiaAsociarFormImpl)previousFormObject;
        }
        else
        if (previousFormObject instanceof es.pode.catalogadorWeb.presentacion.volver.ConfirmarGuardarDatosSubmitFormImpl)
        {
            final es.pode.catalogadorWeb.presentacion.volver.ConfirmarGuardarDatosSubmitFormImpl previousForm = (es.pode.catalogadorWeb.presentacion.volver.ConfirmarGuardarDatosSubmitFormImpl)previousFormObject;
        }
        else
        {
            // do nothing
        }
        org.apache.struts.action.ActionForward forward = null;

        try
        {
            forward = _cargarDatos(mapping, form, request, response);
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
    private org.apache.struts.action.ActionForward _cargarDatos(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        es.pode.catalogadorWeb.presentacion.catalogadorBasico.CatBasicoControllerFactory.getCatBasicoControllerInstance().cargarDatos(mapping, (CatalogadorBasicoFormImpl)form, request, response);
        forward = mapping.findForward("catalogador.form");


        return forward;
    }

}
