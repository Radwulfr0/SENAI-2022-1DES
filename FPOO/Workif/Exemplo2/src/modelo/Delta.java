package modelo;

import java.util.Scanner;

public class Delta {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada= new Scanner(System.in);
			int a, b ,c, r;
			float r1, r2 ;
			System.out.print("Valor de a:");
			a = entrada.nextInt();
			System.out.print("valor de b:");
			b = entrada.nextInt();
			System.out.print("Valor de c:");
			c = entrada.nextInt();
			
			r = b * b - 4 * a * c;
		
			System.out.println("o valor de r é " +r);
			if (r<0) {
				System.out.println("r não possui raizes reias.");
			}else {
				r1 = (int)(-b + Math.sqrt(r))/(2*a);
				r2 = (int)(-b - Math.sqrt(r))/(2*a);
				System.out.println("Os resultados são " + r1 + " e " + r2);
				
		}
		
}
}