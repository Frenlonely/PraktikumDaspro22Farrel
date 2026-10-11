import java.util.Scanner;

public class TugasParkirFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan durasi parkir
        int durasi;

        // Memasukkan durasi parkir
        System.out.print("Masukkan durasi parkir (jam): ");
        durasi = sc.nextInt();

        // Membuat variabel untuk menyimpan total tarif parkir
        int tarif;

        // Jika durasi parkir 2 jam atau kurang
        if (durasi <= 2) {
            tarif = durasi * 3000;

        // Jika durasi parkir lebih dari 2 jam
        } else {
            tarif = 2 * 3000 + (durasi - 2) * 2000;
        }

        // Menampilkan total biaya parkir
        System.out.println("Total biaya parkir: Rp " + tarif);

        // Menutup Scanner
        sc.close();
    }
}