package Aula02;

import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		
	
	
	int opcao;
	
	Scanner leitor = new Scanner(System.in);
	System.out.println("Escolha as seguintes opções : \n 1 - Sacar \n 2 - Depositar \n 3 - Verificar Saldo \n 4 - Sair");
	System.out.println("Digite a sua opção :");
	opcao= Integer.parseInt(leitor.nextLine());
	 
	while ( opcao !=4) 
	{
		  switch (opcao) {
	         case 1: 
	        	 System.out.println("você escolheu a opção Sacar");
	        	 break;
	         case 2: 
	        	 System.out.println("você escolheu a opção Depositar");
	        	 break;
	         case 3: 
	        	 System.out.println("você escolheu a opção Verificar saldo");
	        	 break;
	         case 4: 
	        	 System.out.println("você escolheu a opção Sair ");
	        	 break;

			default:
				System.out.println("Opcçaõ invalida ");
		
	}
		  System.out.println(" 1 - Sacar  \n 2 - Depositar \n 3 - Verificar Saldo \n 4 - Sair");
			opcao = Integer.parseInt(leitor.nextLine());

	   }
	leitor.close();
	}
}



