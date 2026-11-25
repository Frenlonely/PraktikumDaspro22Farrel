import java.util.Scanner;

public class PengelolaanNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        // Validasi jumlah mahasiswa
        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            input.close();
            return;
        }

        // Membuat array nilai
        int[] nilai = new int[jumlah];

        int total = 0;

        // Input nilai setiap mahasiswa
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlah;

        // Menentukan nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Menampilkan seluruh nilai dan status kelulusan
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1)
                    + " | Nilai: " + nilai[i]
                    + " | Status: " + status);
        }

        // Menampilkan hasil perhitungan
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Total nilai     : " + total);
        System.out.println("Rata-rata       : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        input.close();
    }
}