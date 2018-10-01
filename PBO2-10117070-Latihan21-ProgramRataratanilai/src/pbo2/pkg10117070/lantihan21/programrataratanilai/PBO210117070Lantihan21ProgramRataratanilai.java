/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.lantihan21.programrataratanilai;

import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding
 * Rata - Rata Nilai Mahasiswa
 */
public class PBO210117070Lantihan21ProgramRataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       double rata;
       
       int[] nilai = new int [100];
       Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya mahasiswa : ");
        double jml = input.nextInt();
        
        int sum = 0;
        for (int i=1; i<= jml; i++){
            try{
                System.out.print("Nilai Mahasiswa Ke-"+ i+": ");
                nilai[i] = input.nextInt();
                sum += nilai[i];
                
            }catch (Exception e){
                e.printStackTrace();
                break;
            }
        }
        rata = sum/jml;
        int jmls =(int)(jml);
        
        System.out.println("Total nilai dari "+jmls+" mahasiswa = "+ sum);
        System.out.println("dengan rata - rata = "+ rata);
    }
    
    
    
}
    

