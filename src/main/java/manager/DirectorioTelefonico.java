package manager;
import java.util.Scanner;
import entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DirectorioTelefonico {

    public static List agregar(){
        Usuario usuario = new Usuario();
        Scanner sn = new Scanner(System.in);

        List<Usuario> usuarioList = new ArrayList<>();
        System.out.println("Agregue el usuario que necesite");
        System.out.println("Nombre : ");
        usuario.setNombre(sn.nextLine());
        System.out.println("Apellido : ");
        usuario.setApellido(sn.nextLine());
        System.out.println("Telefono : ");
        usuario.setTelefono(Integer.parseInt(sn.nextLine()));
        System.out.println("Anexo : ");
        usuario.setAnexo(sn.nextLine());
        System.out.println("Dpeartamento : ");
        usuario.setDepartamento(sn.nextLine());

    usuarioList.add(usuario);
    return usuarioList;
    };


    public static List buscar(){


        Scanner sn = new Scanner(System.in);

        System.out.println("Buscador :" );
        String buscador = sn.nextLine();



    }







}
