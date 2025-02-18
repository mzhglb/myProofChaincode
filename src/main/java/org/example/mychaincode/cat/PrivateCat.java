package org.example.mychaincode.cat;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType
@Data
@Accessors(chain = true)
public class PrivateCat {

    @Property
    Cat cat;

    @Property
    String collection;
}
