/*
 * EJERCICIO 5: Clasificar una nota
 * Pide al usuario una nota (decimal) con Scanner y muestra su calificación:
 *   0 a 4.99   -> Suspenso
 *   5 a 6.99   -> Aprobado
 *   7 a 8.99   -> Notable
 *   9 a 10     -> Sobresaliente
 * Si la nota es exactamente 10, muestra además: "¡Matrícula de honor posible!".
 * Si la nota no está entre 0 y 10, muestra "Nota no válida" y no hagas nada más.
 *
 * PASOS:
 *  1. Crea un Scanner y pide la nota con nextDouble.
 *  2. Comprueba primero si la nota está fuera de rango (if).
 *  3. Encadena else if para cada tramo de calificación.
 *  4. Añade la comprobación del 10 dentro del tramo de Sobresaliente.
 *  5. Prueba el programa con 3.5, 6, 8.2, 9.5, 10 y 12.
 */
