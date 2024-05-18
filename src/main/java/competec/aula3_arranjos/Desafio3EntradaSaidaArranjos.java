package competec.aula3_arranjos;
import java.util.Scanner;
public class Desafio3EntradaSaidaArranjos {

	public static void main(String[] args) {

		
		// Coletar tamanho arranjo
		Scanner digatamanho = new Scanner(System.in);
		int tamanho;
		System.out.println("Diga o tamanho do arranjo");
		tamanho = digatamanho.nextInt();
		int valores [] = new int [tamanho];
		// Preencher arranjo]
		Scanner diga = new Scanner(System.in);
		System.out.println("Diga os valores do arranjo");
		int aumento;
		for(int i = 0; i < valores.length; i++){
			aumento = i+1;
			System.out.println("Valor "+aumento);	
			valores[i] = diga.nextInt( );
			}
		// Impremir arranjo
		System.out.println("Os valores do arranjo são:");
		for(int i = 0; i < valores.length; i++){
			aumento = i+1;
			System.out.println("Valor " + aumento + ": " + valores[i]);
	}
		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */

	}

}
