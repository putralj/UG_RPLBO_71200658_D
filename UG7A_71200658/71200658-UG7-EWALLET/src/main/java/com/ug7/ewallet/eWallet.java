package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user) {
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }

    public String topup(int jumlah){
        if (jumlah > 0 && this.user.getUang() < jumlah){
            return "Maaf uang cash anda tidak cukup untuk melakukan top up";
        }
        else {
            this.user.topup(jumlah);
            this.saldo = saldo + jumlah;
            return "Top up saldo sebesar " + Main.formatRupiah(jumlah) + " telah berhasil!";
        }
    }

    public void transfer (eWallet eWallet, int jumlah){
        if (jumlah > 0 && jumlah <= this.saldo){
            this.saldo = saldo - jumlah;
            eWallet.jumBayar(jumlah);
            System.out.println("Transfer saldo sebesar " + Main.formatRupiah(jumlah) + " ke akun " + eWallet.getUser().getNama() + " telah berhasil!");
        }
    }

    public void withdraw (int jumlah){
        if (jumlah > 0 && jumlah <= this.saldo){
            this.saldo -= jumlah;
            this.user.withdraw(jumlah);
        }
    }

    public void getInfo(){
        System.out.println("Nama: " + this.user.getNama() + "[PIN: " + this.user.getPIN() + "]");
        String state = "";
        if (this.user.isEmailConfirmed()){
            state = "[Confirmed]";
        }
        System.out.println("Email: " + this.user.getEmail() + " " + state);
        System.out.println("Uang Cash: "+ Main.formatRupiah(user.getUang()));
        System.out.println("Saldo e-Wallet: "+ Main.formatRupiah(this.getSaldo()));
    }

    public void jumBayar(int jumlah){
        if (jumlah > 0){
            this.saldo = saldo + jumlah;
        }
    }

    public User getUser() {return this.user;}

    public int getSaldo() {
        return this.saldo;
    }
}
