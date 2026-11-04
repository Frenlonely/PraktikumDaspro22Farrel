
import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Memasukkan jumlah toko
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        // Memeriksa jumlah toko
        if (jumlahToko < 1) {

            System.out.println("Jumlah toko minimal 1!");

        } else {

            // Variabel total seluruh toko
            int totalBarangSemua = 0;

            // Menyimpan jumlah barang terbanyak
            int barangTerbanyak = -1;

            // Menyimpan nomor toko terbaik
            int tokoTerbaik = 0;

            // Outer loop: mengulang setiap toko
            for (int i = 1; i <= jumlahToko; i++) {

                System.out.println("\n=== TOKO " + i + " ===");

                // Memasukkan jumlah pelanggan
                System.out.print("Jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();

                // Memeriksa jumlah pelanggan
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    System.out.println("Jalankan ulang program untuk memasukkan data yang benar.");
                    sc.close();
                    return;
                }

                // Variabel untuk setiap toko
                int totalBarangToko = 0;
                int totalPelanggan = jumlahPelanggan;

                // Middle loop: mengulang setiap pelanggan
                for (int j = 1; j <= jumlahPelanggan; j++) {

                    System.out.print("Jumlah barang pelanggan ke-" + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    // Memeriksa jumlah barang
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                        System.out.println("Jalankan ulang program untuk memasukkan data yang benar.");
                        sc.close();
                        return;
                    }

                    // Menambahkan barang pelanggan ke total toko
                    totalBarangToko += jumlahBarang;
                }

                // Menampilkan hasil setiap toko
                System.out.println("Total pelanggan toko " + i + ": " + totalPelanggan);
                System.out.println("Total barang toko " + i + ": " + totalBarangToko);

                // Menambahkan barang ke total seluruh toko
                totalBarangSemua += totalBarangToko;

                // Mencari toko dengan barang terbanyak
                // Operator > mempertahankan toko bernomor lebih kecil jika seri
                if (totalBarangToko > barangTerbanyak) {

                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = i;
                }
            }

            // Menampilkan rekap seluruh toko
            System.out.println("\n===== REKAP PENJUALAN =====");
            System.out.println("Total barang seluruh toko: " + totalBarangSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
            System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);
        }

        sc.close();
    }
}
