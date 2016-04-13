//Realizado por RodoPH   152t0191@itsm.edu.mx

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String clave, nombre, pos;
        Long Cel;
        int edad, prepa;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos jugadores tienes?", "Información", 1));
        Futbolista jugador[] = new Futbolista[num];
        if (num >= 11) {
            for (int i = 0; i < jugador.length; i++) {
                //Obteniendo datos de los jugadores
                clave = JOptionPane.showInputDialog(null,"JUGADOR: "+ i +  "\nnúmeros y/o letras" + "\nEscribe tu Clave: ", "Datos del jugador", 1);
                nombre = JOptionPane.showInputDialog(null, "JUGADOR: "+ i + "\nEscribe tu nombre: ", "Datos del jugador", 1);
                edad = Integer.parseInt(JOptionPane.showInputDialog(null,"JUGADOR: "+ i +  "\nEscribe tu edad: ", "Datos del jugador", 1));
                pos = JOptionPane.showInputDialog(null,"JUGADOR: "+ i +"\nEscribe la posición que jugarás" , "Datos del jugador", 1);

                Futbolista jug1 = new Futbolista(clave, nombre, edad, pos);

                jugador[i] = jug1;
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Obteniendo datos para el entrenador
            JOptionPane.showMessageDialog(null, "Tienes derecho a un entrenador", "Asignación de personal", 1);
            clave = JOptionPane.showInputDialog(null, "números y/o letras" + "\nEscribe tu Clave: ", "Datos del entrenador", 1);
            nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre: ", "Datos del entrenador", 1);
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu edad: ", "Datos del entrandor", 1));
            Cel = Long.parseLong(JOptionPane.showInputDialog(null, "Escribe tu número de celular", "Datos del entrenador", 1));

            Entrenador entrena = new Entrenador(clave, nombre, edad, Cel);
            //Obteniendo datos para el masajista

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // obteniendo datos del masajista
            JOptionPane.showMessageDialog(null, "Tienes derecho a un masajista", "Asignación de personal", 1);
            clave = JOptionPane.showInputDialog(null, "números y/o letras" + "\nEscribe tu Clave: ", "Datos del masajista", 1);
            nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre: ", "Datos del masajista", 1);
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu edad: ", "Datos del masajista", 1));
            prepa = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe la cantidad de años de experiencia", "Datos del masajista", 1));

            Masajista masajea = new Masajista(clave, nombre, edad, prepa);

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Quieres ver la lista de tu equipo?", "Pregunta", JOptionPane.YES_NO_OPTION);

            if (pregunta == JOptionPane.YES_OPTION) {

                for (int i = 0; i < jugador.length; i++) {
                    jugador[i].verDatos();
                }
                entrena.verDatos();
                masajea.verDatos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes tener al menos 11 jugadores para poder ingresar a la selección", "Lo sentimos", 1);
        }
    }
}
