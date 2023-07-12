package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Vuelo6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Inserte la cantidad de pasajes de clase turiste vendidos: ");
		int turista = teclado.nextInt();

		System.out.println("Inserte la cantidad de pasajes de primero clase vendidos: ");
		int primera = teclado.nextInt();

		int valorTurista = 8800;
		// 30% mas
		int valorPrimera = ((8800 * 30) / 100) + 8800;

		int totalTurista = turista * valorTurista;
		int totalPrimera = primera * valorPrimera;
		int total = totalTurista + totalPrimera;

		System.out.println("El dinero recaudado con pasajes de clase turista es: " + totalTurista);
		System.out.println("El dinero recaudado con pasajes de primera clase es: " + totalPrimera);
		System.out.println("");
		System.out.println("El dinero total recaudado en el vuelo es de: " + total);

		teclado.close();
	}
}
