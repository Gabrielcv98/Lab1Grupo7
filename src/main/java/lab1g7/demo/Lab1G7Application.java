package lab1g7.demo;

import manager.DirectorioTelefonico;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Lab1G7Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1G7Application.class, args);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

while(salir)
        {

            System.out.println("1. Leer Datos ");
            System.out.println("2. Agregar Usuario ");
            System.out.println("3. Buscar Usuario ");
            System.out.println("4. Escribir Directorio");

            System.out.println("Escribe una de las opciones");

            opcion = sn.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    DirectorioTelefonico.agregar();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opción errónea");
            }
        }
    }
}
