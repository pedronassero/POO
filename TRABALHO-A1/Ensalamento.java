import java.util.List;
import java.util.ArrayList;

public class Ensalamento {
    
    private static List<Turmas> turmas = new ArrayList<>();
    
    public static void execEnsalamento() {
        
        //Disciplinas
        Disciplinas disc1 = new Disciplinas("POO");
        Disciplinas disc2 = new Disciplinas("Estrutura de Dados");
        Disciplinas disc3 = new Disciplinas("BI");
        Disciplinas disc4 = new Disciplinas("fabrica");
        
        //Cursos
        Cursos TI = new Cursos("TI");
        Cursos ADM = new Cursos("ADM");
        Cursos ENG = new Cursos("ENG");
        TI.addDisciplina(disc1);
        TI.addDisciplina(disc2);
        ADM.addDisciplina(disc3);
        ENG.addDisciplina(disc4);
        
        //Professores
        Professores prof1 = new Professores("Mia", disc1);
        Professores prof2 = new Professores("Saulo", disc2);
        Professores prof3 = new Professores("Paula", disc3);
        
        //Alunos
        List<Alunos> alunos = new ArrayList<>();
        alunos.add(new Alunos("Alfredo", TI));
        alunos.add(new Alunos("Amélia", TI));
        alunos.add(new Alunos("Ana", ADM));
        alunos.add(new Alunos("Bruno", TI));
        alunos.add(new Alunos("Bentinho", ADM));
        alunos.add(new Alunos("Capitú", TI));
        alunos.add(new Alunos("Debra", TI));
        alunos.add(new Alunos("Ian", ADM));
        alunos.add(new Alunos("Iracema", TI));
        alunos.add(new Alunos("Joelmir", ADM));
        alunos.add(new Alunos("Julieta", TI));
        alunos.add(new Alunos("Luana", ADM));
        alunos.add(new Alunos("Luciana", TI));
        alunos.add(new Alunos("Majô", ADM));
        alunos.add(new Alunos("Maria", ADM));
        alunos.add(new Alunos("Norberto", TI));
        alunos.add(new Alunos("Paulo", ADM));
        alunos.add(new Alunos("Romeu", ADM));
        alunos.add(new Alunos("Wendel", TI));
        alunos.add(new Alunos("Zoey", TI));
        
        //Turmas
        turmas.add(new Turmas(prof1, disc1));
        turmas.add(new Turmas(prof2, disc2));
        turmas.add(new Turmas(prof3, disc3));
        
        
        //Ensalando
        for (Turmas turma : turmas) {
            Disciplinas discTurma = turma.getDisciplina();
            
            for (Alunos aluno : alunos) {
                Cursos cursoAluno = aluno.getCurso();
                
                boolean achou = false;
                for (Disciplinas disciplinaCurso : cursoAluno.getDisciplinas()) {
                    if (disciplinaCurso.equals(discTurma)) {
                        achou = true;
                        break;
                    }
                }
                
                if (achou) {
                    turma.addAluno(aluno);
                }
            }
        }
    }
    
    public static void imprimirTurmasEAlunos() {
        for (Turmas turma : turmas) {
            System.out.println("\nTurma: " + turma.getDisciplina().getNome());
            System.out.println("Professor: " + turma.getProfessor().getNome());
            System.out.println("Alunos:");
            for (Alunos aluno : turma.getAlunos()) {
                System.out.println("- " + aluno.getNome());
            }
        }
    }
    
}