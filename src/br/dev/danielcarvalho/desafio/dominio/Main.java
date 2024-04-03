package br.dev.danielcarvalho.desafio.dominio;

public class Main {
    public static void main(String[] args) {
        //criar curso
        Curso curso = new Curso("Java", "Curso Java");
        curso.setCargaHoraria(2);

        //criar modulo e teste
        Modulo modulo = new Modulo();
        modulo.setCurso(curso);
        Teste teste = new Teste();
        teste.setPontuacaoMinima(7);
        modulo.setTeste(teste);


        //criar bootcamp e colocar modulo
        BootCamp bootcamp = new BootCamp();
        bootcamp.getConteudoList().add(curso);

        //criar aluno
        Aluno daniel = new Aluno("Daniel", "000-00-000");
        daniel.cadastrarNoBootcamp(bootcamp);

        //cadastrar nota modulo
        daniel.cadastrarNota(8, teste);

        daniel.completarModulo(modulo);

        System.out.println(daniel.getPontuacoesTestes().get(teste));
        System.out.println(teste.getPontuacaoMinima());

        daniel.getModulosCompletos().forEach(System.out::println);




        Aluno aluno = new Aluno("Daniel", "202");

    }
}
