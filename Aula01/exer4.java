package Aula01;

import java.util.Scanner;

public class exer4 { 
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira um numero :");
		int numero =  Integer.parseInt(leitor.nextLine());
		
		if (numero % 2 ==0)
		{
			System.out.println(numero + " é um número par.");
		}
		else
		{
			System.out.println(numero + " é um número impar.");
		}
		leitor.close();
		
		
	}

}
