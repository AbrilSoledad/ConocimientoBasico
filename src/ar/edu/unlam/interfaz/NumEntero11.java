package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class NumEntero11 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero entero de tres cifras: ");
		int numero = teclado.nextInt();

		int centenas = numero / 100;
		int residuo = numero % 100;
		int decenas = residuo / 10;
		int unidades = residuo % 10;

		System.out.println("Centenas: " + centenas);
		System.out.println("Decenas: " + decenas);
		System.out.println("Unidades: " + unidades);

		teclado.close();
	}
}
