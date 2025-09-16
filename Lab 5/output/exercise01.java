package Lab005;
import java.util.Scanner;

class UnderAgeException extends Exception {
	public UnderAgeException(String message) {
		super(message);
		}
}

public class exercise01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        try {
            if (age < 18) {
                throw new UnderAgeException("You must be at least 18 years old!");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
        sc.close();
	}

} 
   