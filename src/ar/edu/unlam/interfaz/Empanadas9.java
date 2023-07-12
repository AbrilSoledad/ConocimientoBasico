package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Empanadas9 {

	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantas empanadas desea comprar?: ");
		int empanadas = teclado.nextInt();
	
		 int precioDocena = 300;
		 int precioIndividual = 30;
		 
		 int docenaEmpanadas = empanadas / 12;
		 int sobranteEmpanadas = empanadas % 12;
		 
		 int total = docenaEmpanadas * precioDocena + sobranteEmpanadas * precioIndividual;
		 System.out.println("El precio total a pagar es: $" + total);
		
		teclado.close();
	}	
}
