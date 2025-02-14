package org.example.mychaincode.cat;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import java.io.Serializable;

@DataType
@Data
@Accessors(chain = true)
public class EviFile implements Serializable {
    private static final long serialVersionUID = 1340832964869849491L;

    @Property
    String key;

    @Property
    String json;

    @Property
    String name;

    @Property
    Integer type;

    @Property
    String uploader;

    @Property
    String timestamp;

    @Property
    String keyword;

    @Property
    String content;

}
