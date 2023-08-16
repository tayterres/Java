package Aula01;

import java.util.Scanner;

public class exer17 {
  
	public static void main(String[] args) {
		 Scanner leitor = new Scanner (System.in);
		 System.out.println("Insira uma letra :");
		 char a = leitor.next().charAt(0);
		 
		 
		 if( a == 'A' || a == 'E' ||  a == 'I' || a == 'O' || a == 'U')
		 {
			 System.out.println("É uma vogal");
		 }
		 else
		 {
			 System.out.println("Não é uma vogal");
		 }
		 leitor.close();
	}
}
