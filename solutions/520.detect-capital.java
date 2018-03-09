/*
 * [520] Detect Capital
 *
 * https://leetcode.com/problems/detect-capital/description/
 *
 * algorithms
 * Easy (51.96%)
 * Total Accepted:    51.4K
 * Total Submissions: 99K
 * Testcase Example:  '"USA"'
 *
 * 
 * Given a word, you need to judge whether the usage of capitals in it is right
 * or not.
 * 
 * 
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one
 * letter, like "Google".
 * 
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "USA"
 * Output: True
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: "FlaG"
 * Output: False
 * 
 * 
 * 
 * Note:
 * The input will be a non-empty word consisting of uppercase and lowercase
 * latin letters.
 * 
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean lCaseDetected = false, UCaseDetected = false, firstLetter = false;
        char[] str = word.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i == 0 && Character.isUpperCase(str[i])) {
                firstLetter = true;
            } else if (Character.isUpperCase(str[i])) {
                UCaseDetected = true;
                if (lCaseDetected || !firstLetter) {
                    return false;
                }
            } else if (Character.isLowerCase(str[i])) {
                lCaseDetected = true;
                if (UCaseDetected) {
                    return false;
                }
            }
        }
        return true;
    }
}
