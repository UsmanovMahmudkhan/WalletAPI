package com.wallet.WalletApi.DTO;

public class OperationResponse {

    private int operationID;
    private int walletId;
    private Type type;

    public OperationResponse() {
    }

    public OperationResponse(int operationID, int walletId, Type type) {
        this.operationID = operationID;
        this.walletId = walletId;
        this.type = type;
    }

    public int getOperationID() {
        return operationID;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
