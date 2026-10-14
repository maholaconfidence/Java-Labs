package org.example;

/*
Exercise 3.2: Highest and lowest values
Create ArrayStatistics. Use an array of at least six integers to find the largest value, smallest value, and number of elements.

Challenge: Count how many values are greater than or equal to 50.
 */

public class ArrayStatistics {
    int[] nums;
    int largestValue;
    int smallestValue;
    int numElements;

    ArrayStatistics(int[] nums){
        this.nums = nums;
    }

    int getNumberOfElements(){
        int _numElements = nums.length;
        return _numElements;
    }

    int getHighestNum(){
        //{5,2,10, 4, 15, 8, 25}
        int _largestValue = nums[4]; //15
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > _largestValue){
                _largestValue = nums[i];
            }
        }
        return _largestValue;
    }

    void display(){
        largestValue = getHighestNum();
        numElements = getNumberOfElements();
        System.out.println("Highest number: "+largestValue+"\n" +
                "Number of elements: "+numElements);
    }

}
