public class StudyRoom {
    private String title;
    private final int capacity;
    private int reserved;

    public StudyRoom(String inputTitle, int inputCapacity) {
        if (inputTitle == null) {
            throw new IllegalArgumentException("Error: The title is null or blank.");
        }
        if (inputTitle.trim().isBlank()) {
            throw new IllegalArgumentException("Error: The title is null or blank.");
        }
        if (inputCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be more than 0.");
        }
        title = inputTitle.trim();
        capacity = inputCapacity;
        reserved = 0;
    }

    public StudyRoom(String inputTitle) {
        this(inputTitle, 4);
    }

    public String getTitle()  {
    return title; 
    }
    
    public int getCapacity()  { 
        return capacity; 
    }
    
    
    public int getReserved()  
    {
    return reserved;
    }
    
    
    public int getRemaining() 
    {
    return capacity - reserved;
    }

    public boolean reserve(int seats) {
        if (seats <= 0) {
            return false;
        }
        if (seats > getRemaining()) {
            return false;
        }
        reserved += seats;
        return true;
    }

    
    public boolean reserve() {
        return reserve(1);
    }

    public boolean cancel(int seats) {
        if (seats <= 0) {
            return false;
        }
        if (seats > reserved) {
            return false;
        }
        reserved -= seats;
        return true;
    }
}
