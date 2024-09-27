import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {
    public static HashSet<String> nombresInvitados;
    public static Scanner scanner = new Scanner(System.in);

    public RegistroDeInvitados () {
        nombresInvitados = new HashSet<>();
    }

    public void agregarInvitado(String nombre) {
        nombre = formatearNombre(nombre);
        if (!nombre.isEmpty()) {
            if (nombresInvitados.contains(nombre)) {
                System.out.println("El invitado ya ha sido agregado.");
            } else {
                nombresInvitados.add(nombre);
                System.out.println("El invitado fue agregado.");
            }
        } else {
            System.out.println("El nombre no debe estar vacio ");
        }
    }

    public void eliminarInvitado (String nombre) {
        nombre = formatearNombre(nombre);
        if (nombresInvitados.contains(nombre)) {
            nombresInvitados.remove(nombre);
            System.out.println("El invitado fue eliminado.");
        } else {
            System.out.println("El invitado no esta en la lista.");
        }
    }

    public void mostrarInvitados() {
        System.out.println("Lista de invitados: ");
        int i = 0;
        if (nombresInvitados.isEmpty()) {
            System.out.println("La lista esta vacia");
            System.out.println();
        } else {
            for (Object invitado : nombresInvitados) {
                System.out.println((i+1)+". "+invitado);
                i++;
            }
            System.out.println();
        }
    }

    public String formatearNombre(String nombre) {
        return nombre.trim().toLowerCase();  // Elimina espacios adicionales y convierte a minúsculas
    }
}
