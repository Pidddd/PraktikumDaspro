import java.util.Scanner;

public class flowchartTGS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Ganjil atau Genap ---");
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        sc.close();
    }
}