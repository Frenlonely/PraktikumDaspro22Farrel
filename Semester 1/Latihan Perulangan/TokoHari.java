
import java.util.Scanner;

public class TokoHari {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Memasukkan jumlah toko
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        // Memeriksa jumlah toko
        if (jumlahToko < 1) {

            System.out.println("Jumlah toko minimal 1!");

        } else {

            // Variabel untuk rekap seluruh toko
            int totalPelangganSemua = 0;
            int totalBarangSemua = 0;

            // Menyimpan jumlah barang terbanyak
            int barangTerbanyak = -1;
            int tokoTerbaik = 0;

            // Outer loop: mengulang setiap toko
            for (int i = 1; i <= jumlahToko; i++) {

                System.out.println("\n=== TOKO " + i + " ===");

                // Memasukkan jumlah pelanggan dalam satu hari
                System.out.print("Jumlah pelanggan hari ini: ");
                int jumlahPelanggan = sc.nextInt();

                // Memeriksa jumlah pelanggan
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    sc.close();
                    return;
                }

                // Variabel untuk menghitung barang setiap toko
                int totalBarangToko = 0;

                // Menambahkan pelanggan ke total seluruh toko
                totalPelangganSemua += jumlahPelanggan;

                // Middle loop: mengulang setiap pelanggan
                for (int j = 1; j <= jumlahPelanggan; j++) {

                    System.out.print("Jumlah barang pelanggan ke-" + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    // Memeriksa jumlah barang
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                        sc.close();
                        return;
                    }

                    // Menghitung total barang toko
                    totalBarangToko += jumlahBarang;
                }

                // Menampilkan hasil setiap toko
                System.out.println("Total pelanggan toko " + i + ": " + jumlahPelanggan);
                System.out.println("Total barang toko " + i + ": " + totalBarangToko);

                // Menjumlahkan barang seluruh toko
                totalBarangSemua += totalBarangToko;

                // Mencari toko dengan barang terbanyak
                if (totalBarangToko > barangTerbanyak) {

                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = i;
                }
            }

            // Menampilkan rekap akhir
            System.out.println("\n===== REKAP SELURUH TOKO =====");
            System.out.println("Total pelanggan seluruh toko: " + totalPelangganSemua);
            System.out.println("Total barang seluruh toko: " + totalBarangSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
            System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);
        }

        sc.close();
    }
}
