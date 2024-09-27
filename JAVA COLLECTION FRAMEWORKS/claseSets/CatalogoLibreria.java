import java.util.Scanner;

public class CatalogoLibreria {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        boolean salida = false;

        while (!salida) {
            System.out.println("Menu de Libreria");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catalogo");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo del libro:");
                    String titulo = formatoTexto(scanner.nextLine());
                    System.out.println("Ingrese a el autor del libro:");
                    String autor = formatoTexto(scanner.nextLine());
                    System.out.println("Ingrese el número de ISBN del libro:");
                    String isbn = scanner.nextLine();
                    Libro nuevo = new Libro(titulo, autor, isbn);
                    libreria.agregarLibro(nuevo);
                    System.out.println("Libro agregado.");
                    break;
                case 2:
                    System.out.println("Ingrese el número de ISBN del libro:");
                    String isbnCodigo = scanner.nextLine();
                    libreria.eliminarLibro(isbnCodigo);
                    System.out.println("Libro eliminado.");
                    break;
                case 3:
                    libreria.mostrarCatalogo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
    }

    private static String formatoTexto(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
