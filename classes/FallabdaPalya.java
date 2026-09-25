package classes;

public class FallabdaPalya extends Sportpalya{

    private double belmagassag;

    public FallabdaPalya(String kod, int berletiDij, double belmagassag) {
        super(kod, berletiDij);
        this.belmagassag = belmagassag;
    }

    public double getBelmagassag() {
        return belmagassag;
    }

    public void setBelmagassag(float belmagassag) {
        this.belmagassag = belmagassag;
    }
}
