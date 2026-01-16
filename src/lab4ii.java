// Interface definition
interface Motor {
    int capacity = 5;   // public static final by default

    void run();         // public abstract by default
    void consume();
}

// Class implementing the interface
class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity");
    }

    // Method to check interface data member
    void displayCapacity() {
        System.out.println("Motor Capacity = " + capacity);
    }
}

// Driver class
class InterfaceDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}

