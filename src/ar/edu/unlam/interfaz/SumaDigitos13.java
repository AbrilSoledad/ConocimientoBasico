package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class SumaDigitos13 {

	/*
	 * Confeccionar un programa que solicite el ingreso de un número entero positivo
	 * de 4 cifras y pueda calcular e informar la suma de sus dígitos hasta llegar a
	 * una sola cifra
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero positivo entero de 4 cifras: ");
		int numEntero = teclado.nextInt();
		// 2343//
		int cifra1, cifra2, cifra3, cifra4 = 0;

		cifra1 = numEntero / 1000;
		// 2343 / 1000 = 2 //
		cifra2 = (numEntero % 1000) / 100;
		// 2343 % 1000 = 343 / 100 = 3 //
		cifra3 = (numEntero % 100) / 10;
		// 2343 % 100 = 43 / 10 = 4 //
		cifra4 = numEntero % 10;
		// 2343 % 10 = 3 //

		int total = cifra1 + cifra2 + cifra3 + cifra4;
		// 2 + 3 + 4 + 3 = 12 //
		int total2 = total % 10 + total / 10;
		// 12 % 10 = 2 + 12 / 10 = 1 == 3 //
		int total3 = total2 % 10 + total2 / 10;

		System.out.println("El total de sumer los digitos hasta llegar a una sola cifra es: " + total3);

		teclado.close();
	}
}
