import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input05.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = input05.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = input05.nextInt();
            input05.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input05.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        input05.close();
    }
}
