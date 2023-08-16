package Aula01;

import java.util.Scanner;

public class exer25 { 
	  public static void main(String[] args)
	    {   
		  Scanner leitor = new Scanner (System.in);
		  System.out.println("Insira um numero :");
	        int n = Integer.parseInt(leitor.nextLine());
	 
	        String binary = Integer.toBinaryString(n);
	 
	        System.out.println("O número em binário é :" +binary);
	        leitor.close();
	    }
	 

}
