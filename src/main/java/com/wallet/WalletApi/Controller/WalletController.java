package com.wallet.WalletApi.Controller;

import com.wallet.WalletApi.DTO.CreateWalletRequest;
import com.wallet.WalletApi.DTO.OperationResponse;
import com.wallet.WalletApi.DTO.TopUpRequest;
import com.wallet.WalletApi.DTO.WalletResponse;
import com.wallet.WalletApi.Service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<?> createWalletRequestResponseEntity(
            @RequestBody CreateWalletRequest createWalletRequest) {
        var wallet = walletService.createWallet(createWalletRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("ID", String.valueOf(wallet.getId()))
                .body(wallet);

    }

    @GetMapping("/wallets/{id}")
    public ResponseEntity<?> getWalletByID(@PathVariable int id) {
        var wallet = walletService.getWalledByID(id);
        return ResponseEntity
                .ok(wallet);
    }

    @PostMapping("wallets/{id}/top-up")
    public ResponseEntity<WalletResponse> walletResponseResponseEntity(@PathVariable int id,
                                                                       @RequestBody TopUpRequest updatedBalance) {
        var updatedWallet = walletService.update(id, updatedBalance);

        int getOperationID=0;
        for(OperationResponse response: walletService.getOperationResponses()){
            if(response.getWalletId()==id){
                getOperationID=response.getOperationID();
            }
        }

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("operation_type", "TOP_UP")
                .header("wallet_id", String.valueOf(updatedWallet.getId()))
                .header("operation_id", String.valueOf(getOperationID))
                .body(updatedWallet);

    }
}