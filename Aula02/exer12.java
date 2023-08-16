package Aula02;

import java.util.Scanner;

public class exer12 {
	
	public static void main(String[] args) {
		 int n = 20;
		 int cont = 0;
		 int soma =0;
		 double media=0;
		 Scanner leitor = new Scanner(System.in);
		 int maior = Integer.MIN_VALUE;
		 int menor = Integer.MAX_VALUE;
		  
		 while (cont< n) {
			 System.out.println("Insira o " +(cont + 1)+ "numero :");
			 int numero = Integer.parseInt(leitor.nextLine());
			 
			 soma+= soma+numero;
			 
			 if (numero >maior)
			 {
				 maior = numero;
			 }
			 else if (numero< menor) 
			 {
				 menor = numero;
			 }
			 cont++;
			 
		}
		 media= soma / n;
		  System.out.println("Menor número digitado: " + menor);
		    System.out.println("Maior número digitado: " + maior);
		    System.out.println("Média dos números digitados: " + media);
          leitor.close();
		 
	}

}
