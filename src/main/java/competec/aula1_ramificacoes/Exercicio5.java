package competec.aula1_ramificacoes;

import java.util.Scanner;

// 1. Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, caso contrário, imprima FALSO.

public class Exercicio5 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner numero = new Scanner(System.in);
        int number;
        System.out.println("Diga um numero");
        number = numero.nextInt();
        if (number%3 == 0 || number%5 == 0) {
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        }
    }

}
