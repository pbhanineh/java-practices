import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[]arr1 =  new char[]{'a','e','e','e','e'};
        char[]arr2 =  new char[]{'b','b','c','e','e','g'};
        List<Character> common =  CommonArraysClass.getCommonCaractersFrom2Arrays(arr1, arr2);
        System.out.println(common);
    }
}