package complementario;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String numeroTel;
    private String correo;
    
    public Contacto() {
    }

    public Contacto(String nombre, String numeroTel, String correo) {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        return Objects.equals(nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", numeroTel=" + numeroTel + ", correo=" + correo + "]";
    }
    
}
