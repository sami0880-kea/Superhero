import java.util.Scanner;

public class UserInterface {
    public void startProgram() {
        int startInput = 0;

        do {
            System.out.print("""
                    Velkommen til SUPERHERO UNIVERSET.
                    1. Opret superhelt
                    2. Liste af superhelte
                    3. Søg efter en superhelt
                    9. Afslut
                    """);
            System.out.print("> ");

            Scanner sc = new Scanner(System.in);
            startInput = sc.nextInt();
            Database superhelte = new Database();

            if (startInput == 1) {
                superhelte.opretSuperhelt();
                break;
            } else if (startInput == 2) {
                superhelte.hentSuperhelte();
                break;
            } else if (startInput == 3) {
                superhelte.findSuperhelt();
                break;
            } else if (startInput == 9) {
                System.out.println("Program afsluttet!");
            } else {
                System.out.println("Fejl, vælg venligst et tal som er i menuen!");
            }
        } while (startInput != 9);
    }
}