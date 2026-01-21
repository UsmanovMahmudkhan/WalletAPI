package com.wallet.WalletApi.DTO;

public class PaymentRequest {
    private int walletId;
    private float amount;
    private String merchant;
    private String reference;

    public PaymentRequest(int walletId, float amount, String merchant, String reference) {
        this.walletId = walletId;
        this.amount = amount;
        this.merchant = merchant;
        this.reference = reference;
    }

    public PaymentRequest() {
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
