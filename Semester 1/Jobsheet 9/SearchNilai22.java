import java.util.Scanner;

public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            input.close();
            return;
        }

        int[] nilai = new int[jumlah];

        // Input isi array
        System.out.println("\n=== INPUT NILAI ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("\nMasukkan nilai yang dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        // Proses linear search
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key
                        + " ditemukan pada indeks ke-" + i);

                ditemukan = true;
                break;
            }
        }

        // Jika nilai tidak ditemukan
        if (!ditemukan) {
            System.out.println("Nilai yang dicari, yaitu " + key
                    + ", tidak ditemukan dalam array.");
        }

        input.close();
    }
}