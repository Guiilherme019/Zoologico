public class Anfibios extends Animal{

    private int numeroDeAnfibiosNoZoo;

    public Anfibios(String nomeCuidador, double custoMensal) {
        super(nomeCuidador, custoMensal);
        this.numeroDeAnfibiosNoZoo = 4;
    }

    public int getNumeroDeAnfibiosNoZoo() {
        return numeroDeAnfibiosNoZoo;
    }

    @Override
    public String toString() {
        return "numero de anfibo no zoo : " + numeroDeAnfibiosNoZoo;
    }
}
