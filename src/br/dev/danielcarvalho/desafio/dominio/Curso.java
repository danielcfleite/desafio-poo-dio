package br.dev.danielcarvalho.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo{
    private int cargaHoraria;
    private List<Modulo> moduloList = new ArrayList<>();

    public Curso(String titulo, String descricao){
        super(titulo, descricao);
    }

    public List<Modulo> getModulos(){
        return moduloList;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }


}
