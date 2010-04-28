// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateStringClobType.vsl in andromda-hibernate-cartridge.
//
package org.andromda.persistence.hibernate.usertypes;

import java.io.IOException;
import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.type.ImmutableType;

import org.apache.commons.lang.ObjectUtils;

/**
 * <p>
 * A hibernate user type which converts a Clob into a String and back again.
 * </p>
 */
public class HibernateStringClobType
    extends ImmutableType
{
    /**
     * @see org.hibernate.type.NullableType#get(java.sql.ResultSet,
     *      java.lang.String)
     */
    public Object get(ResultSet rs, String name)
        throws SQLException
    {

        Reader reader = rs.getCharacterStream(name);
        if (reader == null)
        {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        try
        {
            char[] charbuf = new char[4096];
            for (int i = reader.read(charbuf); i > 0; i = reader.read(charbuf))
            {
                sb.append(charbuf, 0, i);
            }
        }
        catch (IOException e)
        {
            throw new SQLException(e.getMessage());
        }
        return sb.toString();
    }

    /**
     * @see org.hibernate.type.Type#getReturnedClass()
     */
    public Class getReturnedClass()
    {
        return String.class;
    }

    /**
     * @see org.hibernate.type.NullableType#set(java.sql.PreparedStatement,
     *      java.lang.Object, int)
     */
    public void set(PreparedStatement st, Object value, int index)
        throws SQLException
    {
        st.setString(index, (String)value);
    }

    /**
     * @see org.hibernate.type.NullableType#sqlType()
     */
    public int sqlType()
    {
        return Types.CLOB;
    }

    /**
     * @see org.hibernate.type.Type#getName()
     */
    public String getName()
    {
        return "string";
    }

    /**
     * @see org.hibernate.type.Type#equals(java.lang.Object,
     *      java.lang.Object)
     */
    public boolean equals(Object x, Object y)
    {
        return ObjectUtils.equals(x, y);
    }

    /**
     * @see org.hibernate.type.NullableType#fromString(java.lang.String)
     */
    public Object fromStringValue(String xml)
    {
        return xml;
    }

    /**
     * @see org.hibernate.type.NullableType#toString(java.lang.Object)
     */
    public String toString(Object val)
    {
        return val.toString();
    }
}