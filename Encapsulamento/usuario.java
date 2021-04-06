package Encapsulamento;

public class usuario {
    
    public static void main(String[] args){
        ControleRemoto c = new ControleRemoto();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.fecharMenu();
    }
}
