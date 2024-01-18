package usuarios;

import java.util.Scanner;

public class Ruben {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Creo el Array de tama�o 1000
		int tabla[] = new int[1000];
		// Guardo el n�mero a buscar
		int num = 0;
		// Variable para saber si el n�mero introducido existe
		boolean existe = false;
		// Contador para saber cuantas veces aparece el n�mero
		int cont = 0;

		// Bucle for para rellenar el array con valores aleatorios
		for (int i = 0; i < tabla.length; i++) {
			// Relleno cada posici�n del array
			tabla[i] = (int) (Math.random() * 100);
		}

		//a
		// Pido que introduzca un n�mero
		System.out.println("�Qu� n�mero quieres buscar?");
		num = sc.nextInt();

		// For-each para comprobar si el n�mero existe en el Array
		for (int numExiste : tabla) {
			// Si el n�mero existe en la tabla cambio el valor de existe a true
			if (numExiste == num) {
				existe = true;
			}
		}

		// Compruebo el valor de existe
		if (existe) {
			// Indico que el n�mero existe
			System.out.println("El n�mero " + num + " existe.");
			// Si es verdad muestro en que posiciones se encuentra el valor introducido con
			// un bucle for
			for (int i = 0; i < tabla.length; i++) {
				/*
				 * Aumento el contador solo en el caso que el valor de la posici�n de la tabla y
				 * el n�mero son iguales
				 */
				if (tabla[i] == num) {
					cont++;
				}
			}

			// Indico cuantas veces aparece el n�mero
			System.out.println("El n�mero " + num + " aparece " + cont + " veces");

		} else {
			// Si el n�mero no existe lo muestro por pantalla con un mensaje
			System.out.println("El n�mero " + num + " no existe :(");
		}

		// Cierro el Scanner
		sc.close();
	}

}
