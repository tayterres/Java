package Aula01;

import java.util.Scanner;

public class exer6 {
    
	public static void main(String[] args) {
		 Scanner leitor =  new Scanner (System.in);
		 System.out.println("Insira a sua idade :");
		 int idade = Integer.parseInt(leitor.nextLine());
		  
		 if(idade >=18)
		 {
			 System.out.println("É maior de idade ");
		 }
		 else 
		 {
			 System.out.println("É menor da idade ");
		 }
		 leitor.close();
	}
}
