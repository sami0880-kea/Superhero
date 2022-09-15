import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Database {
    Scanner sc = new Scanner(System.in);

    Superhero s1 = new Superhero("Bruce Wayne", "Batman", "Fight skills", 12083.40, 1939, true);
    ArrayList<Superhero> helteDatabase = new ArrayList<>(Arrays.asList(s1));
    ArrayList<Superhero> søgResultat = new ArrayList<Superhero>();
    ArrayList<Superhero> helteArray = new ArrayList<>();

    public void tilføjSuperhelt(String navn, String heltNavn, String heltPower, double heltStyrke, int heltOprindelse, boolean menneske) {
        helteDatabase.add(new Superhero(navn, heltNavn, heltPower, heltStyrke, heltOprindelse, menneske));
    }

    public void opretSuperhelt() {
        System.out.println("Tilføj en superhelt!");

        System.out.print("Oprindelig Navn: ");
        String hONavn = sc.nextLine();

        System.out.print("Helte navn: ");
        String hNavn = sc.nextLine();

        System.out.print("Superkrafter: ");
        String hPower = sc.nextLine();

        System.out.print("Indtast styrke i tal: ");
        double hStyrke = sc.nextDouble();

        System.out.print("Indtast oprindelse: ");
        int hOprindelse = sc.nextInt();

        System.out.print("Er din superhelt et menneske? (Ja/Nej): ");
        String oMenneske = sc.nextLine();

        boolean oMenneske2;
        if(oMenneske.toLowerCase() == "ja") {
            oMenneske2 = true;
        } else {
            oMenneske2 = false;
        }
        tilføjSuperhelt(hONavn, hNavn, hPower, hStyrke, hOprindelse, oMenneske2);
    }
    public ArrayList<Superhero> hentSuperhelte() { return helteDatabase; }

    public Superhero findSuperhelt() {
        System.out.print("Søg efter et navn: ");
        String søgHeltNavn = sc.nextLine();
        for (Superhero s : helteDatabase) {
            if(s.getHeltNavn().toLowerCase().contains(søgHeltNavn.toLowerCase())) {
                System.out.println(s);
            } else {
                System.out.println("Kunne ikke finde en superhelt med navnet '" + søgHeltNavn + "'.");
            }
        }
        return null;
    }

    public String getAlleNavne() {
        for(Superhero helt : helteDatabase) {
            System.out.println(helt.getNavn());
        }
        return null;
    }
}
