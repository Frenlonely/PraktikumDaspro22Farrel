import java.util.Scanner;

public class BiayaCetakFarrel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int hargaCetak = 500;
        int biayaJilid = 5000;
        int biayaCetak;
        int totalBiaya;

        System.out.print("Masukkan jumlah lembar: ");
        jumlahLembar = sc.nextInt();

        biayaCetak = jumlahLembar * hargaCetak;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Jumlah lembar : " + jumlahLembar);
        System.out.println("Biaya cetak   : Rp " + biayaCetak);
        System.out.println("Biaya jilid   : Rp " + biayaJilid);
        System.out.println("Total biaya   : Rp " + totalBiaya);

    }
}