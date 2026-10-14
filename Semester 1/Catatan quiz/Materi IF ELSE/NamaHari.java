
 // Studi Kasus:
 // Masukkan angka 1 sampai 7.
 // Angka 1 = Senin hingga angka 7 = Minggu.
 // Input: nomor hari.
 // Proses: mencocokkan nomor dengan switch-case.
 // Output: nama hari atau pesan kesalahan.

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Input nomor hari
        System.out.print("Nomor hari (1-7): ");
        int hari = input.nextInt();

        // Tahap 3: Menentukan nama hari
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Nomor hari tidak valid");
        }

        // Tahap 4: Menutup Scanner
        input.close();
    }
}
