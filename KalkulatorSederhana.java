import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan dua bilangan
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();

        // Memanggil metode sesuai dengan operasi yang dipilih
        switch (pilihan) {
            case 1:
                tambah(bilangan1, bilangan2);
                break;
            case 2:
                kurang(bilangan1, bilangan2);
                break;
            case 3:
                kali(bilangan1, bilangan2);
                break;
            case 4:
                bagi(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }

        scanner.close();
    }

    // Metode untuk operasi penjumlahan
    public static void tambah(double a, double b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
    }

    // Metode untuk operasi pengurangan
    public static void kurang(double a, double b) {
        System.out.println("Hasil pengurangan: " + (a - b));
    }

    // Metode untuk operasi perkalian
    public static void kali(double a, double b) {
        System.out.println("Hasil perkalian: " + (a * b));
    }

    // Metode untuk operasi pembagian
    public static void bagi(double a, double b) {
        if (b != 0) {
            System.out.println("Hasil pembagian: " + (a / b));
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        }
    }
}
