

package main;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

public class twoSum {

    public void doIt(){
        System.out.println("hello.");
    }

    public int[] solve(int[] nums, int target){
        Hashtable<int[],int[]> dictionary = new Hashtable<int[],int[]>();
        List<Integer> list = new ArrayList<Integer>();

        int[] result = new int[10];
        for(int i = 0; i < nums.length; i++){
            System.out.println("nums: " + nums[i]);
            list.add(nums[i]);
        }
        return result;
    }

}
