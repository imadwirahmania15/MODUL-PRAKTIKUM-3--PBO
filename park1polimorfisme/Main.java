/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package park1polimorfisme;

/**
 *
 * @author imadw
 */
import java.util.Scanner;

class Hewan {
    public void suara(){
        System.out.println("Hewan membuat suara");
    }    
}

class Anjing extends Hewan{
    public void suara(){
        System.out.println("Anjing menggonggong");
    }
}

class Kucing extends Hewan{
    public void suara(){
        System.out.println("Kucing mengeong");
    }       
}

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2 ): ");
        int pilihan = scanner.nextInt();
        
        Hewan hewan; //referensi polimorfisme
        
         if (pilihan == 1){
            hewan = new Anjing(); //polimorfisme, objek anjing
        } else if (pilihan == 2){
            hewan = new Kucing();//polimorfisme, objek kucing
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
         
         hewan.suara();
         
         scanner.close();
    }
}