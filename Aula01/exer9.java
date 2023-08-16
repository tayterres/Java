package Aula01;

import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira número 1/2 :");
		int n1 = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira número 2/2 : ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
	    System.out.println(" O resultado da é adição " + (n1 + n2));
	    System.out.println(" O resultado da é subtração " + (n1 - n2));
	    System.out.println(" O resultado da é multiplicação " + (n1 * n2));
	    System.out.println(" O resultado da é divisão " + (n1 / n2));
		 leitor.close();
	}
}
