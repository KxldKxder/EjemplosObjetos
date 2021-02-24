package fes.aragon.clases;

public class Libro {

    private String titulo;
    private String autor;
    private String editorial;

    public Libro() {
        this.titulo = "S/T";
        this.autor = "Desconocido";
        this.editorial = "S/E";
    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
