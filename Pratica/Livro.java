package Pratica;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes(){
        return "Livro { título:" + titulo + ", autor: " + autor
                + "\n total de páginas: " + totPaginas + ", página atual:" + pagAtual
                + "\n livro aberto: " + aberto + ", Leitor do livro: " + leitor.getNome();
    }    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    //Métodos Setters e Getters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int tP) {
        this.totPaginas = tP;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pA) {
        this.pagAtual = pA;
    }

    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return leitor;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    //Métodos Abstratos
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
