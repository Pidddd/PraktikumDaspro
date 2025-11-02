package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class persegiAngka03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    // untuk bagian yang kosong ditengah
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
