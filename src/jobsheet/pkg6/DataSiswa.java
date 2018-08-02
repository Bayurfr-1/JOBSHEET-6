/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6;

import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class DataSiswa {
    public static void main(String[] args) {
        String nama, alamat;
        int usia, absen;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("###DATA SISWA###");
        System.out.println("Nama Siswa : ");
        
        nama = keyboard.next();
        
        System.out.println("ALAMAT : ");
        
        alamat = keyboard.next();
        System.out.println("ABSEN : ");
        usia = keyboard.nextInt();
        System.out.print("Usia : ");
        absen = keyboard.nextInt();
        
        System.out.println("-----------");
        System.out.println("Nama Siswa : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("Absen : "+ usia );
        System.out.println("Usia : "+ absen);
        
        
            
        
        
                
    }
    
}
