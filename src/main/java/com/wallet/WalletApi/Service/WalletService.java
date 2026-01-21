package com.wallet.WalletApi.Service;

import com.wallet.WalletApi.DTO.CreateWalletRequest;
import com.wallet.WalletApi.DTO.Wallet;
import com.wallet.WalletApi.DTO.WalletResponse;
import com.wallet.WalletApi.Exception.WalletNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Random;


@Service
public class WalletService {

    private final ArrayList<WalletResponse>walletResponseArrayList=new ArrayList<>();
    private final ArrayList<Wallet>wallets=new ArrayList<>();

    public ArrayList<WalletResponse> getWalletResponseArrayList() {
        return walletResponseArrayList;
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }


    public WalletResponse createWallet(CreateWalletRequest createWalletRequest) {

        String ownerName = createWalletRequest.getOwnerName();

        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name must not be null or blank");
        }

        Wallet wallet = new Wallet();
        wallet.setId( Math.abs(new Random().nextInt()));
        wallet.setBalance(0);
        wallet.setOwnerName(ownerName);
        wallets.add(wallet);


        WalletResponse walletResponse=new WalletResponse();
        walletResponse.setId(wallet.getId());
        walletResponse.setBalance(wallet.getBalance());
        walletResponse.setOwnerName(wallet.getOwnerName());
        walletResponseArrayList.add(walletResponse);

        return walletResponse;
    }

    public WalletResponse getWalledByID(int id){
        boolean found=false;
        WalletResponse wallet=null;
        for(WalletResponse w:walletResponseArrayList){
            if(w.getId()==id){
                wallet=w;
                found=true;
            }
        }

        if(found){
            return wallet;
        }
        else {
            throw new WalletNotFoundException();
        }

    }


}
