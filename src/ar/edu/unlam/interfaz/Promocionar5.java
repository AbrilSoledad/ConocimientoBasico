package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Promocionar5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String condicionFinal = "";
		boolean desaprobado;
		boolean aprobado;
		boolean promocionado;

		System.out.println("Ingrese la nota del primer parcial: ");
		int nota1 = teclado.nextInt();

		System.out.println("Ingrese la nota del segundo parcial: ");
		int nota2 = teclado.nextInt();

		desaprobado = (nota1 < 4 || nota2 < 4);
		aprobado = (nota1 >= 4 && nota1 < 7) || (nota2 >= 4 && nota2 < 7);
		promocionado = (nota1 >= 7 && nota2 >= 7);

		condicionFinal = "El estudiante ha promocionado la materia: " + promocionado + ".";
		condicionFinal += " El estudiante ha aprobado la materia: " + aprobado + ".";
		condicionFinal += " El estudiante ha desaprobado la materia: " + desaprobado + ".";

		System.out.println(condicionFinal);
		
		teclado.close();
	}
	
}
