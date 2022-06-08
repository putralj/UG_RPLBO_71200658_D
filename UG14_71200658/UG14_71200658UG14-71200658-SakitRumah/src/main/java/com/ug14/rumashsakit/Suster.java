package com.ug14.rumashsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public void screening(Pasien pasien, Jadwal jadwal){
        jadwal.setStatusScreening(true);
    }
}
