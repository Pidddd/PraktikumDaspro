package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class kopiSenja03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalItemCabang = 0;
        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;

        System.out.print("Masukkan jumlah cabang: ");
        int jmlCabang = sc.nextInt();

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\nCabang ke-" + i);
            System.out.print("Masukkan jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Total item terjual di cabang ke-" + i + ": " + totalItemCabang);

            totalSeluruhPelanggan += jmlPelanggan;
            totalSeluruhItem += totalItemCabang;
        }

        System.out.println("\n=== RINGKASAN PENJUALAN ===");
        System.out.println("Total seluruh pelanggan: " + totalSeluruhPelanggan);
        System.out.println("Total seluruh item terjual: " + totalSeluruhItem);

        sc.close();
    }
}
