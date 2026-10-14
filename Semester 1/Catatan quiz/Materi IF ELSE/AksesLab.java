
 // Studi Kasus:
 // Mahasiswa boleh memasuki laboratorium jika berstatus aktif
 // dan memiliki kartu akses atau didampingi dosen.
 // Input: status aktif, kartu akses, dan pendamping dosen.
 // Proses: gunakan operator && dan ||.
 // Output: akses diterima atau ditolak.

import java.util.Scanner;

public class AksesLab {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Memasukkan status mahasiswa
        System.out.print("Mahasiswa aktif (true/false): ");
        boolean aktif = input.nextBoolean();

        // Tahap 3: Memasukkan status kartu akses
        System.out.print("Memiliki kartu akses (true/false): ");
        boolean kartu = input.nextBoolean();

        // Tahap 4: Memasukkan status pendamping
        System.out.print("Didampingi dosen (true/false): ");
        boolean dosen = input.nextBoolean();

        // Tahap 5: Memeriksa seluruh persyaratan
        if (aktif && (kartu || dosen)) {
            System.out.println("Akses diterima");
        } else {
            System.out.println("Akses ditolak");
        }

        // Tahap 6: Menutup Scanner
        input.close();
    }
}
