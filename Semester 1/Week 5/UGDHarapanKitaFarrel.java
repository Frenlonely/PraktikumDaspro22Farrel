import java.util.Scanner;

public class UGDHarapanKitaFarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat variabel untuk menyimpan data pasien
        double spo2, tekananDarah, suhu;
        int sisaBedICU, usia, lajuNapas;
        boolean sadar, komorbid;

        // Memasukkan data SpO2 pasien
        System.out.print("Masukkan SpO2 (%): ");
        spo2 = sc.nextDouble();

        // Memasukkan jumlah bed ICU yang tersedia
        System.out.print("Masukkan sisa bed ICU: ");
        sisaBedICU = sc.nextInt();

        // Memasukkan tekanan darah sistolik
        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        tekananDarah = sc.nextDouble();

        // Memasukkan kondisi kesadaran pasien
        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        sadar = sc.nextBoolean();

        // Memasukkan suhu tubuh pasien
        System.out.print("Masukkan suhu tubuh (C): ");
        suhu = sc.nextDouble();

        // Memasukkan apakah pasien memiliki riwayat komorbid
        System.out.print("Apakah pasien memiliki komorbid? (true/false): ");
        komorbid = sc.nextBoolean();

        // Memasukkan usia pasien
        System.out.print("Masukkan usia pasien: ");
        usia = sc.nextInt();

        // Memasukkan laju napas pasien
        System.out.print("Masukkan laju napas (kali/menit): ");
        lajuNapas = sc.nextInt();

        // Variabel untuk menyimpan lokasi perawatan
        String lokasi;

        // 1. SpO2 kurang dari 85% dan bed ICU masih tersedia
        if (spo2 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";

        // 2. SpO2 kurang dari 85% tetapi bed ICU sudah habis
        } else if (spo2 < 85 && sisaBedICU == 0) {
            lokasi = "UGD_VENTILATOR_MOBIL";

        // 3. Kondisi yang membutuhkan resusitasi UGD
        } else if ((spo2 >= 85 && spo2 <= 89)
                || tekananDarah < 90
                || tekananDarah > 180
                || !sadar) {
            lokasi = "RESUSITASI_UGD";

        // 4. SpO2 90-94% atau suhu >39 C,
        //    serta memiliki komorbid dan usia minimal 65 tahun
        } else if ((spo2 >= 90 && spo2 <= 94 || suhu > 39)
                && komorbid && usia >= 65) {
            lokasi = "HCU_ISOLASI";

        // 5. SpO2 90-94% atau laju napas lebih dari 24 kali/menit
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";

        // 6. Jika tidak memenuhi semua kondisi di atas
        } else {
            lokasi = "RAWAT_JALAN";
        }

        // Menampilkan lokasi perawatan pasien
        System.out.println("Lokasi perawatan: " + lokasi);

        // Menutup Scanner
        sc.close();
    }
}