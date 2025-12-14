public class SleepEntry extends Entry {
    private double hoursSlept;

    public SleepEntry(String date, String notes, double hoursSlept) {
        super(date, notes);
        this.hoursSlept = hoursSlept;
    }

    public double getHoursSlept() { return hoursSlept; }

    @Override
    public void displayEntry() {
        System.out.println("\tSleep Hours: " + hoursSlept + " hrs");
        System.out.println("\tNotes: " + notes);
    }
}
