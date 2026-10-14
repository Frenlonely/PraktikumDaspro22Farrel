
 // Studi Kasus:
 // Mahasiswa dinyatakan lulus jika nilainya minimal 60.
 // Input: nilai mahasiswa.
 // Proses: membandingkan nilai dengan batas kelulusan.
 // Output: status lulus atau tidak lulus.

import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input nilai
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Tahap 3: Memeriksa kelulusan
        if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }

        // Tahap 4: Menutup Scanner
        input.close();
    }
}
