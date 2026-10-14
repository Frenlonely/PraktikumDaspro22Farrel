
 // Studi Kasus:
 // Buat program untuk mengubah total detik menjadi jam,
 // menit, dan detik.
 // Input: jumlah detik.
 // Proses: menggunakan operator pembagian dan modulus.
 // Output: hasil konversi waktu.

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input jumlah detik
        System.out.print("Total detik: ");
        int totalDetik = input.nextInt();

        // Tahap 3: Menghitung jumlah jam
        int jam = totalDetik / 3600;

        // Tahap 4: Menghitung sisa detik setelah jam
        int sisa = totalDetik % 3600;

        // Tahap 5: Menghitung menit
        int menit = sisa / 60;

        // Tahap 6: Menghitung detik yang tersisa
        int detik = sisa % 60;

        // Tahap 7: Menampilkan hasil
        System.out.println(jam + " jam, "
                + menit + " menit, " + detik + " detik");

        // Tahap 8: Menutup Scanner
        input.close();
    }
}
