import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array
        int[] nilaiAkhir = new int[10];

        // Input nilai mahasiswa menggunakan for loop
        System.out.println("=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Menghitung jumlah mahasiswa yang lulus dan tidak lulus
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menampilkan seluruh nilai menggunakan foreach
        System.out.println("\n=== SELURUH NILAI MAHASISWA ===");

        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai: " + nilai + " (" + status + ")");
        }

        // Menampilkan mahasiswa yang lulus saja
        System.out.println("\n=== MAHASISWA YANG LULUS ===");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1)
                        + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        // Menampilkan jumlah kelulusan
        System.out.println("\n=== REKAP KELULUSAN ===");
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        input.close();
    }
}