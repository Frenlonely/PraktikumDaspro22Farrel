//Muhammad Farrel Sarona-1D-22
//Nim : 264107020028
import java.util.Scanner;

public class KeuntunganProdukFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga_jual_handphone = 4000000;
        int harga_jual_kabel = 100000;
        int harga_jual_earphone = 300000;

        int harga_beli_handphone = 3000000;
        int harga_beli_kabel = 50000;
        int harga_beli_earphone = 100000;

        int biaya_pengiriman = 15000;
        int biaya_pengemasan = 5000;

        double diskon_handphone = 0.05;
        double diskon_kabel = 0.03;
        double diskon_earphone = 0.03;

        int jumlah_terjual_handphone;
        int jumlah_terjual_kabel;
        int jumlah_terjual_earphone;

        // Memasukkan jumlah barang terjual
        System.out.println("Masukkan jumlah terjual handphone:");
        jumlah_terjual_handphone = sc.nextInt();

        System.out.println("Masukkan jumlah terjual kabel:");
        jumlah_terjual_kabel = sc.nextInt();

        System.out.println("Masukkan jumlah terjual earphone:");
        jumlah_terjual_earphone = sc.nextInt();

        // Menghitung keuntungan per produk
        int keuntungan_HP = (int) ((harga_jual_handphone * (1 - diskon_handphone))
                - (harga_beli_handphone + biaya_pengiriman + biaya_pengemasan));

        int keuntungan_kabel = (int) ((harga_jual_kabel * (1 - diskon_kabel))
                - (harga_beli_kabel + biaya_pengiriman + biaya_pengemasan));

        int keuntungan_earphone = (int) ((harga_jual_earphone * (1 - diskon_earphone))
                - (harga_beli_earphone + biaya_pengiriman + biaya_pengemasan));

        // Menghitung keuntungan total
        int keuntungan_total =
                (keuntungan_HP * jumlah_terjual_handphone)
                + (keuntungan_kabel * jumlah_terjual_kabel)
                + (keuntungan_earphone * jumlah_terjual_earphone);

        System.out.println("Keuntungan HP per item = " + keuntungan_HP);
        System.out.println("Keuntungan Kabel per item = " + keuntungan_kabel);
        System.out.println("Keuntungan Earphone per item = " + keuntungan_earphone);
        System.out.println("Keuntungan Total = " + keuntungan_total);

        sc.close();
    }
}