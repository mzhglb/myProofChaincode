package org.example.mychaincode.cat;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import java.util.List;

@DataType
@Data
@Accessors(chain = true)
public class CatQueryPageResult {

    @Property
    String bookmark;

    @Property
    List<CatQueryResult> cats;
}
