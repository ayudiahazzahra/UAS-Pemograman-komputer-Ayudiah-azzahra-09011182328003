import java.util.Scanner;

public class Tokoonline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah barang yang dibeli oleh pelanggan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Memasukkan harga per barang
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();

        // Menghitung total harga sebelum diskon
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Menghitung diskon berdasarkan jumlah pembelian
        double diskon = 0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1; // Diskon 10%
        } else if (jumlahBarang > 20) {
            diskon = 0.2; // Diskon 20%
        }

        // Menghitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

        scanner.close();
    }
}