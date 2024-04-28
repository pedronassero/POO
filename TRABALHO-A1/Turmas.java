import java.util.List;
import java.util.ArrayList;

public class Turmas {
    
    private Professores professor;
    private Disciplinas disciplina;
    private List<Alunos> alunos;
    
    public Turmas(Professores professor, Disciplinas disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }
    
    public void addAluno(Alunos aluno) {
        alunos.add(aluno);
    }
    
    public Professores getProfessor() {
        return professor;
    }
    
    public Disciplinas getDisciplina() {
        return disciplina;
    }
    
    public List<Alunos> getAlunos() {
        return alunos;
    }
    
}