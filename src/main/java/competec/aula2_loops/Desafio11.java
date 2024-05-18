package competec.aula2_loops;

public class Desafio11 {
	public static void main(String[] args) {
		int soma = 0; // inicialmente a soma é zero.
		int somar=0;
		// crie um loop que atualize o valor de soma 100 vezes
		while (soma <101) {
			soma++;
			somar = somar + soma;
		}
		// imprima o valor da soma
		System.out.println(somar + ""); 
	}
}
