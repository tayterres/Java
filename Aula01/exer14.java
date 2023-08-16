package Aula01;

import java.util.Scanner;

public class exer14 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira o seu nome :");
		String nome = (leitor.nextLine());
		System.out.println("Insira a sua idade :");
		int idade = Integer.parseInt(leitor.nextLine());
		
		if (idade >= 16 )
		{
			System.out.println("Apto a votar.");
		}
		else 
		{
			System.out.println(" Não apto a votar.");
		}
		leitor.close();
	}

}
