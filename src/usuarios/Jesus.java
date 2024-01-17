package usuarios;

import java.util.Arrays;

public class Jesus {
	// ENTRADA: Tabla de tipo int
		// SALIDA: Valor máximo del contenido de la tabla
		// Función maximo()
		public static int maximo(int t[]) {
			// Valor más grande de la tabla
			int numMaximo;
			// Ordenamos la tabla de menor a mayor
			Arrays.sort(t);
			// Asignamos al número máximo el último elemento de nuestra tabla
			numMaximo = t[t.length - 1];
			// Devolvemos el número máximo
			return numMaximo;
		}

		// Función main()
		public static void main(String[] args) {
			// Saludo del autor
			System.out.println("Hola, esta es la Clase de Jesús");
			
			// Valor máximo de la tabla
			int valorMaximo;
			// Creamos nuestra tabla (quiero que tenga tamaño 10)
			int tabla[] = new int[10];

			// Bucle for que recorrerá toda la tabla
			for (int i = 0; i < tabla.length; i++) {
				// Para rellenarla con números aleatorios
				tabla[i] = (int) (Math.random() * 50 + 1);
			}

			// Mostramos la tabla
			System.out.println(Arrays.toString(tabla));
			
			// Llamamos a la función maximo() y lo asignamos al valor máximo
			valorMaximo = maximo(tabla);
			
			// Mostramos el resultado
			System.out.println(valorMaximo);
		}
}
