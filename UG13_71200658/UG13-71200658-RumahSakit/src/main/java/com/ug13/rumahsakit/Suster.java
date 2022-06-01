package com.ug13.rumahsakit;

public class Suster {
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening (Pasien pasien, Jadwal jadwal){
        jadwal.setStatusScreening(true);
    }
}
