import java.util.Stack;

public class PemeriksaKurung {
    public static void main(String[] args) {
        String ekspresi1 = "(2 + 3) * (5 - 4)";
        String ekspresi2 = "((7 / 2) + 4) * (3 - 1)";

        if (cekUrutanKurung(ekspresi1)) {
            System.out.println("Urutan kurung pada ekspresi 1 benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi 1 salah.");
        }

        if (cekUrutanKurung(ekspresi2)) {
            System.out.println("Urutan kurung pada ekspresi 2 benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi 2 salah.");
        }
    }

    // Metode untuk memeriksa urutan kurung
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(') {
                stack.push(karakter);
            } else if (karakter == ')') {
                // Jika stack kosong atau karakter terakhir dalam stack bukan kurung buka, urutan salah
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        // Jika stack masih berisi kurung buka, urutan salah
        return stack.isEmpty();
    }
}
