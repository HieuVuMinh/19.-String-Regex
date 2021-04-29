import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegular {
    public boolean emailRegular(String account){
        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
