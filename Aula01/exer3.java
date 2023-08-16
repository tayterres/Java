package Aula01;

import java.util.Scanner;

public class exer3 {
   
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira a nota 1/3");
		double nota1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira a nota 2/3");
		double nota2 =  Double.parseDouble(leitor.nextLine());
		System.out.println("Insira a nota 3/3");
		double nota3 =  Double.parseDouble(leitor.nextLine());
		double media= (nota1 + nota2 + nota3)/3;
		 System.out.println("A média do aulo é :" + media);
		 leitor.close();
		
		
		
	}
}
