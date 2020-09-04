/*
You are given two non-empty linked lists representing two
 non-negative integers. The digits are stored in reverse
 order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero,
 except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

package main;

import test.Add_Two_Numbers_test;

import java.util.List;

public class Add_Two_Numbers {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode solve(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode p, dummy = new ListNode(0);
        p = dummy;
        while(l1 != null || l2 != null || carry != 0){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }
}
