
class Insurance extends Bank {
    // Constructor for Insurance class
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method to indicate coverage
    public void cover() {
        System.out.println("You are covered.");
    }
}