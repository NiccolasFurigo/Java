package Encapsulamento;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Método Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    //Métodos Especiais
    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    //Controlador
    @Override
    public void ligar() {
        if(this.getLigado() == false){
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado() == true){
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for(int i = 0; i < this.getVolume(); i++){
                System.out.println('|');
            }
            System.out.println("");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
