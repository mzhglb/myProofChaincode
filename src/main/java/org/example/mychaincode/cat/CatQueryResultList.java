package org.example.mychaincode.cat;

import lombok.Data;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import java.util.List;


@DataType
@Data
public class CatQueryResultList {

    @Property
    List<CatQueryResult> cats;
}
