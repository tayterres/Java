package Aula02;

import java.util.Scanner;

public class exer13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nomeUsuario = scanner.nextLine();
        
        int numero;
        do {
            System.out.print("Digite um número entre 2 e 10: ");
            numero = scanner.nextInt();
        } while (numero < 2 || numero > 10);
        
        for (int i = 0; i < numero; i++) {
            System.out.println(nomeUsuario);
        }
        
        scanner.close();
    }
}
