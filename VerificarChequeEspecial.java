package executavel;


import java.util.Scanner;

public class VerificarChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
