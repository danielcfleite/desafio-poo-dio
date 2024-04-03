package br.dev.danielcarvalho.desafio.dominio;

public class Teste {
    private int id;
    private int quantidadePerguntas;
    private double pontuacaoMinima;

    private static int ULTIMO_ID = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadePerguntas() {
        return quantidadePerguntas;
    }

    public void setQuantidadePerguntas(int quantidadePerguntas) {
        this.quantidadePerguntas = quantidadePerguntas;
    }

    public double getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(double pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }
}
