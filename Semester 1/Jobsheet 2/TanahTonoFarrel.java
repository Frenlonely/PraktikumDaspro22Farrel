import java.util.Scanner;

public class TanahTonoFarrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float lebar, panjang, diameter, sisi;
        float luas_tanah, luas_kolam, luas_taman, luas_tidak_digunakan;
        float phi = 3.14f;

        System.out.print("Masukkan lebar tanah: ");
        lebar = scanner.nextFloat();

        System.out.print("Masukkan panjang tanah: ");
        panjang = scanner.nextFloat();

        System.out.print("Masukkan diameter kolam: ");
        diameter = scanner.nextFloat();

        System.out.print("Masukkan sisi taman bunga: ");
        sisi = scanner.nextFloat();

        luas_tanah = lebar * panjang;
        luas_kolam = phi * (diameter / 2) * (diameter / 2);
        luas_taman = sisi * sisi;

        luas_tidak_digunakan = luas_tanah - luas_kolam - luas_taman;

        System.out.println("Luas tanah: " + luas_tanah);
        System.out.println("Luas kolam: " + luas_kolam);
        System.out.println("Luas taman bunga: " + luas_taman);
        System.out.println("Luas tanah yang tidak digunakan: " + luas_tidak_digunakan);

        scanner.close();
    
    }
}