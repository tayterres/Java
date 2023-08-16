package Aula02;

public class exer9 {
	
	public static void main(String[] args) {
		int n;
		int soma=0;
		
		for (int i = 0; i < 100; i++) {
			 
			n=i;
			
			if (n % 2 !=0)
			{
				soma+=n;
			}
		}
		System.out.println("O valor da soma é :" +soma);
	}

}
