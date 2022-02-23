package com.ug3.soal1;
import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("===========================Data Product===========================");
        System.out.println("Masukkan Data Product Makanan Anda :" );
        System.out.print("Nama Makanan: ");
        String nama = input.nextLine();
        System.out.print("Tanggal Kadaluwarsa: ");
        String tanggalExpire = input.nextLine();
        System.out.print("Jumlah (quantity): ");
        Double qty = input.nextDouble();
        System.out.print("Berat (gram): ");
        Double berat = input.nextDouble();

        System.out.println("===========================Data Product===========================");
        System.out.println("Nama makanan = "+ nama);
        System.out.println("Tanggal Kadaluwarsa = "+ tanggalExpire);
        System.out.println("Jumlah(quantity) = "+ qty);
        System.out.println("Berat = "+ berat + " gram");
        System.out.println("===================================================================");
    }
}
