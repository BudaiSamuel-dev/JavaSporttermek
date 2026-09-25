package classes;

public  abstract class Sportpalya {

    //Mezőváltozók
    protected String kod;
    protected int berletiDij;

    public Sportpalya(String kod, int berletiDij) {
        this.kod = kod;
        this.berletiDij = berletiDij;
    }

    public String getKod() {
        return kod;
    }

    public int getBerletiDij() {
        return berletiDij;
    }


    //Egyéb metódusok
    public String getInfo(){
        return String.format("%s - > %d Ft/óra", kod, berletiDij);
    }
}
