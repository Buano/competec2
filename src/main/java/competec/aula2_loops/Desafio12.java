package competec.aula2_loops;

import java.util.Scanner;

public class Desafio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int senha = 123; // esta é a senha correta
		int tentativa = 0;
		System.out.println(tentativa);
		tentativa = entrada.nextInt();
		// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.
		while (tentativa != senha){
			System.out.println("Senha inválida");
			tentativa = entrada.nextInt();
		}
	    System.out.println("Senha Válida");
	}
}
