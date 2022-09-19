import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Database {
    Scanner sc = new Scanner(System.in);
    UserInterface UI = new UserInterface();

    Superhero s1 = new Superhero("Bruce Wayne", "Batman", "Fight skills", 12083.40, 1939, true);
    ArrayList<Superhero> helteDatabase = new ArrayList<>(Arrays.asList(s1));

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
        int hOprindelse = TjekInt();

        System.out.print("Er din superhelt et menneske? (Ja/Nej): ");
        boolean oMenneske = sc.nextBoolean();

        tilføjSuperhelt(hONavn, hNavn, hPower, hStyrke, hOprindelse, oMenneske);

        UI.startProgram();
    }

    public void hentSuperhelte() {
        //     public ArrayList<Superhero> hentSuperhelte() { return helteDatabase; }
        for (Superhero s : helteDatabase) {
            System.out.println(s.getNavn() + ", " + s.getHeltNavn() + ", " + s.getHeltPower() + ", " + s.getHeltStyrke() + ", " + s.getHeltOprindelse() + ", " + s.getMenneske());
        }
    }
    public Superhero findSuperhelt() {
        System.out.print("Søg efter et superhelt navn: ");
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

    public void redigerSuperhelt() {
        ArrayList<Superhero> søgResultat = new ArrayList<Superhero>(helteDatabase);

        for(int i = 0; i < søgResultat.size(); i++) {
            System.out.println(i+1 + ": " + søgResultat.get(i));
        }

        System.out.println("Indtast nummer på den superhelt der skal redigeres: ");
        int nr = TjekInt();
        sc.nextLine();

        Superhero redigerHelt = søgResultat.get(nr-1);
        System.out.println("Redigere superhelt " + redigerHelt);

        System.out.print("Oprindelig Navn: " + redigerHelt.getNavn() + " ");
        String hONavn = sc.nextLine();
        if(!hONavn.isEmpty()) {
            redigerHelt.setNavn(hONavn);
        }

        System.out.print("Helte navn: " + redigerHelt.getHeltNavn() + " ");
        String hNavn = sc.nextLine();
        if(!hNavn.isEmpty()) {
            redigerHelt.setHeltNavn(hNavn);
        }

        System.out.print("Superkrafter: " + redigerHelt.getHeltPower() + " ");
        String hPower = sc.nextLine();
        if(!hPower.isEmpty()) {
            redigerHelt.setHeltPower(hPower);
        }

        System.out.print("Indtast styrke i tal: " + redigerHelt.getHeltStyrke() + " ");
        String hStyrke = sc.nextLine();
        if(!hStyrke.isEmpty()) {
            redigerHelt.setHeltStyrke(Double.parseDouble(hStyrke));
        }

        System.out.print("Indtast oprindelse: " + redigerHelt.getHeltOprindelse() + " ");
        String hOprindelse = sc.nextLine();
        if(!hOprindelse.isEmpty()) {
            redigerHelt.setHeltStyrke(Integer.parseInt(hOprindelse));
        }

        System.out.print("Er din superhelt et menneske? (Ja/Nej): " + redigerHelt.getMenneske() + " ");
        String oMenneske = sc.nextLine();
        if(!oMenneske.isEmpty()) {
            boolean oMenneske2;
            if(oMenneske.toLowerCase() == "ja") {
                oMenneske2 = true;
            } else {
                oMenneske2 = false;
            }
            redigerHelt.setMenneske(oMenneske2);
        }

    }

    public String getAlleNavne() {
        for(Superhero helt : helteDatabase) {
            System.out.println(helt.getNavn());
        }
        return null;
    }

    public int TjekInt() {
        while(!sc.hasNextInt()) {
            System.out.print("> '" + sc.next() + "' er ikke et tal. Prøv igen!: ");
        }
        return sc.nextInt();
    }
}

