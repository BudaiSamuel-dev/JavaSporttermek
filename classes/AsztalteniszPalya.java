package classes;

public class AsztalteniszPalya extends Sportpalya {

    private String alapterulet;
    private String asztalSzine;

    public AsztalteniszPalya(String kod, int berletiDij, String alapterulet, String asztalSzine ) {
        super(kod, berletiDij);
        this.alapterulet = alapterulet;
        this.asztalSzine = asztalSzine;
    }

    public String getAlapterulet() {
        return alapterulet;
    }

    public AsztalteniszPalya setAlapterulet(String alapterulet) {
        this.alapterulet = alapterulet;
        return this;
    }

    public String getAsztalSzine() {
        return asztalSzine;
    }

    public AsztalteniszPalya setAsztalSzine(String asztalSzine) {
        this.asztalSzine = asztalSzine;
        return this;
    }

    //Egyéb metódusok
    public double getAlapteruletNm(){
        double alapteruletNm = 0;

        double a = Double.parseDouble( alapterulet.replace('m', ' ').split("x")[0].trim());
        double b = Double.parseDouble( alapterulet.replace('m', ' ').split("x")[1].trim());

        alapteruletNm = a*b;

        return alapteruletNm;
    }

    public String getParentInfo(){
        return super.getInfo();
    }

    @Override
    public String getInfo(){
        return String.format("Bérleti díj: %d Ft/h, %.2f nm, %s asztal", berletiDij, getAlapteruletNm(), asztalSzine);
    }
}
