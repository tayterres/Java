package Aula01;

import java.util.Scanner;

public class exer12 {
	
	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira um número");
		int numero = Integer.parseInt(leitor.nextLine());
		
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			System.out.println("O " + numero + " é multiplo de 3 e 5.");
		}
		else
		{
			System.out.println("O " + numero + " não é multiplo de 3 e 5.");
		}
		leitor.close();
	}

}
