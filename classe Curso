import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private String descricao;
    private ArrayList<Aluno> alunos;

    public Curso(String nomeCurso, String descricao) {
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos matriculados neste curso.");
        } else {
            System.out.println("Alunos matriculados no curso " + nomeCurso + ":");
            for (Aluno aluno : alunos) {
                System.out.println("Matrícula: " + aluno.getMatricula());
            }
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
