package Exercicis;

public class Exercici29 {

	// Calcula la potència de forma recursiva:

	static int potencia(int base, int exp) {
		if (exp == 0) {
			return 1;
		} else {
			return base * potencia(base, exp - 1);

		}

	}

	// Funció recursiva que calcule un número de la sèrie Fibonacci:

	static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}
	
	// Funció recursiva Plindrom
	
	static boolean palindrom(String cadena) {
		
		if (cadena.length() <= 1)
			return true;
		
		
	}
	
	
	

	public static void main(String[] args) {

//		int res = potencia(5, 7);
//		int res = fibonacci(50);
		
		boolean res = palindrom("aba");
		System.out.println(res);

	}

}
