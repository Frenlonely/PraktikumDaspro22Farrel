
 // Studi Kasus:
 // Tentukan kategori usia berdasarkan umur.
 // Usia 0-5 = balita.
 // Usia 6-12 = anak-anak.
 // Usia 13-17 = remaja.
 // Usia 18 ke atas = dewasa.
 // Input: usia seseorang.
 // Proses: memeriksa kategori dengan else-if.
 // Output: kategori usia.

import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input usia
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        // Tahap 3: Memeriksa kategori usia
        if (usia < 0) {
            System.out.println("Usia tidak valid");
        } else if (usia <= 5) {
            System.out.println("Balita");
        } else if (usia <= 12) {
            System.out.println("Anak-anak");
        } else if (usia <= 17) {
            System.out.println("Remaja");
        } else {
            System.out.println("Dewasa");
        }

        // Tahap 4: Menutup Scanner
        input.close();
    }
}
