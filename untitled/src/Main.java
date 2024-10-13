import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int []{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int [] {2,5,6};
        int n = 3;
        int [] merge = mergeSolution2(nums1,m,nums2,n);
        System.out.println(Arrays.toString(merge));

        int [] merge2 = merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(merge2));
    }
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int [] merge = new int[m+n];
            int k=0;
            int i=0; int j=0;
            System.out.println("voici m: " +m);
            System.out.println("voici n: " +n);
            while(i< m && j<n){
                if(nums1[i] < nums2[j]){
                    merge[k++]= nums1[i++];
                }else {
                    merge[k++] = nums2[j++];
                }
            }
            while(i<m){
                merge[k++] = nums1[i++];
            }
            while(j<n){
                merge[k++] = nums2[j++];
            }
            return merge;

        }
    public static int[] mergeSolution2(int[] nums1, int m, int[] nums2, int n) {
        int [] merge = new int[m+n];
        int k= m+n-1;
        int i=m-1; int j=n-1;
        System.out.println("voici m: " +m);
        System.out.println("voici n: " +n);
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                merge[k--]= nums1[i--];
            }else {
                merge[k--] = nums2[j--];
            }
        }
        while(i>=0 ){
            merge[k--] = nums1[i--];
        }
        while(j >= 0){
            merge[k--] = nums2[j--];
        }
        return merge;

    }
    }
