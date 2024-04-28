public class Alunos extends Pessoas {
    
    private Cursos curso;
    
    public Alunos(String nome, Cursos curso) {
        super(nome);
        this.curso = curso;
    }
    
    
    public Cursos getCurso() {
        return curso;
    }
}