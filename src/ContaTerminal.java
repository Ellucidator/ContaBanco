import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite a agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        scanner.nextLine();
        String clienteNome =scanner.nextLine() ;

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();
        NumberFormat formatarMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Olá, " + clienteNome + " obrigado por criar uma conta em nosso banco," +
                            " sua agência é " + agencia + "," +
                            " conta " + conta + " e seu saldo de " + formatarMoeda.format(saldo) + " já está disponível para saque.");
    }

}