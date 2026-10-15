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

    int getLowestNum(){
        int _lowestValue = nums[2];
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < _lowestValue){
                _lowestValue = nums[i];
            }
        }

        return _lowestValue;
    }

        int getHighestNum(){

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
        smallestValue = getLowestNum();
        numElements = getNumberOfElements();
        System.out.println("Highest number: "+largestValue+"\n" +
                "Number of elements: "+numElements);
        System.out.println("Lowest number: "+smallestValue+"\n" +
                "Number of elements: "+numElements);

    }

}
