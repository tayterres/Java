package Aula01;

import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o seu nome :");
		String nome = (leitor.nextLine());
		System.out.println("Insira a sua idade :");
		int idade = Integer.parseInt(leitor.nextLine());
		
		if (idade >= 65)
		{
			System.out.println("Já pode se aposentar.");
		}
		else
		{
			System.out.println("Não pode se aposentar.");
		}
		leitor.close();
	}
}
