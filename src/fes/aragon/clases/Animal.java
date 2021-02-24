package fes.aragon.clases;

public class Animal {

    private String nombre;
    private String reino;
    private String alimentacion;

    public Animal() {
        this.nombre = "S/N";
        this.reino = "S/R";
        this.alimentacion = "S/D";
    }

    public Animal(String nombre, String reino, String alimentacion) {
        this.nombre = nombre;
        this.reino = reino;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getReino() {
        return this.reino;
    }

    public String getAlimentacion() {
        return this.alimentacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", reino=" + reino + ", alimentacion=" + alimentacion + '}';
    }

}
