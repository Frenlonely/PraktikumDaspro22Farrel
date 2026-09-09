public class LogikaLulus {

    // Method untuk mengecek kelulusan berdasarkan p dan q
    public static boolean cekKelulusan(double nilaiUjian, double kehadiranPersen) {
        boolean p = nilaiUjian >= 60;
        boolean q = kehadiranPersen >= 80;

        boolean lulus = p && q;             // Ekspresi: p ∧ q
        boolean tidakLulus = !(p && q);     // Negasi:   ¬(p ∧ q)

        System.out.println("Nilai Ujian   : " + nilaiUjian + " -> p = " + p);
        System.out.println("Kehadiran (%) : " + kehadiranPersen + " -> q = " + q);
        System.out.println("Status        : " + (lulus ? "LULUS" : "TIDAK LULUS"));
        System.out.println("Cek ¬(p ∧ q)  : " + tidakLulus);
        System.out.println("----------------------------------------");
        return lulus;
    }

    public static void main(String[] args) {

        // ===== TRUTH TABLE =====
        System.out.println("=== TRUTH TABLE ===");
        System.out.printf("%-6s%-6s%-8s%-8s%n", "p", "q", "p∧q", "¬(p∧q)");
        boolean[] nilaiBoolean = {true, false};
        for (boolean p : nilaiBoolean) {
            for (boolean q : nilaiBoolean) {
                boolean pq = p && q;
                boolean negPq = !pq;
                System.out.printf("%-6s%-6s%-8s%-8s%n", p, q, pq, negPq);
            }
        }

        // ===== SIMULASI KASUS =====
        System.out.println("\n=== SIMULASI KASUS ===");
        cekKelulusan(75, 90);   // p=T, q=T -> Lulus
        cekKelulusan(50, 90);   // p=F, q=T -> Tidak lulus
        cekKelulusan(80, 60);   // p=T, q=F -> Tidak lulus
        cekKelulusan(40, 50);   // p=F, q=F -> Tidak lulus

        // ===== VERIFIKASI HUKUM DE MORGAN =====
        // ¬(p ∧ q) ekuivalen dengan ¬p ∨ ¬q
        System.out.println("\n=== VERIFIKASI HUKUM DE MORGAN ===");
        System.out.println("¬(p ∧ q)  ≡  ¬p ∨ ¬q ?");
        System.out.printf("%-6s%-6s%-10s%-10s%-8s%n", "p", "q", "¬(p∧q)", "¬p∨¬q", "Sama?");
        for (boolean p : nilaiBoolean) {
            for (boolean q : nilaiBoolean) {
                boolean kiri = !(p && q);
                boolean kanan = (!p) || (!q);
                System.out.printf("%-6s%-6s%-10s%-10s%-8s%n", p, q, kiri, kanan, (kiri == kanan));
            }
        }
    }
}