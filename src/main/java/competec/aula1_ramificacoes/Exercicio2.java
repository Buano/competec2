package competec.aula1_ramificacoes;

import java.util.Scanner;

// 1. Compare o seu nome com o nome do colega ao lado e veja se são iguais
// 2. Faça uma comparação para descobrir se você é mais novo que o professor;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner ler = new Scanner(System.in);
		int idade;	
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		boolean comparacao = idade>21;
		System.out.println("Sua idade é maior que a do professor "+comparacao);
    }
}
