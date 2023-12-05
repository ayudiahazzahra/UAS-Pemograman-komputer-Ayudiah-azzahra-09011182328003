import java.util.Scanner;

public class AutentikasiPengguna {
    public static void main(String[] args) {
        // Nilai username dan password yang telah ditentukan
        String usernameYangBenar = "ayudiahazzahra";
        String passwordYangBenar = "100106";

        // Memasukkan username dan password dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai dengan nilai yang telah ditentukan
        if (usernameInput.equals(usernameYangBenar) && passwordInput.equals(passwordYangBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }
}

