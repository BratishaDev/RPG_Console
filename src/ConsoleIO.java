import java.util.Scanner;

public final class ConsoleIO {

    private static final Scanner scanner = new Scanner(System.in);

    public static int lireInt(String prompt) {
        System.out.println(prompt);
        boolean valide = false;
        int saisiInt = 0;
        do {
            String stringSaisi;
            stringSaisi = scanner.nextLine().trim();
            if (stringSaisi.isEmpty()) {
                return 1;
            } else {
                try {
                    saisiInt = Integer.parseInt(stringSaisi);
                    valide = true;
                } catch (NumberFormatException e) {
                    return 1;
                }
            }
        } while(!valide);
        return saisiInt;
    }
    public static String lireStr(String prompt) {
        System.out.println(prompt);
        boolean valide = false;
        String saisi;
        do {
            saisi = scanner.nextLine();
            if(!saisi.isEmpty()){
                valide = true;
            } else {
                System.out.println("Le saisie ne peut pas être vide. Veuillez réessayer.");
            }
        } while(!valide);
        return saisi;
    }
}