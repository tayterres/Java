package Aula01;

import java.util.Scanner;

public class exer18 {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner (System.in);
		 System.out.println("Insira o ano :");
		 int ano = Integer.parseInt(leitor.nextLine());
		 
		 if (ano % 4 ==0)
		 {
			 System.out.println("É ano bissexto");
		 }
		 else
		 {
			 System.out.println("Não é ano bissexto");
		 }
		 leitor.close();
	}

}
