package Aula02;

public class exer8 { 
	public static void main(String[] args) {
		
		
		int soma=0;
		int n ;
		
		for (int i = 0; i < 101; i++) {
			
			n=i;
			if(n %2==0)
			{
				soma+=n;
				
			}
			
		}
		 System.out.println("O valor da soma é :" + soma);
	}

}
