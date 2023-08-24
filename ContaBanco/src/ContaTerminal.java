import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, digite o número da conta: ");
        Integer conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo: ");
        Double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: " + saldo + " já está disponível para saque.");
    }
}
