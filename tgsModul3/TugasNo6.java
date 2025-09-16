/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsModul3;

/**
 *
 * @author imadw
 */
import java.util.ArrayList;
import java.util.Scanner;

// Kelas abstrak
abstract class Perpustakaan {
    protected String judul;
    protected int tahunTerbit;

    public Perpustakaan (String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    // Metode abstrak untuk menampilkan info
    public abstract void tampilkanInfo();
}

// Subclass Buku
class Buku extends Perpustakaan {
    private String pengarang;
    private int jumlahHalaman;

    public Buku(String judul, int tahunTerbit, String pengarang, int jumlahHalaman) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Buku: " + judul + ", Pengarang: " + pengarang + ", Halaman: " + jumlahHalaman + ", Tahun: " + tahunTerbit);
    }
}

// Subclass Majalah
class Majalah extends Perpustakaan {
    private int edisi;
    private int volume;

    public Majalah(String judul, int tahunTerbit, int edisi, int volume) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
        this.volume = volume;
    }

    
    public void tampilkanInfo() {
        System.out.println("Majalah: " + judul + ", Edisi: " + edisi + ", " + "Volume: " + volume + ", Tahun: " + tahunTerbit);
    }
}

// Subclass DVD
class DVD extends Perpustakaan {
    private int durasi; // dalam menit
    private String genre;

    public DVD(String judul, int tahunTerbit, int durasi, String genre) {
        super(judul, tahunTerbit);
        this.durasi = durasi;
        this.genre = genre;
    }

 
    public void tampilkanInfo() {
        System.out.println("DVD: " + judul + ", Durasi: " + durasi + " menit, Genre: " + genre + ", Tahun: " + tahunTerbit);
    }
}

// Program utama
public class TugasNo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perpustakaan> perpustakaan = new ArrayList<>();

        // Input beberapa item
        System.out.println("Masukkan jumlah item yang ingin ditambahkan: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nPilih jenis item (1: Buku, 2: Majalah, 3: DVD): ");
            int jenis = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            System.out.print("Judul: ");
            String judul = scanner.nextLine();

            System.out.print("Tahun terbit: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            if (jenis == 1) {
                System.out.print("Pengarang: ");
                String pengarang = scanner.nextLine();
                System.out.print("Jumlah halaman: ");
                int halaman = scanner.nextInt();
                scanner.nextLine();

                perpustakaan.add(new Buku(judul, tahun, pengarang, halaman));
            } else if (jenis == 2) {
                System.out.print("Edisi: ");
                int edisi = scanner.nextInt();
                System.out.print("Volume: ");
                int volume = scanner.nextInt();
                scanner.nextLine();

                perpustakaan.add(new Majalah(judul, tahun, edisi, volume));
            } else if (jenis == 3) {
                System.out.print("Durasi (menit): ");
                int durasi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Genre: ");
                String genre = scanner.nextLine();

                perpustakaan.add(new DVD(judul, tahun, durasi, genre));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

         // Menampilkan semua item dipisah berdasarkan jenis
        System.out.println("\n=== Daftar Buku ===");
        for (Perpustakaan item : perpustakaan) {
            if (item instanceof Buku) item.tampilkanInfo();
        }

        System.out.println("\n=== Daftar Majalah ===");
        for (Perpustakaan item : perpustakaan) {
            if (item instanceof Majalah) item.tampilkanInfo();
        }

        System.out.println("\n=== Daftar DVD ===");
        for (Perpustakaan item : perpustakaan) {
            if (item instanceof DVD) item.tampilkanInfo();
        }
        scanner.close();
    }
}
