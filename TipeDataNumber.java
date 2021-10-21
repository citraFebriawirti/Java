/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipedatanumber;

/**
 *
 * @author Citra Febriawirti
 */
public class TipeDataNumber {// ini untuk class scope merangkup semua class yang ada di dalamnya
    public static void main(String[] args) {// ini untuk class scope bagian dari dalam class
        byte iniByte = 120;
        // variable dari iniByte dalam tipe data byte dengan nilai 120, tipe data byte ini min -128 max 127
        short iniShort = 1200;
       // variable ini iniShort dalam tipe data short dengan nilai 1200, tipe data short ini min -32,768 max 32,767
        int iniInt = 12000000;
        // variable ini iniInt dalam tipe data int dengan nilai 12000000, tipe data short ini min -2,147,483,648 max 2,147,483,647
        long iniLong = 120000000;
        // variable ini iniLong dalam tipe data long dengan nilai 120000000, 
        //tipe data short ini min -9,223,372,036,854,775,808  max 9,223,372,036,854,775,807
        float iniFloat = 12.5f;
         // variable ini iniFloat dalam tipe data float dengan nilai 12.5f,dengan total 4 bytes ini outputnya 12.5
        double iniDouble = 12.6d;
         // variable ini iniDouble dalam tipe data double dengan nilai 12.6d, tipe data double denagn 6 bytes ini outputnya 12.6 
        System.out.println("nilai byte adalah "+ iniByte + "  dari data");//outputnya nilai byte adalah 120 dari data
        System.out.println("nilai short adalah "+ iniShort + " dari data");//outputnya nilai short adalah 1200 dari data
        System.out.println("nilai Int adalah "+ iniInt + " dari data");//outputnya nilai int adalah 120000000 dari data
        System.out.println("nilai Long adalah "+ iniLong + " dari data");//outputnya nilai long adalah 120000000 dari data
        System.out.println("nilai Float adalah "+ iniFloat + " dari data");//outputnya nilai float adalah 12.5 dari data
        System.out.println("nilai Double adalah "+ iniDouble + " dari data");//outputnya nilai double adalah 12.6 dari data
        
    }
    
}
