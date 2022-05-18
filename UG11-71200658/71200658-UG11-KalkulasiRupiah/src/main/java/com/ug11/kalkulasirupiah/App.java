package com.ug11.kalkulasirupiah;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pattern pattern = Pattern.compile("[^a-zA-Z\\s]+");
        System.out.println( "Masukkan teks : " );
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] kata = text.split(" ");

    }
}
