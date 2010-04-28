// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package es.pode.publicacion.negocio.dominio;

/**
 * <p>
 * Esta entidad almacena las transiciones entre estados que puede
 * tener un ODE a lo largo de su ciclo de vida.
 * </p>
 * <p>
 * Cada transicion tiene una relacion con un estado inicial y un
 * estado final.
 * </p>
 * <p>
 * Cuando el ODE se crea por primera vez, no hay estado inicial
 * para la transicion al estado "Creado".
 * </p>
 * <p>
 * El estado actual del ODE corresponde al estado final de la
 * transicion mas moderna.
 * </p>
 */
public abstract class Transicion
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -1880118518462237121L;

    private java.util.Calendar fecha;

  /**
   * <p>
   * Fecha en la que se realizo la transicion entre estados.
   * </p>
   * @return java.util.Calendar
   */
    public java.util.Calendar getFecha()
    {
        return this.fecha;
    }

  /**
   * <p>
   * Fecha en la que se realizo la transicion entre estados.
   * </p>
   *  @param fecha  Fecha en la que se realizo la transicion entre estados. 
   */
    public void setFecha(java.util.Calendar fecha)
    {
        this.fecha = fecha;
    }
    private java.lang.String comentarios;

  /**
   * <p>
   * Son los comentarios que pone el administrador al cambio de
   * estado del ODE.
   * </p>
   * @return java.lang.String
   */
    public java.lang.String getComentarios()
    {
        return this.comentarios;
    }

  /**
   * <p>
   * Son los comentarios que pone el administrador al cambio de
   * estado del ODE.
   * </p>
   *  @param comentarios  Son los comentarios que pone el administrador al cambio de estado del ODE. 
   */
    public void setComentarios(java.lang.String comentarios)
    {
        this.comentarios = comentarios;
    }
    private java.lang.String idODE;

  /**
   * <p>
   * Clave del ODE al que pertenece esta transicion de estados.
   * </p>
   * @return java.lang.String
   */
    public java.lang.String getIdODE()
    {
        return this.idODE;
    }

  /**
   * <p>
   * Clave del ODE al que pertenece esta transicion de estados.
   * </p>
   *  @param idODE  Clave del ODE al que pertenece esta transicion de estados. 
   */
    public void setIdODE(java.lang.String idODE)
    {
        this.idODE = idODE;
    }
    private java.lang.String idUsuario;

  /**
   * <p>
   * Identificador del usuario que realiza el cambio de estado.
   * </p>
   * @return java.lang.String
   */
    public java.lang.String getIdUsuario()
    {
        return this.idUsuario;
    }

  /**
   * <p>
   * Identificador del usuario que realiza el cambio de estado.
   * </p>
   *  @param idUsuario  Identificador del usuario que realiza el cambio de estado. 
   */
    public void setIdUsuario(java.lang.String idUsuario)
    {
        this.idUsuario = idUsuario;
    }
    private java.lang.String titulo;

  /**
   * <p>
   * Se trata del titulo del ODE en caso de tenerlo.
   * </p>
   * @return java.lang.String
   */
    public java.lang.String getTitulo()
    {
        return this.titulo;
    }

  /**
   * <p>
   * Se trata del titulo del ODE en caso de tenerlo.
   * </p>
   *  @param titulo  Se trata del titulo del ODE en caso de tenerlo. 
   */
    public void setTitulo(java.lang.String titulo)
    {
        this.titulo = titulo;
    }
    private java.lang.String idUsuarioCreacion;

  /**
   * <p>
   * Se trata del usuario que creo el ODE.
   * </p>
   * @return java.lang.String
   */
    public java.lang.String getIdUsuarioCreacion()
    {
        return this.idUsuarioCreacion;
    }

  /**
   * <p>
   * Se trata del usuario que creo el ODE.
   * </p>
   *  @param idUsuarioCreacion  Se trata del usuario que creo el ODE. 
   */
    public void setIdUsuarioCreacion(java.lang.String idUsuarioCreacion)
    {
        this.idUsuarioCreacion = idUsuarioCreacion;
    }
    private java.lang.Long milisegundos;

  /**
   * <p>
   * Milisegundos del momento de creacion de la transicion. Nos hace
   * falta la precision de milisegundos ya que puede darse el caso
   * que en cargas masivas haya mas de una transicion en un segundo y
   * no sepamos distinguir la mas moderna de la mas antigua.
   * </p>
   * @return java.lang.Long
   */
    public java.lang.Long getMilisegundos()
    {
        return this.milisegundos;
    }

  /**
   * <p>
   * Milisegundos del momento de creacion de la transicion. Nos hace
   * falta la precision de milisegundos ya que puede darse el caso
   * que en cargas masivas haya mas de una transicion en un segundo y
   * no sepamos distinguir la mas moderna de la mas antigua.
   * </p>
   *  @param milisegundos  Milisegundos del momento de creacion de la transicion. Nos hace falta la precision de milisegundos ya que puede darse el caso que en cargas masivas haya mas de una transicion en un segundo y no sepamos distinguir la mas moderna de la mas antigua. 
   */
    public void setMilisegundos(java.lang.Long milisegundos)
    {
        this.milisegundos = milisegundos;
    }
    private java.lang.Boolean compartido;

  /**
   * <p>
   * Un boolean que nos indica si el ODE esta compartido o no.
   * </p>
   * @return java.lang.Boolean
   */
    public java.lang.Boolean getCompartido()
    {
        return this.compartido;
    }

  /**
   * <p>
   * Un boolean que nos indica si el ODE esta compartido o no.
   * </p>
   *  @param compartido  Un boolean que nos indica si el ODE esta compartido o no. 
   */
    public void setCompartido(java.lang.Boolean compartido)
    {
        this.compartido = compartido;
    }
    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }
  /**
   * <p>
   * Esta entidad almacena todos los posibles estados por los que
   * puede pasar un ODE a lo largo de su ciclo de vida.
   * </p>
   * <p>
   * Se reconocen los siguientes:
   * </p>
   * <p>
   * CREADO
   * </p>
   * <p>
   * COMPLETO
   * </p>
   * <p>
   * RECHAZADO
   * </p>
   * <p>
   * PROPUESTO PUBLICACION
   * </p>
   * <p>
   * PUBLICADO
   * </p>
   * <p>
   * NO DISPONIBLE
   * </p>
   */
    private es.pode.publicacion.negocio.dominio.Estado estadoTransitado;

  /**
   * Getter of estadoTransitado.  
   * @return es.pode.publicacion.negocio.dominio.Estado  Esta entidad almacena todos los posibles estados por los que puede pasar un ODE a lo largo de su ciclo de vida.
 Se reconocen los siguientes:
 CREADO
 COMPLETO
 RECHAZADO
 PROPUESTO PUBLICACION
 PUBLICADO
 NO DISPONIBLE
   */
    public es.pode.publicacion.negocio.dominio.Estado getEstadoTransitado()
    {
        return this.estadoTransitado;
    }

  /**
   * Setter of estadoTransitado  
   *  @param estadoTransitado  Esta entidad almacena todos los posibles estados por los que puede pasar un ODE a lo largo de su ciclo de vida.
 Se reconocen los siguientes:
 CREADO
 COMPLETO
 RECHAZADO
 PROPUESTO PUBLICACION
 PUBLICADO
 NO DISPONIBLE 
   */
    public void setEstadoTransitado(es.pode.publicacion.negocio.dominio.Estado estadoTransitado)
    {
        this.estadoTransitado = estadoTransitado;
    }

  /**
   * <p>
   * Esta entidad almacena todos los posibles estados por los que
   * puede pasar un ODE a lo largo de su ciclo de vida.
   * </p>
   * <p>
   * Se reconocen los siguientes:
   * </p>
   * <p>
   * CREADO
   * </p>
   * <p>
   * COMPLETO
   * </p>
   * <p>
   * RECHAZADO
   * </p>
   * <p>
   * PROPUESTO PUBLICACION
   * </p>
   * <p>
   * PUBLICADO
   * </p>
   * <p>
   * NO DISPONIBLE
   * </p>
   */
    private es.pode.publicacion.negocio.dominio.Estado estadoActual;

  /**
   * Getter of estadoActual.  
   * @return es.pode.publicacion.negocio.dominio.Estado  Esta entidad almacena todos los posibles estados por los que puede pasar un ODE a lo largo de su ciclo de vida.
 Se reconocen los siguientes:
 CREADO
 COMPLETO
 RECHAZADO
 PROPUESTO PUBLICACION
 PUBLICADO
 NO DISPONIBLE
   */
    public es.pode.publicacion.negocio.dominio.Estado getEstadoActual()
    {
        return this.estadoActual;
    }

  /**
   * Setter of estadoActual  
   *  @param estadoActual  Esta entidad almacena todos los posibles estados por los que puede pasar un ODE a lo largo de su ciclo de vida.
 Se reconocen los siguientes:
 CREADO
 COMPLETO
 RECHAZADO
 PROPUESTO PUBLICACION
 PUBLICADO
 NO DISPONIBLE 
   */
    public void setEstadoActual(es.pode.publicacion.negocio.dominio.Estado estadoActual)
    {
        this.estadoActual = estadoActual;
    }



    /**
     * Returns <code>true</code> if the argument is an Transicion instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     *
     * @param object The object to compare
     * @return boolean
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Transicion))
        {
            return false;
        }
        final Transicion that = (Transicion)object;
        if (this.id == null || that.id == null || !this.id.equals(that.id))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     * @return int
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link es.pode.publicacion.negocio.dominio.Transicion}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link es.pode.publicacion.negocio.dominio.Transicion}.
         * @return es.pode.publicacion.negocio.dominio.Transicion
         */
        public static es.pode.publicacion.negocio.dominio.Transicion newInstance()
        {
            return new es.pode.publicacion.negocio.dominio.TransicionImpl();
        }
    }

// HibernateEntity.vsl merge-point
}