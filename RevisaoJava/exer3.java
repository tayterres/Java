package RevisaoJava;

import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		
		
		int vet[] = new int [10]; 
        Scanner leitor = new Scanner(System.in);
    
         
         for (int i = 0; i < vet.length; i++) 
         {

       	  System.out.println("Insira um número :");
             vet [i]= Integer.parseInt(leitor.nextLine());
         }
         for (int i = 0; i < vet.length; i++) {
        	 if (vet[i] % 2 ==0)
        	 {
        		  System.out.print(vet[i] + " ");
        	 }
        	 leitor.close();
			
		}
           
	}
}
         

       	
             
        
        



