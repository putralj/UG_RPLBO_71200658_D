package com.ug5a.soal2;

public class Sepatu {
    private String kode = "NK0024510", merkModel;
    private static int nextNum = 1;
    private int ukuran, stok;
    private long harga;

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok) {
        merkModel = argMerkModel;
        ukuran = argUkuran;
        stok = argStok;
        harga = argHarga;
        kode = kode + nextNum;
        nextNum++;
    }

    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

}
