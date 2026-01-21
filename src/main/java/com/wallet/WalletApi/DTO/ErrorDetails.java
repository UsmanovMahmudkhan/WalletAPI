package com.wallet.WalletApi.DTO;

public class ErrorDetails {
    String message;

    public ErrorDetails(String message) {
        this.message = message;
    }

    public ErrorDetails() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
