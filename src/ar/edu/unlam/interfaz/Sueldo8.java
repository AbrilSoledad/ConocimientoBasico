package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Sueldo8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese las horas trabajadas por quincena: ");
		float horasTrabajadas = teclado.nextFloat();

		System.out.println("Ingrese el valor de una hora trabajada: ");
		double valorHora = teclado.nextDouble();

		double sueldo = horasTrabajadas * valorHora;

		System.out.println("El sueldo del empleado es: " + "$" + sueldo);

		teclado.close();
	}
}
