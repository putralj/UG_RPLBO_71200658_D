package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private String noRekening;
    private boolean checkFee = false;
    private final long feeAntarBank = 6000;

    public MobileBanking(String nama, long saldo, String noRekening) {
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal < 0){
            System.out.println("Nominal yang anda input tidak valid!");
        } else if ((this.getSaldo() + this.feeAntarBank) < nominal){
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi");
        } else if ((this.getSaldo() + this.feeAntarBank) >= nominal){
            if (checkFee){
                this.setSaldo(getSaldo() - nominal);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, nominal);
            }
            else {
                this.setSaldo(getSaldo() - nominal);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, (nominal + this.feeAntarBank));
            }

        }
    }

    public boolean isCheckFee(){
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}
