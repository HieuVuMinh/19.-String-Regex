import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String className = sc.nextLine();

        boolean validClassName = validateNameClass.validateNameClass(className);
        System.out.println("Name is " + className + " is valid: " + validClassName);
    }
}

