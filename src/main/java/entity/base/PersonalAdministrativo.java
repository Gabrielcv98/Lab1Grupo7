package entity.base;

import entity.Usuario;

public class PersonalAdministrativo extends Usuario {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
