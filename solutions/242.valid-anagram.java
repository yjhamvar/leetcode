import java.util.HashMap;

/*
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (47.33%)
 * Total Accepted:    202.1K
 * Total Submissions: 427.1K
 * Testcase Example:  '""\n""'
 *
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s. 
 * 
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * 
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your
 * solution to such case?
 */
class Solution {
    public boolean isAnagram(String str, String tr) {
        char[] s = str.toCharArray();
        char[] t = tr.toCharArray();

        if (s.length != t.length)
            return false;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length; i++) {
            if (!hm.containsKey(s[i])) {
                hm.put(s[i], 1);
            } else {
                hm.put(s[i], (hm.get(s[i]) + 1));
            }
        }

        for (int j = 0; j < t.length; j++) {
            if (!hm.containsKey(t[j])) {
                return false;
            } else {
                if (hm.get(t[j]) == 0) {
                    //System.out.println("Get:"+t.charAt(j)+":"+hm.get(t.charAt(j)));
                    return false;
                } else {
                    hm.put(t[j], (hm.get(t[j]) - 1));
                }
            }
        }
        return true;
    }
}