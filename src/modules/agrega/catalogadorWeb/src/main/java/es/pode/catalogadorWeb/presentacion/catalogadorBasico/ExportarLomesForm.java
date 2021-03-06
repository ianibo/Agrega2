// license-header java merge-point
package es.pode.catalogadorWeb.presentacion.catalogadorBasico;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>exportarLomes</code> method, which is located on the
 * <code>es.pode.catalogadorWeb.presentacion.catalogadorBasico.CatBasicoController</code> controller.
 *
 * 
 *
 * @see es.pode.catalogadorWeb.presentacion.catalogadorBasico.CatBasicoController#exportarLomes
 */
public interface ExportarLomesForm
{
    /**
     * Sets the <code>lomExportar</code> field.
     *
     * 
     */
    public void setLomExportar(es.pode.catalogacion.negocio.servicios.LomBasicoVO lomExportar);

    /**
     * Gets the <code>lomExportar</code> field.
     *
     * 
     */
    public es.pode.catalogacion.negocio.servicios.LomBasicoVO getLomExportar();
    
    /**
     * Resets the <code>lomExportar</code> field.
     */
    public void resetLomExportar();

}
