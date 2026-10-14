
 // Studi Kasus:
 // Buat program untuk menampilkan biodata mahasiswa.
 // Data meliputi nama, umur, kelas, dan status aktif.
 // Input: nama, umur, kelas, dan status aktif.
 // Proses: menyimpan data dalam variabel.
 // Output: menampilkan biodata mahasiswa.

import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Memasukkan nama
        System.out.print("Nama: ");
        String nama = input.nextLine();

        // Tahap 3: Memasukkan umur
        System.out.print("Umur: ");
        int umur = input.nextInt();
        input.nextLine();

        // Tahap 4: Memasukkan kelas
        System.out.print("Kelas: ");
        String kelas = input.nextLine();

        // Tahap 5: Memasukkan status aktif
        System.out.print("Mahasiswa aktif (true/false): ");
        boolean aktif = input.nextBoolean();

        // Tahap 6: Menampilkan biodata
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Kelas: " + kelas);
        System.out.println("Aktif: " + aktif);

        // Tahap 7: Menutup Scanner
        input.close();
    }
}
