import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenDeMerito {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        boolean salir = false;
        
        System.out.println("Notas");
        while (!salir) {
            System.out.print("Ingrese un numero entre 1 a 10: ");
            int num = scanner.nextInt();
            if (num > 0 && num < 11) {
                notas.add(num);
            } else {
                System.out.println("Numero ingresado fuera del rango establecido");
            }

            System.out.println("¿Desea ingresar otro numero? (1. SI | 2.NO)");
            int opcion = scanner.nextInt();
            if (opcion == 2) {
                salir = true;
            }
        }

        // Orden ascendente
        Collections.sort(notas);
        System.out.println();
        System.out.println("Orden ascendente lista de notas: " + notas);
        // Orden descendente
        Collections.sort(notas, Comparator.reverseOrder());
        System.out.println();
        System.out.println("Orden descendente lista de notas: " + notas);
    }
}


// • Inicializa un ArrayList de tipo Integer para almacenar los números enteros.
// • Implementa un bucle que solicite al usuario ingresar números enteros uno por uno. Puedes usar un bucle while o for que pregunte al usuario si desea agregar un número en cada iteración.
// • En cada iteración del bucle, verifica que el número ingresado esté dentro del rango del 1 al 10 y agrégalo al ArrayList utilizando el método add. Continúa solicitando al usuario que ingrese números hasta que decida no agregar más.
// • Después de que el usuario haya ingresado todos los números, utiliza el método sort para ordenar la lista de números de forma descendente.
// • Imprime por pantalla la lista ordenada tanto en orden ascendente como descendente.
