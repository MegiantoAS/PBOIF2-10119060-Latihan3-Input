/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program ini berisi program menampilkan biodata
 */
public class PBOIF210119060Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner (System.in);
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
