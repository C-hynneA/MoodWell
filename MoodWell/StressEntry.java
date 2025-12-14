public class StressEntry extends Entry {
    private int stressLevel;

    public StressEntry(String date, String notes, int stressLevel) {
        super(date, notes);
        this.stressLevel = stressLevel;
    }

    public int getStressLevel() { return stressLevel; }

    @Override
    public void displayEntry() {
        System.out.println("\tStress Level: " + stressLevel + "/10");
        System.out.println("\tNotes: " + notes);
    }
}
