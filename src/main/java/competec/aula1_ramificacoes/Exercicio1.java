package competec.aula1_ramificacoes;

import java.util.Scanner;

// O Sr João precisa de um programa para calcular o valor das compras da sua lojinha
// de frutas, que vende apenas três produtos: abacaxi, maçã e pêra;
// As frutas custam R$ 7,30, R$ 2,00 e R$ 3,00, respectivamente;
// 1. Faça um programa que pegue a quantidade de cada fruta comprada e retorne o valor total da compra;

public class Exercicio1 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner quantidade = new Scanner(System.in);
        int abacaxi1;
        System.out.println("Diga quantos abacaxis foram comprados"); 
        abacaxi1 = quantidade.nextInt();
        int maçã1; 
        System.out.println("Diga quantas maçãs foram compradas");
        maçã1 = quantidade.nextInt();
        int pêra1; 
        System.out.println("Diga quantas pêras foram compradas");
        pêra1 = quantidade.nextInt();
        float abacaxi = 7.30f;
        float maçã = 2.00f;
        float pêra = 3.00f;
        float soma = (abacaxi*abacaxi1)+(maçã*maçã1)+(pêra*pêra1);
        System.out.println("O valor da compra é de"+soma);  

        char preco_frutas = 'd';
        switch (preco_frutas) {
            case '1':
            System.out.println("O preço do abacaxi é "+abacaxi);
            break;
            case '2':
            System.out.println("O preço da maçã é "+maçã);
            break;
            case '3':
            System.out.println("O preço da pêra é "+pêra);
            break;
            default:
            System.out.println("Para ver o preço das frutas digite : 1 - abacaxi, 2 - maçã ou 3 - pêra");
            break;
        }
    }
}
