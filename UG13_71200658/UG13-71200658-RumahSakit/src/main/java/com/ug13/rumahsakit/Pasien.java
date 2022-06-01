package com.ug13.rumahsakit;

public class Pasien {
    private String nama, alamat, penyakit;
    private int usia, levelPenyakit;
    private boolean status = false;

    public Pasien(String nama, int usia, String alamat ) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
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

    public boolean getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}
