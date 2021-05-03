import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");

        String phoneNumber = sc.nextLine();
        boolean regular =  regularExpression.regularExpression(phoneNumber);
        System.out.println("Phone number is " + phoneNumber + " is valid: " + regular);
    }
}
