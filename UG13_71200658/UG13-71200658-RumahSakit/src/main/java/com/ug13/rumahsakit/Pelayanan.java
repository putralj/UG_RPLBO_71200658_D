package com.ug13.rumahsakit;


import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal (Pasien pasien, Dokter dokter, Jadwal jadwal){
        System.out.println("==========PROSES PENGATURAN JADWAL BERHASIL==========");
    }

    public Pasien registrasi(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanAngka = new Scanner(System.in);
        Jadwal jadwal = new Jadwal();

        System.out.print("Masukkan nama anda : ");
        String name = scanner.nextLine();
//        pasien.setNama(name);

        System.out.print("Masukkan usia anda : ");
        int age = scanAngka.nextInt();
//        pasien.setUsia(age);

        scanner.reset();
        System.out.print("Masukkan alamat anda : ");
        String address = scanner.nextLine();
//        pasien.setAlamat(address);

        System.out.print("Masukkan penyakit anda : ");
        String sick = scanner.nextLine();
//        pasien.setPenyakit(sick);

        Pasien saha = new Pasien(name, age, address);
        saha.setLevelPenyakit(3);
        jadwal.setPasien(saha);


        System.out.println("==========Proses Registrasi Berhasil==========");

        return saha;
    }
}
