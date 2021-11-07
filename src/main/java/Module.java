package main.java;

import java.util.Scanner;

public class Module {
    private static boolean logedOut = false;

    public Module(final UserType userType) {
        Scanner scanner = new Scanner(System.in);
        boolean isChoiceIncorrect;
        switch (userType) {
            case ADMIN:
                System.out.println("\tAdmin Menu");
                System.out.println("1 - log out");
                System.out.println("2 - exit application\n");
                do {
                    System.out.print("-> ");
                    isChoiceIncorrect = false;
                    switch (scanner.nextLine()) {
                        case "1":
                            setLogedOut(true);
                            break;

                        case "2":
                            System.exit(0);
                            break;

                        default:
                            isChoiceIncorrect = true;
                    }
                } while (isChoiceIncorrect);
                break;

            case TEACHER:
                System.out.println("\tTeacher Menu");
                System.out.println("1 - log out");
                System.out.println("2 - exit application\n");
                do {
                    System.out.print("-> ");
                    isChoiceIncorrect = false;
                    switch (scanner.nextLine()) {
                        case "1":
                            setLogedOut(true);
                            break;

                        case "2":
                            System.exit(0);
                            break;

                        default:
                            isChoiceIncorrect = true;
                    }
                } while (isChoiceIncorrect);
                break;

            case STUDENT:
                System.out.println("\tStudent Menu");
                System.out.println("1 - log out");
                System.out.println("2 - exit application\n");
                do {
                    System.out.print("-> ");
                    isChoiceIncorrect = false;
                    switch (scanner.nextLine()) {
                        case "1":
                            setLogedOut(true);
                            break;

                        case "2":
                            System.exit(0);
                            break;

                        default:
                            isChoiceIncorrect = true;
                    }
                } while (isChoiceIncorrect);
                break;

            default:
                System.out.println("Error: incorrect user type");
                System.exit(1);
        }
    }

    public static void setLogedOut(final boolean _logedOut) {
        logedOut = _logedOut;
    }
    
    public static boolean hasLogedOut() {
        return logedOut;
    }
}
