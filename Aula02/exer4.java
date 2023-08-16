package Aula02;

import java.util.Scanner;

public class exer4 { 
	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
		System.out.println("Insira um numero entre 2 e 5 :");
		int numero = Integer.parseInt(leitor.nextLine());
		int fatorial = 1;
		
		while (numero >=2 && numero <=5)
		
		{
			fatorial = fatorial * numero;
			numero--;
		}
		System.out.println(fatorial);
		leitor.close();
	}

}
