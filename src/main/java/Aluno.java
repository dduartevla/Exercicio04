public class Aluno {
    private  String nome;
    private String nomeCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            throw new IllegalArgumentException("Nome vazio!");
        }
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        if (nomeCurso.isEmpty()) {
            throw new IllegalArgumentException("Nome do Curso Nulo!");
        }
        this.nomeCurso = nomeCurso;
    }

    public String imprimirDiploma(IDiploma diploma){
        if (diploma==null){
            throw new NullPointerException("Diploma é nulo.");
        }

        String conteudoDiploma = diploma.formata(this);

        return conteudoDiploma;
    }
}
