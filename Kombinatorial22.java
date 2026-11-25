import java.util.Scanner;

public class Kombinatorial22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = sc.nextLine();

        int n = input.length();
        int[] frekuensi = new int[65536];

        for (int i = 0; i < n; i++) {
            frekuensi[input.charAt(i)]++;
        }

        long pembilang = 1;
        long penyebut = 1;
        for (int i = 1; i <= n; i++) {
            pembilang *= i;
        }
        for (int i = 0; i < frekuensi.length; i++) {
            long faktorial = 1;

            for (int j = 1; j <= frekuensi[i]; j++) {
                faktorial *= j;
            }

            penyebut *= faktorial;
        }
        System.out.println("Jumlah string berbeda: "
                + (pembilang / penyebut));

        sc.close();
    }
}
