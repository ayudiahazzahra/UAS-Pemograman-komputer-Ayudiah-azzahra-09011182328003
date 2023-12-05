import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan bilangan bulat positif yang akan difaktorisasi
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan faktorisasi bilangan
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        scanner.close();
    }

    // Fungsi untuk memfaktorisasi bilangan dan menampilkannya
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
