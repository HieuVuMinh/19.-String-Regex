

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.bbc.com/news");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\n+", "");
            content = content.replaceAll("&#x27", "");
            content = content.replaceAll("</span></span></a></span></li><li", "");
            // regex
            Pattern p = Pattern.compile("gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text\">Australian(.*?)</h3>");
             Matcher m = p.matcher(content);
            while (m.find()) {
//                if (m.group(1).contains("Hãy")){
//                    int i = m.group(1).length();
                    System.out.println(m.group(1));
//                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}