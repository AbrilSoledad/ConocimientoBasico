package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Conversion4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un valor expresado en Kilobytes (KB): ");
		double kiloByte = teclado.nextDouble();

		double megaByte = kiloByte * 1024;
		double gigaByte = megaByte * 1024;
		double teraByte = gigaByte * 1024;

		System.out.println("El valor ingresado equivale a: " + megaByte + " Megabytes (MB)");
		System.out.println("El valor ingresado equivale a: " + gigaByte + " Gigabytes (GB)");
		System.out.println("El valor ingresado equivale a: " + teraByte + " Terabytes (TB)");

		teclado.close();
	}
}
