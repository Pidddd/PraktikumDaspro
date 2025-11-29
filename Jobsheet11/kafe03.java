package PraktikumDaspro.Jobsheet11;

import java.util.Scanner;

public class kafe03 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo diterima, berikan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo diterima, berikan diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("======== ==");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga03(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Diskon 50% diterapkan");
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Diskon 30% diterapkan");
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("andi", true, "DISKON30");

        int totalKeseluruhan = 0;
        char ulang;

        do {
            System.out.print("Masukkan nomor menu: ");
            int menu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int jumlah = sc.nextInt();

            System.out.print("Masukkan kode promo: ");
            String kode = sc.next();

            int total = hitungTotalHarga03(menu, jumlah, kode);
            totalKeseluruhan += total;

            System.out.print("Apakah ingin menambah pesanan? y atau n: ");
            ulang = sc.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total keseluruhan pesanan adalah Rp" + totalKeseluruhan);

        sc.close();
    }

}
