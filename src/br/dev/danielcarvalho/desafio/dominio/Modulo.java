package br.dev.danielcarvalho.desafio.dominio;

public class Modulo {
    private static int ULTIMO_ID = 0;
    private int quantidadeDeAulas;
    private int cargaHoraria;
    private Teste teste;
    private Curso curso;

    private int quantidadeXp;

    public int getQuantidadeXp() {
        return quantidadeXp;
    }

    public Teste getTeste(){
        return teste;
    }

    public void setTeste(Teste teste){
        this.teste = teste;
    }

    public static int getUltimoId() {
        return ULTIMO_ID;
    }

    public static void setUltimoId(int ultimoId) {
        ULTIMO_ID = ultimoId;
    }

    public int getQuantidadeDeAulas() {
        return quantidadeDeAulas;
    }

    public void setQuantidadeDeAulas(int quantidadeDeAulas) {
        this.quantidadeDeAulas = quantidadeDeAulas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setQuantidadeXp(int quantidadeXp) {
        this.quantidadeXp = quantidadeXp;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "quantidadeDeAulas=" + quantidadeDeAulas +
                ", cargaHoraria=" + cargaHoraria +
                ", teste=" + teste +
                ", curso=" + curso +
                ", quantidadeXp=" + quantidadeXp +
                '}';
    }
}
