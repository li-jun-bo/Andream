package com.dream.java.algorithm;

import java.util.HashMap;

public class A001_TwoSum {


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        A001_TwoSum twoSum = new A001_TwoSum();

        long startTime = System.currentTimeMillis();
        twoSum.solutionOne(nums, target);
        long endTime = System.currentTimeMillis();
        System.out.println("times = " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        twoSum.solutionTwo(nums, target);
        endTime = System.currentTimeMillis();
        System.out.println("times = " + (endTime - startTime));
    }


    /**
     * 题意是让你从给定的数组中找到两个元素的和为指定值的两个索引，最容易的当然是循环两次，复杂度为 O(n^2)，
     * 首次提交居然是 2ms，打败了 100% 的提交，谜一样的结果，之后再次提交就再也没跑到过 2ms 了。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] solutionOne(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    /**
     * 利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，
     * 比如 i = 0 时，此时首先要判断 nums[0] = 2 是否在 map 中，如果不存在，那么插入键值对 key = 9 - 2 = 7, value = 0，
     * 之后当 i = 1 时，此时判断 nums[1] = 7 已存在于 map 中，那么取出该 value = 0 作为第一个返回值，当前 i 作为第二个返回值，
     * 具体代码如下所示。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] solutionTwo(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }


}
