package com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by mac on 06/07/2017.
 */
public class Problems {

    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, max=0;
        List<Character> noRepeat = new ArrayList<Character>();
        while(i < s.length()){
            if(!noRepeat.contains(s.charAt(i))){
                noRepeat.add(s.charAt(i++));
                max = Math.max(max, noRepeat.size());
            } else{
                noRepeat.remove(s.charAt(j++));
            }
        }
        return max;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0;
        List<Integer> sortedList = new ArrayList<Integer>();
        while(i < nums1.length || j < nums2.length){
            if(i < nums1.length && j == nums2.length){
                sortedList.add(nums1[i]);
                i++;
            } else if(j < nums2.length && i == nums1.length){
                sortedList.add(nums2[j]);
                j++;
            } else if(nums1[i] < nums2[j]) {
                sortedList.add(nums1[i]);
                i++;
            } else{
                sortedList.add(nums2[j]);
                j++;
            }

        }
        int index  = sortedList.size()/2;
        if(sortedList.size() > 2 && sortedList.size()%2 !=0){
            return sortedList.get(index);
        } else {
            double sum = sortedList.get(index-1) + sortedList.get(index);
            return sum/2;
        }
    }

    public String longestPalindrome(String s) {

        List<String> palindrome = new ArrayList<String>();
        for(int m = 0; m<s.length(); m++){
            explore(s, palindrome, m, m);
            explore(s, palindrome, m, m+1);
        }

        String longest = "";
        for(String str : palindrome){
            if(str.length() > longest.length()){
                longest = str;
            }
        }
        return longest;
    }

    private void explore(String s, List<String> palindrome, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            palindrome.add(s.substring(i, j+1));
            i--;
            j++;
        }
    }

    public String zigzagConvert(String s, int numRows) {
        if(numRows <=1) return s;
        StringBuilder[] builders = new StringBuilder[numRows];
        for(int i=0; i< builders.length; i++){
            builders[i] = new StringBuilder("");
        }
        int index = 0;
        int next = 1;
        for(int i = 0; i<s.length(); i++){
            builders[index].append(s.charAt(i));
            if(index == 0) next = 1;
            if(index == numRows -1) next = -1;
            index += next;
        }
        String result = "";
        for (int j = 0; j< builders.length; j++){
            result += builders[j];
        }
        return result;
    }

    public int reverseInteger(int x) {
        long reversed = 0;
        while (x != 0){
            reversed = reversed * 10 + x%10;
            x = x/10;
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversed;
    }
}
