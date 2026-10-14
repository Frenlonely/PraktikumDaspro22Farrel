
 // Studi Kasus:
 // Pembeli membeli beberapa buku dengan harga yang sama.
 // Program menghitung total harga dan uang kembalian.
 // Input: harga buku, jumlah buku, dan uang pembayaran.
 // Proses: total = harga * jumlah.
 // Kembalian = pembayaran - total.
 // Output: total belanja dan kembalian.

import java.util.Scanner;

public class TotalBelanja {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input harga buku
        System.out.print("Harga buku: Rp");
        int harga = input.nextInt();

        // Tahap 3: Input jumlah buku
        System.out.print("Jumlah buku: ");
        int jumlah = input.nextInt();

        // Tahap 4: Input uang pembayaran
        System.out.print("Uang pembayaran: Rp");
        int uang = input.nextInt();

        // Tahap 5: Menghitung total belanja
        int total = harga * jumlah;

        // Tahap 6: Menghitung kembalian
        int kembalian = uang - total;

        // Tahap 7: Menampilkan hasil
        System.out.println("Total: Rp" + total);
        System.out.println("Kembalian: Rp" + kembalian);

        // Tahap 8: Menutup Scanner
        input.close();
    }
}
