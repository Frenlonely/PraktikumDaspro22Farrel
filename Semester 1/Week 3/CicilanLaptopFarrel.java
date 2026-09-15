import java.util.Scanner;

public class CicilanLaptopFarrel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hargaLaptop;
        double uangMuka;
        int jumlahBulan;
        double sisaHarga;
        double bunga;
        double pokokCicilan;
        double cicilanPerBulan;

        System.out.print("Masukkan harga laptop: Rp ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukkan uang muka: Rp ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan jumlah bulan cicilan: ");
        jumlahBulan = sc.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bunga = 0.02 * sisaHarga;
        pokokCicilan = sisaHarga / jumlahBulan;
        cicilanPerBulan = pokokCicilan + bunga;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Sisa harga          : Rp " + sisaHarga);
        System.out.println("Bunga per bulan     : Rp " + bunga);
        System.out.println("Pokok per bulan     : Rp " + pokokCicilan);
        System.out.println("Cicilan per bulan   : Rp " + cicilanPerBulan);

    }
}