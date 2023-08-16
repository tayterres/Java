package Aula02;

public class exer3 {
	
	public static void main(String[] args) {
		
		int soma = 0;
		int cont = 0;
		int n = 1;
		 
		while(cont <100)
		{
			n++;
			cont++;
			if (n % 2 != 0)
			{
				soma += n;
			}
		}
		System.out.println(soma);
	}

}
