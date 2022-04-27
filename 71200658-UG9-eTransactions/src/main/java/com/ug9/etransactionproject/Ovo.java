package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (dp instanceof BNImo || dp instanceof BRImo){
            super.setFeeTransferBank(this.ovoFeeTransferBank);
            super.transfer(dp, nominal);
        } else if (dp instanceof Dana){
            System.out.println("Transfer gagal! Akun OVO Anda tidak valid");
        } else {
            super.transfer(dp, nominal);
        }
    }
}
