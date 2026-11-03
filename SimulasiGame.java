//Nama : MUhammad Farrel Sarona
//Kelas : 1D / 22
//Nim : 264107020028


import java.util.Scanner;

public class SimulasiGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int damage = 0;
        int pilihanSenjata, pilihanLokasi;
        int hp = 100;
        double totalDamage = 0;

        System.out.println("=== GAME SIMULASI DAMAGE ===");
        System.out.println("Pilih Senjata:");
        System.out.println("1. SMG (25 Damage)");
        System.out.println("2. AR (35 Damage)");
        System.out.println("3. Sniper (90 Damage)");
        System.out.print("Masukkan pilihan: ");
        pilihanSenjata = input.nextInt();

        // Menentukan damage senjata
        switch (pilihanSenjata) {
            case 1:
                damage = 25;
                System.out.println("Senjata: SMG");
                break;

            case 2:
                damage = 35;
                System.out.println("Senjata: AR");
                break;

            case 3:
                damage = 90;
                System.out.println("Senjata: Sniper");
                break;

            default:
                System.out.println("Pilihan senjata tidak valid!");
                input.close();
                return;
        }

        System.out.println("\nPilih Lokasi Tembakan:");
        System.out.println("1. Badan");
        System.out.println("2. Kepala");
        System.out.print("Masukkan pilihan: ");
        pilihanLokasi = input.nextInt();

        // Menghitung damage berdasarkan lokasi
        if (pilihanLokasi == 1) {

            // Bonus damage badan 20%
            double bonus = damage * 0.20;
            double damageBonus = damage + bonus;

            // Pengurangan rompi 30%
            double rompi = damageBonus * 0.30;

            totalDamage = damageBonus - rompi;

            System.out.println("\nLokasi: Badan");
            System.out.println("Damage awal: " + damage);
            System.out.println("Bonus badan: " + bonus);
            System.out.println("Pengurangan rompi: " + rompi);

        } else if (pilihanLokasi == 2) {

            System.out.println("\nLokasi: Kepala");

            if (pilihanSenjata == 3) {
                totalDamage = hp;
                System.out.println("Sniper Headshot!");
                System.out.println("Target langsung mati!");
            } else {
                totalDamage = damage * 2;
                System.out.println("Damage Headshot: " + totalDamage);
            }

        } else {
            System.out.println("Pilihan lokasi tidak valid!");
            input.close();
            return;
        }

        // Menampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total Damage: " + totalDamage);

        hp = hp - (int) Math.ceil(totalDamage);

        if (hp <= 0) {
            hp = 0;
            System.out.println("Status: Target Mati!");
        } else {
            System.out.println("Sisa HP Target: " + hp);
            System.out.println("Status: Target Masih Hidup!");
        }

        input.close();
    }
}
