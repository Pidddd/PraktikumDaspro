import java.util.Scanner;

public class ifElseCetakKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan Semester saat ini: ");
        int Semester = sc.nextInt();

        if (Semester == 1) {
            System.out.println("KRS Semester 1 Ditampilkan");
        } else if (Semester == 2) {
            System.out.println("KRS Semester 2 Ditampilkan");
        } else if (Semester == 3) {
            System.out.println("KRS Semester 3 Ditampilkan");
        } else if (Semester == 4) {
            System.out.println("KRS Semester 4 Ditampilkan");
        } else if (Semester == 5) {
            System.out.println("KRS Semester 5 Ditampilkan");
        } else if (Semester == 6) {
            System.out.println("KRS Semester 6 Ditampilkan");
        } else if (Semester == 7) {
            System.out.println("KRS Semester 7 Ditampilkan");
        } else if (Semester == 8) {
            System.out.println("KRS Semester 8 Ditampilkan");
        } else {
            System.out.println("Semester Tidak Ada");
        }
    }
}
