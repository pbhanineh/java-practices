import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubstring {
    public String longestDistinctSubstring(String s) {

        int end = 0, start = 0;
        int maxLength = 0;
        int maxStart = 0;
        Set<Character> charInSet = new HashSet<>();

        for (end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Si le caractère actuel est déjà dans le Set, on réduit la fenêtre
            while (charInSet.contains(currentChar)) {
                charInSet.remove(s.charAt(start));  // Supprimer le caractère au début de la fenêtre
                start++;  // Avancer le pointeur "start"
            }

            charInSet.add(currentChar);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }
}
