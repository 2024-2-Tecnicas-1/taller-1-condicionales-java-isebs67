package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasnB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
            if (( numVictoriasA>= 6 && numVictoriasA - numVictoriasnB >= 2) || (numVictoriasA == 7 && numVictoriasnB == 6)) {
            return "Ganó A";
        } else if ((numVictoriasnB >= 6 && numVictoriasnB - numVictoriasA >= 2) || (numVictoriasnB == 7 && numVictoriasA == 6)) {
            return "Ganó B";
        } else if (numVictoriasA <= 6 && numVictoriasnB <= 6) {
            return "Aún no termina";
        } else {
            return "Inválido";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
