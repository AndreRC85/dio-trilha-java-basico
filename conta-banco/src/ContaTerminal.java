import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Saldo: R$");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
