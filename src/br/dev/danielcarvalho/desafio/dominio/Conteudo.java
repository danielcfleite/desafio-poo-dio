package br.dev.danielcarvalho.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {
    private static int ULTIMO_ID = 0;
    private String titulo;
    private String descricao;
    private int id;

    public Conteudo(String titulo, String descricao){
        this.id = ++ULTIMO_ID ;
        this.titulo = titulo;
        this.descricao = descricao;
    }
}
