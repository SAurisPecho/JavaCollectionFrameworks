package GestionDeReservas;

import java.util.HashMap;

public class SistemaGestionReservas {
    HashMap<String, Reserva> reservas;

    public SistemaGestionReservas () {
        reservas = new HashMap<>();
    }

    public void agregarReserva (Reserva reserva) {
        if (reservas.containsKey(reserva.getIdentificador())) {
            System.out.println("Error: Ya existe una reserva con el identificador " + reserva.getIdentificador());
        } else {
            reservas.put(reserva.getIdentificador(), reserva);
            System.out.println("Reserva agregada exitosamente.");
        }
    }

    public Reserva obtenerReserva (String id) {
        if (reservas.containsKey(id)) {
            return reservas.get(id);
        } else {
            System.out.println("No se encontró ninguna reserva con el identificador: " + id);
            return null;
        }
    }

    public void eliminarReserva (String id) {
        if (reservas.containsKey(id)) {
            reservas.remove(id);
            System.out.println("Reserva eliminada exitosamente.");
        } else {
            System.out.println("No se encontró ninguna reserva con el identificador: " + id);
        }
    }

    public void mostrarEstadoActual () {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas en el sistema.");
        } else {
            System.out.println("Estado actual del sistema");
            for (Reserva reserva : reservas.values()) {
                System.out.println(reserva);
            }
            System.out.println("Cantidad total de reservas: " + reservas.size());
        }
    }
}
