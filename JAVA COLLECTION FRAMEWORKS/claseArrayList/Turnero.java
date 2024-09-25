import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Turnero {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    
    public static int obtenerNumTurno(int ultimoTurno){
        ultimoTurno++;
        return ultimoTurno;
    }

    public static void atenderCliente(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("Atendiendo al cliente numero: "+lista.remove(0));
        }
    }

    public static void sortearTurno (ArrayList<Integer> lista) {
        if (!lista.isEmpty()) {
            int indiceSorteado = random.nextInt(lista.size());
            System.out.println("Cliente sorteado y atendido: "+lista.get(indiceSorteado));
            lista.remove(indiceSorteado);
        } else {
            System.out.println("No hay clientes para sortear.");
        }
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> listaTurno = new ArrayList<>();
        int ultimoTurno = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("MENU TURNOS");
            System.out.println("1. Obtener un número de turno");
            System.out.println("2. Atender al siguiente turno");
            System.out.println("3. Sortear y atender turno");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ultimoTurno = obtenerNumTurno(ultimoTurno);
                    listaTurno.add(ultimoTurno);
                    System.out.println("Se ha emitido el turno: "+ultimoTurno);
                    break;
                case 2:
                    atenderCliente(listaTurno);
                    break;
                case 3:
                    sortearTurno(listaTurno);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        }
    }
}
