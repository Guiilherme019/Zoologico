public class Aguario extends Animal {

    private int numeroDeAnimaisNoAguario;

    public Aguario(String nomeCuidador, double custoMensal) {
        super(nomeCuidador, custoMensal);
        this.numeroDeAnimaisNoAguario = 30;
    }

    public int getNumeroDeAnimaisNoAguario() {
        return numeroDeAnimaisNoAguario;
    }
}
