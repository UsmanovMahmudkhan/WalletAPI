package com.wallet.WalletApi.DTO;

public class CreateWalletRequest {
    private String ownerName;

    public CreateWalletRequest() {
    }

    public CreateWalletRequest(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
