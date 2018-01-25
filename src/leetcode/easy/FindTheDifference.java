/**
 * Create by stormlin. All rights reserved.
 * Personal Website: www.stormlin.com
 * Problem Name: 389. Find the Difference
 * Problem Address: https://leetcode.com/problems/find-the-difference/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position. Find the letter that was added in t.
 * -----------------------------------------------------------------------------
 * Example:
 * <p>
 * Input:
 * s = "abcd"
 * t = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 **/

package leetcode.easy;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char result = 0;
        int length = (s.length() >= t.length()) ? t.length() : s.length();

        for (int i = 0; i < length; i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }

        return (s.length() >= t.length()) ? (char) (result ^ s.charAt(s.length() - 1)) : (char) (result ^ t.charAt(t.length() - 1));

        //Code below runs more slower than the code shown above
        /**
         char result=0;

         for(int i=0;i<s.length();i++){
         result^=s.charAt(i);
         }

         for(int j=0;j<t.length();j++){
         result^=t.charAt(j);
         }

         return result;
         **/
    }

}
