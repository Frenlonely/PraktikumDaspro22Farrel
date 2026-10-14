//Nama : MUhammad Farrel Sarona
//Kelas : 1D / 22
//Nim : 264107020028

import java.util.Scanner;
public class SimulasiGame {
    public static void main(String[] args){

        // Tahap 1: Membuat Scanner
         Scanner input = new Scanner(System.in);

        // tahap 2: Menampilkan tipe senjata
        System.out.print("Apakah senjata AR? (true/false): ");
        boolean AR = input.nextBoolean();

          System.out.print("Apakah senjata SMG? (true/false): ");
        boolean SMG = input.nextBoolean();

          System.out.print("Apakah senjata AR? (true/false): ");
        boolean SNIPER = input.nextBoolean();

        // Tahap 3: Memeriksa hasil perhitungan hit
        System.out.print("Apakah terkena kepala/badan (true jika kepala/false badan): ");
        boolean Hit = input.nextBoolean();


        // Tahap 4: Hasil dari hit
        if (AR && Hit) {
            System.out.println("Damage dasar 35");
            System.out.println("Damage akhir 45");
        } else {
            System.out.println("Damage dasar 35");
            System.out.println("Damage akhir 28");
        }

        if (SMG && Hit) {
            System.out.println("Damage dasar 25");
            System.out.println("Damage akhir 45"); 
         } else {
            System.out.println("Damage dasar 25");
            System.out.println("Damage akhir 17.5");
        }

        if (SNIPER && Hit) {
            System.out.println("Damage dasar 90");
            System.out.println("Damage akhir KNOCK"); 
         } else {
            System.out.println("Damage dasar 90");
            System.out.println("Damage akhir 90");
        } 


        input.close();



    }
}
