
 // Studi Kasus:
 // Tentukan predikat nilai mahasiswa.
 // Nilai 85-100 = A, 75-84 = B,
 // 60-74 = C, dan 0-59 = D.
 // Input: nilai mahasiswa.
 // Proses: memeriksa rentang nilai menggunakan else-if.
 // Output: predikat nilai atau pesan nilai tidak valid.

import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input nilai
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Tahap 3: Memeriksa rentang nilai
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 85) {
            System.out.println("Predikat A");
        } else if (nilai >= 75) {
            System.out.println("Predikat B");
        } else if (nilai >= 60) {
            System.out.println("Predikat C");
        } else {
            System.out.println("Predikat D");
        }

        // Tahap 4: Menutup Scanner
        input.close();
    }
}
