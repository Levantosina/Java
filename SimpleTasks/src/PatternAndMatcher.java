import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        String text="Lorem Ipsum is simply dummy lev12@gmail.com text of  the printing" +
                " and typesetting industry. Lorem Ipsum has been " +
                "the industry's standard dummy text ever since the tim@yandex.ru";

        Pattern email=Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher=email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
