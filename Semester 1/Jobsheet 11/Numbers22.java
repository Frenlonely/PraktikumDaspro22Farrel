import java.util.Arrays;

public class Numbers22 {
    public static void main(String[] args) {

        // Deklarasi jagged array dengan 3 baris
        int[][] myNumbers = new int[3][];

        // Menentukan panjang setiap baris
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Menampilkan isi setiap baris
        System.out.println("=== ISI ARRAY SETIAP BARIS ===");

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Baris ke-" + (i + 1) + ": "
                    + Arrays.toString(myNumbers[i]));
        }

        // Menampilkan array menggunakan Arrays.toString()
        System.out.println("\n=== ARRAYS.TOSTRING ===");
        System.out.println(Arrays.toString(myNumbers));

        // Menampilkan array menggunakan Arrays.deepToString()
        System.out.println("\n=== ARRAYS.DEЕPTOSTRING ===");
        System.out.println(Arrays.deepToString(myNumbers));

        // Menampilkan jumlah baris dan panjang setiap baris
        System.out.println("\n=== PANJANG ARRAY ===");
        System.out.println("Jumlah baris: " + myNumbers.length);

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1)
                    + ": " + myNumbers[i].length);
        }

        // Mengubah panjang baris pertama menjadi 7
        myNumbers[0] = new int[7];

        System.out.println("\n=== SETELAH BARIS PERTAMA DIUBAH ===");
        System.out.println("Jumlah baris: " + myNumbers.length);
        System.out.println("Panjang baris pertama: "
                + myNumbers[0].length);

        System.out.println(Arrays.deepToString(myNumbers));

        // Contoh penyalinan array 2 dimensi secara terpisah
        int[][] salinan = new int[myNumbers.length][];

        for (int i = 0; i < myNumbers.length; i++) {
            salinan[i] = myNumbers[i].clone();
        }

        // Mengubah isi array salinan
        salinan[0][0] = 99;

        System.out.println("\n=== PERBANDINGAN ARRAY ASLI DAN SALINAN ===");
        System.out.println("Array asli: " + Arrays.deepToString(myNumbers));
        System.out.println("Array salinan: " + Arrays.deepToString(salinan));
    }
}