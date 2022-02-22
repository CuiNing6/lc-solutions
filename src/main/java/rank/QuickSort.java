package rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuining8 on 02/22/2022.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5};
        QuickSort quickSort = new QuickSort();
        int[] res = quickSort.quickSort(nums);
        System.out.println(Arrays.toString(res));
    }

    public int[] quickSort(int[] nums) {
        int[] res;
        int left = 0;
        int right = nums.length - 1;
        res = sort(left, right, nums);
        return res;
    }

    public int[] sort(int left, int right, int[] nums) {
        if (left > right) {
            return nums;
        }

        int key = nums[left];
        int low = left;
        int high = right;

        while (left < right) {
            while (left < right && nums[right] > key) {
                right = right - 1;
            }
            nums[left] = nums[right];

            while (left < right && nums[left] < key) {
                left = left + 1;
            }
            nums[right] = nums[left];

            nums[right] = key;
            sort(low, left-1, nums);
            sort(left+1, high, nums);
        }
        return nums;
    }

}
