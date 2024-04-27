package competec.aula1_ramificacoes;

import java.util.Scanner;

// Suponha duas pessoas, A e B:
// 1. Faça uma comparação lógica para ver se A e B têm a mesma idade E A tem mais de 18 anos.
// 2. Faça uma comparação lógica para ver se A e B têm idades diferentes E se B tem menos de 12 anos.

public class Exercicio4 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Digite uma idade");
		idade = ler.nextInt();
        Scanner ler2 = new Scanner(System.in);
        int idade2;
        System.out.println("Digite outra idade");
		 idade2 = ler2.nextInt();
        boolean comparacao = idade >= idade2 || idade > 18;
        System.out.println(comparacao);
        boolean comparacao2 = idade != idade2 || idade2 < 12;
        System.out.println(comparacao2);
        if (comparacao == true){
            System.out.println("Eles apresentam a mesma idade ou o primeiro tem mais de 18 anos");
        }
        else{
            System.out.println("Eles não apresentam a mesma idade ou o primeiro não tem mais de 18 anos");
        }
        if (comparacao2 == true) {
            System.out.println("Eles apresentam idades diferentes ou o segundo tem menos de 12 anos");
        }
        else{
            System.out.println("Eles não apresentam idades diferentes ou o segundo tem mais de 12 anos");
        }
    }
}