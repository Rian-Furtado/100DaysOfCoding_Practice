package LeetCode;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12,13,14,15,16,17,28,30,40};
        System.out.println(search(nums,40));
    }

    public static int search(int[] nums, int target) {

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
        return -1;
    }

}
