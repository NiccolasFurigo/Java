package Herança2;

public class Projeto {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        v1.setNome("Jorge");
        v1.setSexo("H");
        v1.setIdade(35);

        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setIdade(20);
        b1.setSexo("M");

        Aluno n1 = new Aluno();
        n1.setNome("André");
        n1.setIdade(40);
        n1.setSexo("H");

        System.out.println(v1.toString());
        System.out.println(b1.toString());
        System.out.println(n1.toString());
    }
}
