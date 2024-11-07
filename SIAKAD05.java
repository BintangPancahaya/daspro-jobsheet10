import java.util.Scanner;
public class SIAKAD05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int siswa, matkul;

        System.out.print("Masukkan jumlah siswa: ");
        siswa = input05.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        matkul = input05.nextInt();


        int[][] nilai = new int[siswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input05.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/nilai[0].length);
        }
        System.out.println("\n==============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/nilai.length);
        }
        input05.close();
    }
}
