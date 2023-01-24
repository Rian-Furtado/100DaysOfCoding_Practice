package LeetCode;

public class SearchInsertPostion_35 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,3,5,6};
        System.out.println(nums.length-1);
        System.out.println(searchInsert(nums, 2 ));
    }

    public static int searchInsert(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;
        int middle = 0;

        while(start <= end){
            middle = (start+end)/2;

            if(nums[middle] == target){
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else if(nums[middle] < target){
                start = middle + 1;
            }
        }
        if(nums[middle] > target){
            return middle;
        }else{
            return middle+1;
        }
    }
}
