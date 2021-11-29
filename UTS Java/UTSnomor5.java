/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsnomor5;
// Citra Febriawirti, 201100032
import java.util.Scanner;
public class UTSnomor5 {
    public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukkan Menu Makanan : ");
        pilihan = masuk.nextInt();
        switch(pilihan) {
          case 1: 
                 System.out.println("Soto Ayam");
                 break;
          case 2: 
                 System.out.println("Gule Kambing");
                 break;
          case 3: 
                 System.out.println("Nasi Goreng");
                 break;
          default: 
                 System.out.println("Maaf Tersedia!!");
        }
    }
    }
    

