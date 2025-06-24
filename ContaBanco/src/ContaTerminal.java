import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner= new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
        var NumeroConta= scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        scanner.nextLine();
        var Agencia= scanner.nextLine();
        
        System.out.println("Por favor, informe o seu nome !");
        var NomeCliente= scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta !");
        var Saldo= scanner.nextFloat();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n", NomeCliente, Agencia, NumeroConta, Saldo);
     

    }
}
