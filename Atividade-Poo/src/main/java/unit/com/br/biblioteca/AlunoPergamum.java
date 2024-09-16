package unit.com.br.biblioteca;

import java.util.ArrayList;

public class AlunoPergamum {

    private int matricula;
    private String nomeAluno;
    private ArrayList<Integer> emprestimos;


    public ArrayList<Integer> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Integer> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    boolean emprestarLivro (LivroPergamum livro) {
        return true;
    }

    boolean devolverLivro (LivroPergamum livro){
        return false;
    }

    public AlunoPergamum(){}

    public void Pergamum(int matricula, String nomeAluno, int totalLivros){
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.emprestimos = new ArrayList<>(totalLivros);
    }


}
