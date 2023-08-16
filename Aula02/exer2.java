package Aula02;

public class exer2 {
	public static void main(String[] args) {
		 
		int soma =0;
		int numero = 0;
		int contador=0;
		
		while (contador <100)
		{
			numero ++;
			contador++;
			if (numero % 2 ==0)
			{
				soma += numero;
				
			}	
		}
		System.out.println(soma);
	}

}
