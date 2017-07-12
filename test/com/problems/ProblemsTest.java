package com.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mac on 06/07/2017.
 */
public class ProblemsTest {
    Problems problems = new Problems();
    @Test
    public void shouldFindMedimNum(){
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        double result = problems.findMedianSortedArrays(nums1, nums2);
        assertThat(result, is(2.5));
    }

    @Test
    public void shouldFindLongestPalindrome(){
        String s1 = "babad";
        String s2 = "cbbd";
        String result1 = problems.longestPalindrome(s1);
        String result2 = problems.longestPalindrome(s2);
        assertThat(result1, is("bab"));
        assertThat(result2, is("bb"));
    }

    @Test
    public void shouldConvertAsZigzagPatten(){
        String testStr = "PAYPALISHIRING";
        int rowNum = 3;
        String result = problems.zigzagConvert(testStr, 3);
        assertThat(result,is("PAHNAPLSIIGYIR"));
    }

    @Test
    public void shouldReverseInteger(){
        int origin1 = 123;
        int origin2 = -123;
        int origin3 = 1000000003;
        int reversed1 = problems.reverseInteger(origin1);
        int reversed2 = problems.reverseInteger(origin2);
        int reversed3 = problems.reverseInteger(origin3);
        assertThat(reversed1, is(321));
        assertThat(reversed2, is(-321));
        assertThat(reversed3, is(0));
    }

}