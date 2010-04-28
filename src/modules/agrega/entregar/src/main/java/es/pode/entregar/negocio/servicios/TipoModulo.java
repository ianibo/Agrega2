// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: Enumeration.vsl in andromda-java-cartridge.
//
package es.pode.entregar.negocio.servicios;

/**
 * 
 */
public class TipoModulo
    implements java.io.Serializable
{
    /**
     * 
     */
    public static final TipoModulo EMPAQUETADOR = new TipoModulo("EMPAQUETADOR");

    /**
     * 
     */
    public static final TipoModulo BUSCADOR = new TipoModulo("BUSCADOR");

    private java.lang.String value;

    private TipoModulo(java.lang.String value)
    {
        this.value = value;
    }

    /**
     * The default constructor allowing
     * super classes to access it.
     */
    protected TipoModulo()
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
     * Creates an instance of TipoModulo from <code>value</code>.
     *
     * @param value the value to create the TipoModulo from.
     */
    public static TipoModulo fromString(java.lang.String value)
    {
        TipoModulo typeValue = (TipoModulo)values.get(value);
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
            ((TipoModulo)that).getValue());
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
            || (object instanceof TipoModulo && ((TipoModulo)object).getValue().equals(
                this.getValue()));
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return this.getValue().hashCode();
    }

    private static final java.util.Map values = new java.util.HashMap(2, 1);
    private static java.util.List literals = new java.util.ArrayList(2);
    private static java.util.List names = new java.util.ArrayList(2);

    /**
     * Initializes the values.
     */
    static
    {
        values.put(EMPAQUETADOR.value, EMPAQUETADOR);
        literals.add(EMPAQUETADOR.value);
        names.add("EMPAQUETADOR");
        values.put(BUSCADOR.value, BUSCADOR);
        literals.add(BUSCADOR.value);
        names.add("BUSCADOR");
        literals = java.util.Collections.unmodifiableList(literals);
        names = java.util.Collections.unmodifiableList(names);
    }
}