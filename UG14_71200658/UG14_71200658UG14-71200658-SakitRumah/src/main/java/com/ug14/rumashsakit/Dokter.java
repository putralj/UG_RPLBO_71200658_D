package com.ug14.rumashsakit;

public class Dokter {
    private int idDokter;
    private String nama, spesialis, ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if (jadwal.isStatusScreening()){
//            System.out.println("==========PROSES PEMERIKSAAN DOKTER==========");
            pasien.setLevelPenyakit((pasien.getLevelPenyakit() - 1));
        }
    }

    public void cekStatus(Pasien pasien){
        if (pasien.getLevelPenyakit() < 0){
            System.out.println("==========PASIEN TELAH SEMBUH==========");
            System.out.println("Status Pasien Behasil Diubah!");
        } else {
            System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
        }
    }
}

