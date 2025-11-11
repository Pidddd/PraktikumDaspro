package PraktikumDaspro.Jobsheet10;

public class Bioskop03 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length); // Pertanyaan 4
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        for (int i = 0; i < penonton.length; i++) { // Pertanyaan 5
            System.out.println("Baris ke-" + i + " panjangnya: " + penonton[i].length);
        }

        for (String[] baris : penonton) { // Pertanyaan 6
            System.out.println("Panjang baris: " + baris.length);
        }

        for (int i = 0; i < penonton[2].length; i++) { // Pertanyaan 7
            System.out.println(penonton[2][i]);
        }

        System.out.println("Penonton pada baris ke-3: "); // Pertanyaan 8
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        for (int i = 0; i < penonton.length; i++) { //Pertanyaan 9
            System.out.println("Penonton pada baris ke-" + (i + 1) + ":" + String.join(", ", penonton[i]));
        }

    }

}
