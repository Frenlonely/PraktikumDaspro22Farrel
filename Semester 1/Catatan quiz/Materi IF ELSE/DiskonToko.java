
 // Studi Kasus:
 // Anggota toko mendapat diskon 10%.
 // Jika anggota belanja minimal Rp200.000,
 // berikan diskon tambahan 5% setelah diskon pertama.
 // Nonanggota tidak mendapat diskon.
 // Input: status anggota dan total belanja.
 // Proses: menghitung diskon dengan Nested IF.
 // Output: total pembayaran.

import java.util.Scanner;

public class DiskonToko {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input status anggota
        System.out.print("Anggota (true/false): ");
        boolean anggota = input.nextBoolean();

        // Tahap 3: Input total belanja
        System.out.print("Total belanja: Rp");
        double belanja = input.nextDouble();

        // Tahap 4: Menentukan total pembayaran
        double total = belanja;

        // Tahap 5: Memeriksa status anggota
        if (anggota) {
            total = total * 0.90;

            // Tahap 6: Memeriksa syarat diskon tambahan
            if (belanja >= 200000) {
                total = total * 0.95;
            }
        }

        // Tahap 7: Menampilkan total pembayaran
        System.out.println("Total bayar: Rp" + total);

        // Tahap 8: Menutup Scanner
        input.close();
    }
}
