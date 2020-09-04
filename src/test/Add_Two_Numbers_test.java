package test;

import main.Add_Two_Numbers;
import org.junit.Test;
import org.junit.Before;

public class Add_Two_Numbers_test {
    private Add_Two_Numbers solution;

    @Before
    public void setup(){this.solution = new Add_Two_Numbers();}

    @Test
    public void test_a(){

        Add_Two_Numbers.ListNode l1_a = new Add_Two_Numbers.ListNode();
        l1_a.val = 2;
        Add_Two_Numbers.ListNode l1_b = new Add_Two_Numbers.ListNode();
        l1_b.val = 4;
        l1_a.next = l1_b;
        Add_Two_Numbers.ListNode l1_c = new Add_Two_Numbers.ListNode();
        l1_c.val = 3;
        l1_b.next = l1_c;

        Add_Two_Numbers.ListNode l2_a = new Add_Two_Numbers.ListNode();
        l2_a.val = 5;
        Add_Two_Numbers.ListNode l2_b = new Add_Two_Numbers.ListNode();
        l2_b.val = 6;
        l2_a.next = l2_b;
        Add_Two_Numbers.ListNode l2_c = new Add_Two_Numbers.ListNode();
        l2_c.val = 4;
        l2_b.next = l2_c;
        Add_Two_Numbers.ListNode result = solution.solve(l1_a, l2_a);

        while(true){
            System.out.println(result.val);
            if(result.next == null){
                break;
            }
            result = result.next;
        }








    }


}
