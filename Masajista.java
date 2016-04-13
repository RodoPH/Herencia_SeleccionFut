//Realizado por RodoPH   152t0191@itsm.edu.mx
import javax.swing.JOptionPane;

public class Masajista extends seleccionFutbol {

    int preparacion;

    public Masajista(String clave, String nombre, int edad, int prepa) {
        super(clave, nombre, edad);

        this.preparacion = prepa;
    }

    @Override
    public void verDatos() {
      JOptionPane.showMessageDialog(null,"ID: " + clave + "\nNOMBRE: " + nombre + "\nEDAD: " + edad + "\nTelefono: " + "\nPreparación: "+ preparacion, "Datos del masajista", 1);

    }

   
    public String verDatosString() {
        return "Años de preparación: " + preparacion + " Datos del futbolista";
    }
}
