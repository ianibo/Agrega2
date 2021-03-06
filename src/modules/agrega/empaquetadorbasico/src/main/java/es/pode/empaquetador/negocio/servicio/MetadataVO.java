// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package es.pode.empaquetador.negocio.servicio;

/**
 * 
 */
public class MetadataVO
    implements java.io.Serializable
{

    /**
     * Constructor por defecto
     */        
    public MetadataVO()
    {
    }

    /**
     * Constructor taking all properties.
     * @param schema  
     * @param schemaVersion  
     */
    public MetadataVO(
        java.lang.String schema,
        java.lang.String schemaVersion)

    {
        this.schema = schema;
        this.schemaVersion = schemaVersion;
    }

    /**
     * Copies constructor from other MetadataVO
     * @param otherBean MetadataVO 
     */
    public MetadataVO(MetadataVO otherBean)
    {
        if (otherBean != null)
        {
            this.schema = otherBean.getSchema();
            this.schemaVersion = otherBean.getSchemaVersion();
        }
    }

    private java.lang.String schema;

    public java.lang.String getSchema()
    {
        return this.schema;
    }

    public void setSchema(java.lang.String schema)
    {
        this.schema = schema;
    }

    private java.lang.String schemaVersion;

    public java.lang.String getSchemaVersion()
    {
        return this.schemaVersion;
    }

    public void setSchemaVersion(java.lang.String schemaVersion)
    {
        this.schemaVersion = schemaVersion;
    }

}