import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommonArraysClass {

    public  List<Character> getCommonCaractersFrom2Arrays(char[] arr1, char[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j=0;
        List<Character> common = new ArrayList<>();
        int k =0;

        while (i<m && j<n){
            if (arr1[i] == arr2[j]){
                common.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        return common;
    }
}
