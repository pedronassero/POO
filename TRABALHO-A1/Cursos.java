import java.util.List;
import java.util.ArrayList;

public class Cursos {
    
    public String nome;
    List<Disciplinas> disciplinas;
    
    public Cursos(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addDisciplina(Disciplinas disciplina) {
        disciplinas.add(disciplina);
    }
    
    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }
}