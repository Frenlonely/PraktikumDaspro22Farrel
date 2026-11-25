import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array bioskop dengan 4 baris dan 2 kolom
        String[][] penonton = new String[4][2];

        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("\n===== MENU BIOSKOP MINI =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    String nama;
                    int baris, kolom;

                    System.out.println("\n=== INPUT DATA PENONTON ===");

                    // Memasukkan data penonton
                    while (true) {
                        System.out.print("Masukkan nama penonton: ");
                        nama = sc.nextLine();

                        System.out.print("Masukkan nomor baris (1-4): ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan nomor kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        // Validasi baris dan kolom
                        if (baris < 1 || baris > penonton.length
                                || kolom < 1
                                || kolom > penonton[baris - 1].length) {

                            System.out.println("Nomor baris atau kolom tidak tersedia!");
                            continue;
                        }

                        // Mengecek apakah kursi sudah terisi
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah ditempati penonton lain!");
                            System.out.println("Silakan pilih kursi yang berbeda.");
                            continue;
                        }

                        // Menyimpan nama penonton
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.println("Data penonton berhasil disimpan!");

                        break;
                    }
                    break;

                case 2:
                    // Menampilkan daftar penonton
                    System.out.println("\n=== DAFTAR KURSI BIOSKOP ===");

                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i + 1) + ": ");

                        for (int j = 0; j < penonton[i].length; j++) {

                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);
                            }

                            System.out.print("\t");
                        }

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);

        sc.close();
    }
}