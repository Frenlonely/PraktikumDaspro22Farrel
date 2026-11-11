import java.util.Scanner;

public class Studikasus122Farrel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi dan inisialisasi variabel
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon = 0;
        int totalBayar;
        int kembalian;
        int kurang;

        // Input jumlah cup dan uang pembayaran
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        // Menghitung total harga
        totalHarga = jumlahCup * hargaPerCup;

        // Memeriksa apakah pembelian mendapatkan diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Menghitung total pembayaran
        totalBayar = totalHarga - diskon;

        // Menampilkan rincian pembayaran
        System.out.println("Total harga     : Rp " + totalHarga);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Total bayar     : Rp " + totalBayar);

        // Memeriksa kecukupan uang pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian       : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println(
                "Uang tidak cukup, kurang Rp " + kurang
            );
        }

        input.close();
    

    }
}
