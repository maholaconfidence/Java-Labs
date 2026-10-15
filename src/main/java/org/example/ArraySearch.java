package org.example;

public class ArraySearch {
    int[] nums;
    int index;
    boolean foundTarget;

    ArraySearch(int[] nums) {
        this.nums = nums;
        foundTarget = false;
    }

    void getIndexNum(int _target) {
        for (int i= 0; i < nums.length;i++){
            if (nums[i] == _target) {
                index = -1;
                System.out.println("Index found" + i);
                foundTarget = true;
            }
        }
        if (!foundTarget){
            System.out.println("Value not found");
        }
    }
}