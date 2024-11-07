import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        System.out.println("=========== Pilih Menu ==============");
        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Menampilkan daftar penonton");
        System.out.println("Menu 3: Exit");

        for (int i=0; i <= i; i++) {
        System.out.print("Masukkan angka 1-3 untuk memilih menu: ");
        int angka = input05.nextInt();

            if (angka == 1) {
                input05.nextLine();
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = input05.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input05.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input05.nextInt();
                        input05.nextLine();

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Warning: Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = input05.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (angka == 2) {
                System.out.println("====== Data Penonton ======");
                for (int j = 0; j < penonton.length; j++) {
                    for (int k = 0; k < penonton[0].length; k++) {
                        if (penonton[j][k] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[j][k] + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (angka == 3) {
                System.out.println("Keluar dari menu!");
                break;

            } else {
                System.out.println("Input invalid! Harap input lagi!");
            }
        }
        input05.close();
    }
}
