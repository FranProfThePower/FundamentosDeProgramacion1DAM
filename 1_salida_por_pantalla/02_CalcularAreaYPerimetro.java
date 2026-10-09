/*
 * EJERCICIO 2: Área y perímetro de un rectángulo (con Scanner)
 * Pide al usuario la base y la altura del rectángulo usando Scanner.
 * Después calcula y muestra:
 *   El área es: <base por altura>
 *   El perímetro es: <2 por (base más altura)>
 *
 * Pista: import java.util.Scanner; al principio del archivo.
 * Pista: Scanner sc = new Scanner(System.in); crea el lector de teclado.
 * Pista: sc.nextInt() lee un entero escrito por el usuario.
 */
import java.util.Scanner;

public class CalcularAreaYPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = sc.nextInt();

        // TODO: pide la altura con el mismo estilo (print + nextInt)

        // TODO: calcula el área y el perímetro en dos variables
        
        // TODO: muestra ambos resultados con los textos indicados

        sc.close();
    }
}
