import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input nama dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Menampilkan output
        System.out.println("Selamat datang di Java, " + nama + "!");

        scanner.close();
    }
}