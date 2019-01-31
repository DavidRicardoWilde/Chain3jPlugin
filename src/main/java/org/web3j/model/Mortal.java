package org.web3j.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.chain3j.abi.TypeReference;
import org.chain3j.abi.datatypes.Function;
import org.chain3j.abi.datatypes.Type;
import org.chain3j.crypto.Credentials;
import org.chain3j.protocol.Chain3j;
import org.chain3j.protocol.core.RemoteCall;
import org.chain3j.protocol.core.methods.response.TransactionReceipt;
import org.chain3j.tx.Contract;
import org.chain3j.tx.TransactionManager;
import org.chain3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.chain3j.io/command_line.html">chain3j command line tools</a>,
 * or the org.chain3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/chain3j/chain3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with chain3j version 0.1.0.
 */
public class Mortal extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008054600160a060020a0319163317905560bf806100316000396000f300608060405260043610603e5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166341c0e1b581146043575b600080fd5b348015604e57600080fd5b5060556057565b005b60005473ffffffffffffffffffffffffffffffffffffffff1633141560915760005473ffffffffffffffffffffffffffffffffffffffff16ff5b5600a165627a7a72305820ba65dc4d68fe57b770a734b241f252614eaae12458f0db94211fcbe3f80405c50029";

    public static final String FUNC_KILL = "kill";

    @Deprecated
    protected Mortal(String contractAddress, Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, chain3j, credentials, gasPrice, gasLimit);
    }

    protected Mortal(String contractAddress, Chain3j chain3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, chain3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Mortal(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, chain3j, transactionManager, gasPrice, gasLimit);
    }

    protected Mortal(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, chain3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> kill() {
        final Function function = new Function(
                FUNC_KILL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Mortal> deploy(Chain3j chain3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Mortal.class, chain3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Mortal> deploy(Chain3j chain3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Mortal.class, chain3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Mortal> deploy(Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Mortal.class, chain3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Mortal> deploy(Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Mortal.class, chain3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static Mortal load(String contractAddress, Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Mortal(contractAddress, chain3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Mortal load(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Mortal(contractAddress, chain3j, transactionManager, gasPrice, gasLimit);
    }

    public static Mortal load(String contractAddress, Chain3j chain3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Mortal(contractAddress, chain3j, credentials, contractGasProvider);
    }

    public static Mortal load(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Mortal(contractAddress, chain3j, transactionManager, contractGasProvider);
    }
}
