import java.io.File;
import java.io.IOException;

public class Edicion {


    public void edicionArchivo(String path){



        ProcessBuilder process = new ProcessBuilder("kwrite", path);
        try{
            process.start();
            System.out.println("Archivo abierto, puedes escribir en el");
        }catch(IOException e){
            System.out.println("No ha sido posible abrir el archivo");
        }


    }

    public boolean comprobarArchivo(String path){

        File file = new File(path);

        if(!file.isFile()){
            return false;
        }
        else{
            return true;
        }

    }


}
