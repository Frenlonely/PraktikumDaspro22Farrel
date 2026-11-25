import java.util.Scanner;

public class PemesananKafe22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu dan harga
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };

        // Menampilkan daftar menu
        System.out.println("========== MENU KAFE KAMPUS ==========");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]
                    + " - Rp" + harga[i]);
        }

        // Fitur pencarian menu
        System.out.print("\nMasukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();

        int indeks = -1;

        // Linear search
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                indeks = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (indeks != -1) {
            System.out.println("Menu ditemukan: " + menu[indeks]);
            System.out.println("Harga: Rp" + harga[indeks]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        // Input jumlah item pesanan
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Validasi jumlah pesanan
        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
            input.close();
            return;
        }

        // Array untuk menyimpan pesanan
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        int total = 0;

        // Proses pemesanan
        for (int i = 0; i < jumlah; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-"
                        + (i + 1) + ": ");

                String nama = input.nextLine();

                // Mencari dan memvalidasi menu
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];

                        total += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println(
                            "Menu tidak tersedia. Silakan masukkan kembali."
                    );
                }
            }
        }

        // Menampilkan nota pembelian
        System.out.println("\n========== NOTA PEMBELIAN ==========");
        System.out.println("No.  Nama Menu             Harga");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ".   "
                    + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("------------------------------------");
        System.out.println("Total pembayaran: Rp" + total);
        System.out.println("====================================");
        System.out.println("Terima kasih telah memesan!");

        input.close();
    }
}