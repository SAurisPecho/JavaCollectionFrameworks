import java.util.HashMap;
import java.util.Scanner;

public class InventarioStock {
    public static Scanner scanner = new Scanner(System.in);

    private static HashMap<String, Integer> inventario;

    public InventarioStock () {
        inventario = new HashMap<>();
    }

    public static void main(String[] args) {
        InventarioStock inventario = new InventarioStock();
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu: ");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar cantidad de producto existente");
            System.out.println("3. Verificar cantidad en stock");
            System.out.println("4. Verificar si un producto existe");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la cantidad en stock: ");
                    Integer cantidad = scanner.nextInt();
                    inventario.agregarProducto(nombre, cantidad);
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la actualizacion de cantidad en stock: ");
                    Integer cantidadNueva = scanner.nextInt();
                    inventario.actualizarStock(nombre, cantidadNueva);
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del producto para verificar stock: ");
                    String nombre = scanner.nextLine();
                    inventario.verificarStock(nombre);
                }
                case 4 -> {
                    System.out.println("Ingrese el nombre del producto para verificar si existe: ");
                    String nombre = scanner.nextLine();
                    inventario.verificarExistencia(nombre);
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Intente de nuevo");
            }
        }
    }

    public static String formatearTexto (String nombreProducto) {
        return nombreProducto.trim().substring(0, 1).toUpperCase()+nombreProducto.substring(1).toLowerCase();
    }

    public void agregarProducto(String nombre, Integer cantidad) {
        nombre = formatearTexto(nombre);
        if (!inventario.containsKey(nombre)) {
            inventario.put(nombre, cantidad);
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("El producto ya existe");
        }
    }

    public void actualizarStock(String nombre, Integer cantidadNueva) {
        nombre = formatearTexto(nombre);
        if (inventario.containsKey(nombre)) {
            Integer cantidadAnterior = inventario.get(nombre);
            inventario.replace(nombre, cantidadNueva+cantidadAnterior);
            System.out.println("Cantidad de producto actualizado exitosamente.");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void verificarStock(String nombre) {
        nombre = formatearTexto(nombre);
        if (inventario.containsKey(nombre)) {
            int stock = inventario.getOrDefault(nombre, 0);
            System.out.println("Stock de producto: "+stock);
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void verificarExistencia(String nombre) {
        nombre = formatearTexto(nombre);
        boolean existe = inventario.containsKey(nombre);
        if (existe) {
            System.out.println("El producto si existe");
        } else {
            System.out.println("El producto no existe");
        }
    }
}
