import java.util.*;

public class Principal {

    public static void main(String args[]){

        Scanner read = new Scanner(System.in);

        /*
        System.out.println("Insira o cpf");
        String cpf = read.nextLine();

        System.out.println("Insira o ano de nascimento");
        int anoNascimento = read.nextInt();
        read.nextLine();

        System.out.println("Insira o nome");
        String nome = read.nextLine();

        System.out.println("Insira o email");
        String email = read.nextLine();

        Cliente cliente_01 = new Cliente(cpf, anoNascimento, nome, email);
        
        Cliente cliente_03 = new Cliente();
        cliente_03.setCpf(ler.nextLine());

        System.out.println("Insira o numero da conta");
        int numero = read.nextInt();
        */


        Conta conta_01 = new Conta(23196, 250);

        System.out.println("Insira o novo saldo");

        float saldo = read.nextFloat();
        boolean flag = conta_01.setSaldo(saldo);

        if(flag){
            System.out.println("Saldo atualizado com sucesso");
        }else{
            System.out.println("Saldo nao atualizado. Nao pode ser negativo");
        }

//        System.out.println("Insira o valor a ser debitado: ");
//        float debito = read.nextFloat();
//
//        conta_01.debitaSaldo(debito);
//
//        System.out.println("Insira o valor a ser creditado: ");
//        float credito = read.nextFloat();
//
//        conta_01.creditaSaldo(credito)
//        System.out.println(cliente_01.retornaCliente());

        System.out.println(conta_01.retornaConta());

        read.close();
    }
}
