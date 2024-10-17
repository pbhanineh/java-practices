public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String convert(String s, int numRows) {

        if(numRows == 1 || numRows <= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        // initialiser les rows
        for(int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int thisRow = 0;
        boolean goDown = false;
        for(char c :s.toCharArray()) {
            rows[thisRow].append(c);
            if(thisRow == 0 || thisRow == numRows - 1) {
                goDown = !goDown;
                thisRow+= goDown ? 1 : -1;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}