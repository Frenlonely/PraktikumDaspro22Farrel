import java.util.Scanner;

public class nestedUjianSkripsiFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan pesan hasil kondisi
        String pesan;

        // Memasukkan status bebas kompen
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        // Memasukkan jumlah log bimbingan Pembimbing 1
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        // Memasukkan jumlah log bimbingan Pembimbing 2
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        // Mengecek apakah mahasiswa sudah bebas kompen
        if (bebasKompen.equalsIgnoreCase("Ya")) {

            // Jika P1 minimal 8 dan P2 minimal 4
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";

            // Jika P1 dan P2 belum memenuhi syarat
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";

            // Jika P1 belum mencapai 8 kali
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";

            // Jika P2 belum mencapai 4 kali
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }

        // Jika mahasiswa belum bebas kompen
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        // Menampilkan hasil pemeriksaan
        System.out.println(pesan);

        // Menutup Scanner
        sc.close();
    }
}