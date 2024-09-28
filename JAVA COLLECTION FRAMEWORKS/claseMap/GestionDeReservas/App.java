package GestionDeReservas;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SistemaGestionReservas sistema = new SistemaGestionReservas();
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu Reservas: ");
            System.out.println("1. Agregar Reserva");
            System.out.println("2. Obtener Reserva");
            System.out.println("3. Eliminar Reserva");
            System.out.println("4. Mostrar el estado actual del sistema");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el identificador de la reserva: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese la fecha de la reserva (dd/mm/yyyy): ");
                    String fecha =scanner.nextLine();
                    System.out.print("Ingrese el nombre del reservante: ");
                    String nombre = scanner.nextLine();
                    Reserva nueva = new Reserva(id, fecha, nombre);
                    sistema.agregarReserva(nueva);
                }
                case 2 -> {
                    System.out.print("Ingrese el identificador de la reserva: ");
                    String id = scanner.nextLine();
                    Reserva reserva = sistema.obtenerReserva(id);
                    if (reserva != null) {
                        System.out.println("Detalles de la reserva: " + reserva);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el identificador de la reserva: ");
                    String id = scanner.nextLine();
                    sistema.eliminarReserva(id);
                }
                case 4 -> sistema.mostrarEstadoActual();
                case 5 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }  
                default -> System.out.println("Opción inválida. Intente de nuevo");
            }
        }
    }
}
