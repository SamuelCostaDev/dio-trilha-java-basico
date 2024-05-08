import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
       // Criando o objeto Scanner
       Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome:");
       String nome = scanner.next();

       System.out.println("Digite seu sobrenome:");
       String sobrenome = scanner.next();

       int idade;
        while (true) {
            System.out.println("Digite sua idade:");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro: idade deve ser um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }


       System.out.println("Digite sua altura:");
       double altura = scanner.nextDouble();

       //Imprimindo os dados obitidos pelo usuario

       System.out.println("Olá, me chamo " + nome + " " + sobrenome);
       System.out.println("Tenho " + idade + " anos ");
       System.out.println("Minha altura é " + altura + "cm ");
    }
}