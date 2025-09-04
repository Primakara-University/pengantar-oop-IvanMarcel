import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        System.out.println("Selamat datang di Java, " + nama + "!");

        scanner.close();
    }
}