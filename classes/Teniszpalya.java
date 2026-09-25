package classes;

public class Teniszpalya extends Sportpalya{

    private String boritas;
    private boolean parosMerkozes;


    public Teniszpalya(String kod, int berletiDij, String boritas, boolean parosMerkozes) {
        super(kod, berletiDij);
        this.boritas = boritas;
        this.parosMerkozes = parosMerkozes;
    }


    public String getBoritas() {
        return boritas;
    }

    public boolean isParosMerkozes() {
        return parosMerkozes;
    }

    public Teniszpalya setBoritas(String boritas) {
        this.boritas = boritas;
        return this;
    }

    public Teniszpalya setParosMerkozes(boolean parosMerkozes) {
        this.parosMerkozes = parosMerkozes;
        return this;
    }

}
