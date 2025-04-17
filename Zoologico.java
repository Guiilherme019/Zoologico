
public class Zoologico {
   private int numeroVisitantesNoZoo;
   private double precoEntrada;
   public Zoologico(int numeroVisitantesNoZoo, double precoEntrada) {
       this.numeroVisitantesNoZoo = numeroVisitantesNoZoo;
       this.precoEntrada = precoEntrada;
   }

    public int getnumeroVisitantesNoZoo() {
       return numeroVisitantesNoZoo;
    }

public double getPrecoEntrada() {
       return precoEntrada;
}




    @Override
    public String toString() {
        return "Animal{" + ", NumeroVisitantesNoZoo= " + numeroVisitantesNoZoo + "Preço Da Entrada= " + precoEntrada + "}";
    }
}

