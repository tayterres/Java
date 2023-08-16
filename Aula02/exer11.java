package Aula02;

import java.util.Scanner;

public class exer11 { 
	public static void main(String[] args) {
		
		int n =20;
		int cont =0;
		int soma =0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
				
		Scanner leitor = new Scanner(System.in);
		 while (cont < n)
		 {
			 System.out.println("Informe o " +(cont+1)+ "° número :");
			  int  numero  = Integer.parseInt(leitor.nextLine());
			  
			  if (numero <0)
			  {
				  System.out.println("Numero invalido.");
				  continue;
			  }
			  soma+=numero;
			   if (numero < menor)
			   {
				   menor = numero;
			   }
			   else if (numero > maior)
			   {
				   maior = numero;
			   }
			   cont++;
		} 
		    double media = soma/n;
		    System.out.println("Menor número digitado: " + menor);
		    System.out.println("Maior número digitado: " + maior);
		    System.out.println("Média dos números digitados: " + media);
            leitor.close();
		}

	}


