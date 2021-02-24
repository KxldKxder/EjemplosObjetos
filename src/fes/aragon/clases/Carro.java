package fes.aragon.clases;

public class Carro {

    private String marca;
    private String modelo;
    private float precio;

    public Carro() {
        this.marca = "S/M";
        this.modelo = "S/M";
        this.precio = 0f;
    }

    public Carro(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

}
