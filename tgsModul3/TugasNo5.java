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

// Kelas abstrak Rekening
abstract class Rekening {
    protected String nomorRekening;
    protected double saldo;   

 public Rekening(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }
 
  // Metode abstrak untuk tarik uang
public abstract void tarik(double jumlah);

// Metode non-abstrak untuk setor uang
public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor sebesar " + jumlah + ". Saldo sekarang: " + saldo);
    }
    
public void tampilSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }   
}

// Subclass RekeningTabungan
class RekeningTabungan extends Rekening {
    public RekeningTabungan(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }
    
public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik tunai Tabungan: " + jumlah + ". Sisa saldo: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk penarikan.");
        }
    }
}

// Subclass RekeningGiro
class RekeningGiro extends Rekening {
    private double overdraftLimit = 1000;

    public RekeningGiro(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }
 
public void tarik(double jumlah) {
        if (jumlah <= saldo + overdraftLimit) {
            saldo -= jumlah;
            System.out.println("Tarik tunai Giro: " + jumlah + ". Saldo sekarang: " + saldo);
        } else {
            System.out.println("Melebihi limit cerukan.");
        }
    }
}

// Subclass RekeningDeposito
class RekeningDeposito extends Rekening {
    public RekeningDeposito(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }
public void tarik(double jumlah) {
        System.out.println("Penarikan dari Deposito hanya bisa saat jatuh tempo.");
    }
}   
public class TugasNo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis rekening:");
        System.out.println("1. Rekening Tabungan");
        System.out.println("2. Rekening Giro");
        System.out.println("3. Rekening Deposito");

        System.out.print("Masukkan pilihan Anda (1 sampai 3): ");
        int pilihan = scanner.nextInt();

        Rekening rekening;

        if (pilihan == 1) {
            rekening = new RekeningTabungan("TAB001", 100000);
        } else if (pilihan == 2) {
            rekening = new RekeningGiro("GIR001", 200000);
        } else if (pilihan == 3) {
            rekening = new RekeningDeposito("DEP001", 50000);
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        System.out.println("Pilih aksi:");
        System.out.println("1. Setor");
        System.out.println("2. Tarik");

        System.out.print("Masukkan pilihan aksi Anda (1 atau 2): ");
        int aksi = scanner.nextInt();

        System.out.print("Masukkan jumlah uang: ");
        double jumlah = scanner.nextDouble();

        if (aksi == 1) {
            rekening.setor(jumlah);
        } else if (aksi == 2) {
            rekening.tarik(jumlah);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
