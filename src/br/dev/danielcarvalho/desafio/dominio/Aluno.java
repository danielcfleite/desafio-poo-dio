package br.dev.danielcarvalho.desafio.dominio;

import java.util.*;

public class Aluno {
    private static int ULTIMO_ID = 0;
    private String nome;
    private String documento;
    private int id;
    private int xp;
    private List<BootCamp> bootcampsInscrito = new ArrayList<>();
    private List<BootCamp> bootcampsConcluidos = new ArrayList<>();
    private Map<Teste, Double> pontuacoesTestes = new HashMap<>();
    private List<Modulo> modulosCompletos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Aluno(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
        this.id = ++ULTIMO_ID;
    }

    public Map<Teste, Double> getPontuacoesTestes(){
        return pontuacoesTestes;
    }

    public Double getPontuacoesTestes(Teste teste){
        return pontuacoesTestes.get(teste);
    }

    public List<BootCamp> getBootcampsInscrito() {
        return bootcampsInscrito;
    }

    public List<Modulo> getModulosCompletos() {
        return modulosCompletos;
    }


    public void cadastrarNoBootcamp(BootCamp bootcamp) {
        this.bootcampsInscrito.add(bootcamp);
        bootcamp.getAlunosCadastrados().add(this);
    }

    public void completarModulo(Modulo modulo) {
        double pontuacaoMinima = modulo.getTeste().getPontuacaoMinima();
        try {
            double pontuacaoAluno = pontuacoesTestes.get(modulo.getTeste());
            if (pontuacaoAluno > pontuacaoMinima) {
                this.modulosCompletos.add(modulo);
                this.xp += modulo.getQuantidadeXp();
            } else {
                System.out.println("O aluno não atingiu a pontuação necessária");
            }
        } catch (NullPointerException e) {
            System.out.println("O aluno não fez o teste");
        }
    }

    public void cadastrarNota(double nota, Teste teste) {
        this.pontuacoesTestes.put(teste, nota);
    }

    public void completarBootcamp(BootCamp bootcamp) {
        if (bootcamp.todasNotasMinimas(this)) {
            this.bootcampsInscrito.remove(bootcamp);
            this.bootcampsConcluidos.add(bootcamp);
        } else {
            System.out.println("O aluno não completou todos os cursos do bootcamp com nota mínima.");
        }
    }

}