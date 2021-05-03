import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public boolean validateNameClass(String className){
        while (true){

            Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIKLMN]$");
            Matcher matcher = pattern.matcher(className);
            return matcher.matches();
        }
    }
}

//    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//
//        Không chứa các ký tự đặc biệt
//
//        Theo sau ký tự bắt đầu là 4 ký tự số
//
//        Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M