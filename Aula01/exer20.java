package Aula01;

import java.util.Scanner;

public class exer20 {
  
	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira o seu salário :");
		double salario = Double.parseDouble(leitor.nextLine());
		double reajuste = 0.0;
		double nSalario = 0.0;
		
		if (salario <=1.500)
		{
			reajuste = 0.15 * salario ;
			nSalario = salario + reajuste;
		}
		else
		{
			reajuste = salario *0.10;
			nSalario = salario + reajuste;
		}
		System.out.println("O seu novo sálario é :" + nSalario);
		leitor.close();
	}
	
}
