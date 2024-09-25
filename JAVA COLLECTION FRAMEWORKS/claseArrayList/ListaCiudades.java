import java.util.ArrayList;
import java.util.Scanner;

public class ListaCiudades {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("Lista de ciudades:");
            System.out.print("Ingrese una ciudad: ");
            String ciudad = scanner.nextLine();
            listaCiudades.add(ciudad);

            System.out.println();
            System.out.println("Desea agregar otra ciudad: (1. SI | 2. NO)");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 2) {
                salir = true;
            }

        }

        System.out.println();
        System.out.println("Lista de ciudades ingresadas:");
        for (int i = 0; i < listaCiudades.size(); i++) {
            System.out.println((i+1)+". "+listaCiudades.get(i));
        }
    }
}