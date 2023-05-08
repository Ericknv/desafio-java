import java.util.Scanner;

public class ContaTerminal {

public static void main (String [] args) {

try (Scanner usuario = new Scanner(System.in)) {
    int numero;
    String agencia = "";
    String nomeCliente = "";
    double saldo;
    
    System.out.println("Digite o seu nome:");
    nomeCliente = usuario.nextLine();   

    System.out.println("Digite o número da sua agência:");
    agencia = usuario.nextLine();

    System.out.println("Digite o número da sua conta:");
    numero = usuario.nextInt();

    System.out.println("Digite o seu saldo:");
    saldo = usuario.nextDouble();
    
    System.out.println("Olá " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo R$" + saldo + " já está disponível");
}

}

}