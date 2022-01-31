package modelo;

import java.util.Scanner;

public class Media {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada= new Scanner(System.in);
			int n1, n2, result;
			System.out.print("qual sua prieira nota?");
			n1 = entrada.nextInt();
			System.out.print("qual sua segunda nota?");
			n2 = entrada.nextInt();
			result = (n1 + n2)/2;
			
		int media = result;
		if(media >=-5){System.out.println("Parabens você foi aprovado com nota" + result);
		}else{System.out.println("Reprovado");
		}
		
	}
	
}