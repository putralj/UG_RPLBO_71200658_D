package com.ug7.ewallet;

public class ShopeePay extends eWallet {
    private int feeTopup = 500, feeTransfer = 0, feeWithdraw = 1000;

    public ShopeePay(User user) {
        super(user);
    }

    public String topup(int jumlah) {
        if (jumlah + this.feeTopup > super.getUser().getUang()) {
            return "Maaf, uang anda tidak mencukupi!";
        } else {
            super.topup(jumlah);
            this.jumBayar(this.feeTopup);
            return "Top up anda sebesar " + (this.feeTopup + jumlah) + " telah berhasil";
        }
    }

    public void transfer(eWallet eWallet, int jumlah) {
        if (!super.getUser().isEmailConfirmed()) {
            System.out.println("Mohon untuk mengkonfirmasi email terlebih dahulu!");
        } else {
            System.out.println("Transfer saldo akan terkena potongan fee " + Main.formatRupiah(this.feeTransfer));
            System.out.print("Transfer diproses");
            Main.tunggu(3);
            if (jumlah + this.feeTransfer > super.getSaldo()) {
                jumlah += this.feeTransfer;
                System.out.println("Maaf, saldo anda tidak cukup! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
            } else {
                super.transfer(eWallet, jumlah);
                this.jumBayar(this.feeTransfer);
            }
        }
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw akan terkena potongan fee " + Main.formatRupiah(this.feeWithdraw));
        if (jumlah + this.feeWithdraw > super.getSaldo()) {
            jumlah += this.feeWithdraw;
            System.out.println("Maaf, saldo anda tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            System.out.println("Halo, Uang cash sejumlah " + Main.formatRupiah(jumlah) + " telah keluar dari E-Wallet anda!");
            super.withdraw(jumlah);
            this.jumBayar(this.feeWithdraw);
        }
    }

    public void getInfo() {
        System.out.println("[ ShopeePay e-Wallet ]");
        super.getInfo();
    }
}