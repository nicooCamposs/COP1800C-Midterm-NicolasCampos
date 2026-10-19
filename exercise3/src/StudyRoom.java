public class StudyRoom {
    private String Title;
    private final int Capacity;
    private int Reserved;

    public StudyRoom(String Title, int Capacity) {
        if (Title == null || Title.trim().isEmpty()) {
            throw new IllegalArgumentException("The Title must not be null or blank.");
        }
        if (Capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.Title = Title.trim();
        this.Capacity = Capacity;
        this.Reserved = 0;
    }

    public StudyRoom(String Title) {
        this(Title, 4);
    }

    public String getTitle()  { return Title; }
    public int getCapacity()  { return Capacity; }
    public int getReserved()  { return Reserved; }
    public int getRemaining() { return Capacity - Reserved; }

    public boolean reservation(int seats) {
        if (seats <= 0 || seats > getRemaining()) {
            return false;
        }
        Reserved += seats;
        return true;
    }

    public boolean reservation() {
        return reservation(1);
    }

    public boolean cancel(int seats) {
        if (seats <= 0 || seats > Reserved) {
            return false;
        }
        Reserved -= seats;
        return true;
    }
}
