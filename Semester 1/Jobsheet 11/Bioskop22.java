public class Bioskop22 {
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi array 2 dimensi
        String[][] penonton = {
            {"Amin", "Bena"},
            {"Candra", "Dela"},
            {"Eka", "Farhan"},
            {"Gisel", "Hana"}
        };

        // Menampilkan seluruh data penonton
        System.out.println("=== DAFTAR PENONTON BIOSKOP ===");

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1)
                    + ": " + String.join(", ", penonton[i]));
        }

        // Menampilkan jumlah baris dan kolom
        System.out.println("\n=== PANJANG ARRAY ===");
        System.out.println("Jumlah baris: " + penonton.length);

        // Menggunakan for loop
        System.out.println("\nPanjang setiap baris menggunakan for:");

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1)
                    + ": " + penonton[i].length);
        }

        // Menggunakan foreach loop
        System.out.println("\nPanjang setiap baris menggunakan foreach:");

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Menampilkan penonton pada baris ketiga menggunakan for
        System.out.println("\n=== PENONTON BARIS KETIGA ===");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Menampilkan penonton pada baris ketiga menggunakan foreach
        System.out.println("\nMenggunakan foreach:");

        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        // Menampilkan seluruh array menggunakan String.join()
        System.out.println("\n=== DAFTAR PENONTON SETIAP BARIS ===");

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris ke-" + (i + 1) + ": "
                    + String.join(", ", penonton[i]));
        }
    }
}