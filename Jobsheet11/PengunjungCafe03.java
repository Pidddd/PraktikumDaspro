package PraktikumDaspro.Jobsheet11;

public class PengunjungCafe03 {
    static void daftarPengunjung(String... var0) {
        System.out.println("Daftar Nama Pengunjung:");

        for (int var1 = 0; var1 < var0.length; ++var1) {
            System.out.println("- " + var0[var1]);
        }
    }

    public static void main(String[] var0) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "eti", "fahmi", "galih");
    }
}