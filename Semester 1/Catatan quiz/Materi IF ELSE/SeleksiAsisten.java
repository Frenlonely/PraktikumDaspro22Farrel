
 // Studi Kasus:
 // Calon asisten harus memiliki nilai pemrograman >= 80.
 // Jika memenuhi, nilai wawancara harus >= 75.
 // Input: nilai pemrograman dan wawancara.
 // Proses: menggunakan IF di dalam IF.
 // Output: status seleksi dan alasan jika tidak lolos.

import java.util.Scanner;

public class SeleksiAsisten {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input nilai pemrograman
        System.out.print("Nilai pemrograman: ");
        int pemrograman = input.nextInt();

        // Tahap 3: Input nilai wawancara
        System.out.print("Nilai wawancara: ");
        int wawancara = input.nextInt();

        // Tahap 4: Memeriksa syarat pertama
        if (pemrograman >= 80) {

            // Tahap 5: Memeriksa syarat kedua
            if (wawancara >= 75) {
                System.out.println("Lolos seleksi");
            } else {
                System.out.println("Gagal pada wawancara");
            }

        } else {
            System.out.println("Nilai pemrograman kurang");
        }

        // Tahap 6: Menutup Scanner
        input.close();
    }
}
