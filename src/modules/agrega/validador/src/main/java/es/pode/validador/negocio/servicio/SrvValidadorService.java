// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.validador.negocio.servicio;

/**
 * <p>
 * El servicio de validacion consta de cuatro metodos para
 * diferentes tipos de validacion:
 * </p>
 * <p>
 * a) obtenerValidacionBin: parametro de entrada rutaManifest de
 * tipo String, es la ruta en la      que    se   encuentra el
 * fichero imsmanifest.xml; parametro de salida, el tipo ValidaVO
 * </p>
 * <p>
 * Este tipo de validacion realiza las siguientes tareas:
 * </p>
 * <p>
 * 1.- chequea que el fichero se encuentre en la ruta
 * correspondiente
 * </p>
 * <p>
 * 2.- realiza el parseo del fichero y comprueba que los nodos y
 * atributos sean correctos
 * </p>
 * <p>
 * 3.- chequeo de los contenidos, en los que se testea que los
 * ficheros a los que referencia           el imsmanifest.xml sean
 * correctos y esten en su ruta correspondiente
 * </p>
 * <p>
 * El resultado de esta validacion sera del tipo ValidaVO, con sus
 * atributos rellenos seguno
 * </p>
 * <p>
 * se ha comentado en el mismo
 * </p>
 * <p>
 * b) obtenerValidacionLigera: parametro de entrada rutaManifest de
 * tipo String, es la ruta en
 * </p>
 * <p>
 * la que se encuentra el fichero imsmanifest.xml; parametro de
 * salida, el tipo ValidaVO
 * </p>
 * <p>
 * Este tipo de validacion realiza las siguientes tareas:
 * </p>
 * <p>
 * 1.- chequea que el fichero se encuentre en la ruta
 * correspondiente
 * </p>
 * <p>
 * 2.- realiza el parseo del fichero y comprueba que los nodos y
 * atributos sean correctos;
 * </p>
 * <p>
 * esta comprobacion tendra mayor o menor restriccion dependiendo
 * del tipo de ODE que
 * </p>
 * <p>
 * puede ser: CA (contentAggregation--> si es obligatorio que tenga
 * al menos una
 * </p>
 * <p>
 * organizacion) o RCP (ResourceContentPackage --> la etiqueta
 * organizations tiene que ir
 * </p>
 * <p>
 * vacia)
 * </p>
 * <p>
 * El resultado de esta validacion sera del tipo ValidaVO, con sus
 * atributos rellenos seguno
 * </p>
 * <p>
 * se ha comentado en el mismo
 * </p>
 * <p>
 * c) validarCargaOde: parametro de entrada rutaManifest de tipo
 * String, es la ruta en
 * </p>
 * <p>
 * la que se encuentra el fichero imsmanifest.xml; parametro de
 * salida, el tipo ValidaVO
 * </p>
 * <p>
 * Este tipo de validacion realiza las siguientes tareas:
 * </p>
 * <p>
 * 1.- valida que el fichero se encuentre en la ruta
 * correspondiente
 * </p>
 * <p>
 * 2.- chequea que todos los metadatos de tipo LOM-ES sean
 * correctos
 * </p>
 * <p>
 * 3.- Realiza la validacion Binaria (explicado en apartado a)
 * </p>
 * <p>
 * 4.- chequea que esten rellenos los campos de metadatos basicos
 * obligatorios
 * </p>
 * <p>
 * d) validarMDBasicosObl: parametro de entrada MDBasicosOblVO, es
 * la ruta en
 * </p>
 * <p>
 * la que se encuentra el fichero imsmanifest.xml; parametro de
 * salida, el tipo ValidaVO
 * </p>
 * <p>
 * Con este metodo se obliga a que se rellenen los metadatos
 * basicos obligatorios, si no estan
 * </p>
 * <p>
 * devolvera un error
 * </p>
 */
public interface SrvValidadorService
{
    public es.pode.validador.negocio.servicio.ValidaVO obtenerValidacionBin(java.lang.String rutaManifest);

    public es.pode.validador.negocio.servicio.ValidaVO obtenervalidacionLigera(java.lang.String rutaManifest, java.lang.String tipoOde);

    public es.pode.validador.negocio.servicio.ValidaVO validarCargaOde(java.lang.String rutaOde);

    public es.pode.validador.negocio.servicio.ValidaVO validarMDBasicosObl(es.pode.validador.negocio.servicio.MDBasicosOblVO mDBasicos);

    public java.lang.String validarMec(java.lang.String rutaManifest);

    public boolean estoyActivo();

    public java.lang.Boolean obtenerValidacionLomes(javax.activation.DataHandler fichero);

    public es.pode.validador.negocio.servicio.ValidaVO obtenerValidacion(java.lang.String rutaOde);

}