package Herança2;

public class Aluno extends Pessoa {
    private int matriculas;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno" + this.nome);
    }

    public int getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(int matriculas) {
        this.matriculas = matriculas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
