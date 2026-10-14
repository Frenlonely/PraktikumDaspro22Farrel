
 // Studi Kasus:
 // Pilih makanan berdasarkan kode menu.
 // 1 = Nasi goreng Rp15.000.
 // 2 = Mi goreng Rp12.000.
 // 3 = Bakso Rp13.000.
 // Input: nomor menu.
 // Proses: menentukan harga dengan switch-case.
 // Output: nama dan harga makanan.

import java.util.Scanner;

public class MenuKantin {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Menampilkan menu
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mi goreng");
        System.out.println("3. Bakso");

        // Tahap 3: Input pilihan
        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        // Tahap 4: Memproses pilihan
        switch (pilihan) {
            case 1:
                System.out.println("Nasi goreng: Rp15000");
                break;
            case 2:
                System.out.println("Mi goreng: Rp12000");
                break;
            case 3:
                System.out.println("Bakso: Rp13000");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }

        // Tahap 5: Menutup Scanner
        input.close();
    }
}
