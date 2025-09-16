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

class Anjing extends Hewan {
    public void suara(){
        System.out.println("Anjing menggonggong");
    }
}
class Kucing extends Hewan {
    public void suara(){
        System.out.println("Kucing mengeong");
    }
}
//soal no 2 pengembangan polimorfisme
// membuat kelas burung dan menampilkan suara
class Burung extends Hewan {
    public void suara(){
        System.out.println("Burung berkicau ");
    }
}

public class Main2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        Hewan[] hewanArray = new Hewan [3];
        hewanArray[0] = new Anjing();
        hewanArray[1] = new Kucing();
        hewanArray[2] = new Burung(); //untuk memanggil class burung
        
        System.out.println("Pilih hewan dari 0 hingga 2:");
        
        int pilihan = scanner.nextInt();
        
        if (pilihan >= 0 && pilihan < hewanArray.length){
            hewanArray[pilihan].suara();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}