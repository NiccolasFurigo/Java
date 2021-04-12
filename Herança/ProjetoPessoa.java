package Herança;

public class ProjetoPessoa {

    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Paulo");
        p2.setNome("Maria");
        p3.setNome("José");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.6f);
        p4.setSetor("Estoque");
        
    }
}
