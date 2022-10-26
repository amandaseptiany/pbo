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
public class Luaspersegipanjang {
    public static void main(String[] args) {
        //deklarasi
        double Luas;
        int panjang, lebar;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("**Program hitung Luas Persegi Panjang**");
        System.out.println("input panjang");
        panjang = hitung.nextInt();
        System.out.println("input lebar");
        lebar = hitung.nextInt();
        
        //proses
        Luas = Double.valueOf((panjang * lebar));
        
        //output
        System.out.println("Luas Persegi Panjang = "+Luas);
        System.out.println("Hello World");
    }
}
    

