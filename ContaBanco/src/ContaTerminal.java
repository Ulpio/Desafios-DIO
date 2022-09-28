import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        int numero;
        String agencia,nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, Bem vindo ao banco Úlpio\nPor favor insira o Número da conta.");
        numero = sc.nextInt();
        System.out.println("Por favor insira o número da Agência:");
        agencia = sc.nextLine();
        agencia = sc.nextLine();
        System.out.println("Insira o seu Nome:");
        nomeCliente = sc.nextLine();
        System.out.println("Insira o seu Saldo:");
        saldo = sc.nextDouble();


        System.out.println("Um momento, carregando...\n");
        System.out.println("Olá"+nomeCliente+"Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: "+agencia+" conta: "+numero+" e seu saldo: "+saldo+" Já está disponivel para saque.");


    }
}
