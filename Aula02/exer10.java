package Aula02;

import java.util.Scanner;

public class exer10 {
 public static void main(String[] args) {
	
	  int n; 
	  int fatorial =1;
	   
	  Scanner leitor = new Scanner(System.in);
	  
	  do {
          System.out.print("Informe um número entre 2 e 5: ");
          n = leitor.nextInt();
          
          if (n < 2 || n > 5) {
              System.out.println("Número inválido. Por favor, informe um número entre 2 e 5.");
          }
      } while (n < 2 || n > 5);

    
      for (int i = 1; i <= n; i++) {
          fatorial *= i;
      }

      System.out.println("O fatorial de " + n+ " é: " + fatorial);

      leitor.close();
		
	}
	  
	  
}

