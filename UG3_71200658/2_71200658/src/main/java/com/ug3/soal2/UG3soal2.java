package com.ug3.soal2;
import java.util.Scanner;

public class UG3soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean p = false;
        int n1, n2, x, total = 11;

    while(!p){
        System.out.println("Bilangan Fibonacci dari kata");
        System.out.print("Masukkan input pertama : ");
        String kata1 = input.nextLine();
        System.out.print("Masukkan input kedua : ");
        String kata2 = input.nextLine();

        int totalHuruf1= kata1.length();
        int totalHuruf2= kata2.length();
        x = totalHuruf1;

        System.out.println("Bilangan Fibonacci ");

        for (int i = 1; i <= total; i++){
            x = totalHuruf1 + totalHuruf2;
            System.out.print(totalHuruf1 + " ");
            totalHuruf1 = totalHuruf2;
            totalHuruf2 = x;

        }


        System.out.print("\nKeluar dari program (ketikan exit) : ");
        String jawaban = input.nextLine();
        if (jawaban.equals("exit")) {
            p = true;
        }
        }
    }
}