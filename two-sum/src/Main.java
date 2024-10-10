import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] result = sumNumbers(new int[]{1, 2, 5}, 7);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumNumbers(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }
}