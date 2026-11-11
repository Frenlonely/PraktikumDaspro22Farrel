import java.util.Scanner;

public class KonsultanPajakFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan PKP dan pajak
        double pkp, pajak;

        // Memasukkan Penghasilan Kena Pajak
        System.out.print("Masukkan PKP: ");
        pkp = sc.nextDouble();

        // Jika PKP 0 atau kurang, maka tidak dikenakan pajak
        if (pkp <= 0) {
            pajak = 0;

        // Jika PKP sampai Rp60 juta, dikenakan pajak 5%
        } else if (pkp <= 60000000) {
            pajak = pkp * 0.05;

        // Jika PKP lebih dari Rp60 juta sampai Rp250 juta
        } else if (pkp <= 250000000) {
            pajak = 60000000 * 0.05
                    + (pkp - 60000000) * 0.15;

        // Jika PKP lebih dari Rp250 juta sampai Rp500 juta
        } else if (pkp <= 500000000) {
            pajak = 60000000 * 0.05
                    + 190000000 * 0.15
                    + (pkp - 250000000) * 0.25;

        // Jika PKP lebih dari Rp500 juta
        } else {
            pajak = 60000000 * 0.05
                    + 190000000 * 0.15
                    + 250000000 * 0.25
                    + (pkp - 500000000) * 0.30;
        }

        // Menampilkan hasil pajak
        System.out.println("Pajak PPh 21: Rp " + pajak);

        // Menutup Scanner
        sc.close();
    }
}