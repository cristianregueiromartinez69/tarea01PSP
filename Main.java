import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Edicion editarArchivo = new Edicion();
        String pregunta = JOptionPane.showInputDialog("Introduce la ruta del archivo: " + "\n" +
                "Si el archivo no existe, se creará automáticamente" + "\nSi el archivo existe, por favor,. introduce la ruta correcta");

        while(!editarArchivo.comprobarArchivo(pregunta)){
             pregunta = JOptionPane.showInputDialog("No es un archivo, por favor, introduce uno válido: " + "\n" +
                    "Si el archivo no existe, se creará automáticamente" + "\nSi el archivo existe, por favor,. introduce la ruta correcta");

        }


        editarArchivo.edicionArchivo(pregunta);

    }
}