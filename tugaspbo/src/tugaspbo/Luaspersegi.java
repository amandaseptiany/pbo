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
public class Luaspersegi {
    public static void main(String[] args) {
        //deklarasi
        double Luas;
        int sisi;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("**Program hitung Luas Persegi**");
        System.out.println("input sisi");
        sisi = hitung.nextInt();
        
        //proses
        Luas = Double.valueOf((sisi * sisi));
        
        //output
        System.out.println("Luas Persegi = "+Luas);
        System.out.println("Hello World");
    }
}
    

