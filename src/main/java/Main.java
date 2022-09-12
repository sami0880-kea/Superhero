import java.util.Scanner;

public class Main {
    static int startInput;
    static boolean opretHelt = false;

    public static void main(String[] args) {
        do {
            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("9. Afslut");
            System.out.print("> ");

            Scanner sc = new Scanner(System.in);
            startInput = sc.nextInt();
            Database superhelte = new Database();

            opretHelt = true;
            if (startInput == 1) {
                superhelte.getAlleNavne();
            } else if (startInput == 9) {
                System.out.println("Program afsluttet!");
            } else {
                System.out.println("Fejl, vælg venligst et tal som er i menuen!");
            }
        } while (!opretHelt);
    }
}
