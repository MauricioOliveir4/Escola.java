import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private String endereco;
    private Pessoa diretor;
    private ArrayList<Curso> cursos;

    public Escola(String nomeEscola, String endereco, Pessoa diretor) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.diretor = diretor;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Não há cursos cadastrados nesta escola.");
        } else {
            System.out.println("Cursos oferecidos pela escola " + nomeEscola + ":");
            for (Curso curso : cursos) {
                System.out.println("Nome do curso: " + curso.getNomeCurso());
            }
        }
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
