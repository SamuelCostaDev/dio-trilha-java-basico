import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Seja Bem Vindo ao seu banco digital!");
        
        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();
        
        String verifique;
        while (true) {
            System.out.println("Por favor, verifique se o número da sua conta está correto (Sim/Não): " + conta);
            verifique = scanner.next();
            
            if (verifique.equalsIgnoreCase("Sim")) {
                System.out.println("Conta verificada com sucesso. Prossiga.");
                break; // Saia do loop, permitindo que o programa prossiga
            } else if (verifique.equalsIgnoreCase("Não")) {
                // Repetir a mensagem
                System.out.println("Por favor, verifique novamente o número da sua conta.");
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            }
        }
        
        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        
        while (true) {
            System.out.println("Por favor, verifique se o número da sua agência está correto (Sim/Não): " + agencia);
            verifique = scanner.next();
            
            if (verifique.equalsIgnoreCase("Sim")) {
                System.out.println("Agência verificada com sucesso. Prossiga.");
                break; // Saia do loop, permitindo que o programa prossiga
            } else if (verifique.equalsIgnoreCase("Não")) {
                // Repetir a mensagem
                System.out.println("Por favor, verifique novamente o número da sua agência123.");
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            }
        }
        
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        
        double saldo = Math.random() * 1000;

        saldo = Math.min(saldo, 1000);
        saldo = Math.round(saldo * 100.0) / 100.0;

        DecimalFormat decimalFormatado = new DecimalFormat("0.00");

        System.out.println("Olá " + nome + " obrigado por acessar nosso banco digital, sua agência é " + agencia + " conta de número " + conta + " e seu saldo dísponivel para saque é: R$" + decimalFormatado.format(saldo));
    }
}