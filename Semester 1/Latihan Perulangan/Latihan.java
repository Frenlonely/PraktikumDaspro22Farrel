
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Identitas mahasiswa dan kode personal
        String nama = "Muhammad Farrel Sarona";
        int noAbsen = 7; 
        int k = noAbsen % 5;

        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        // Memasukkan jumlah kamar
        System.out.print("Jumlah kamar: ");
        int totalKamar = sc.nextInt();

        // Variabel rekap seluruh kamar
        double totalKwhTertinggi = -1;
        int kamarTerboros = 0;
        int jumlahMeteranRusak = 0;

        // Outer loop: mengulang setiap kamar
        for (int i = 1; i <= totalKamar; i++) {

            System.out.println("\nKamar " + i);

            double totalKwh = 0;
            boolean rusak = false;
            int hariRusak = 0;

            // Berapa kali badan inner loop dijalankan?
            // Maksimal 5 kali, tetapi berhenti jika menemukan -1.
            for (int hari = 1; hari <= 5; hari++) {

                System.out.print("Hari " + hari + " (kWh): ");
                double kwh = sc.nextDouble();

                // Jika input -1, meteran dianggap rusak
                if (kwh == -1) {
                    rusak = true;
                    hariRusak = hari;
                    break;
                }

                // Menambahkan pemakaian listrik
                totalKwh += kwh;
            }

            // Menentukan kategori kamar
            String kategori;
            double rataRata = totalKwh / 5;

            if (rusak) {
                kategori = "Rusak (hari ke-" + hariRusak + ")";
                jumlahMeteranRusak++;
            } else if (rataRata < 5 + k) {
                kategori = "Hemat";
            } else {
                kategori = "Boros";
            }

            // Menampilkan hasil setiap kamar
            System.out.printf("Total: %.2f | %s%n", totalKwh, kategori);

            // Mencari kamar dengan total kWh tertinggi
            // Hanya kamar yang meterannya tidak rusak
            if (!rusak && totalKwh > totalKwhTertinggi) {
                totalKwhTertinggi = totalKwh;
                kamarTerboros = i;
            }
        }

        // Menampilkan ringkasan akhir
        System.out.println("\n==============================");

        if (kamarTerboros == 0) {
            System.out.println("Tidak ada kamar dengan meteran normal.");
            System.out.println("Total kWh tertinggi: Tidak tersedia");
        } else {
            System.out.println("Kamar paling boros : " + kamarTerboros);
            System.out.printf("Total kWh tertinggi: %.2f%n",
                    totalKwhTertinggi);
        }

        System.out.println("Jumlah meteran rusak: " + jumlahMeteranRusak);

        sc.close();
    }
}
