public class EmailExampleTest {
    public static void main(String[] args) {
        String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        EmailExample emailExample = new EmailExample();
        for (String email: validEmail){
            boolean isValid = emailExample.emailTest(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email: invalidEmail){
            boolean isValid = emailExample.emailTest(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
