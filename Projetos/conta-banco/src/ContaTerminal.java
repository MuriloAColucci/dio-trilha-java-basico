import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Porfavor, informe os dados abaixo");
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();
        
        System.out.println("Digite seu número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
            + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
