
import java.util.Scanner;
public class PenilaianHuruf {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Huruf: A");
        } else if (nilai >= 70) {
            System.out.println("Huruf: B");
        } else if (nilai >= 55) {
            System.out.println("Huruf: C");
        } else if (nilai >= 40) {
            System.out.println("Huruf: D");
        } else {
            System.out.println("Huruf: E");
        }

        input.close();
    }
}