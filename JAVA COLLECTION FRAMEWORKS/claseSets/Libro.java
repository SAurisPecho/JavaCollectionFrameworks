public class Libro {
    private String titulo;
    private String autor;
    private String isnb;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, String isnb) {
        this.titulo = titulo;
        this.autor = autor;
        this.isnb = isnb;
    }

    @Override
    public int hashCode() {
        return isnb.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro other = (Libro) obj;
        return isnb.equals(other.isnb);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

}