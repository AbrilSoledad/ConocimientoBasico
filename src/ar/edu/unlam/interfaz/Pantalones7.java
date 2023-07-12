package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Pantalones7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int sinIva = 12000;
		double conIva = (sinIva * 21) / 100;

		System.out.println("Ingrese la cantidad de pantalones que va a comprar: ");
		int cantidad = teclado.nextInt();

		int pantalonesSinIva = sinIva * cantidad;
		double pantalonesConIva = conIva * cantidad;

		System.out.println("Los pantalones sin IVA cuestan: " + "$" + pantalonesSinIva);
		System.out.println("Los pantalones con IVA cuestan: " + "$" + pantalonesConIva);

		teclado.close();
	}
}
