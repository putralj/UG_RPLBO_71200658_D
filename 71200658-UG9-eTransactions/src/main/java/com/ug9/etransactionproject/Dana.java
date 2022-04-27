package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (dp instanceof BRImo || dp instanceof BNImo){
            super.setFeeTransferBank(this.danaFeeTransferBank);
            super.transfer(dp, nominal);
        } else if (dp instanceof Ovo){
            System.out.println("Transfer gagal! Akun DANA Anda tidak valid");
        } else {
            super.transfer(dp, nominal);
        }
    }

}
