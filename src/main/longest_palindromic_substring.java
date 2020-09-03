/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

 */

package main;

public class longest_palindromic_substring {
    public String test(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        l++;
        return s.substring(l,r);
    }
    public String solve(String s){
        String res = "";
        for(int i=0; i<s.length(); i++ ){
            String odd = test(s, i, i);
            String even = test(s, i, i+1);
            String longest = res;
            if (odd.length() > longest.length()){
                longest = odd;
            }
            if (even.length() > longest.length()){
                longest = even;
            }
            res = longest;
        }
        return res;
    }
}
