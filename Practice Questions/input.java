package Project;
import java.util.Scanner; 
public class input {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Addition of "+ num +" and "+ num +" number: " + (num + num));
		
		sc.close();
	}
	

}
