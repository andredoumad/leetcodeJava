

package main;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class twoSum {

    public void doIt(){
        System.out.println("hello.");
    }

    public int[] solve(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            int findThis = target - nums[i];
            System.out.println("findThis: " + findThis);
            System.out.println("dictionary: " + map);
            if(map.containsKey(findThis)){
                System.out.println("found it: " + map.get(findThis));
                result[1] = i;
                result[0] = map.get(findThis);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
