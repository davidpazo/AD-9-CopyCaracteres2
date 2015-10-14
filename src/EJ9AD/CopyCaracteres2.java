package EJ9AD;

/*** author oracle ****/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCaracteres2 {

    private final String ruta = "/home/oracle/Desktop/Pruebas/texto8.txt";
    private final File file = new File(ruta);
    FileWriter fw;

    public void Escribir() {
        try {
            file.createNewFile();

        } catch (IOException e) {
        }
    }

    public static void main(String[] arg) {
        String rutaFichOrigen = "/home/oracle/Desktop/Pruebas/texto8.txt";//Ruta al fichero de origen
        String rutaFichDestino = "/home/oracle/Desktop/Pruebas/texto9"; //Ruta al fichero de destino
        File ficheroOrigen = new File("/home/oracle/Desktop/Pruebas/texto8.txt");//Creamos objeto de tipo fichero con la ruta origen.
        File ficheroDestino = new File("/home/oracle/Desktop/Pruebas/texto9.txt");//Creamos objeto de tipo fichero con la ruta destino.
        BufferedReader lectorFichero;//Creo un objeto buffer de lectura.
        BufferedWriter escritorFichero;//Creo un objeto buffer de escritura.
        try {
            lectorFichero = new BufferedReader(new FileReader(ficheroOrigen));//Inicializa el buffer de lectura con un objeto de tipo FileReader(lector de fichero).
            escritorFichero = new BufferedWriter(new FileWriter(ficheroDestino));//Inicializa el buffer de escritura con un objeto de tipo FileWriter(escritor de fichero).
            String linea;//variable ke ira conteniendo la linea ke leemos para despues escribirla
            while ((linea = lectorFichero.readLine()) != null) { //mientras haya lineas...
                escritorFichero.write(linea + "\n");//Escribe la linea al fichero destino
                System.out.println(linea);//se imprime la linea copiada por consola
            }
            lectorFichero.close();//cerramos el lector
            escritorFichero.close();//cerramos el escritor
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }
    }
}