// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package es.pode.publicacion.negocio.servicios;

/**
 * 
 */
public interface SrvPublicacionService
{
  /**
   * <p>
   * Este metodo consulta el estado actual del ODE que le pasan. Se
   * le pasa el idioma al que traducir el texto descriptivo del
   * estado.
   * </p>
   * <p>
   * Obtenemos el estado del ODE traducido al idioma que le pasamos.
   * </p>
      * @param idODE  String con el identificador del ODE que queremos consultar.
         * @param idioma  El idioma en el que queremos que nos traduzca el estado.
      * @return es.pode.publicacion.negocio.servicios.EstadoVO
   * @throws throws es.pode.publicacion.negocio.servicios.ObtenEstadoODEException Exception
   */
    public es.pode.publicacion.negocio.servicios.EstadoVO obtenEstadoPorIdODE(java.lang.String idODE, java.lang.String idioma)
        throws es.pode.publicacion.negocio.servicios.ObtenEstadoODEException;

  /**
   * <p>
   * Este metodo recibe un identificador de un ODE del que espera
   * obtener un historial de las transiciones de estados por los que
   * ha ido pasando en su historia.
   * </p>
   * <p>
   * Devuelve un array con las transiciones ordenadas por fecha de
   * los estados del ODE.
   * </p>
      * @param idODE  Identificador del ODE del que se quiere el historial de transiciones.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   * @throws throws es.pode.publicacion.negocio.servicios.ObtenerHistoriaODEException Exception
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenHistorialPorIdODE(java.lang.String idODE)
        throws es.pode.publicacion.negocio.servicios.ObtenerHistoriaODEException;

  /**
   * <p>
   * Metodo que implementa el rechazo del ODE que le indican.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se va a rechazar.
         * @param idUsuario  Usuario que rechaza el ODE.
         * @param comentarios  El rechazo de un ODE puede llevar comentarios.
         * @param titulo  Titulo del ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO rechazar(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo);

  /**
   * <p>
   * Este metodo implementa las operaciones de creacion de un nuevo
   * ODE desde la nada hasta el estado de Creacion.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se va a crear desde la nada.
         * @param idUsuario  Identificador del usuario que va a crear el ODE desde la nada.
         * @param comentarios  La creacion puede llevar asociado algun comentario.
         * @param titulo  Titulo del ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   * @throws throws es.pode.publicacion.negocio.servicios.CreacionException Exception
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO creacion(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo)
        throws es.pode.publicacion.negocio.servicios.CreacionException;

  /**
   * <p>
   * Este metodo se encargara de coger un identificador de ODE y
   * realizar todos los pasos para publicarlo, incluyendo la
   * generacion del MEC.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se quiere publicar.
         * @param idUsuario  Identificador del usuario que publica el ODE.
         * @param comentarios  La publicacion del ODE puede llevar asociados algunos comentarios.
         * @param titulo  Titulo del ODE.
         * @param comunidades  Comunidades licenciadas para el uso del ODE.
         * @param tipoLicencia  Tipo de licencia que afecta al uso del ODE.
         * @param universal  El campo de universal de rights argrega para la licencia.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   * @throws throws es.pode.publicacion.negocio.servicios.PublicarException Exception
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO publicar(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo, java.lang.String comunidades, java.lang.String tipoLicencia, java.lang.String universal)
        throws es.pode.publicacion.negocio.servicios.PublicarException;

  /**
   * <p>
   * Metodo encargado de publicar objetos en formato PIF (ZIP). La
   * funcionalidad sera similar a la realizada por el metodo
   * publicar(idODE).
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param pif  Fichero PIF que alberga un fichero en formato ZIP. Contiene el ODE.
         * @param idUsuario  Identificador del usuario que publica el fichero con el ODE.
         * @param comentarios  La publicacion de un ODE puede llevar algunos comentarios.
         * @param sobrescribir  Indica si la carga se ha de realizar sobrescribiendo el ODE si este ya existe. Valores s/n.
         * @param titulo  el titulo del ode. Aparecera en las transiciones de creado y propuesto. Lo normal es que sea el nombre del archivo zip que se importa.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   * @throws throws es.pode.publicacion.negocio.servicios.PublicarPIFException Exception
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO publicarPIF(javax.activation.DataHandler pif, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String sobrescribir, java.lang.String titulo)
        throws es.pode.publicacion.negocio.servicios.PublicarPIFException;

  /**
   * <p>
   * Metodo que implementa el paso a no disponible del ODE que le
   * indican.
   * </p>
   * <p>
   * El paso a no disponible implica la desindexacion del ODE, la
   * eliminacion de todas sus valoraciones y un cambio de
   * localizacion en disco.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que pasa a no disponible.
         * @param idUsuario  Identificador del usuario que pasa a no disponible el ODE.
         * @param comentarios  El paso a no disponible puede llevar algun comentario.
         * @param titulo  Titulo del ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO noDisponible(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo);

  /**
   * <p>
   * Este metodo propone para publicacion el ODE que se le indica.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se va a proponer para publicacion.
         * @param idUsuario  Identificador del usuario que propone el ODE para publicacion.
         * @param comentarios  Comentarios asociados a la propuesta para publicacion.
         * @param titulo  Titulo del ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO proponerPublicacion(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo);

  /**
   * <p>
   * Este metodo devuelve una lista de identificadores de ODEs que se
   * encuentren en estado publicado.
   * </p>
   * @return es.pode.publicacion.negocio.servicios.IdODEVO[]
   */
    public es.pode.publicacion.negocio.servicios.IdODEVO[] obtenODEsPublicados();

  /**
   * <p>
   * Este metodo recupera la lista de ODEs en estado CREADO asociados
   * a un usuario.
   * </p>
      * @param idUsuario  Identificador de un usuario.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsCreadosPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Este metodo devuelve los ODEs en estado PROPUESTO asociados al
   * usuario dado.
   * </p>
      * @param idUsuario  Identificador del usuario del que se quieren averiguar los ODEs.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsPropuestosPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Este metodo selecciona los ODEs en estado PROPUESTO asociados al
   * usuario dado.
   * </p>
      * @param idUsuario  Identificador del usuario del que se quieren averiguar la lista de ODEs.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsPublicadosPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Busca identificadores de ODE's cuyo estado actual sea el mismo
   * que el suministrado.
   * </p>
   * <p>
   * Devuelve un array de identificadores de ODEs.
   * </p>
      * @param estado  String con el estado por el que queremos buscar.
         * @param inicio  Valor de inicio de la pagina
         * @param fin  Valor de finalizacion de la pagina
         * @param hayMas  Indicador de si hay o no m�s p�ginas disponibles
      * @return es.pode.publicacion.negocio.servicios.IdODEVO[]
   * @throws throws es.pode.publicacion.negocio.servicios.BuscarODEsEstadoException Exception
   */
    public es.pode.publicacion.negocio.servicios.IdODEVO[] buscarODEsPorEstado(java.lang.String estado, java.lang.Integer inicio, java.lang.Integer fin, java.lang.Boolean hayMas)
        throws es.pode.publicacion.negocio.servicios.BuscarODEsEstadoException;

  /**
   * <p>
   * Este metodo genera un identificador MEC valido para el ODE del
   * que se le pasa la ruta del fichero imsmanifest.
   * </p>
      * @param localizador  Ruta donde se localiza el fichero imsmanifest del ODE del que se quiere crear un MEC.
      * @return java.lang.String
   */
    public java.lang.String generaMEC(java.lang.String localizador);

  /**
   * <p>
   * Este metodo mueve el contenido de un directorio a otro
   * directorio.
   * </p>
   * <p>
   * Devuelve el tamanio del directorio movido (con todos sus
   * subdirectorios).
   * </p>
      * @param oldDir  Directorio antiguo.
         * @param newDir  Directorio nuevo.
      * @return java.lang.Long
   */
    public java.lang.Long moveDir(java.io.File oldDir, java.io.File newDir);

  /**
   * <p>
   * Este metodo obtiene la ultima transicion del ode al que
   * corresponde el identificador.
   * </p>
      * @param idODE  Identificador del ODE del que queremos averiguar la ultima transicion.
      * @return es.pode.publicacion.negocio.dominio.Transicion
   */
    public es.pode.publicacion.negocio.dominio.Transicion obtenerUltimaTransicion(java.lang.String idODE);

  /**
   * <p>
   * Este metodo busca los ODEs que hay en la plataforma en el estado
   * que le pasan para el usuario que le pasan.
   * </p>
      * @param idUsuario  Identificador del usuario del que se quiere obtener la lista de ODEs.
         * @param estado  Estado en el que se quiere obtener la lista de ODEs.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] buscarODEsPorEstadoUsuario(java.lang.String idUsuario, java.lang.String estado);

  /**
   * <p>
   * Este metodo realiza las operaciones de creacion de un ODE en
   * estado CREADO.
   * </p>
   * <p>
   * Valida la informacion del ODE que se pasa en formato PIF(ZIP) y
   * lo alberga en la plataforma bajo el usuario con el que se crea.
   * Se descomprime en un temporal para validarlo, y si valida se
   * crea un localizador y se copia en �l.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param ficheroPIF  Se trata del fichero del ODE en formato PIF(ZIP).
         * @param idUsuario  Identificador del usuario que va a realizar la operacion de crear el ODE desde un fichero PIF.
         * @param comentarios  Comentarios de la creacion.
         * @param titulo  Titulo del ODE que se desea crear.
         * @param idioma  Se necesita el idioma para mostrar el titulo del ode creado en el idioma correspondiente. Se muestra el titulo del lomes en casa de tenerlo. Si no se muestra como titulo el nombre del archivo.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO crearPIF(javax.activation.DataHandler ficheroPIF, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo, java.lang.String idioma);

  /**
   * <p>
   * Devuelve los odes del usuario que estan en estado rechazado.
   * </p>
      * @param idUsuario  El id del usuario.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsRechazadosPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Elimina el ode que se pasa por parametro del usuario. Los odes
   * eliminables por el usuario son los que estan en estado:creacion,
   * no disponible, rechazado.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODEs  El ode a eliminar, por identificador.
         * @param idUsuario  El id del usuario. Solo podemos eliminar los odes que pertenezcan al usuario.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO eliminar(java.lang.String idODEs, java.lang.String idUsuario);

  /**
   * <p>
   * Este metodo reindexa en el indice de busqueda el ODE que se le
   * indica con la valoracion que le pasan.
   * </p>
   * <p>
   * Devuelve un VO con el codigo de exito o error en la operacion.
   * </p>
      * @param idODE  Identificador del ODE que se quiere reindexar.
         * @param valoracion  Valoracion con la que se quiere reindexar el ODE.
      * @return es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO
   */
    public es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO reindexarODEPublicado(java.lang.String idODE, java.lang.Float valoracion);

  /**
   * <p>
   * Este metodo reindexa la lista de ODEs publicados que le pasan
   * (lista de identificadores).
   * </p>
   * <p>
   * Los elimina del indice  y los vuelve a reindexar cada uno en su
   * idioma.
   * </p>
   * <p>
   * Se devuelve un VO con codigo de exito/fracaso para cada ODE.
   * </p>
      * @param idODEs  Lista de identificadores de ODEs que se quieren reindexar.
 Si la lista es null o vacia, se reindexaran todos los ODEs publicados.
      * @return es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO[]
   */
    public es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO[] reindexarODEsPublicados(java.lang.String[] idODEs);

  /**
   * <p>
   * Se regeneran los indices de los idiomas que se pasan.
   * </p>
   * <p>
   * Se borran todos los odes indexados en esos idiomas y se indexan
   * los odes publicados en el momento de la invocacion para cada
   * idioma afectado.
   * </p>
      * @param paramRegenera  Parametros de regeneracion de los indices de un repositorio.
      * @return es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO[]
   */
    public es.pode.publicacion.negocio.servicios.ReindexarODEResultadoVO[] regeneraIndiceIdioma(es.pode.publicacion.negocio.servicios.RegeneracionIndiceVO paramRegenera);

  /**
   * <p>
   * Devuelve los odes de todos los usuarios del nodo que estan
   * pendientes de publicacion (en estado propuesto)
   * </p>
   * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsPropuestos();

  /**
   * <p>
   * Muestra los odes de todos los usuarios del noodo que estan
   * despublicados (no disponibles)
   * </p>
   * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsDespublicados();

  /**
   * <p>
   * Publica un ode que este en estado despublicado. No genera un
   * nuevo codigo mec.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se quiere publicar.
         * @param idUsuario  Identificador del usuario que publica el ODE.
         * @param comentarios  La publicacion del ODE puede llevar asociados algunos comentarios.
         * @param titulo  Titulo del ODE.
         * @param comunidades  Comunidades licenciadas para el uso del ODE.
         * @param tipoLicencia  Tipo de licencia que afecta al uso del ODE.
         * @param universal  El campo de universal de rights argrega para la licencia.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO publicarDespublicado(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo, java.lang.String comunidades, java.lang.String tipoLicencia, java.lang.String universal);

  /**
   * <p>
   * Este metodo devuelve los ODEs que estan en estado No Disponible
   * asociados al usuario dado.
   * </p>
      * @param idUsuario  Identificador del usuario que creo el ODE y al que se le asocia el ODE.
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsDespublicadosPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Este metodo elimina los ODEs en estado No Disponible que cumplen
   * las condiciones de los parametros que se le pasan: rango de
   * fecha en el que paso a no disponible, usuario al que pertenece
   * el ODE, etc.
   * </p>
   * <p>
   * Si la lista de usuarios es vacia, se tendran en cuenta los ODEs
   * no disponibles de todo el repositorio.
   * </p>
   * <p>
   * Si la fecha de fin es vacia, se tendra en cuenta la fecha actual
   * como limite temporal superior.
   * </p>
   * <p>
   * Si la fecha de inicio es vacia, no se tendra en cuenta limite
   * temporal inferior.
   * </p>
   * <p>
   * Devuelve un array de resultados de eliminar los ODEs que cumplen
   * las condiciones de eliminacion.
   * </p>
      * @param parametro  Parametros con las condiciones a cumplir por los ODEs a eliminar.
      * @return es.pode.publicacion.negocio.servicios.EliminarResultadoVO[]
   */
    public es.pode.publicacion.negocio.servicios.EliminarResultadoVO[] eliminarNoDisponibles(es.pode.publicacion.negocio.servicios.EliminarNoDisponiblesVO parametro);

  /**
   * <p>
   * Este metodo modifica los valores de titulo y comentarios de un
   * ode en estado creado que le pasan.
   * </p>
   * <p>
   * Si los valores de titulo o comentarios suministrados son alguno
   * o los dos nulos, no se modificara el campo afectado. Solo se
   * modificaran los campos con contenido.
   * </p>
   * <p>
   * Devuelve un booleano con el resultado de la modificacion y una
   * excepcion en caso de no existir ningun ode en creacion con esas
   * caracteristicas.
   * </p>
      * @param idODE  Se trata del identificador del ODE que esta en estado de creacion al que se quiere realizar la modificacion.
         * @param idUsuario  Se trata del identificador de usuario al que pertenece el ODE en estado de creacion.
         * @param titulo  Se trata del nuevo titulo con el que se quiere sustituir el titulo del ODE en estado de creacion.
 Puede ser null, lo que implica que no se realizaran cambios para este campo en este ODE.
         * @param comentarios  Se trata de los comentarios con los que se quiere sustituir los comentarios del ODE en estado de creacion.
 Puede ser null, lo que implica que no se realizaran cambios para este campo en este ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO modificaODECreado(java.lang.String idODE, java.lang.String idUsuario, java.lang.String titulo, java.lang.String comentarios);

  /**
   * <p>
   * Este metodo devuele la licencia de un ODE, del que sabemos su
   * id.
   * </p>
      * @param idODE  El identificador del ODE del que queremos conocer la licencia.
         * @param idioma  El idioma en el que estamos navegando y en el que accedemos al manifest del ODE.
      * @return es.pode.publicacion.negocio.servicios.LicenciaVO
   */
    public es.pode.publicacion.negocio.servicios.LicenciaVO obtenLicenciaODE(java.lang.String idODE, java.lang.String idioma);

    public es.pode.publicacion.negocio.servicios.IdODEVO[] obtenODEsPublicadosPorPagina(java.lang.Integer inicio, java.lang.Integer fin, java.lang.Boolean hayMas);

  /**
   * <p>
   * Metodo que realiza la creacion de la ruta a mostrar y decide si
   * se debe o no enviar a la cola JMS la peticion para generar la
   * imagen o no.
   * </p>
   * <p>
   * Si el archivo principal es:
   * </p>
   * <p>
   * .doc, .xls, .ppt, .pdf, .mp3, .wav, etc.
   * </p>
   * <p>
   * Se apuntara a un icono por defecto y no se solicitara la
   * generacion de dicha imagen.
   * </p>
      * @return java.lang.String
   */
    public java.lang.String createImage4Ode(es.pode.publicacion.negocio.servicios.OdeVO ode);

  /**
   * <p>
   * Metodo encargado de enviar a la cola JMS el objeto del cual se
   * desea generar una imagen.
   * </p>
      */
    public void sendMessage(es.pode.publicacion.negocio.servicios.OdeVO ode);

  /**
   * <p>
   * Devuelve los odes de todos los usuarios que esten pendientes de
   * catalogar.
   * </p>
   * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODESPropuestosCatalogacion();

  /**
   * <p>
   * devuelve los odes del usuario que esten pendientes de catalogar.
   * </p>
      * @param idUsuario  el usuario del que se quieren obtener los odes en estado Propuesto para catalogacion
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODESPropuestosCatalogacionPorUsuario(java.lang.String idUsuario);

  /**
   * <p>
   * Este metodo propone para catalogacion el ODE que se le indica.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param idODE  Identificador del ODE que se va a proponer para catalogacion.
         * @param idUsuario  Identificador del usuario que propone el ODE para catalogacion.
         * @param comentarios  Comentarios asociados a la propuesta para catalogacion.
         * @param titulo  Titulo del ODE.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO proponerCatalogacion(java.lang.String idODE, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo);

  /**
   * <p>
   * Metodo encargado de publicar objetos en formato PIF (ZIP). La
   * funcionalidad sera similar a la realizada por el metodo
   * publicar(idODE).
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param pif  Fichero PIF que alberga un fichero en formato ZIP. Contiene el ODE.
         * @param idUsuario  Identificador del usuario que publica el fichero con el ODE.
         * @param comentarios  La publicacion de un ODE puede llevar algunos comentarios.
         * @param titulo  el titulo del ode. Aparecera en las transiciones de creado y propuesto. Lo normal es que sea el nombre del archivo zip que se importa.
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO crearPIFCatalogado(javax.activation.DataHandler pif, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo);

  /**
   * <p>
   * Un m�todo como crearPif, s�lo que toma en cuenta el tama�o del
   * ODE a la hora de validar.
   * </p>
   * <p>
   * Este metodo crea un ODE en estado CREADO a partir de un fichero
   * PIF teniendo en cuenta el espacio consumido por el usuario
   * (CREADOS m�s RECHAZADOS) y la cuota de espacio del usuario.
   * </p>
   * <p>
   * Si el ODE no cabe en la cuota del usuario, se devuelve un error
   * en consecuencia. Si hay espacio suficiente se crea el ODE.
   * </p>
      * @param pif  El paquete
         * @param idUsuario  el identificador del usuario
         * @param comentarios  Los comentarios a�adidos
         * @param titulo  El t�tulo del ODE
         * @param idioma  El idioma del ODE
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO crearPifConCuota(javax.activation.DataHandler pif, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo, java.lang.String idioma);

  /**
   * <p>
   * M�todo para obtener los Odes propuestos para catalogaci�n de una
   * lista de usuarios
   * </p>
      * @param idsUsuarios  Lista de identificadores de usuarios
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsPropuestosCatalogacionPorUsuarios(java.lang.String[] idsUsuarios);

  /**
   * <p>
   * Metodo que devuelve todos los ODEs que estan en estado creado o
   * rechazado y esten compartidos
   * </p>
   * @return es.pode.publicacion.negocio.servicios.TransicionAutorVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionAutorVO[] obtenODESCompartidos();

  /**
   * <p>
   * Metodo para descompartir un ODE que esta compartido
   * </p>
      * @param idODE  El identifcador que se quiere descompartir
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO descompartirODE(java.lang.String idODE);

  /**
   * <p>
   * Metodo para compartir un ODE que esta descompartido
   * </p>
      * @param idODE  El identificador del ODE que se quiere compartir
      * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO compartirODE(java.lang.String idODE);

  /**
   * <p>
   * Este metodo realiza las operaciones de creacion de un ODE en
   * estado CREADO.
   * </p>
   * <p>
   * Valida la informacion del ODE que se pasa en formato PIF(ZIP) y
   * lo alberga en la plataforma bajo el usuario con el que se crea.
   * Se descomprime en un temporal para validarlo, y si valida se
   * crea un localizador y se copia en �l.
   * </p>
   * <p>
   * Devuelve un VO con el error que se ha producido en el caso de
   * detectarse algun problema.
   * </p>
      * @param url  Se trata del fichero del ODE en formato PIF(ZIP).
         * @param idUsuario  Identificador del usuario que va a realizar la operacion de crear el ODE desde un fichero PIF.
         * @param comentarios  Comentarios de la creacion.
         * @param titulo  Titulo del ODE que se desea crear.
         * @param idioma  Se necesita el idioma para mostrar el titulo del ode creado en el idioma correspondiente. Se muestra el titulo del lomes en casa de tenerlo. Si no se muestra como titulo el nombre del archivo.
            * @return es.pode.publicacion.negocio.servicios.ResultadoOperacionVO
   */
    public es.pode.publicacion.negocio.servicios.ResultadoOperacionVO crearDesdeURL(java.lang.String url, java.lang.String idUsuario, java.lang.String comentarios, java.lang.String titulo, java.lang.String idioma, java.lang.String idiomaDestinatario, java.lang.String tipo);

  /**
   * <p>
   * M�todo para obtener los Odes propuestos de una lista de usuarios
   * </p>
      * @param ids  Los identificadores de los usuarios
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsPropuestosPorUsuarios(java.lang.String[] ids);

  /**
   * <p>
   * Metodo que devuelve todos los ODEs que estan en estado creado o
   * rechazado y esten compartidos por una lista de usuarios
   * </p>
      * @param ids  Identificadores de los usuarios
      * @return es.pode.publicacion.negocio.servicios.TransicionAutorVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionAutorVO[] obtenODEsCompartidosPorUsuarios(java.lang.String[] ids);

  /**
   * <p>
   * Muestra los odes de todos los usuarios que comparten grupo de
   * trabajo que estan despublicados (no disponibles)
   * </p>
      * @param ids  Los identificadores de los usuarios
      * @return es.pode.publicacion.negocio.servicios.TransicionVO[]
   */
    public es.pode.publicacion.negocio.servicios.TransicionVO[] obtenODEsDespublicadosPorUsuarios(java.lang.String[] ids);

}
