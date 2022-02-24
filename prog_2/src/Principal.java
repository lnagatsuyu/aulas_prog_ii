import java.util.*;

public class Principal {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        String cpf, nome, email;
        int anoNascimento, numero;
        float saldo, debito, credito;

        System.out.println("Cliente 01");

        System.out.println("Insira o cpf");
        cpf = read.nextLine();

        System.out.println("Insira o ano de nascimento");
        anoNascimento = read.nextInt();
        read.nextLine();

        System.out.println("Insira o nome");
        nome = read.nextLine();

        System.out.println("Insira o email");
        email = read.nextLine();

        Cliente cliente_01 = new Cliente(cpf, anoNascimento, nome, email);
/*--------------------------------------------------------------------------------*/
        System.out.println("Cliente 02");

        System.out.println("Insira o cpf");
        cpf = read.nextLine();

        System.out.println("Insira o ano de nascimento");
        anoNascimento = read.nextInt();
        read.nextLine();

        System.out.println("Insira o nome");
        nome = read.nextLine();

        System.out.println("Insira o email");
        email = read.nextLine();

        Cliente cliente_02 = new Cliente(cpf, anoNascimento, nome, email);

 /*--------------------------------------------------------------------------------*/

        System.out.println("Cliente 03");
        System.out.println("Insira o cpf");
        cpf = read.nextLine();

        System.out.println("Insira o ano de nascimento");
        anoNascimento = read.nextInt();
        read.nextLine();

        System.out.println("Insira o nome");
        nome = read.nextLine();

        System.out.println("Insira o email");
        email = read.nextLine();

        Cliente cliente_03 = new Cliente(cpf, anoNascimento, nome, email);
/*--------------------------------------------------------------------------------*/

        System.out.println("Cliente 04");
        System.out.println("Insira o cpf");
        cpf = read.nextLine();

        System.out.println("Insira o ano de nascimento");
        anoNascimento = read.nextInt();
        read.nextLine();

        System.out.println("Insira o nome");
        nome = read.nextLine();

        System.out.println("Insira o email");
        email = read.nextLine();

        Cliente cliente_04 = new Cliente(cpf, anoNascimento, nome, email);

/*--------------------------------------------------------------------------------*/
        System.out.println("Conta 01");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_01 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_01.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_01.creditaSaldo(credito);

        /*--------------------------------------------------------------------------------*/
        System.out.println("Conta 02");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_02 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_02.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_02.creditaSaldo(credito);

        /*--------------------------------------------------------------------------------*/
        System.out.println("Conta 03");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_03 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_03.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_03.creditaSaldo(credito);

        /*--------------------------------------------------------------------------------*/
        System.out.println("Conta 04");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_04 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_04.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_04.creditaSaldo(credito);

        /*--------------------------------------------------------------------------------*/
        System.out.println("Conta 05");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_05 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_05.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_05.creditaSaldo(credito);

        /*--------------------------------------------------------------------------------*/
        System.out.println("Conta 06");
        System.out.println("Insira o numero da conta");
        numero = read.nextInt();

        System.out.println("Insira o saldo");
        saldo = read.nextFloat();

        Conta conta_06 = new Conta(numero, saldo);

        System.out.println("Insira o valor a ser debitado: ");
        debito = read.nextFloat();

        conta_06.debitaSaldo(debito);

        System.out.println("Insira o valor a ser creditado: ");
        credito = read.nextFloat();

        conta_06.creditaSaldo(credito);


        System.out.println("Cliente 01: \n");
        System.out.println(cliente_01.retornaCliente());
        System.out.println("Cliente 02: \n");
        System.out.println(cliente_02.retornaCliente());
        System.out.println("Cliente 03: \n");
        System.out.println(cliente_03.retornaCliente());
        System.out.println("Cliente 04: \n");
        System.out.println(cliente_04.retornaCliente());

        System.out.println("Conta 01");
        System.out.println(conta_01.retornaConta());
        System.out.println("Conta 02");
        System.out.println(conta_02.retornaConta());
        System.out.println("Conta 03");
        System.out.println(conta_03.retornaConta());
        System.out.println("Conta 04");
        System.out.println(conta_04.retornaConta());
        System.out.println("Conta 05");
        System.out.println(conta_05.retornaConta());
        System.out.println("Conta 06");
        System.out.println(conta_06.retornaConta());

        read.close();
    }
}
