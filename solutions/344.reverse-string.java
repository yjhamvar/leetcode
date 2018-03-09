/*
 * [344] Reverse String
 *
 * https://leetcode.com/problems/reverse-string/description/
 *
 * algorithms
 * Easy (60.13%)
 * Total Accepted:    225.1K
 * Total Submissions: 374.4K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * 
 * Example:
 * Given s = "hello", return "olleh".
 * 
 */
class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}