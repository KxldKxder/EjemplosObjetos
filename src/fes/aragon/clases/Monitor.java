package fes.aragon.clases;
public class Monitor {
    private String marca;
    private int hertz;
    private String resolucion;

    public Monitor(){
        this.marca = "S/M";
        this.hertz = 60;
        this.resolucion = "800x600";
    }
    
    public Monitor(String marca, int hertz, String resolucion) {
        this.marca = marca;
        this.hertz = hertz;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getHertz() {
        return this.hertz;
    }

    public String getResolucion() {
        return this.resolucion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", hertz=" + hertz + ", resolucion=" + resolucion + '}';
    }
    
}
