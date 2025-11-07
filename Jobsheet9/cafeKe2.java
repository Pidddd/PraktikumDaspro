package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class cafeKe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        // Tampilkan menu
        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        // Input makanan yang dicari
        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = input.nextLine();

        // Proses pencarian 
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        System.out.println("\n=== HASIL PENCARIAN ===");
        if (ditemukan) {
            System.out.println("Menu \"" + cari + "\" tersedia di daftar (posisi ke-" + (posisi + 1) + ").");
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia di kafe.");
        }

        input.close();
    }
}
