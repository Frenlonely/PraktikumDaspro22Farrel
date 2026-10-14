
/*
STUDI KASUS:

Seorang pemilik toko handphone online menjual tiga jenis
produk, yaitu handphone, kabel, dan earphone.

Setiap produk memiliki harga jual, harga beli, biaya
pengiriman, biaya pengemasan, diskon, faktor risiko
kerusakan, serta jumlah barang yang terjual.

Program dibuat untuk menghitung:
1. Keuntungan dari setiap jenis produk.
2. Total keuntungan seluruh produk.
3. Rata-rata keuntungan per item.
4. Persentase pencapaian target keuntungan.

Rumus:
Keuntungan per item =
Harga jual - Harga beli - Biaya pengiriman
- Biaya pengemasan - Diskon

Jumlah item penghitung keuntungan =
Jumlah terjual - (Risiko kerusakan / 100
* Jumlah terjual)

Keuntungan produk =
Keuntungan per item * Jumlah item penghitung keuntungan

Total keuntungan =
Keuntungan handphone + Keuntungan kabel
+ Keuntungan earphone

Rata-rata keuntungan =
Total keuntungan / Total item penghitung keuntungan

Persentase pencapaian target =
Total keuntungan / Target keuntungan * 100%

Materi yang digunakan:
1. Struktur dasar Java.
2. Variabel dan tipe data.
3. Input, output, dan operator aritmatika.
*/


import java.util.Scanner;

public class Catatanquiz1 {
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Menyimpan total keuntungan dan jumlah item
        double totalKeuntungan = 0;
        double totalItem = 0;

        // Input target keuntungan
        System.out.print("Target keuntungan: Rp");
        double target = input.nextDouble();

        // Input data handphone
        System.out.println("\n=== DATA HANDPHONE ===");
        System.out.print("Harga jual: ");
        double jual1 = input.nextDouble();
        System.out.print("Harga beli: ");
        double beli1 = input.nextDouble();
        System.out.print("Biaya pengiriman: ");
        double kirim1 = input.nextDouble();
        System.out.print("Biaya pengemasan: ");
        double kemas1 = input.nextDouble();
        System.out.print("Diskon: ");
        double diskon1 = input.nextDouble();
        System.out.print("Risiko kerusakan (%): ");
        double risiko1 = input.nextDouble();
        System.out.print("Jumlah terjual: ");
        int jumlah1 = input.nextInt();

        // Menghitung keuntungan handphone
        double perItem1 = jual1 - beli1 - kirim1
                          - kemas1 - diskon1;
        double item1 = jumlah1 - risiko1 / 100 * jumlah1;
        double untung1 = perItem1 * item1;

        // Input data kabel
        System.out.println("\n=== DATA KABEL ===");
        System.out.print("Harga jual: ");
        double jual2 = input.nextDouble();
        System.out.print("Harga beli: ");
        double beli2 = input.nextDouble();
        System.out.print("Biaya pengiriman: ");
        double kirim2 = input.nextDouble();
        System.out.print("Biaya pengemasan: ");
        double kemas2 = input.nextDouble();
        System.out.print("Diskon: ");
        double diskon2 = input.nextDouble();
        System.out.print("Risiko kerusakan (%): ");
        double risiko2 = input.nextDouble();
        System.out.print("Jumlah terjual: ");
        int jumlah2 = input.nextInt();

        // Menghitung keuntungan kabel
        double perItem2 = jual2 - beli2 - kirim2
                          - kemas2 - diskon2;
        double item2 = jumlah2 - risiko2 / 100 * jumlah2;
        double untung2 = perItem2 * item2;

        // Input data earphone
        System.out.println("\n=== DATA EARPHONE ===");
        System.out.print("Harga jual: ");
        double jual3 = input.nextDouble();
        System.out.print("Harga beli: ");
        double beli3 = input.nextDouble();
        System.out.print("Biaya pengiriman: ");
        double kirim3 = input.nextDouble();
        System.out.print("Biaya pengemasan: ");
        double kemas3 = input.nextDouble();
        System.out.print("Diskon: ");
        double diskon3 = input.nextDouble();
        System.out.print("Risiko kerusakan (%): ");
        double risiko3 = input.nextDouble();
        System.out.print("Jumlah terjual: ");
        int jumlah3 = input.nextInt();

        // Menghitung keuntungan earphone
        double perItem3 = jual3 - beli3 - kirim3
                          - kemas3 - diskon3;
        double item3 = jumlah3 - risiko3 / 100 * jumlah3;
        double untung3 = perItem3 * item3;

        // Menghitung total keuntungan dan total item
        totalKeuntungan = untung1 + untung2 + untung3;
        totalItem = item1 + item2 + item3;

        // Menghitung rata-rata keuntungan per item
        double rataRata = totalKeuntungan / totalItem;

        // Menghitung persentase pencapaian target
        double persentase = totalKeuntungan / target * 100;

        // Menampilkan keuntungan setiap produk
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Keuntungan handphone: Rp" + untung1);
        System.out.println("Keuntungan kabel: Rp" + untung2);
        System.out.println("Keuntungan earphone: Rp" + untung3);

        // Menampilkan hasil keseluruhan
        System.out.println("Total keuntungan: Rp" + totalKeuntungan);
        System.out.println("Total item: " + totalItem);
        System.out.println("Rata-rata keuntungan: Rp" + rataRata);
        System.out.println("Pencapaian target: " + persentase + "%");

        // Menutup Scanner
        input.close();
    }
}
