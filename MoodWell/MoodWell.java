import java.util.Scanner;

public class MoodWell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account accountMenu = new Account();

        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println();
        System.out.println("\t\t\tMoodWell");
        System.out.println();
        System.out.println("\t\tWelcome to MoodWell!");
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println("\n");

        accountMenu.showMenu();
        sc.close();
    }
}
