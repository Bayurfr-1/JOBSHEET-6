/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author win 7
 */
public class ContohBufferedReader {
    public static void main(String[] args) throws IOException {
           
    
    String nama;
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.print("Inputkan nama : ");
    nama = br.readLine();
    
    
    System.out.println("Nama umak adalah "+ nama);
    
    
    
    }
}
