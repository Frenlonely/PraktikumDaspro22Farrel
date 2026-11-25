import java.util.Scanner;

public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Validasi jumlah data
        if (jumlahMahasiswa <= 0 || jumlahMataKuliah <= 0) {
            System.out.println("Jumlah mahasiswa dan mata kuliah harus lebih dari 0.");
            sc.close();
            return;
        }

        // Deklarasi array 2 dimensi
        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

        // Input nilai menggunakan nested loop
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menampilkan nilai dan rata-rata setiap mahasiswa
        System.out.println("\n=== HASIL NILAI MAHASISWA ===");

        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;

            System.out.println("\nMahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Mata kuliah ke-" + (j + 1)
                        + ": " + nilai[i][j]);

                totalPerSiswa += nilai[i][j];
            }

            double rataRataSiswa = totalPerSiswa / nilai[i].length;

            System.out.println("Rata-rata nilai mahasiswa: " + rataRataSiswa);
        }

        // Menghitung rata-rata setiap mata kuliah
        System.out.println("\n==================================");
        System.out.println("RATA-RATA NILAI SETIAP MATA KULIAH");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataRataMatkul = totalPerMatkul / nilai.length;

            System.out.println("Mata kuliah ke-" + (j + 1)
                    + ": " + rataRataMatkul);
        }

        sc.close();
    }
}