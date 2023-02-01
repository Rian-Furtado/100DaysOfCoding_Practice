package LeetCode;

public class Divide_Array_Into_Pairs_2206 {
    public static void main(String[] args) {
        // COMPLEXIDADE O(N²)! - BAD!

        System.out.println(divideArray(new int[]{}));

    }
    
    public static boolean divideArray(int[] nums){
        int count = 0;

        for (int num : nums) {
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    
}
