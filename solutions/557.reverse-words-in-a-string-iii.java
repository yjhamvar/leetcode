/*
 * [557] Reverse Words in a String III
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * algorithms
 * Easy (60.11%)
 * Total Accepted:    62.6K
 * Total Submissions: 104.2K
 * Testcase Example:  '"Let\'s take LeetCode contest"'
 *
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * 
 * 
 * Note:
 * In the string, each word is separated by single space and there will not be
 * any extra space in the string.
 * 
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("\\s+");
        for (int i = 0; i < str.length; i++) {
            StringBuilder rev = new StringBuilder(str[i]);
            sb.append(rev.reverse());
            if (i != str.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
