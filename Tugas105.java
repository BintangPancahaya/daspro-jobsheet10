import java.util.Scanner;
public class Tugas105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[][] = new int [10][6];
        int i=0, j=0;
        double jml = 0, jmlSem = 0;

        for (i=0;i<a.length;i++) {
            for (j=0;j<a[0].length;j++) {
                System.out.print("Input pertanyaan responden "+(i+1)+": ");
                a[i][j] = input.nextInt();
            }
        }
        for (i=0;i<a.length;i++) {
            jmlSem = 0;
            for (j=0;j<a[0].length;j++) {
                jmlSem += a[i][j];
            }
            jml += jmlSem;
            System.out.println("Rata-rata responden "+(i+1) +": "+ jmlSem/6);
        }
        for (i=0;i<a[0].length;i++) {
            jmlSem = 0;
            for (j=0;j<10;j++) {
                jmlSem += a[j][i];
            }
            System.out.println("Rata-rata pertanyaan "+(i+1)+": " + jmlSem/10);
        }
        System.out.println("Rata-rata keseluruhannya: " + jml/60);
        input.close();
    }
}
