import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainMenu {

    private User user;       
    private Scanner sc;
    private Random random;
    private String[] quotes = {
        "Rest, Reset, Restart.",
        "Being yourself is enough.",
        "Your feelings are valid. Your story matters.",
        "It's okay to take a break. Rest is productive.",
        "Taking a break doesn't mean you are stopping."
    };

    public MainMenu(User user, Scanner sc) {
        this.user = user;
        this.sc = sc;
        this.random = new Random();
    }


    public void showMenu() {
        while (true) {
            printDoubleLine();
            System.out.println("\t\tWELCOME, " + user.getUsername().toUpperCase() + "!");
            System.out.println("\t(" + quotes[random.nextInt(quotes.length)] + ")");
            printDoubleLine();
            System.out.println();

            System.out.println("\t1. Add Entry");
            System.out.println("\t2. View All Entries");
            System.out.println("\t3. Search Entry by Date");
            System.out.println("\t4. Show Mood Statistics");
            System.out.println("\t5. Log Out");
            System.out.println();
            System.out.print("\tChoose a number (1-5): ");
            
            String input = sc.nextLine();

            switch (input) {
                case "1": 
                    addEntryMenu(); 
                    break;
                case "2": 
                    viewAllEntries(); 
                    break;
                case "3": 
                    searchEntries(); 
                    break;
                case "4": 
                    showStatistics(); 
                    break;
                case "5":
                    System.out.println("\n\tLogging out...");
                    System.out.println("\tReturning to Account Menu.\n");
                    return;
                default:
                    System.out.println("\tInvalid Input. Please input numbers between 1-5 only.\n");
            }
        }
    }

    
    private void addEntryMenu() {
        while (true) {
            printDoubleLine();
            System.out.println("\t\tADD ENTRY");
            printDoubleLine();
            System.out.println();
            System.out.println("\t1. Mood Entry");
            System.out.println("\t2. Sleep Entry");
            System.out.println("\t3. Stress Level Entry");
            System.out.println("\t4. Back to Main Menu");
            System.out.println();
            System.out.print("\tChoose a number (1-4): ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1": 
                    addMoodEntry(); 
                    break;
                case "2": 
                    addSleepEntry(); 
                    break;
                case "3": 
                    addStressEntry(); 
                    break;
                case "4":
                    System.out.println("\tReturning to Main Menu...\n");
                    return;
                default:
                    System.out.println("\tInvalid input. Please enter a number between 1-4 only.\n");
            }
        }
    }

    private void addMoodEntry() {
        try {
            System.out.print("\tRate your mood today (1-10): ");
            int rating = Integer.parseInt(sc.nextLine());

            System.out.print("\tDate (yyyy-mm-dd): ");
            String date = sc.nextLine();

            System.out.print("\tNotes (optional): ");
            String notes = sc.nextLine();

            MoodEntry mood = new MoodEntry(date, notes, rating);
            user.addEntry(mood);

            System.out.println("\tMood entry added successfully!\n");
        } catch (NumberFormatException e) {
            System.out.println("\tInvalid numeric input! Please try again.\n");
        }
    }

    private void addSleepEntry() {
        try {
            System.out.print("\tEnter hours slept (0-24): ");
            double hours = Double.parseDouble(sc.nextLine());

            System.out.print("\tDate (yyyy-mm-dd): ");
            String date = sc.nextLine();

            System.out.print("\tNotes (optional): ");
            String notes = sc.nextLine();

            SleepEntry sleep = new SleepEntry(date, notes, hours);
            user.addEntry(sleep);

            System.out.println("\tSleep entry added successfully!\n");
        } catch (NumberFormatException e) {
            System.out.println("\tInvalid numeric input! Please try again.\n");
        }
    }


    private void addStressEntry() {
        try {
            System.out.print("\tRate your stress level today (1-10): ");
            int level = Integer.parseInt(sc.nextLine());

            System.out.print("\tDate (yyyy-mm-dd): ");
            String date = sc.nextLine();

            System.out.print("\tNotes (optional): ");
            String notes = sc.nextLine();

            StressEntry stress = new StressEntry(date, notes, level);
            user.addEntry(stress);

            System.out.println("\tStress entry added successfully!\n");
        } catch (NumberFormatException e) {
            System.out.println("\tInvalid numeric input! Please try again.\n");
        }
    }


    private void viewAllEntries() {
        printDoubleLine();
        System.out.println("\t\tVIEW ALL ENTRIES");
        printDoubleLine();
        System.out.println();

        ArrayList<Entry> list = user.getEntries();
        if (list.size() == 0) {
            System.out.println("\tNo entries found.\n");
            return;
        }

        System.out.println("\t----- " + user.getUsername() + "'s Entries -----");
        for (Entry e : list) {
            printLine();
            System.out.println("\tDate: " + e.getDate());
            e.displayEntry();
        }
        printLine();
        System.out.println("\tTotal Entries: " + list.size() + " day(s) logged.\n");
    }

   
    private void searchEntries() {
        printDoubleLine();
        System.out.println("\tSEARCH ENTRIES");
        printDoubleLine();
        System.out.println();

        System.out.print("\tEnter date to search (yyyy-mm-dd): ");
        String date = sc.nextLine();

        ArrayList<Entry> results = user.searchEntriesByDate(date);

        if (results.size() == 0) {
            System.out.println("\tNo entries found for " + date + ".\n");
            return;
        }

        System.out.println("\tFound " + results.size() + " entry(ies):");
        for (Entry e : results) {
            if (e instanceof MoodEntry) {
                MoodEntry m = (MoodEntry) e;
                System.out.println("\t[Mood] Rating: " + m.getMoodRating() + " | Notes: " + m.getNotes());
            } else if (e instanceof SleepEntry) {
                SleepEntry s = (SleepEntry) e;
                System.out.println("\t[Sleep] Hours: " + s.getHoursSlept() + " | Notes: " + s.getNotes());
            } else if (e instanceof StressEntry) {
                StressEntry st = (StressEntry) e;
                System.out.println("\t[Stress] Level: " + st.getStressLevel() + " | Notes: " + st.getNotes());
            }
        }
        System.out.println();
    }

  
    private void showStatistics() {
        printDoubleLine();
        System.out.println("\t\tMOOD STATISTICS");
        printDoubleLine();
        System.out.println();

        double avgMood = user.averageMood();
        double avgSleep = user.averageSleep();
        double avgStress = user.averageStress();

        System.out.printf("\tAverage Mood Rating: %.1f\n", avgMood);
        System.out.printf("\tAverage Sleep Hours: %.1f\n", avgSleep);
        System.out.printf("\tAverage Stress Level: %.1f\n", avgStress);

        if (avgMood < 5 || avgSleep < 6 || avgStress > 6) {
            System.out.println("\tTake care! You might need more rest or relaxation.\n");
        } else {
            System.out.println("\tKeep it up! You're maintaining a healthy balance.\n");
        }
    }


    private void printLine() {
        for (int i = 0; i < 50; i++) System.out.print("-");
        System.out.println();
    }

    private void printDoubleLine() {
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println();
    }
}

