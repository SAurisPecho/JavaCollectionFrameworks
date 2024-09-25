import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerValores();

        System.out.println("Sopa de numeros: ");
        int suma = calcularSuma(numeros);
        double promedio = calcularPromedio(numeros);
        mostrarResultados(numeros, suma, promedio);
        
    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> nums = new ArrayList<>();
        int valor;

        System.out.println("Ingrese numeros enteros. Ingrese -99 para finalizar: ");
        while (true) {
            valor = scanner.nextInt();
            if ( valor == -99) {
                break;
            }
            nums.add(valor);
        }

        return nums;
    }

    public static int calcularSuma(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0;
        }

        int suma = 0;
        Iterator<Integer> iterator = valores.iterator();

        while (iterator.hasNext()) {
            suma += iterator.next();

        }
        return suma;
    }

    public static double calcularPromedio(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0;
        }

        int suma = calcularSuma(valores);
        double promedio = suma / valores.size();

        return promedio;
    }

    public static void mostrarResultados(ArrayList<Integer> valores, int suma, double promedio) {
        System.out.println("Valores ingresados: "+valores);
        System.out.println("Suma de valores: "+suma);
        System.out.println("Promedio de valores: "+promedio);

        int valoresMayoresPromedio = 0;
        for (Integer num : valores) {
            if (num > promedio) {
                valoresMayoresPromedio++;
            }
        }

        System.out.println("Cantidad de valores mayores al promedio: "+valoresMayoresPromedio);
    }
}
