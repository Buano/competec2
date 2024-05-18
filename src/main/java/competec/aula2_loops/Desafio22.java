package competec.aula2_loops;

import java.util.Scanner;

public class Desafio22 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int numero;
		System.out.println("Diga um numero");
		numero = number.nextInt();
		int redutor =1;
		while (redutor < numero) {
			redutor+=2;
			System.out.println(redutor);
		}
	}





        Scanner number = new Scanner(System.in);
	    int temperatura;
	    System.out.println("Diga uma temperatura");
	    temperatura = number.nextInt();
	    System.out.println("Diga em qual unidade está a temperatura (Celsius, Kelvin e etc).");
	    System.out.println("0 = Celsius; 1 = Fahrenheit; 2 = Kelvin.");
	    Scanner unidade = new Scanner(System.in);
	    int qual;
	    System.out.println("Diga a unidade de medida");
	    qual = unidade.nextInt();
	    Scanner mudar = new Scanner(System.in);
	    int onde;
	    System.out.println("Diga a unidade de medida para qual você deseja mudar");
	    onde = mudar.nextInt();
	    if (qual == 0 && onde == 1 ) {
	    double conta1 = (temperatura*1.8) + 32;
	    System.out.println(conta1);
	    }
	    else if (qual == 0 && onde == 2 ) {
	    double conta2 = temperatura + 273.15;
	    System.out.println(conta2);
	    }
	    else if (qual == 1 && onde == 0 ) {
	    double conta3 = (temperatura - 32)*1.8;
	    System.out.println(conta3);
	    }
	    else if (qual == 1 && onde == 2 ) {
	    double conta4 = temperatura + 459.67;
	    System.out.println(conta4);
	    }
	    else if (qual == 2 && onde == 0 ) {
	    double conta5 = temperatura - 273.15;
	    System.out.println(conta5);
	    }
	    else (qual == 2 && onde == 1 ) {
	    double conta6 = 1.8*(temperatura - 273) + 32;
	    System.out.println(conta6);
	    }
	}
}