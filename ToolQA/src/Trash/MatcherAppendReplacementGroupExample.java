package Trash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherAppendReplacementGroupExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        Pattern regexp = Pattern.compile("<[a-z]+>");
        Matcher m = regexp.matcher("<a><b-><1><c><d/>");
        while (m.find())
            m.appendReplacement(buffer, "text");
        m.appendTail(buffer);

        System.out.println(buffer);
    }
}
           