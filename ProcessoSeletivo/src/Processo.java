import java.util.Scanner;
public class Processo {
    public static void main(String[] args) {
        int salarioBase = 2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o salário pretendido?");
        int salarioPretendido = sc.nextInt();

        if (salarioBase == salarioPretendido){
            System.out.println("Ligar com contra-proposta");
        }
        else if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else{
            System.out.println("Aguardando resposta de outros candidatos");
        }
    }
}
    

