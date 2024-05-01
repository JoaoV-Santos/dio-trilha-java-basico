import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        int numero = in.nextInt();
        in.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = in.nextLine();
        System.out.println("Por favor, digite o seu Nome!");
        String nome = in.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        double saldo = in.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


        in.close();
    }
}
