import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;


        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Unesite broj n:");
        Scanner unos = new Scanner(System.in);
        n = unos.nextInt();
        System.out.println("Brojevi od 1 do n koji su djeljivi sa sumom svojih cifara:");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}