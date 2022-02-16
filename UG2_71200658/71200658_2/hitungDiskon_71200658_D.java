import java.util.Scanner;
import java.util.stream.*;

public class hitungDiskon_71200658_D {
    public static void main(String[]args){


        Scanner input = new Scanner(System.in);
        System.out.println("Banyak belanjaan : ");
        int jmlBarang = input.nextInt();

        int[] arrayTotal = new int[jmlBarang];
        for (int i =1; i < arrayTotal.length+1; i++){
            System.out.println("Harga barang ke-"+i);
            int hrgBarang = input.nextInt();
            arrayTotal[i] = hrgBarang;
        }
        int sum = IntStream.of(arrayTotal).sum();
        System.out.println("Total Harga : "+sum);


        }

    }
