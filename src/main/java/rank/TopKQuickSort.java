package rank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/22/2022.
 */
public class TopKQuickSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int K = 3;
        TopKQuickSort topKQuickSort = new TopKQuickSort();
        int res = topKQuickSort.topKQuickSort(nums,K);
        System.out.println(res);
    }

    public int topKQuickSort(int[] nums, int K) {
        if (nums.length < K)  {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        int[] res = topK(nums, K, left, right);

        return res[K-1];
    }

    public int[] topK(int[] nums, int K, int left, int right) {
        if (left == right) {
            return nums;
        }

        int index = sort(left, right, nums);
        if (index + 1 == K + left) {
            return nums;
        }

        if (index + 1 > K + left) {
            return topK(nums, K, left, index - 1);
        } else {
            return topK(nums, K-(index-left+1), index + 1, right);
        }

    }

    public int sort(int left, int right, int[] nums) {
        int key = nums[left];

        while (left < right) {
            while (left < right && nums[right] < key) {
                right = right - 1;
            }
            nums[left] = nums[right];

            while (left < right && nums[left] > key) {
                left = left + 1;
            }
            nums[right] = nums[left];
        }

        nums[right] = key;

        return right;
    }
}
