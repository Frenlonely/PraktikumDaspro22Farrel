
import java.util.Scanner;

public class PenilaianKelompok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Memasukkan jumlah kelompok dan juri
        System.out.print("Jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();

        System.out.print("Jumlah juri: ");
        int jumlahJuri = sc.nextInt();

        // Memeriksa jumlah kelompok dan juri
        if (jumlahKelompok <= 0 || jumlahJuri <= 0) {

            System.out.println("Jumlah harus lebih dari 0!");

        } else {

            int nomorKelompok = 1;

            // Menyimpan rata-rata tertinggi
            double rataTertinggi = -1;

            // Menyimpan nomor kelompok terbaik
            int kelompokTerbaik = 0;

            // Outer loop: mengulang kelompok
            while (nomorKelompok <= jumlahKelompok) {

                System.out.println("\nKelompok " + nomorKelompok);

                double totalNilai = 0;

                // Middle loop: mengulang juri
                for (int j = 1; j <= jumlahJuri; j++) {

                    int nilai;

                    // Inner loop: validasi nilai juri
                    do {

                        System.out.print("Nilai juri " + j + ": ");
                        nilai = sc.nextInt();

                        // Memeriksa nilai valid
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100!");
                        }

                    } while (nilai < 0 || nilai > 100);

                    // Menambahkan nilai juri
                    totalNilai += nilai;
                }

                // Menghitung rata-rata kelompok
                double rataRata = totalNilai / jumlahJuri;

                System.out.println("Rata-rata: " + rataRata);

                // Membandingkan nilai tertinggi
                if (rataRata > rataTertinggi) {

                    rataTertinggi = rataRata;
                    kelompokTerbaik = nomorKelompok;
                }

                // Berpindah ke kelompok berikutnya
                nomorKelompok++;
            }

            // Menampilkan hasil akhir
            System.out.println("\n=== HASIL PENILAIAN ===");
            System.out.println("Kelompok terbaik: " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi: " + rataTertinggi);
        }

        sc.close();
    }
}
