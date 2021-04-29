public class Main {
    public static void main(String[] args) {
        String[] validAccount = new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh"};
        String[] inValidAccount = new String[] {".@", "12345", "1234_", "abcde"};

        EmailRegular emailRegular = new EmailRegular();
        for(String account: validAccount){
            boolean valid = emailRegular.emailRegular(account);
            System.out.println("Account is " + account +" is valid: "+ valid);
        }
        for(String account: inValidAccount){
            boolean valid = emailRegular.emailRegular(account);
            System.out.println("Account is " + account +" is valid: "+ valid);
        }
    }
}
