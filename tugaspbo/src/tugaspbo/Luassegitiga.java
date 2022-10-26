/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Luassegitiga {
    public static void main(String[] args) {
        //deklarasi
        double Luas;
        int alas, tinggi;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("**Program hitung Luas Segitiga**");
        System.out.println("input alas");
        alas = hitung.nextInt();
        System.out.println("input tinggi");
        tinggi = hitung.nextInt();
        
        //proses
        Luas = Double.valueOf((alas * tinggi / 2));
        
        //output
        System.out.println("Luas Segitiga = "+Luas);
        System.out.println("Hello World");
    }
}
    

