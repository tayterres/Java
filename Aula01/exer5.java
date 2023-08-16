package Aula01;

import java.util.Scanner;

public class exer5 {
   
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira um número :");
		double numero =Double.parseDouble(leitor.nextLine());
		 
		if (numero > 0)
		{
			System.out.println(numero + " é número positivo");
		}
		else if (numero == 0)
		{
			System.out.println(numero + " é número Zero");
		}
		else
		{
			System.out.println(numero + " é número negativo");
		}
		leitor.close();
	}
	
}
