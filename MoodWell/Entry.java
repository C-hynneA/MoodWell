public abstract class Entry {
    protected String date;
    protected String notes;

    public Entry(String date, String notes) {
        this.date = date;
        this.notes = notes;
    }

    public String getDate() { return date; }
    public String getNotes() { return notes; }
    public abstract void displayEntry();
}
