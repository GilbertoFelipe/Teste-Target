import java.util.Scanner;

public class Teste02 {

    public static boolean quadradoPerfeito(int x) {
        int raiz = (int) Math.sqrt(x);
        return raiz * raiz == x;
    }

    public static boolean eFibonacci(int n) {
        return quadradoPerfeito(5 * n * n + 4) || quadradoPerfeito(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo, para verificar se pertence à série Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        if (eFibonacci(n)) {
            System.out.println(n + " pertence");

        } else {
            System.out.println(n + " não pertence");
        }

    }
}