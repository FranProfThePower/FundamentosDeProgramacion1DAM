/*
 * EJERCICIO 3: Ficha de un alumno con formato (con Scanner)
 * Pide al usuario, con Scanner, los siguientes datos:
 *   - Nombre (texto completo, p. ej. "Ana García")
 *   - Edad (entero)
 *   - Nota media (decimal, p. ej. 7.456)
 *
 * Después muestra por pantalla, usando printf, esta línea:
 *   Alumno: <nombre> | Edad: <edad> | Media: <media con 2 decimales>
 *
 * Pistas:
 *   - sc.nextLine() lee una línea completa de texto.
 *   - sc.nextDouble() lee un decimal; usa punto o coma según tu configuración.
 */
import java.util.Scanner;

public class MostrarFichaAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: pide el nombre completo con print y nextLine

        // TODO: pide la edad con nextInt

        // TODO: pide la nota media con nextDouble

        // TODO: muestra la ficha
        
        System.out.println("Fin de la ficha");

        sc.close();
    }
}
