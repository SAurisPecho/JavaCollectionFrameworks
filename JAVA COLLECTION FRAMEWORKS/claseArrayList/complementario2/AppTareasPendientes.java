package complementario2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTareasPendientes {
    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<Tarea> tareas;

    public AppTareasPendientes() {
        this.tareas = new ArrayList<>();
    }

    public static void main(String[] args) {
        AppTareasPendientes app = new AppTareasPendientes();
        boolean salir = false;

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar lista de tareas pendientes.");
            System.out.println("5. Mostrar lista de tareas pendientes.");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();

            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String descripcion = scanner.nextLine();
                        app.agregarTarea(descripcion);
                        break;
                    case 2:
                        System.out.print("Ingrese el ID de la tarea a completar: ");
                        int id = solicitarId();
                        app.completarTarea(id);
                        break;
                    case 3:
                        System.out.print("Ingrese el ID de la tarea a eliminar: ");
                        int ID = solicitarId();
                        app.eliminarTarea(ID);
                        break;
                    case 4:
                        app.mostrarTareasPendientes();
                        break;
                    case 5:
                        app.mostrarTareasCompletadas();
                        break;
                    case 6:
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


    public void agregarTarea (String descripcion) {
        if (!descripcion.isEmpty()) {
            Tarea nueva = new Tarea(descripcion);
            tareas.add(nueva);
            System.out.println("Tarea agregada con ID " + nueva.getIdTarea() + ": " + nueva.getDescripcion());
        } else {
            System.out.println("Debe agregar una descripcion");
        }
    }

    public void completarTarea (int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getIdTarea() == id) {
                tarea.marcarComoCompleta();
                System.out.println("Tarea marcada como completada: " + tarea);
                return;
            }
        }
        System.out.println("No se encontró la tarea con el ID " + id);
    }

    public void eliminarTarea (int id) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getIdTarea() == id) {
                System.out.println("Tarea eliminada: " + tareas.get(i));
                tareas.remove(i);
                return;
            }
        }
        System.out.println("No se encontró la tarea con el ID " + id);
    }

    public void mostrarTareasPendientes () {
        System.out.println("Tareas pendientes: ");
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                System.out.println("ID " + tarea.getIdTarea() + ": " + tarea.getDescripcion());
            }
        }
    }

    public void mostrarTareasCompletadas () {
        System.out.println("Tareas completadas: ");
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada()) {
                System.out.println("ID " + tarea.getIdTarea() + ": " + tarea.getDescripcion());
            }
        }
    }

    public static int solicitarId() {
        int idTarea = -1;
        while (true) {
            try {
                idTarea = scanner.nextInt();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido para el ID.");
                scanner.nextLine();
            }
        }
        return idTarea;
    }
}


// Inicializa un ArrayList para almacenar objetos de tipo Tarea, donde Tarea es una clase que contiene atributos para la descripción y 
// el estado de la tarea. Además, cada tarea debe tener un atributo idTarea que se autogenera de forma incremental, es decir,
// incrementando en 1 cada vez que se crea una nueva tarea, garantizando así la unicidad de identificadores para cada tarea

// Implementa un menú que permita al usuario seleccionar entre las siguientes opciones: agregar tarea, marcar tarea como completada,
// eliminar tarea y mostrar lista de tareas pendientes.

// Cada vez que el usuario elija agregar una tarea, solicita por teclado la descripción de la tarea y añádela al ArrayList 
// con el estado "pendiente" (por defecto).

// Para marcar una tarea como completada, solicita por teclado el número de la tarea a completar y cambia su estado a "completada".

// Para eliminar una tarea, solicita por teclado el número de la tarea a eliminar y elimina el objeto correspondiente del ArrayList.

// Implementa una función para mostrar la lista completa de tareas pendientes, mostrando tanto la descripción como el idTarea.

// Implementa una función para mostrar la lista completa de tareas completadas, mostrando tanto la descripción como el idTarea.