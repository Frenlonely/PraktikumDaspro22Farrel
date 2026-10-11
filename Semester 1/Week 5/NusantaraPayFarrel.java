import java.util.Scanner;

public class NusantaraPayFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan data transaksi
        String statusAkun;
        double saldo, nominal;
        int jam;
        boolean isBedaNegara;

        // Memasukkan status akun
        System.out.print("Masukkan status akun: ");
        statusAkun = sc.nextLine();

        // Memasukkan jumlah saldo
        System.out.print("Masukkan saldo: ");
        saldo = sc.nextDouble();

        // Memasukkan nominal transaksi
        System.out.print("Masukkan nominal transaksi: ");
        nominal = sc.nextDouble();

        // Memasukkan jam transaksi
        System.out.print("Masukkan jam transaksi (0-23): ");
        jam = sc.nextInt();

        // Memasukkan apakah transaksi berasal dari negara berbeda
        System.out.print("Apakah transaksi dari negara berbeda? (true/false): ");
        isBedaNegara = sc.nextBoolean();

        // Variabel untuk menyimpan hasil status transaksi
        String status;

        // 1. Mengecek apakah akun masuk daftar hitam
        if (statusAkun.equals("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";

        // 2. Mengecek apakah nominal melebihi saldo
        } else if (nominal > saldo) {
            status = "REJECTED_SALDO";

        // 3. Mengecek apakah nominal melebihi limit harian 10.000
        } else if (nominal > 10000) {
            status = "REJECTED_LIMIT";

        // 4. Mengecek transaksi luar negeri dengan nominal di atas 2.000
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";

        // 5. Mengecek transaksi jam 00.00-04.00 dengan nominal di atas 1.000
        } else if (jam >= 0 && jam <= 4 && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";

        // 6. Mengecek akun suspicious dengan nominal di atas 500
        } else if (statusAkun.equals("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";

        // 7. Jika tidak memenuhi semua kondisi di atas
        } else {
            status = "APPROVED";
        }

        // Menampilkan status akhir transaksi
        System.out.println("Status transaksi: " + status);

        // Menutup Scanner
        sc.close();
    }
}