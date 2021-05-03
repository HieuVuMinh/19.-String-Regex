import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public boolean regularExpression(String numbers){
        while (true){
            Pattern pattern = Pattern.compile("\\([0-9]{2}\\)-\\(0[0-9]{9}\\)");
            Matcher matcher = pattern.matcher(numbers);
            return matcher.matches();
        }
    }
}
