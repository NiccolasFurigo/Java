package Polimorfismo;

public class Programa {
    public static void main(String[] args){
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir(11, 45);
        c.reagir(true);
        c.reagir(2, 17.5f);
    }
}
