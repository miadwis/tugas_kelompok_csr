/*Nama : Mia Dwi Susilowati
 *NPM  : 140203120014
 *Teknik Informatika/3/A
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmertika;

import java.util.Scanner;

/**
 *
 * @author mia
 */
public class Aritmertika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int pertama, kedua, kali, tambah, kurang, mod, pangkat;
    
        Scanner input = new Scanner(System.in);
        System.out.print("Menu Arimetika bilangan integer");
        System.out.println("====================================");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulo");
        System.out.println("6. Pangkat(2)");
        
        System.out.println("0. Keluar");
        Systemout.print("Pilihan menu [1-2]            ");
        nomer = input.nextInt();
        
        switch (nomer) {
            case 1:
                System.out.print("Masukkan operator ke-1 :  ");
                pertama=input.nextInt();
                System.out.print("Masukkan operator ke-2 :  ");
                kedua=inpt.nextInt();
                tambah=pertama+kedua;
                System.out.println("Hasil Penjumlahan      :  "+tambah);
                break;
            case 2:
                System.out.print("Masukkan operator ke-1 :  ");
                pertama=input.nextInt();
                System.out.print("Masukkan operator ke-2 :  ");
                kedua=input.nextint();
                kurang=pertama-kedua;
                System.out.println("Hasil Pengurangan      :  "+kurang);
                break;
            case 3:
                System.out.print("Masukkan operator ke-1 :  ");
                pertama=input.nextInt();
                System.out.print("Masukkan operator ke-2 :  ")
                kedua=input.nextInt();
                kali=pertama*kedua;
                System.out.println("Hasil Perkalian      :  "+kali);
                break;
            case 4:
                System.out.print("Masukkan operator ke-1 :  ");
                pertama=input.nextInt();
                System.out.print("Masukkan operator ke-2 :  ");
                pertama=input.nextInt();
                bagi=pertama/kedua;
                System.out.println("Hasil Pembagian      :  "+bagi);
                break;
            case :
                System.out.print("Masukkan operator ke-1 :  ");
                pertama=input.nextInt();
                System.out.print("Masukkan operator ke-2 :  ");
                kedua=input.nextInt();
                modpertama % kedua;
                System.out.println("Hasil Modulo      :  "+mod);
                break;
             case 6:
                System.out.print("Masukkan bilangan :  ");
                pertama=input.nextInt();
                pangkat=pertama *pertama ;
                System.out.println("Hasil Pangkat      :  "+pangkat);
                break;     
            default 
                System.out.println("anda keluar dari program ini");  
                brak;
        }
        //AKHIR SWITCH
    
    //AKHIR PROGRAM
  }
        
}
