import java.util.Scanner;

public class ArrayRataNilai {
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

        // Membuat array berdasarkan input pengguna
        int[] nilaiMhs = new int[jumlah];

        int total = 0;
        int jumlahLulus = 0;

        // Input nilai dan menghitung total
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();

            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        // Menghitung rata-rata
        double rata2 = (double) total / nilaiMhs.length;

        // Menentukan nilai tertinggi dan terendah
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        // Menentukan predikat kelas
        String predikat;

        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }

        // Menampilkan seluruh nilai
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1)
                    + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        // Menampilkan hasil perhitungan
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Predikat kelas: " + predikat);

        input.close();
    }
}