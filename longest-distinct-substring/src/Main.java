import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String result = findLongestSubstring("abcdemorrap");
        System.out.println(result);
    }
        private static String findLongestSubstring(String s) {
                Set<Character> charsInWindows = new HashSet<>();
                int start = 0;
                int maxLength = 0;
                int maxStart = 0;

for (int end = 0; end < s.length(); end++) {
    char currentChar = s.charAt(end);
    while (charsInWindows.contains(currentChar)) {
        charsInWindows.remove(s.charAt(start));
        start ++;
    }
    charsInWindows.add(currentChar);
    if(end - start > maxLength) {
        maxLength = end - start + 1;
        maxStart = start;
    }
}
return s.substring(maxStart, maxStart + maxLength);

        }
}