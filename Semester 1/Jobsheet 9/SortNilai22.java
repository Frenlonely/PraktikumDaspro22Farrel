import java.util.Arrays;

public class SortNilai22 {
    public static void main(String[] args) {

        // Array nilai awal
        int[] nilai = {78, 65, 90, 55, 88, 72};

        System.out.println("Array sebelum diurutkan:");
        System.out.println(Arrays.toString(nilai));

        // Proses bubble sort descending
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan hasil pengurutan
        System.out.println("\nArray setelah diurutkan descending:");
        System.out.println(Arrays.toString(nilai));
    }
}