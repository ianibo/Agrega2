// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.valoracion.negocio.servicios.auditoria;

/**
 * <p>
 * Esta clase implementa la parte de auditoria del servicio de
 * valoracion. Alberga los metodos publicos que permiten extraer
 * informacion estadistica de la valoracion de los elementos de la
 * plataforma.
 * </p>
 */
public interface SrvAuditoriaValoracionService
{
  /**
   * <p>
   * Este metodo permite consultar los N contenidos mas valorados en
   * un periodo dado.
   * </p>
      * @param parametro  Parametros de la consulta.
      * @return es.pode.valoracion.negocio.servicios.auditoria.ValoracionODEVO[]
   */
    public es.pode.valoracion.negocio.servicios.auditoria.ValoracionODEVO[] contenidosMasValorados(es.pode.valoracion.negocio.servicios.auditoria.ParametroAuditValoracionVO parametro);

}
