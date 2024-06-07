package executavel;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();
        
        try {
            verificaNumeroConta(numeroConta);
            System.out.println("\tNumero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("\tErro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {
            scanner.close();
        }
    }

    private static void verificaNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}