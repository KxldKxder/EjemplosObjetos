package fes.aragon.inicio;

import fes.aragon.clases.Celular;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Clase objeto = new Constructor(parametros);
        Celular objCelular = new Celular();
        Celular objCelular2 = new Celular();
        Celular objCelular3 = new Celular(2500.99f);
        Celular objCelular4 = new Celular("Hwawei", "Lite", 3000.45f);
        
        objCelular.setModelo("Huawei PS1");
        JOptionPane.showMessageDialog(null, objCelular.getModelo());
        JOptionPane.showMessageDialog(null, objCelular3.getModelo());
        JOptionPane.showMessageDialog(null, objCelular4.toString());
    }
}
