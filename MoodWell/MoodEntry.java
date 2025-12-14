public class MoodEntry extends Entry {
    private int moodRating;

    public MoodEntry(String date, String notes, int moodRating) {
        super(date, notes);
        this.moodRating = moodRating;
    }

    public int getMoodRating() { return moodRating; }

    @Override
    public void displayEntry() {
        System.out.println("\tMood Rating: " + moodRating + "/10");
        System.out.println("\tNotes: " + notes);
    }
}
