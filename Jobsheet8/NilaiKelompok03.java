package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class NilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, nilai;
        float totalNilai = 0, rataNilai;

        // Tambahan variabel untuk mencari nilai tertinggi
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata " + rataNilai);

            // Cek apakah nilai rata-rata saat ini lebih tinggi dari sebelumnya
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println();
        System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah Kelompok "
                + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);

        sc.close();
    }
}
