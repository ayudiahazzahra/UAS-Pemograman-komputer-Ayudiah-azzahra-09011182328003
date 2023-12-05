import java.util.Scanner;

public class KelolaAkun {
    public static void main(String[] args) {
        // Membuat objek akun
        AkunPengguna akun1 = new AkunPengguna("ayudiahazzahra", "100106");
        AkunPengguna akun2 = new AkunPengguna("dimasarya", "311004");

        // Menampilkan informasi akun
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();

        // Mengaktifkan atau menonaktifkan akun
        akun1.aktifkanAkun();
        akun2.nonaktifkanAkun();

        // Menampilkan informasi akun setelah perubahan
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();
    }

    // Kelas untuk merepresentasikan akun pengguna
    private static class AkunPengguna {
        String username;
        String password;
        boolean aktif; // Menandakan apakah akun aktif atau nonaktif

        public AkunPengguna(String username, String password) {
            this.username = username;
            this.password = password;
            this.aktif = false; // Saat akun dibuat, diasumsikan nonaktif
        }

        // Metode untuk menampilkan informasi akun
        public void tampilkanInformasi() {
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
            System.out.println();
        }

        // Metode untuk mengaktifkan akun
        public void aktifkanAkun() {
            aktif = true;
            System.out.println("Akun berhasil diaktifkan.");
        }

        // Metode untuk menonaktifkan akun
        public void nonaktifkanAkun() {
            aktif = false;
            System.out.println("Akun berhasil dinonaktifkan.");
        }
    }
}
