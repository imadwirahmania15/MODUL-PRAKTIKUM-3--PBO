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

//interface Alt elektronik
interface AlatElektronik {
    void hidupkan();
    void matikan();
}
// Kelas Televisi yang mengimplementasikan Alat Elektronik 
 class Televisi implements AlatElektronik {
    public void hidupkan(){
        System.out.println("Perangkat Televisi dinyalakan.");
    }
    
    public void matikan(){
        System.out.println("Perangkat Televisi dimatikan");
    } 
}

// Kelas Radio yang mengimplementasikan Alat elektronik
class Radio  implements AlatElektronik {
    public void hidupkan(){
        System.out.println("Perangkat Radio dinyalakan.");
    }
    public void matikan(){
        System.out.println("Perangkat Radio dimatikan");
    }    
}


public class TugasNo4 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in); //Membuat scanner untuk input dari keyboard
        
        //Menampilkan pilihan Alat elektronik kepada pengguna
        System.out.println("Pilih jenis Alat Elektronik:");
        System.out.println("1. Televisi");
        System.out.println("2. Radio");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt(); //Membawa input pilihan dari pengguna
        
        AlatElektronik alatElektronik ; //Mendeklarasi variabel tipe interface Alat elektronik 
 
        
        //Memilih Alat elektronik berdasarkan input pengguna
        if (pilihan == 1){
            alatElektronik = new Televisi(); // Membuat objek Televisi;
        } else if (pilihan == 2){
            alatElektronik = new Radio();
        } else {
            System.out.println("Pilihan tidak valid");
            return;
        }
        
        //melakukan aksi pada Alat elektronik berdasarkan input pengguna
        System.out.println("Pilih aksi:");
        System.out.println("1. Nyalakan Perangkat");
        System.out.println("2. Matikan Perangkat");
        
        System.out.println("Masukkan pilihan aksi Anda (1 atau 2): ");
        int aksi = scanner.nextInt(); //membaca input aksi dari pengguna
        
        //menjalankan aksi sesuai pilihan
        if (aksi == 1) {
            alatElektronik.hidupkan();//Menyalakan Perangkat
        } else if (aksi == 2){
            alatElektronik.matikan();// Mematikan Perangkat
        } else {
            System.out.println("Aksi tidak valid");
        }
        
        scanner.close(); //menutup scanner
        
    }
    
}
