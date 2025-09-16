/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package park3interface;

/**
 *
 * @author imadw
 */
import java.util.Scanner;
//interface Kendaraan
interface Kendaraan {
    void startEngine();
    void stopEngine();
}
// Kelas Mobil yang mengimplementasikan Kendaraan 
 class Mobil implements Kendaraan {
    public void startEngine(){
        System.out.println("Mesin mobil dinyalakan.");
    }
    
    public void stopEngine(){
        System.out.println("Mesin mobil dimatikan");
    } 
}

// Kelas Motor yang mengimplementasikan Kendaraan
class Motor implements Kendaraan {
    public void startEngine(){
        System.out.println("Mesin motor dinyalakan.");
    }
    public void stopEngine(){
        System.out.println("Mesin motor dimatikan");
    }    
}


public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in); //Membuat scanner untuk input dari keyboard
        
        //Menampilkan pilihan kendaraan kepada pengguna
        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt(); //Membava input pilihan dari pengguna
        
        Kendaraan kendaraan ; //Mendeklarasi variabel tipe interface Kendaraa 
        
        //Memilih kendaraan berdasarkan input pengguna
        if (pilihan == 1){
            kendaraan = new Mobil(); // Membuatr objek mobi;
        } else if (pilihan == 2){
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid");
            return;
        }
        
        //melakukan aksi pada kendaraan berdasarkan input pengguna
        System.out.println("Pilih aksi:");
        System.out.println("1. Nyalakan mesin");
        System.out.println("2. Matikan mesin");
        
        System.out.println("Masukkan pilihan aksi Anda (1 atau 2): ");
        int aksi = scanner.nextInt(); //membaca input aksi dari pengguna
        
        //menjalankan aksi sesuai pilihan
        if (aksi == 1) {
            kendaraan.startEngine();//Menyalakan mesin
        } else if (aksi == 2){
            kendaraan.stopEngine(); // Mematikan mesin
        } else {
            System.out.println("Aksi tidak valid");
        }
        
        scanner.close(); //menutup scanner
        
    }
    
}
