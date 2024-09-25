package complementario1;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Registro estudiantes = new Registro();
        boolean salir = false;

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar lista de estudiantes");
            System.out.println("4. Buscar estudiante por documento");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Registrar estudiante: ");
                        System.out.print("Ingrese el documento: ");
                        String doc = scanner.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad: ");
                        int edad = scanner.nextInt();
                        estudiantes.agregarEstudiante(doc, nombre, edad);
                        break;
                    case 2:
                        System.out.println("Eliminacion: ");
                        System.out.print("Ingrese el documento: ");
                        String documento = scanner.nextLine();
                        estudiantes.eliminarEstudiante(documento);
                        break;
                    case 3:
                        estudiantes.listaEstudiantes();
                        break;
                    case 4:
                        System.out.print("Ingrese el documento del estudiante a buscar: ");
                        String dni = scanner.nextLine();
                        estudiantes.buscarEstudiantePorDni(dni);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }
            
        }
        
    }
}
