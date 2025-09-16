/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsModul3;

/**
 *
 * @author imadw
 */
import java.util.Scanner;

//Kelas abstrak Hewan
abstract class Kendaraan {
    public abstract void nyalakanMesin(); //metode abstrak
    public void matikanMesin(){
        System.out.println("Mesin dimatikan.");
    }    
}

//kelas turunan anjing
class Motor extends Kendaraan {
    public void nyalakanMesin(){
        System.out.println("Mesin motor dinyalakan.");
    }
}

//kelas turunan kucing
class Mobil extends Kendaraan{
    public void nyalakanMesin(){
        System.out.println("Mesin mobil dinyalakan.");
    }
}

public class TugasNo3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2 ): ");
        int pilihan = scanner.nextInt();
        
        Kendaraan kendaraan;
        
        if (pilihan == 1){
            kendaraan = new Motor();
        } else if (pilihan == 2){
            kendaraan = new Mobil();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();
        
        scanner.close();
    }
}

