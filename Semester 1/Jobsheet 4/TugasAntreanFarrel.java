import java.util.Scanner;

public class TugasAntreanFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan pilihan layanan
        int pilihan;

        // Menampilkan daftar layanan akademik
        System.out.println("Pilih layanan akademik:");
        System.out.println("1. KRS");
        System.out.println("2. Transkrip Nilai");
        System.out.println("3. Surat Aktif");
        System.out.println("4. Konsultasi");
        System.out.print("Masukkan kode layanan (1-4): ");

        // Membaca pilihan yang dimasukkan pengguna
        pilihan = sc.nextInt();

        // Menentukan nomor antrean berdasarkan pilihan
        switch (pilihan) {

            // Jika memilih KRS
            case 1:
                System.out.println("Nomor antrian Anda: A");
                break;

            // Jika memilih Transkrip Nilai
            case 2:
                System.out.println("Nomor antrian Anda: B");
                break;

            // Jika memilih Surat Aktif
            case 3:
                System.out.println("Nomor antrian Anda: C");
                break;

            // Jika memilih Konsultasi
            case 4:
                System.out.println("Nomor antrian Anda: D");
                break;

            // Jika pilihan bukan 1 sampai 4
            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        // Menutup Scanner
        sc.close();
    }
}