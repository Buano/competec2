package competec.aula2_loops;

import java.util.Scanner;

public class Desafio21 {
	public static void main (String[] args) {
		Scanner number = new Scanner(System.in);
		int numero;
		System.out.println("Diga um numero");
		numero = number.nextInt();
		for(int tabuada = 0; tabuada < 11; tabuada++){
		System.out.println(numero * tabuada);
		}

	}
}
