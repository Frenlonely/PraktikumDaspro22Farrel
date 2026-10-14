
 // Studi Kasus:
 // Buat program untuk menentukan bilangan genap atau ganjil.
 // Input: sebuah bilangan bulat.
 // Proses: periksa sisa pembagian bilangan dengan 2.
 // Output: bilangan genap atau bilangan ganjil.

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {

        // Tahap 1: Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Tahap 2: Memasukkan bilangan
        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        // Tahap 3: Memeriksa sisa pembagian
        if (angka % 2 == 0) {
            // Jika sisa bagi 0, bilangan genap
            System.out.println("Bilangan genap");
        } else {
            // Jika tidak, bilangan ganjil
            System.out.println("Bilangan ganjil");
        }

        // Tahap 4: Menutup Scanner
        input.close();
    }
}
