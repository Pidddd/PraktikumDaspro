package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class kopiSenja03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlCabang = 0, jmlPelanggan = 0, item = 0;
        int i = 0, j = 0;
        int totalItemCabang = 0, totalSeluruhPelanggan = 0, totalSeluruhItem = 0;

        // Input jumlah cabang
        System.out.print("Jumlah cabang kafe: ");
        jmlCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        // Perulangan untuk setiap cabang
        for (i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            jmlPelanggan = sc.nextInt();

            // Reset total item untuk cabang baru
            totalItemCabang = 0;

            // Input data setiap pelanggan
            for (j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                item = sc.nextInt();
                totalItemCabang += item;
            }

            // Tampilkan hasil per cabang
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            // Akumulasi total keseluruhan
            totalSeluruhPelanggan += jmlPelanggan;
            totalSeluruhItem += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem + " item");

        sc.close();
    }
}
