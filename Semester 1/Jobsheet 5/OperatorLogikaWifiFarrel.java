import java.util.Scanner;

public class OperatorLogikaWifiFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel boolean untuk menyimpan status pengguna
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        // Memasukkan status pengguna sebagai mahasiswa
        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        // Memasukkan status pengguna sebagai dosen
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        // Memasukkan status akun pengguna
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        // Mengecek apakah pengguna mendapatkan akses WiFi
        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        // Menutup Scanner
        sc.close();
    }
}