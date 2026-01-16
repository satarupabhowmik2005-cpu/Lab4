import java.util.Scanner;

// Abstract class
abstract class student {
    int rollno;
    long regno;

    // Method to take input
    void getinput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        rollno = sc.nextInt();

        System.out.print("Enter Registration no: ");
        regno = sc.nextLong();
    }

    // Abstract method
    abstract void course();
}

// Subclass
class kiitian extends student {

    // Implementation of abstract method
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    // Method to display details
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

// Driver class
 class AbstractDemo {
    public static void main(String[] args) {

        kiitian k = new kiitian();
        k.getinput();
        k.display();
    }
}
