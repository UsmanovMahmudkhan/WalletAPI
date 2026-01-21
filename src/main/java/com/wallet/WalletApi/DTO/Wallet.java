package com.wallet.WalletApi.DTO;

public class Wallet {
    private int id;
    private String ownerName;
    private float balance;

    public Wallet(int id, String ownerName, float balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public Wallet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
