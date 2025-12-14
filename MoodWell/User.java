import java.util.ArrayList;

public class User {

    private String accName;
    private String username;
    private String password;
    private ArrayList<Entry> entries;

    public User(String accName, String username, String password) {
        this.accName = accName;
        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
    }

    public String getAccName() { return accName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void addEntry(Entry entry) { entries.add(entry); }
    public ArrayList<Entry> getEntries() { return entries; }

    public ArrayList<Entry> searchEntriesByDate(String date) {
        ArrayList<Entry> results = new ArrayList<>();
        for (Entry e : entries) {
            if (e.getDate().equals(date)) results.add(e);
        }
        return results;
    }

    public double averageMood() {
        int count = 0;
        double total = 0;
        for (Entry e : entries) {
            if (e instanceof MoodEntry) {
                total += ((MoodEntry) e).getMoodRating();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public double averageSleep() {
        int count = 0;
        double total = 0;
        for (Entry e : entries) {
            if (e instanceof SleepEntry) {
                total += ((SleepEntry) e).getHoursSlept();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public double averageStress() {
        int count = 0;
        double total = 0;
        for (Entry e : entries) {
            if (e instanceof StressEntry) {
                total += ((StressEntry) e).getStressLevel();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }
}
