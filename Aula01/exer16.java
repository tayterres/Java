package Aula01;

import java.util.Scanner;

public class exer16 {
  
	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira um número :");
		int numero = Integer.parseInt(leitor.nextLine());
		 
		int divisores = 0;
		for (int i = (numero - 1); i > 0; i--) 
		{
			if ((numero % i) == 0)
			{
				divisores++;
			}
		}
		
		if (divisores > 1)
		{
			System.out.println("Não é primo");
		}
		else 
		{
			System.out.println("É primo");
		}
		leitor.close();
	}
}
