
import java.util.Scanner;

public class Bioskop22Farrel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPendapatan = 0;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        while (true) {

            System.out.print("\nMasukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                continue;
            }

            int subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            int totalBayar = (int) (subtotal - (subtotal * diskon));

            totalTiket += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + totalBayar);
        }

        System.out.println("\n=== HASIL PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        System.out.println("Program selesai.");

        sc.close();
    }
}
