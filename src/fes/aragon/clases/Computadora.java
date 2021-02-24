package fes.aragon.clases;

public class Computadora {

    private String marca;
    private String procesador;
    private int ram;

    public Computadora() {
        this.marca = "S/M";
        this.procesador = "S/D";
        this.ram = 4;
    }

    public Computadora(String marca, String procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public int getRam() {
        return this.ram;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", ram=" + ram + "Gb" + '}';
    }

}
