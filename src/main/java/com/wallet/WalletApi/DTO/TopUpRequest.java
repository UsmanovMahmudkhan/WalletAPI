package com.wallet.WalletApi.DTO;

public class TopUpRequest {
    float balance;
    String reference;

    public TopUpRequest() {
    }

    public TopUpRequest(float balance, String reference) {
        this.balance = balance;
        this.reference = reference;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

