import java.util.Scanner;

public class ListaInvitados {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu de Registros");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar la lista actual de invitados");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del invitado:");
                    String nombre = scanner.nextLine();
                    registro.agregarInvitado(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del invitado:");
                    String name = scanner.nextLine();
                    registro.eliminarInvitado(name);
                    break;
                case 3:
                    registro.mostrarInvitados();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }

}