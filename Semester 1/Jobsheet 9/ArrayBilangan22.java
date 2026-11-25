// Mengimpor library Arrays untuk menampilkan isi array
import java.util.Arrays;

public class ArrayBilangan22 {
    public static void main(String[] args) {

        // Membuat array integer dengan kapasitas 4 elemen
        int[] bil = new int[4];

        // Mengisi masing-masing elemen array
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // Menampilkan array menggunakan perulangan for
        System.out.println("Menampilkan menggunakan For:");

        for (int i = 0; i < bil.length; i++) {

            // Menampilkan indeks dan nilai array
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // Menampilkan array menggunakan foreach
        System.out.println("\nMenampilkan menggunakan Foreach:");

        for (int nilai : bil) {

            // Menampilkan setiap nilai dalam array
            System.out.println(nilai);
        }

        // Menampilkan seluruh isi array menggunakan Arrays.toString()
        System.out.println("\nMenampilkan menggunakan Arrays.toString():");
        System.out.println(Arrays.toString(bil));

        // Contoh inisialisasi array secara langsung
        int[] angka = {5, 13, -7, 17};

        // Menampilkan array hasil inisialisasi langsung
        System.out.println("\nArray hasil inisialisasi langsung:");
        System.out.println(Arrays.toString(angka));
    }
}