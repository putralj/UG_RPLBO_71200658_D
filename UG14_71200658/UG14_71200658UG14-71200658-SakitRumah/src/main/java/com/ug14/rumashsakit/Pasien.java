package com.ug14.rumashsakit;

public class Pasien {
    private int rm, usia, levelPenyakit;
    private String nama, alamat, penyakit;
    private boolean status;

    public Pasien(int rm, String nama, int usia, String alamat, String penyakit) {
        this.rm = rm;
        this.usia = usia;
        this.nama = nama;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public int getRm() {
        return rm;
    }

    public int getUsia() {
        return usia;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }
}
