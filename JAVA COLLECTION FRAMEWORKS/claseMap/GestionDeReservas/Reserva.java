package GestionDeReservas;

public class Reserva {
    private String identificador;
    private String fecha;
    private String nombreReservante;
    
    public Reserva() {
    }

    public Reserva(String identificador, String fecha, String nombreReservante) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.nombreReservante = nombreReservante;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreReservante() {
        return nombreReservante;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreReservante(String nombreReservante) {
        this.nombreReservante = nombreReservante;
    }

    @Override
    public String toString() {
        return "Reserva [identificador=" + identificador + ", fecha=" + fecha + ", nombreReservante=" + nombreReservante + "]";
    }

}
