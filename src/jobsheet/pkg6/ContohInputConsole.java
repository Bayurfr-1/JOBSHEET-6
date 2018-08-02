/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6;
import java.io.Console;


/**
 *
 * @author win 7
 */
public class ContohInputConsole {

  

   
    public static void main(String[] args) {
        String nama;
        int usia;
        String alamat;
        
        Console con = System.console();
        System.out.print("Inputkan nama anda : ");
        nama = con.readLine();
        System.out.print("Inputkan Usia :");
        usia = Integer.parseInt(con.readLine());
        System.out.print("Inputkan alamat anda : ");
        alamat = con.readLine();
        
        System.out.println("Nama kamu adalah : "+ nama);
        System.out.println("Saat ini berusia : "+ usia+ "tahun");
        System.out.println("Alamat kamu saat ini : "+ alamat);
                
    }

    
    
    
}
