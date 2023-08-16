package Aula01;

import java.util.Scanner;

public class exer21 {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner (System.in);
		 System.out.println("Insira o número 1/3 :");
		 int a = Integer.parseInt(leitor.nextLine());
		 System.out.println("Insira o número 2/3 :");
		 int b = Integer.parseInt(leitor.nextLine());
		 System.out.println("Insira o número 3/3 :");
		 int c = Integer.parseInt(leitor.nextLine());
		 
		 if (a < b && b < c)
		 {
			 System.out.println(a + " " + b + " " + c);
		 }
		 else if (b < a && a < c )
		 {
			 System.out.println(b + " " + a + " " + c);
		 }
		 else if (c < a && a < b)
		 {
			 System.out.println(c + " " + a + " " + b); 
		 }
		 else 
		 {
			 System.out.println(c + " " + b + " " + a);  
		 }
		 leitor.close();
	}   

}
