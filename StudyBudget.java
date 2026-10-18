///Nicolás Campos - Java Midterm Exercise 1

public class StudyBudget {
    private static final int Blocks = 30;
    private static final int FeePerBlock = 5;
    private static final double Discount = 0.20;

    public static void main(String[] args) {
        String name = " Ana Lee ";
        int minutes = 95;
        boolean ActiveMembership = true;

        if (name.trim().isBlank()) {
            System.out.print("Error: Your name is blank.");
            return;
        }

        if (minutes <= 0) {
            System.out.println("Error: Time has to be greater than zero.");
            return;
        }

        String cleanName = name.trim();
        String upperName = cleanName.toUpperCase();
        char firstLetter = cleanName.charAt(0);

        int blocks = minutes / Blocks;
        int leftover = minutes % Blocks;
        double baseFee = blocks * FeePerBlock;

        boolean hasDiscount = ActiveMembership && (blocks >= 4);

        double discount = 0.0;
        double finalFee = baseFee;

        if (hasDiscount) {
            discount = baseFee * Discount;
            finalFee = baseFee - discount;
        }

        System.out.println("--- Study Budget ---");
        System.out.println("Student name: " + cleanName);
        System.out.println("Uppercase name: " + upperName);
        System.out.println("Initial: " + firstLetter);
        System.out.println("Membership active: " + ActiveMembership);
        System.out.println("Time blocks: " + blocks + " and " + leftover + " minutes");
        System.out.printf("Base fee: $%.2f%n", baseFee);
        System.out.println("Gets discount?: " + hasDiscount);
        System.out.println("Discount amount: " + discount + "%$");
        System.out.println("Final fee:" + finalFee);
    }
}
