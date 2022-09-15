public class Superhero {
    private String navn;
    private String heltNavn;
    private String heltPower;

    private double heltStyrke;
    private int heltOprindelse;
    private boolean menneske;

    public Superhero(String navn, String heltNavn, String heltPower, double heltStyrke, int heltOprindelse, boolean menneske) {
        this.navn = navn;
        this.heltNavn = heltNavn;
        this.heltPower = heltPower;
        this.heltStyrke = heltStyrke;
        this.heltOprindelse = heltOprindelse;
        this.menneske = menneske;
    }

    // Get Metoder
    public String getNavn() {
        return navn;
    }
    public String getHeltNavn() {
        return heltNavn;
    }
    public String getHeltPower() {
        return heltPower;
    }
    public int getHeltOprindelse() {
        return heltOprindelse;
    }
    public double getHeltStyrke() {
        return heltStyrke;
    }
    public boolean getMenneske() {
        return menneske;
    }

    // Set Metoder
    public String setNavn( String navn) {
        return this.navn = navn;
    }
    public String setHeltNavn( String heltNavn) {
        return this.heltNavn = heltNavn;
    }
    public String setHeltPower( String heltPower) {
        return this.heltPower = heltPower;
    }
    public int setHeltOprindelse( int heltOprindelse) {
        return this.heltOprindelse = heltOprindelse;
    }
    public double setHeltStyrke( double heltStyrke) {
        return this.heltStyrke = heltStyrke;
    }
    public boolean setMenneske( boolean menneske) {
        return this.menneske = menneske;
    }

    @Override
    public String toString() {
        return heltNavn + " (" + navn + ")";
    }
}
