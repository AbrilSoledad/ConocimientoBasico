package ar.edu.unlam.interfaz;

public class ConvertirUnidades1 {

	public static void main(String[] args) {

		int hdd = 1;
		double dvd = 8.5;
		double blueRay = 25.0;
		double dvdsParaBackupearHdd;
		double blueRayParaBackupearHdd;

		int conversionDeUnidad = 1024;

		System.out.println("La capacidad  de Hdd es: " + hdd + " TB");
		System.out.println("La capacidad de un DVD es: " + dvd + " GB");
		System.out.println("La capacidad de un BlueRay es: " + blueRay + " GB");

		dvdsParaBackupearHdd = (hdd * conversionDeUnidad) / dvd;

		blueRayParaBackupearHdd = (hdd * conversionDeUnidad) / blueRay;

		System.out.println(
				"La cantidad de DVDs que se necesitan para backupear el disco rigido: " + dvdsParaBackupearHdd);
		System.out.println(
				"La cantidad de Blue Rays que se necesitan para backupear el disco rigido: " + blueRayParaBackupearHdd);

	}
}
