package Aula01;

import java.util.Scanner;

public class exerc7 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira um numero 1/3:");
		int n1 = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira um numero 2/3:");
		int n2 = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira um numero 3/3:");
		int n3 = Integer.parseInt(leitor.nextLine());
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("Número " + n1 + "é o maior");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("Número " + n2 + "é o maior");
		}
		else
		{
			System.out.println("Número " + n3 + "é o maior");
		}
		leitor.close();
		
	}

}
