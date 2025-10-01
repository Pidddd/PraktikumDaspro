import java.util.Scanner;

public class sistemPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ktm, registrasi;

        System.out.print("Apakah membawa KTM? (true/false): ");
        ktm = sc.nextBoolean();

        System.out.print("Apakah sudah Registrasi? (true/false): ");
        registrasi = sc.nextBoolean();

        if (ktm || registrasi) {
            System.out.println("\nSilahkan Masuk");
        } else {
            System.out.println("Dilarang Masuk");
        }

        sc.close();
    }
}
