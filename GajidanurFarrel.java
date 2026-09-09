import java.util.Scanner;

public class GajidanurFarrel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== PROGRAM CEK KELULUSAN MAHASISWA =====");
        // Input nilai
        System.out.print("Masukkan nilai mahasiswa (0-100) : ");
        double nilai = input.nextDouble();
        // Input kehadiran
        System.out.print("Masukkan kehadiran (0-100%)      : ");
        double kehadiran = input.nextDouble();
        // Definisi proposisi
        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;
        // Kondisi lulus
        boolean lulus = p && q;
        // Kondisi tidak lulus menggunakan De Morgan
        boolean tidakLulusDeMorgan = !p || !q;

        System.out.println("\n========== HASIL ==========");

        System.out.println("Nilai                 : " + nilai);
        System.out.println("Kehadiran             : " + kehadiran + "%");
        System.out.println("p (nilai >= 60)       : " + p);
        System.out.println("q (kehadiran >= 80%)  : " + q);

        if (lulus) {
            System.out.println("Status                : LULUS");
        } else {
            System.out.println("Status                : TIDAK LULUS");
        }

        System.out.println("Tidak lulus menurut De Morgan : " 
                           + tidakLulusDeMorgan);

        input.close();
    }
}