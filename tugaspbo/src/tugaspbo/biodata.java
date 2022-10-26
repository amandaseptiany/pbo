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
public class biodata {
    //deklarasi variabel
    public static void main(String[] args) {
        String nama, alamat, hobi, citacita;
        int umur, tb, bb;
        
        //membuat Scanner baru
        Scanner datadiri = new Scanner(System.in);
        
        //membuat Scanner
        System.out.println("-----Biodata Siswa------");
        System.out.print("Nama anda : ");
        nama = datadiri.nextLine();
        System.out.print("Alamat Rumah : ");
        alamat = datadiri.nextLine();
        System.out.print("Apa Hobimu : ");
        hobi = datadiri.nextLine();
        System.out.print("Apa Cita-Citamu : ");
        citacita = datadiri.nextLine();
        System.out.print("Berapa Usiamu : ");
        umur = datadiri.nextInt();
        System.out.print("Berapa Tinggi Badanmu : ");
        tb = datadiri.nextInt();
        System.out.print("Berapa Berat Badanmu : ");
        bb = datadiri.nextInt();
        
        //menampilkan apa yang disampaikan di variabel
        System.out.println("-----Biodata Siswa------");
        System.out.println("Nama Saya : "+nama);
        System.out.println("Alamat Rumah Saya : "+alamat);
        System.out.println("Hobi Saya : "+hobi);
        System.out.println("Cita-Cita Saya : "+citacita);
        System.out.println("Umur Saya : "+umur);
        System.out.println("Tinggi Badan Saya : "+tb);
        System.out.println("Berat Badan Saya : "+bb);
    }
    
}
