package Aula02;

import java.util.Scanner;

public class exer6 {
 public static void main(String[] args) {
	 
	 int menor=Integer.MAX_VALUE;
	 int cont= 1;
	 int numero=0;
	 Scanner leitor= new Scanner(System.in);
			 
	while (cont <=10)
	 {
		 System.out.println("Insira um número:");
		 numero= Integer.parseInt(leitor.nextLine());
		 
		 if(numero < menor)
		 { 
			 menor = numero;
		 }
		
		
		 cont++;
	 }
	   System.out.println("O numero menor é" + menor);
	   leitor.close();
   } 
}

