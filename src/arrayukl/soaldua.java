/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayukl;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class soaldua {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kelas: ");
        String pilihan = scan.nextLine();
        String nama [][] = {{"adi", "budi", "jarjit", "ehsan"}, {"bagas", "rudi", "fizi", "putra"}};
        String kelas [][] = {{"XR1", "XR2", "XR3", "XR4"}, {"XR5", "XR6", "XR7", "XR8"}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (kelas[i][j].equalsIgnoreCase(pilihan)){
                    System.out.println("Nama: "+nama [i][j]);
                    System.out.println("Kelas: "+kelas[i][j]);
                    break;
                }}
            
        }} 
    }
     
