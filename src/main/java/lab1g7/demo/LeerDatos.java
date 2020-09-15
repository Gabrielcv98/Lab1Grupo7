package lab1g7.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {


    public static void lecturaDeDatos (String ruta){

        BufferedReader bufferedReader = null;

        String separador = ",";

        try {

            bufferedReader = new BufferedReader(new FileReader(ruta));

            String linea = bufferedReader.readLine();

            while (linea != null){

                String[] campos = linea.split(separador);

                linea = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        if (bufferedReader != null){
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

}
