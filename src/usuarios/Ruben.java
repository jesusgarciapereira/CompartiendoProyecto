package usuarios;

import java.util.Scanner;

public class Ruben {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Creo el Array de tamaño 1000
		int tabla[] = new int[1000];
		// Guardo el número a buscar
		int num = 0;
		// Variable para saber si el número introducido existe
		boolean existe = false;
		// Contador para saber cuantas veces aparece el número
		int cont = 0;

		// Bucle for para rellenar el array con valores aleatorios
		for (int i = 0; i < tabla.length; i++) {
			// Relleno cada posición del array
			tabla[i] = (int) (Math.random() * 100);
		}

		//a
		// Pido que introduzca un número
		System.out.println("¿Qué número quieres buscar?");
		num = sc.nextInt();

		// For-each para comprobar si el número existe en el Array
		for (int numExiste : tabla) {
			// Si el número existe en la tabla cambio el valor de existe a true
			if (numExiste == num) {
				existe = true;
			}
		}

		// Compruebo el valor de existe
		if (existe) {
			// Indico que el número existe
			System.out.println("El número " + num + " existe.");
			// Si es verdad muestro en que posiciones se encuentra el valor introducido con
			// un bucle for
			for (int i = 0; i < tabla.length; i++) {
				/*
				 * Aumento el contador solo en el caso que el valor de la posición de la tabla y
				 * el número son iguales
				 */
				if (tabla[i] == num) {
					cont++;
				}
			}

			// Indico cuantas veces aparece el número
			System.out.println("El número " + num + " aparece " + cont + " veces");

		} else {
			// Si el número no existe lo muestro por pantalla con un mensaje
			System.out.println("El número " + num + " no existe :(");
		}

		// Cierro el Scanner
		sc.close();
	}

}
