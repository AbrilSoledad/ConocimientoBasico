package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Circulo3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el valor del radio(r) del circulo: ");
		double radio = teclado.nextDouble();

		// pi * radio al cuadrado
		double superficie = Math.PI * Math.pow(radio, 2);

		double perimetro = 2 * Math.PI * radio;

		// volumen = cuatro tercios * pi * radio al cubo
		double volumen = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);

		System.out.println("La superficie del circulo es: " + superficie);
		System.out.println("La longitud de la circunferencia es:" + perimetro);
		System.out.println("El volumen de la esfera es:" + volumen);

		teclado.close();
	}

}
