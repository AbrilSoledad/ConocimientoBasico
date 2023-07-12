package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Medidas10 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese una medida en pies: ");
		double pies = teclado.nextDouble();

		double yardas = pies * 3;
		double pulgadas = pies * 12;
		double metros = pies * 0.3048;
		double centimetros = pies * 30.48;

		System.out.println("A continuacion se exhibira la medida convertida a yardas, pulgadas, metros y centimetros");
		System.out.println("");
		System.out.println("La medida en yardas es: " + yardas);
		System.out.println("La medida en pulgadas es: " + pulgadas);
		System.out.println("La medida en metros es: " + metros);
		System.out.println("La medida en centimeros es: " + centimetros);

		teclado.close();
	}
}
