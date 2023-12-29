package com.mmuniz.leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {

        PalindromeNumberSolution.isPalindrome(121);
    }
}

class PalindromeNumberSolution {
    public static boolean isPalindrome(int x) {
        String[] separation = String.valueOf(x).split("");
        String reverse = "";
        for (int i = separation.length -1; i >=0 ; i--) {
            reverse += separation[i];
        }
        if (String.valueOf(x).equals(reverse)) {
            return true;
        }
        return false;
    }
    public static boolean isPalindromeUsingStringBuilder(int x) {
        String value = String.valueOf(x);

        StringBuilder sb = new StringBuilder(value);

        return sb.reverse().toString().equals(value);
    }
}
