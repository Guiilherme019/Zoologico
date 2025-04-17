public class Felinos extends Animal {

    private int numeroDeFelinosNoZoo;

    public Felinos(String nomeCuidador, double custoMensal) {
        super(nomeCuidador, custoMensal);
        this.numeroDeFelinosNoZoo = 15;
    }

    public int getNumeroDeFelinosNoZoo() {
        return numeroDeFelinosNoZoo;
    }

    public String toString() {
        return "numero de Felinos no Zoo : " + numeroDeFelinosNoZoo;
    }
}
