package competec.aula2_loops;

import java.util.Scanner;

public class Desafio0 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		// leia o número inteiro enviado pelo usuário utilizando o scanner.
		int numero;
		System.out.println("Diga um numero");
		numero = number.nextInt();
		// teste se o número é par. Dica: lembre-se do operador '%', que retorna o resto da divisão entre dois números.
		if (numero%2 == 0){
		System.out.println("Esse numero é par");
	}
		else{
			System.out.println("Esse numero é impar");
		}
		// imprima o resultado da operação (se o número digitado é par ou ímpar).
	}
}
