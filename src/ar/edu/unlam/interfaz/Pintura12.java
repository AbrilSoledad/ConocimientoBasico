package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Pintura12 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("En la pintureria el 50% de los tarros son de 1Lt, el 30% de 4Lts y el 20% de 20Lts");
		System.out.println("");
		System.out.println("Ingrese cuantos tarros hay actualmente en la pintureria: ");
		int totalTarros = teclado.nextInt();

		int tarrosUnL = (totalTarros * 50) / 100;
		int tarrosCuatroL = (totalTarros * 30) / 100;
		int tarrosVeinteL = (totalTarros * 20) / 100;

		System.out.println("Hay " + tarrosUnL + " tarros de 1Lt");
		System.out.println("Hay " + tarrosCuatroL + " tarros de 4 Lts");
		System.out.println("Hay " + tarrosVeinteL + " tarros de 20 Lts");

		teclado.close();
	}
}
