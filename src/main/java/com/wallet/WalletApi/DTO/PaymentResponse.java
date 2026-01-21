package com.wallet.WalletApi.DTO;

public class PaymentResponse {
    private int paymentId;
    private int walletId;
    private float amount;
    private String merchant;
    private String accept;

    public PaymentResponse() {
    }

    public PaymentResponse(int paymentId, int walletId, float amount, String merchant, String accept) {
        this.paymentId = paymentId;
        this.walletId = walletId;
        this.amount = amount;
        this.merchant = merchant;
        this.accept = accept;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }
}
