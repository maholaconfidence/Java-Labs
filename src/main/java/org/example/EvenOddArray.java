//Create EvenOddArray. Count the even and odd values in an integer array.
//Challenge: Store the even and odd values in separate arrays or

package org.example;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {
    int[] nums;
    int odd = 0;
    int even = 0;

    List<Integer> evenListNum = new ArrayList<>(even);
    List<Integer> oddListNum = new ArrayList<>(odd);

    EvenOddArray(int[] nums) {
        this.nums = nums;

    }

    void countNum() {
        for (int nums : this.nums) {
            if (nums % 2 == 0) {
                even++;
                evenListNum.add(nums);

                System.out.println("Number of even numbers:" + " " + even);
            }
            else {
                    odd++;
                    oddListNum.add(nums);
                    System.out.println("Number of odd numbers:" + " " + odd);
                }


            }
        System.out.println(evenListNum);
        System.out.println(oddListNum);

        }



    }





