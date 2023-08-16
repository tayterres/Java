package Aula01;

import java.util.Random;
import java.util.Scanner;

public class exer23 {  
	public static void main(String[] args) {
		  Random numero = new Random();
	        int numeroAleatorio = numero.nextInt(100) + 1;
	        int tentativa;
	        int tentativas = 0;

	        Scanner leitor = new Scanner(System.in);
	        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

	        do {
	            System.out.print("Digite a sua tentativa: ");
	            tentativa = leitor.nextInt();
	            tentativas++;

	            if (tentativa > numeroAleatorio) {
	                System.out.println("O número é menor.");
	            } else if (tentativa < numeroAleatorio) {
	                System.out.println("O número é maior.");
	            } else {
	                System.out.println("Parabéns, você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas!");
	            }
	        } while (tentativa != numeroAleatorio);

	        leitor.close();
	    
	}

}
