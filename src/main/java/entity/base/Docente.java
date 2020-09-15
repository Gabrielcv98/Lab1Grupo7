package entity.base;

import entity.Usuario;

public class Docente extends Usuario {


    private String inicioAñoAct;
private int cantCursos;

    public String getInicioAñoAct() {
        return inicioAñoAct;
    }

    public void setInicioAñoAct(String inicioAñoAct) {
        this.inicioAñoAct = inicioAñoAct;
    }

    public int getCantCursos() {
        return cantCursos;
    }

    public void setCantCursos(int cantCursos) {
        this.cantCursos = cantCursos;
    }
}
