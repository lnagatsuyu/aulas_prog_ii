import java.util.*;

public class Principal {

    public static void main(String args[]){

        Scanner read = new Scanner(System.in);

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

        System.out.println("Insira o numero da conta");
        int numero = read.nextInt();

        System.out.println("Insira o saldo");
        float saldo = read.nextFloat();

        Conta conta_01 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        float debito = read.nextFloat();

        conta_01.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        float credito = read.nextFloat();

        conta_01.creditaSaldo(credito);

        System.out.println(cliente_01.retornaCliente());
        System.out.println(conta_01.retornaConta());
        /*
        Cliente cliente_01 = new Cliente("02850435902", 1980, "Marcos da Rocha Souza", "mr_souza@gmail.com");
        Cliente cliente_02 = new Cliente("03510400902", 1985, "Ana Clara Marques", "aninha@gmail.com");
        Cliente cliente_03 = new Cliente("04564238906", 1975, "Pedro de Alcantara", "pedro_75@gmail.com");
        Cliente cliente_04 = new Cliente("03510400902", 1985, "Ana Clara Marques", "aninha@gmail.com");

        Conta conta_01 = new Conta(1521, 750.63);
        Conta conta_02 = new Conta(1314, 10.36);
        Conta conta_03 = new Conta(2368, 1523.00);
        Conta conta_04 = new Conta(3568, -50.45);
        Conta conta_05 = new Conta(2224, 91.23);
        Conta conta_06 = new Conta(1019, -70.35);
        */

        read.close();
    }
}
