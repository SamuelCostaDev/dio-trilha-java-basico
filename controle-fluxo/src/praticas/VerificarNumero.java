package praticas;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digíte um número para saber se ele é falso ou positivo:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O numero é positivo");
        }
    }
}
