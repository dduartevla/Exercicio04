public class Diploma implements IDiploma{

    private Diploma() {}

    private static Diploma diploma = new Diploma();

    public static Diploma getInstancia(){
        return diploma;
    }

    public String formata(Aluno aluno){

        String conteudoDiploma;

        conteudoDiploma = ("Diploma do aluno " + aluno.getNome() + " do curso " + aluno.getNomeCurso());

        return conteudoDiploma;
    }
}
