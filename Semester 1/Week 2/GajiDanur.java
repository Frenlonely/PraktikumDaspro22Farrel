import java.util.Scanner;

public class GajiDanur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gaji_pokok, tunjangan_anak, potongan_pensiun, gaji_bersih;
        int jumlah_anak;

        System.out.print("Masukkan gaji pokok: ");
        gaji_pokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan anak per anak: ");
        tunjangan_anak = sc.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlah_anak = sc.nextInt();

        potongan_pensiun = 0.10 * gaji_pokok;

        gaji_bersih = gaji_pokok
                    + (tunjangan_anak * jumlah_anak)
                    - potongan_pensiun;

        System.out.println("Potongan dana pensiun: " + potongan_pensiun);
        System.out.println("Tunjangan anak: " + (tunjangan_anak * jumlah_anak));
        System.out.println("Gaji bersih: " + gaji_bersih);
    }
}