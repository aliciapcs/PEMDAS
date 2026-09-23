import java.util.Scanner;
public class CheckDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan status member: ");
        String status = input.nextLine();

        if (status.equalsIgnoreCase("GOLD")) {
            System.out.println("Diskon: 20%");
        } else if (status.equalsIgnoreCase("SILVER")) {
            System.out.println("Diskon: 15%");
        } else if (status.equalsIgnoreCase("BRONZE")) {
            System.out.println("Diskon: 10%");
        } else {
            System.out.println("Diskon: 0%");
        }

        input.close();
    }
}

