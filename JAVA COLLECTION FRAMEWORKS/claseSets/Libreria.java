import java.util.HashSet;

public class Libreria {
    public static HashSet<Libro> librosCatalogo;
    
    public Libreria() {
        librosCatalogo = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        librosCatalogo.add(libro);
    }

    public void eliminarLibro(String isnb) {
        for (Libro libro : librosCatalogo) {
            if (libro.getIsnb().equals(isnb)) {
                librosCatalogo.remove(libro);
                break;
            }
        }
    }

    public void mostrarCatalogo() {
        System.out.println("Catalogo de libros: ");
        for (Libro libro : librosCatalogo) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getIsnb());
            System.out.println("------------");
        }
    }
}