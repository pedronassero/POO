public class Professores extends Pessoas {
    
    private Disciplinas disciplina;
    
    public Professores(String nome, Disciplinas disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() {
        return disciplina.nome;
    }
    
}