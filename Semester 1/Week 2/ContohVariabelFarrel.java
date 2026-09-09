public class ContohVariabelFarrel {
    public static void main(String[] args) {
        String SalahSatuHobbySayaAdalah = "Bermain Petak Umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 19;
        double ipk = 3.75, tinggi= 1.72;
        System.out.println(SalahSatuHobbySayaAdalah);
        System.out.println(" Apakah pandai? " +isPandai);
        System.out.println(" Jenis kelamin: " + jenisKelamin);
        System.out.println(" Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}