package Pratica;

public class Pratica{
     public static void main(String[] args){
         Pessoa[] p = new Pessoa[2];
         Livro[] l = new Livro[3];

         p[0] = new Pessoa("Paulo", 22, "H");
         p[1] = new Pessoa("Maria", 29, "M");

         l[0] = new Livro("Java Básico", "Pedrinho", 300, p[0]);
         l[1] = new Livro("POO Java", "Paulo Henrique", 500, p[1]);

         l[0].abrir();
         l[0].folhear(200);
         System.out.println(l[0].detalhes());
         System.out.println("----------");
         System.out.println(l[1].detalhes());
     }
}