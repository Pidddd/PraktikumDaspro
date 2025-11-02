package PraktikumDaspro.Jobsheet8;

import java.util.Scanner;

public class kuadratBersarang03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKuadrat = 0;
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int O = 1; O <= n; O++) {
            System.out.print("n = " + O + " → jumlah kuadrat = ");
            for (int I = 1; I <= O; I++) {
                jumlahKuadrat += I * I;
                System.out.print(I * I);
                if (I < O)
                    System.out.print(" + ");
            }
            System.out.println(" = " + jumlahKuadrat);
        }

        sc.close();
    }
}
