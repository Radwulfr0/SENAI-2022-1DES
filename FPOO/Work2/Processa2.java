import java.util.Scanner;

public class Processa2{
	public static Scanner leia;
	public static void main(String [] args){
		leia = new Scanner(System.in);
		//Entrada
		System.out.println("Digite um numero inteiro: ");
		int v1 = leia.nextInt();//Faz a leitura do teclado
		//Saida
		System.out.printf("Voce	digitou %d\n",v1);
	}
}			