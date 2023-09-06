import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno  aluno;

    @BeforeEach
    void setUp(){
        aluno = new Aluno();
    }

    @Test
    void setAlunoRetornaInvalido(){
        try{
            String nome="";
            aluno.setNome(nome);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Nome vazio!", e.getMessage());
        }
    }

    @Test
    void setNomeCursoRetornaInvalido(){
        try{
            String nomeCurso="";
            aluno.setNomeCurso(nomeCurso);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Nome do Curso Vazio!", e.getMessage());
        }
    }

    @Test
    void imprimirDiplomaCorreto(){
        aluno.setNome("Fulano");
        aluno.setNomeCurso("Sistemas de Informação");
        String conteudo = Diploma.getInstancia().formata(aluno);
        assertEquals("Diploma do aluno Fulano do curso Sistemas de Informação", conteudo);
    }
}