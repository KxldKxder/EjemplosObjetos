package fes.aragon.inicio;

import fes.aragon.clases.*;
import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        String[] clases = {"Animal", "Carro", "Celular", "Computadora", "Libro", "Monitor", "Persona"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "¿Qué ejemplo deseas ejecutar?",
                "Ejemplo de objetos", JOptionPane.QUESTION_MESSAGE, null, clases, JOptionPane.DEFAULT_OPTION);
        switch (seleccion) {

            case "Animal":
                Animal[] objAnimal = new Animal[4];
                objAnimal[0] = new Animal();
                objAnimal[1] = new Animal();
                objAnimal[2] = new Animal();
                objAnimal[3] = new Animal();
                for (int i = 0; i < 4; i++){
                    JOptionPane.showMessageDialog(null, objAnimal[i].toString(), "Animal", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Carro":
                Carro[] objCarro = new Carro[4];
                objCarro[0] = new Carro("Nissan ", "Desconocido", 20f);
                objCarro[1] = new Carro("Volkswagen ", "Desconocido", 20f);
                objCarro[2] = new Carro("Honda ", "Desconocido", 20f);
                objCarro[3] = new Carro();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objCarro[i].toString(), "Carro", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Celular":
                Celular[] objCelular = new Celular[4];
                objCelular[0] = new Celular("samsung", "Galaxy S20+", 20f);
                objCelular[1] = new Celular("samsung", "Galaxy Z Flips", 20f);
                objCelular[2] = new Celular("samsung", "Galaxy A51", 20f);
                objCelular[3] = new Celular();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objCelular[i].toString(), "Celular", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Computadora":
                Computadora[] objComputadora = new Computadora[4];
                objComputadora[0] = new Computadora("Hp", "Ryzen 3 2200G", 8);
                objComputadora[1] = new Computadora("Lenovo", "Ryzen 5 3600", 16);
                objComputadora[2] = new Computadora("Dell-Alienware", "Ryzen 9 3900x", 32);
                objComputadora[3] = new Computadora();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objComputadora[i].toString(), "Computadora", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Libro":
                Libro[] objLibro = new Libro[4];
                objLibro[0] = new Libro("EL PSICOANALISTA", "JOHN KATZENBACH", "B DE BOLSILLO");
                objLibro[1] = new Libro("Los protocolos de los Sabios de Sion", "Desconocido", "Libros Selectos");
                objLibro[2] = new Libro("COMO PROGRAMAR EN C++", "PAUL J. DEITEL", "PEARSON EDUCACION");
                objLibro[3] = new Libro();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objLibro[i].toString(), "Libro", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Monitor":
                Monitor[] objMonitor = new Monitor[4];
                objMonitor[0] = new Monitor("Acer", 60, "2048x1080");
                objMonitor[1] = new Monitor("Samsung", 75, "1280x720");
                objMonitor[2] = new Monitor("Asus", 144, "1920x1080");
                objMonitor[3] = new Monitor();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objMonitor[i].toString(), "Monitor", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Persona":
                Persona[] objPersona = new Persona[4];
                objPersona[0] = new Persona("Jose", 20, "Masculino");
                objPersona[1] = new Persona("Sofía", 22, "Femenino");
                objPersona[2] = new Persona("Ronaldo", 28, "Masculino");
                objPersona[3] = new Persona();
                for (int i = 0; i < 4; i++) {
                    JOptionPane.showMessageDialog(null, objPersona[i].toString(), "Persona", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selección no valida");
                break;
        }
    }
}
