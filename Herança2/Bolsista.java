package Herança2;

public class Bolsista extends Pessoa {
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do " + this.nome);
    }
    
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagando mensalidade facilitada");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
