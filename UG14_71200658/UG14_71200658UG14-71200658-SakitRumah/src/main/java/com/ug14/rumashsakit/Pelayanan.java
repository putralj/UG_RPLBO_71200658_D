package com.ug14.rumashsakit;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayana;
    private String nama;

    public void mengaturJadwal(Pasien pasien, Jadwal jadwal){
        Pasien p = pasien;

        System.out.println("Data jadwal berhasil disimpan");
        System.out.println("====================Proses Pengaturan Jadwal Behasil====================");
    }

    public Pasien registrasi(){
        Scanner scan = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);

        System.out.print("Masukkan rm baru : ");
        int rm = scan.nextInt();
        System.out.print("Masukkan nama anda : ");
        String name = scan.nextLine();
        System.out.print("Masukkan usia anda : ");
        int age = scan.nextInt();
        System.out.print("Masukkan alamat anda : ");
        String address =  scan.nextLine();
        System.out.print("Masukkan penyakit anda : ");
        String sick = scan.nextLine();
        System.out.println("Data Pasien Berhasil Disimpan!");
        System.out.println("====================Proses registrasi berhasil====================");

        Pasien p1 = new Pasien(rm, name, age, address, sick);
        return p1;


    }
}
