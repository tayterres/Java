package Aula01;

import java.util.Scanner;

public class exer24 {
	public static void main(String[] args){
		 
		 
		 
		  Scanner leitor = new Scanner(System.in);
		  System.out.print("Informe um valor inteiro (0-999): ");
		  int valor = Integer.parseInt(leitor.next());
		 
		 
		  if(valor < 0 || valor > 999){
		    System.out.println("Valor fora da faixa permitida");
		    System.exit(0);
		  }
		 
		  // vamos obter o terceiro dígito
		  int terceiro = valor % 10;
		  // obtém os digitos restantes
		  valor = valor / 10;
		 
		  // vamos obter o segundo dígito
		  int segundo = valor % 10;
		  // obtém os digitos restantes
		  valor = valor / 10;
		 
		  // vamos obter o primeiro dígito
		  int primeiro = valor % 10;
		  // obtém os digitos restantes
		  valor = valor / 10;
		 
		  // vamos obter a soma dos dígitos
		  int soma = terceiro + segundo + primeiro;
		 
		  // vamos mostrar o resultado
		  System.out.println("A soma dos dígitos é: " + soma);
		  leitor.close();
		}
}
