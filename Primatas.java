public class Primatas extends Animal {

 private int numeroDePrimatasNoZoo;

    public Primatas(String nomeCuidador, double custoMensal) {
        super(nomeCuidador, custoMensal);
    }


    public int getNumeroDePrimatasNoZoo() {
        return numeroDePrimatasNoZoo;
    }


    @Override
    public String toString() {
        return "Numero de Primatas No Zoo : " + numeroDePrimatasNoZoo;
    }

}