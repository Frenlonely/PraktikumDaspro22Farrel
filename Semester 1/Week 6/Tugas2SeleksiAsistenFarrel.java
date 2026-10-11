import java.util.Scanner;

public class Tugas2SeleksiAsistenFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan status dan nilai mahasiswa
        boolean mahasiswaAktif;
        boolean sanksiAkademik;
        boolean sertifikatKompetensi;
        int nilaiDasarPemrograman;
        int nilaiWawancara;

        // Meminta input status mahasiswa
        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        // Meminta input status sanksi akademik
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
        sanksiAkademik = sc.nextBoolean();

        // Meminta input nilai Dasar Pemrograman
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        nilaiDasarPemrograman = sc.nextInt();

        // Meminta input kepemilikan sertifikat kompetensi
        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        sertifikatKompetensi = sc.nextBoolean();

        // Tahap 1: Memeriksa apakah mahasiswa aktif dan tidak terkena sanksi
        if (mahasiswaAktif && !sanksiAkademik) {

            // Tahap 2: Memeriksa nilai minimal 80 atau memiliki sertifikat
            if (nilaiDasarPemrograman >= 80 || sertifikatKompetensi) {

                // Meminta input nilai wawancara
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextInt();

                // Tahap 3: Memeriksa nilai wawancara minimal 75
                if (nilaiWawancara >= 75) {

                    // Mahasiswa dinyatakan diterima
                    System.out.println("Hasil Seleksi: DITERIMA sebagai asisten praktikum.");

                } else {

                    // Mahasiswa gagal karena nilai wawancara kurang dari 75
                    System.out.println("Hasil Seleksi: GAGAL.");
                    System.out.println("Alasan: Nilai wawancara kurang dari 75.");
                }

            } else {

                // Mahasiswa gagal karena tidak memenuhi syarat nilai atau sertifikat
                System.out.println("Hasil Seleksi: GAGAL.");
                System.out.println("Alasan: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman.");
            }

        } else {

            // Mahasiswa gagal pada tahap pertama
            System.out.println("Hasil Seleksi: GAGAL.");

            // Menampilkan alasan jika mahasiswa tidak aktif
            if (!mahasiswaAktif) {
                System.out.println("Alasan: Status mahasiswa tidak aktif.");

            // Menampilkan alasan jika mahasiswa terkena sanksi
            } else if (sanksiAkademik) {
                System.out.println("Alasan: Mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

        // Menutup Scanner
        sc.close();
    }
}