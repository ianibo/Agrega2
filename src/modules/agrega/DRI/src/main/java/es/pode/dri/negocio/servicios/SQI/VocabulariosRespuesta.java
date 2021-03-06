// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: Enumeration.vsl in andromda-java-cartridge.
//
package es.pode.dri.negocio.servicios.SQI;

/**
 * <p>
 * Esta clase representa todos los vocabularios de representacion
 * de respuestas a consultas que soporta el servicio de SQI.
 * </p>
 * <p>
 * Cualquier otro vocabulario que no este recopilado en esta clase
 * no esta soportado.
 * </p>
 */
public class VocabulariosRespuesta
    implements java.io.Serializable
{
    /**
     * <p>
     * Representa el vocabulario de representacion de resultados de
     * consultas LOM-ES.
     * </p>
     */
    public static final VocabulariosRespuesta LOM_ES = new VocabulariosRespuesta("LOM-ES");

    private java.lang.String value;

    private VocabulariosRespuesta(java.lang.String value)
    {
        this.value = value;
    }

    /**
     * The default constructor allowing
     * super classes to access it.
     */
    protected VocabulariosRespuesta()
    {
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return "" + value;
    }

    /**
     * Creates an instance of VocabulariosRespuesta from <code>value</code>.
     *
     * @param value the value to create the VocabulariosRespuesta from.
     */
    public static VocabulariosRespuesta fromString(java.lang.String value)
    {
        VocabulariosRespuesta typeValue = (VocabulariosRespuesta)values.get(value);
        if (typeValue == null)
        {
            throw new IllegalArgumentException(
                "invalid value '" + value + "', possible values are: " + literals);
        }
        return typeValue;
    }

    /**
     * Gets the underlying value of this type safe enumeration.
     *
     * @return the underlying value.
     */
    public java.lang.String getValue()
    {
        return this.value;
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object that)
    {
        return (this == that) ? 0 : this.getValue().compareTo(
            ((VocabulariosRespuesta)that).getValue());
    }

    /**
     * Returns an unmodifiable list containing the literals that are known by this enumeration.
     *
     * @return A List containing the actual literals defined by this enumeration, this list
     *         can not be modified.
     */
    public static java.util.List literals()
    {
        return literals;
    }

    /**
     * Returns an unmodifiable list containing the names of the literals that are known
     * by this enumeration.
     *
     * @return A List containing the actual names of the literals defined by this
     *         enumeration, this list can not be modified.
     */
    public static java.util.List names()
    {
        return names;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object)
    {
        return (this == object)
            || (object instanceof VocabulariosRespuesta && ((VocabulariosRespuesta)object).getValue().equals(
                this.getValue()));
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return this.getValue().hashCode();
    }

    private static final java.util.Map values = new java.util.HashMap(1, 1);
    private static java.util.List literals = new java.util.ArrayList(1);
    private static java.util.List names = new java.util.ArrayList(1);

    /**
     * Initializes the values.
     */
    static
    {
        values.put(LOM_ES.value, LOM_ES);
        literals.add(LOM_ES.value);
        names.add("LOM_ES");
        literals = java.util.Collections.unmodifiableList(literals);
        names = java.util.Collections.unmodifiableList(names);
    }
}