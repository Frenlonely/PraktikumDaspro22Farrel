
import java.util.Scanner; // Mengimpor Scanner untuk menerima input

public class PenilaianLomba22Farrel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Membuat objek Scanner

        // Deklarasi variabel
        int jumlahPeserta;
        double nilai, totalNilai, rataRata;
        double nilaiTertinggi = -1; // Menyimpan rata-rata tertinggi
        String nama, juara = ""; // Menyimpan nama peserta dan juara

        // Meminta jumlah peserta lomba
        System.out.print("Masukkan jumlah peserta lomba: ");
        jumlahPeserta = sc.nextInt();
        sc.nextLine(); // Membersihkan newline

        // Outer Loop: Mengulang proses untuk setiap peserta
        for (int i = 1; i <= jumlahPeserta; i++) {

            System.out.println("\n=== PESERTA KE-" + i + " ===");

            // Memasukkan nama peserta
            System.out.print("Masukkan nama peserta: ");
            nama = sc.nextLine();

            totalNilai = 0; // Reset total nilai untuk peserta berikutnya

            // Inner Loop: Memasukkan nilai dari 3 orang juri
            for (int j = 1; j <= 3; j++) {

                System.out.print("Masukkan nilai Juri " + j + ": ");
                nilai = sc.nextDouble();

                totalNilai += nilai; // Menambahkan nilai juri ke total
            }

            // Menghitung rata-rata dari 3 juri
            rataRata = totalNilai / 3;

            // Menampilkan total dan rata-rata nilai peserta
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Rata-rata nilai " + nama + ": " + rataRata);

            // Membandingkan rata-rata untuk menentukan juara
            if (rataRata > nilaiTertinggi) {

                nilaiTertinggi = rataRata; // Memperbarui nilai tertinggi
                juara = nama; // Menyimpan nama peserta dengan nilai tertinggi
            }

            sc.nextLine(); // Membersihkan newline sebelum input nama berikutnya
        }

        // Menampilkan hasil akhir perlombaan
        System.out.println("\n===== HASIL LOMBA =====");
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Juara 1: " + juara);

        sc.close(); // Menutup Scanner
    }
}
