package fes.aragon.clases;

public class Celular {

    private String marca;
    private String modelo;
    private float precio;

    //set = cambiar /get = obtener
    /*
    El metodo especil que inicializa los atributos es el constructor, el constructor se debe llamar igual que la clase
    y se pueden tener varios constucturos haciendo la diferencia de cada uno de ellos por el tipo de argumentos
    que recibe.
     */
    public Celular() {
        this.marca = "S/M";
        this.modelo = "S/M";
        this.precio = .50f;
    }

    public Celular(float precio) {
        this.precio = precio;
        
    }

    public Celular(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    
    

}
