package praticas;

import java.util.Scanner;

public class DeterminandoMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro Número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Segundo Número:");
        int segundoNumero = scanner.nextInt();

        System.out.println("Terceiro Número:");
        int terceiroNumero = scanner.nextInt();
        
        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O maior número é: " + segundoNumero);
        } else {
            System.out.println("O maior número é: " + terceiroNumero);
        }
    }
}
