import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
   public boolean emailTest(String email){
       Pattern pattern = Pattern.compile("[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)");
       Matcher matcher = pattern.matcher(email);
       return matcher.matches();
   }
}
