//Realizado por RodoPH   152t0191@itsm.edu.mx
import javax.swing.JOptionPane;

public class Futbolista extends seleccionFutbol {

     String posicion;
                      
    public Futbolista(String clave,String nombre,int edad,String pos) {
        super(clave, nombre, edad);
        this.posicion=pos;
        
    }
    @Override
    public void verDatos() {
         JOptionPane.showMessageDialog(null, "ID: " + clave + "\nNOMBRE: " + nombre + "\nEDAD: " + edad + "\nPosición: "+ posicion, "Datos del entrenador", 1);

    }
    
    public String verDatosString(){
        return "ID: " + clave + "\nNOMBRE: " + nombre + "\nEDAD: " + edad + "\nTelefono: " + "\nPosición: "+ posicion + "Datos del futbolista";

    }
}
