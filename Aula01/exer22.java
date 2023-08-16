package Aula01;

public class exer22 {
	  public static void main(String[] args) {
	        char caractere = 'a';

	        if (Character.isUpperCase(caractere)) {
	            System.out.println("O caractere é uma letra maiúscula.");
	        } else if (Character.isLowerCase(caractere)) {
	            System.out.println("O caractere é uma letra minúscula.");
	        } else if (Character.isDigit(caractere)) {
	            System.out.println("O caractere é um número.");
	        } else {
	            System.out.println("O caractere não é uma letra nem um número.");
	        }
	    }

}
