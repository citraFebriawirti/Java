/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_array3;

/**
 *
 * @author Citra Febriawirti
 */
public class Latihan_Array3 {
    public static void main(String[] args) {
       String[] nama = new String[3];
       int[] nilai = new int [3];
       char[] index = new char[3];
       nama[0]="Andi"; nilai[0]=50; index[0]='C';
       nama[1]="Susi"; nilai[1]=70; index[1]='B';
       nama[2]="Joni"; nilai[2]=90; index[2]='A';
       System.out.println("=====================");
       System.out.println("Nama\tNilai\tIndex");
       System.out.println("=====================");
       System.out.println(nama[0]+"\t"+nilai[0]+"\t"+index[0]);
       System.out.println(nama[1]+"\t"+nilai[1]+"\t"+index[1]);
       System.out.println(nama[2]+"\t"+nilai[2]+"\t"+index[2]);
       
    }
    
}
