package br.dev.danielcarvalho.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class BootCamp {
    private static int ULTIMO_ID = 0;

    private int id;
    private List<Conteudo> conteudoList = new ArrayList<>();
    private List<Aluno> alunosCadastrados = new ArrayList<>();

    public BootCamp(){
        this.id = ++ULTIMO_ID;
    }

    public static int getUltimoId() {
        return ULTIMO_ID;
    }

    public static void setUltimoId(int ultimoId) {
        ULTIMO_ID = ultimoId;
    }

    public List<Conteudo> getConteudoList() {
        return conteudoList;
    }

    public void setConteudoList(List<Conteudo> conteudoList) {
        this.conteudoList = conteudoList;
    }

    public List<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public void setAlunosCadastrados(List<Aluno> alunosCadastrados) {
        this.alunosCadastrados = alunosCadastrados;
    }

    public int getId(){
        return id;
    }

    public boolean todasNotasMinimas(Aluno aluno) {
        for (Conteudo conteudo : conteudoList) {
            if (conteudo instanceof Curso) {
                Curso curso = (Curso) conteudo;
                for (Modulo modulo : curso.getModulos()) {
                    Teste teste = modulo.getTeste();
                    Double notaAluno = aluno.getPontuacoesTestes(teste);
                    if (notaAluno == null || notaAluno < teste.getPontuacaoMinima()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
