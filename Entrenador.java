//Realizado por RodoPH   152t0191@itsm.edu.mx
import javax.swing.JOptionPane;

public class Entrenador extends seleccionFutbol {

    long telCel;

    public Entrenador(String clave, String nombre, int edad, Long Cel) {
        super(clave, nombre, edad);
        this.telCel = Cel;
    }
    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "ID: " + clave + "\nNOMBRE: " + nombre + "\nEDAD: " + edad + "\nTelefono: " + telCel, "Datos del entrenador", 1);

    }

    public String verDatosString() {
        return "\nTelefono:" + telCel + "Datos del entrenador";

    }
}
