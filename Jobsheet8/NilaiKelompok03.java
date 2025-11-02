package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class NilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, nilai;
        float totalNilai = 0, rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.err.println("kelompok " + i + " : nilai rata-rata " + rataNilai);
            i++;
        }
        sc.close();
    }
}