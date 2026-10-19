public class StudyRoomDemo {
    public static void main(String[] args) {
        
        System.out.println("1. Room Trace (Capacity: 6) ");
        StudyRoom room = new StudyRoom("Empty Room", 6);
        printState(room, "initial state: ");

        printState(room, "reserve(4)", room.reserve(4));
        printState(room, "reserve(3)", room.reserve(3));
        printState(room, "cancel(2)",  room.cancel(2));
        printState(room, "reserve()",  room.reserve());
        printState(room, "reserve(3)", room.reserve(3));
        printState(room, "cancel(7)",  room.cancel(7));
        printState(room, "reserve(0)", room.reserve(0));
        printState(room, "cancel(-1)", room.cancel(-1));

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("2. Constructor Exception Checks");
        checkConstructor(null, 5);
        checkConstructor("   ", 5);
        checkConstructor("Zero Room", 0);
        checkConstructor("Negative Room", -1);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();       

        System.out.println("3. Default Capacity Check");
        StudyRoom defaultRoom = new StudyRoom("Regular Room");
        System.out.println("new StudyRoom(\"Regular Room\") - capacity = "
                + defaultRoom.getCapacity() + " (4 guests)");

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();  

      
      
        System.out.println("4. Full Cancellation Check");
      
        StudyRoom full = new StudyRoom("Full Cancel Room", 5); 
        full.reserve(5);
        
        System.out.println("Reserved all 5 seats, reserved: " + full.getReserved());
      
        boolean unavailable = full.cancel(5);
        System.out.println("cancel(5) " + unavailable + ", reserved : " + full.getReserved() + ", remaining = " + full.getRemaining());

      
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();        
      
System.out.println("5. Independent Room vs Alias");
        StudyRoom independent = new StudyRoom("Independent Room", 6);
        StudyRoom alias = room;

        System.out.println("Alias reserved: " + alias.getReserved());
        System.out.println("Independent reserved: " + independent.getReserved());
    }

    private static void printState(StudyRoom r, String action) {
        System.out.println(action + " reserved: " + r.getReserved());
    }

    private static void printState(StudyRoom r, String action, boolean result) {
        System.out.println(action + " result: " + result + " reserved: " + r.getReserved());
    }

    private static void checkConstructor(String title, int capacity) {
        try {
            new StudyRoom(title, capacity);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught successfully");
        }
    }
}
