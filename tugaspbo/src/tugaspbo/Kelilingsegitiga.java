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
public class Kelilingsegitiga {
    public static void main(String[] args) {
        //deklarasi
        double Keliling;
        int a, b, c;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("**Program hitung Keliling Segitiga**");
        System.out.println("input a");
        a = hitung.nextInt();
        System.out.println("input b");
        b = hitung.nextInt();
        System.out.println("input c");
        c = hitung.nextInt();
        
        //proses
        Keliling = Double.valueOf(( a + b + c));
        
        //output
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("Hello World");
    }
}
    

