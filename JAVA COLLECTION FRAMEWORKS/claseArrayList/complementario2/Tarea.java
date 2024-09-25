package complementario2;

public class Tarea {
    private String descripcion;
    private boolean completada;
    private int idTarea;

    private static int contador = 0;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
        this.idTarea = ++contador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void marcarComoCompleta () {
        this.completada = true;
    }

    @Override
    public String toString() {
        return idTarea+": "+ descripcion + " [ "+ (completada ? "Completada" : "Incompleta")+" ]";
    }  
}