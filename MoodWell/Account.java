import java.util.HashMap;
import java.util.Scanner;

public class Account {

    private Scanner sc = new Scanner(System.in);
    private HashMap<String, User> users = new HashMap<>(); 

    
    public void showMenu() {
        while (true) {
            System.out.println("\n");
            for (int i = 0; i < 50; i++) System.out.print("-");
            System.out.println("\n\t-------- ACCOUNT MENU ---------");
            System.out.println("\t1. Create Account");
            System.out.println("\t2. Log In");
            System.out.println("\t3. Exit Program");
            System.out.println();
            System.out.print("\tChoose a number (1-3): ");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    createAccount();
                    break;

                case "2":
                    logIn();
                    break;

                case "3":
                    System.out.println("\n\tThank you for using MoodWell!");
                    System.out.println("Remember: Self-care isn't selfish.");
                    return;

                default:
                    System.out.println("\tInvalid Input. Please input numbers between 1-3 only.");
            }
        }
    }

    private void createAccount() {
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println("\n\t\tCREATE ACCOUNT");
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println();

        System.out.print("\tEnter Account Name: ");
        String accName = sc.nextLine();

        System.out.print("\tEnter Username: ");
        String username = sc.nextLine();

        if (users.containsKey(username)) {
            System.out.println("\tThe username is unavailable. Please try another one.");
            return;
        }

        System.out.print("\tEnter Password: ");
        String password = sc.nextLine();

        
        User newUser = new User(accName, username, password);
        users.put(username, newUser);

        System.out.println("\tAccount Successfully Created!\n");
    }

    
    private void logIn() {
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println("\n\t\tLOG IN ACCOUNT");
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println();

        System.out.print("\tEnter Username: ");
        String username = sc.nextLine();

        System.out.print("\tEnter Password: ");
        String password = sc.nextLine();

        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            System.out.println("\tYou have successfully logged in!");
            System.out.println("\tWelcome, " + username + "!\n");
            MainMenu mainMenu = new MainMenu(users.get(username), sc);
            mainMenu.showMenu();
        } else {
            System.out.println("\tWrong username or password. Please try again.");
        }
    }
}
