package org.example.mychaincode.simple;

import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.Contract;
import org.hyperledger.fabric.contract.annotation.Default;
import org.hyperledger.fabric.contract.annotation.Info;
import org.hyperledger.fabric.contract.annotation.Transaction;
import org.hyperledger.fabric.shim.ChaincodeException;
import org.hyperledger.fabric.shim.ChaincodeStub;

import java.util.logging.Logger;

@Contract(
        name = "myJavaChaincode",
        info = @Info(
                title = "My Java Chaincode",
                description = "A simple Java chaincode example",
                version = "0.0.1-SNAPSHOT"
        )
)
@Default
public class MyJavaChaincode /*implements ContractInterface*/ {
    private static final Logger LOG = Logger.getLogger(MyJavaChaincode.class.getName());

//    @Transaction()
//    public void initLedger(final Context ctx) {
//        ChaincodeStub stub = ctx.getStub();
//        // 初始化账本逻辑，可根据需求添加
//    }
//
//    @Transaction()
//    public void setValue(final Context ctx, final String key, final String value) {
//        ChaincodeStub stub = ctx.getStub();
//        stub.putStringState(key, value);
//    }
//
//    @Transaction()
//    public String getValue(final Context ctx, final String key) {
//        ChaincodeStub stub = ctx.getStub();
//        String value = stub.getStringState(key);
//
//        if (value.isEmpty()) {
//            String errorMessage = String.format("Value for key %s does not exist", key);
//            LOG.severe(errorMessage);
//            throw new ChaincodeException(errorMessage);
//        }
//        return value;
//    }
}
