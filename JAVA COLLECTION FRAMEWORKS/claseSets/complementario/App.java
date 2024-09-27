package complementario;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GestorDeContactos gestorDeContactos = new GestorDeContactos();
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Contactos");
            System.out.println("1. Agregar contacto al ArrayList");
            System.out.println("2. Eliminar contacto del ArrayList");
            System.out.println("3. Agregar contacto al HashSet");
            System.out.println("4. Eliminar contacto del HashSet");
            System.out.println("5. Mostrar listas de contactos");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion:");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1 -> {
                    gestorDeContactos.agregarContactoArrayList(agregarContacto());
                    gestorDeContactos.mostrarArrayList();
                }
                case 2 -> {
                    gestorDeContactos.eliminarContactoArrayList(eliminarContacto());
                    gestorDeContactos.mostrarArrayList();
                }
                case 3 -> {
                    gestorDeContactos.agregarContactoHashSet(agregarContacto());
                    gestorDeContactos.mostrarHashSet();
                }
                case 4 -> {
                    gestorDeContactos.eliminarContactoHashSet(eliminarContacto());
                    gestorDeContactos.mostrarHashSet();
                }
                case 5 -> {
                    gestorDeContactos.mostrarArrayList();
                    gestorDeContactos.mostrarHashSet();
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
    }

    private static Contacto agregarContacto () {
        System.out.print("Ingrese el nombre del contacto:");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el numero del contacto:");
        String numero = scanner.nextLine();
        System.out.print("Ingrese el correo del contacto:");
        String correo = scanner.nextLine();
        
        return new Contacto(nombre, numero, correo);
    }

    private static Contacto eliminarContacto () {
        System.out.print("Ingrese el nombre del contacto:");
        String nombre = scanner.nextLine();

        return new Contacto(nombre, "", "");
    }
}
