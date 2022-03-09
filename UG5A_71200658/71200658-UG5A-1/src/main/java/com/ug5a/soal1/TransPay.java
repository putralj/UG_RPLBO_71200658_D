package com.ug5a.soal1;

public class TransPay {
    private String name;
    private long saldo;

    public String getNama() {
        return name;
    }

    public void setNama(String n) {
        name = n;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long s) {
        saldo = s;
    }

    public void topUp(long jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println("Top up sebesar Rp " + jumlah + " berhasil");
        }
        else {
            System.out.println("Nominal anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlah, Keyboard k){
        int total = (int) (jumlah * k.getHarga());
        if (jumlah <= 0){
            System.out.println("Input jumlah tidak valid!");
        }
        else{
            if (total <= saldo){
                setSaldo(saldo - total);
                System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel() + " di counter");
            }
            else {
                System.out.println("Pembayaran gagal! Saldo anda kurang, silahkan melakukan top up");
            }
        }
    }
}
