package Aula01;

import java.util.Scanner;
public class exer19 {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Informe um núumero inteiro: ");
String numero = scan.nextLine();
scan.close();

String numeroInverso = "";

for (int i = numero.length(); i > 0 ; i--) {
numeroInverso += String.valueOf(numero.charAt(i-1));
}

if (numero.equals(numeroInverso)) {
System.out.println("\nOs números são Palíndromos!\n\nNúmero informado: " + numero + "\nSeu inverso: "+numeroInverso);
} else {
System.out.println("\nOs números NÃO são Palíndromos!\nNúmero informado: " + numero + "\nSeu inverso: "+numeroInverso);
}


}

}