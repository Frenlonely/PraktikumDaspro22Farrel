
import java.util.Scanner;

public class StudiKasus2Farrel22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = input.nextLine().trim().toUpperCase();

        System.out.print("Jumlah dokumen (0-4): ");
        jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara (1-3, 0 jika bukan): ");
        peringkatJuara = input.nextInt();

        System.out.print("Status PKM (1=lolos, 0=tidak): ");
        statusPKM = input.nextInt();

        System.out.println("\n=== HASIL PEMERIKSAAN ===");
        System.out.println("Nama: " + nama);

        if (jumlahDokumen < 0 || jumlahDokumen > 4) {
            System.out.println("Jumlah dokumen tidak valid.");
        } else if (jumlahDokumen < 4) {
            System.out.println("Dokumen tidak lengkap.");
            System.out.println("Dana tidak diberikan.");
        } else {
            
        if (jenisKegiatan.equals("BELMAWA")
        || jenisKegiatan.equals("BAKORMA")
        || jenisKegiatan.equals("MANDIRI")) {

        if (peringkatJuara >= 1 && peringkatJuara <= 3) {
        System.out.println("Dana penghargaan diberikan.");
        } else {
        System.out.println("Dana penghargaan tidak diberikan.");
        }

        } else if (jenisKegiatan.equals("PKM")) {

        if (statusPKM == 1) {
        System.out.println("Dana penghargaan diberikan.");
        } else if (statusPKM == 0) {
        System.out.println("Dana penghargaan tidak diberikan.");
        } else {
        System.out.println("Status PKM tidak valid.");
        }

        } else if (jenisKegiatan.equals("LAINNYA")) {

        System.out.println("Dana penghargaan tidak diberikan.");

        } else {

        System.out.println("Jenis kegiatan tidak valid.");
        }

     }
        input.close();
    }
}
