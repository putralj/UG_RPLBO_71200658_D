import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobil M_71200658 = new Mobil();
        PejalanKaki P_71200658 = new PejalanKaki();
        Scanner input = new Scanner(System.in);

        System.out.println("Kode lampu lalu lintas saat ini : ");
        int inputUser = input.nextInt();

        if (inputUser == 1) {
            System.out.println("---Lampu Hijau---");
            M_71200658.jalan();
            P_71200658.menunggu();
        } else if (inputUser == 2) {
            System.out.println("---Lampu Kuning---");
            M_71200658.kurangiKecepatan();
            P_71200658.bersiap();
        } else if (inputUser == 3) {
            System.out.println("---Lampu Merah---");
            M_71200658.berhenti();
            P_71200658.menyebrang();

        }
    }
}