
import java.util.Scanner;

public class DiskonBarang {
    public static void main(String[] args) {

        // Studi Kasus:
        // Buat program untuk menentukan diskon barang
        // berdasarkan harga barang yang dipilih.
        // Harga Rp10.000 mendapat diskon 5%.
        // Harga Rp20.000 mendapat diskon 10%.
        // Harga Rp30.000 mendapat diskon 15%.
        // Harga Rp40.000 mendapat diskon 20%.
        // Harga lainnya tidak mendapat diskon.
        // Input: harga barang.
        // Proses: menentukan diskon menggunakan switch-case.
        // Output: harga awal, diskon, dan total pembayaran.

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Memasukkan harga barang
        System.out.print("Masukkan harga barang: Rp");
        int harga = input.nextInt();

        // Tahap 3: Menyiapkan variabel diskon
        double diskonPersen;

        // Tahap 4: Menentukan diskon dengan switch-case
        switch (harga) {
            case 10000:
                diskonPersen = 5;
                break;

            case 20000:
                diskonPersen = 10;
                break;

            case 30000:
                diskonPersen = 15;
                break;

            case 40000:
                diskonPersen = 20;
                break;

            default:
                diskonPersen = 0;
                break;
        }

        // Tahap 5: Menghitung nominal diskon
        double diskon = harga * diskonPersen / 100;

        // Tahap 6: Menghitung total pembayaran
        double totalBayar = harga - diskon;

        // Tahap 7: Menampilkan hasil
        System.out.println("Harga awal: Rp" + harga);
        System.out.println("Diskon: " + diskonPersen + "%");
        System.out.println("Potongan harga: Rp" + diskon);
        System.out.println("Total pembayaran: Rp" + totalBayar);

        // Tahap 8: Menutup Scanner
        input.close();
    }
}