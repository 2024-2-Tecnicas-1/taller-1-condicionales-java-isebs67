
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números ordenados de menor a mayor: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        return null;
     }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
