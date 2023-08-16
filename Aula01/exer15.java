package Aula01;

import java.util.Scanner;

public class exer15 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira o lado A :");
		int A = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira o lado B :");
		int B = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira o lado C :");
		int C= Integer.parseInt(leitor.nextLine());
		
		if ( A==B && A==C && B==C)
		{
			System.out.println("As medidas foram um triângulo");
		}
		else 
		{
			System.out.println("As medidas não foram um trinagulo");
		}
		leitor.close();
		
	}

}
