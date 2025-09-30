import java.util.Scanner;

public class switchCetakKRS03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukkan Semester saat ini: ");
        int Semester = sc.nextInt();

        switch (Semester) {
            case 1:
                System.out.println("KRS Semester 1 Ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 Ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 Ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 Ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 Ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 Ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 Ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 Ditampilkan");
                break;
            default:
                System.out.println("Semester Tidak Ada");
                break;
        }
    }
}