package praticas;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Para saber qual dia da semana ele representa..." +
                "\nEscolha um número de 1 a 7:");
            numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4: 
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Número inválido" +
                        "\nEscolha um número de 1 a 7:");
                    break;
            }
        } while (numero < 1 || numero > 7);
    }
}
