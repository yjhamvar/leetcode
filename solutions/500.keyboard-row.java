import java.util.ArrayList;
import java.util.HashSet;

/*
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (59.82%)
 * Total Accepted:    57.5K
 * Total Submissions: 96K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * Note:
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */
class Solution {
    StringBuilder sb;
    static HashSet<Character> first = new HashSet<Character>();
    static HashSet<Character> second = new HashSet<Character>();
    static HashSet<Character> third = new HashSet<Character>();
    static {
        first.add('q');
        first.add('w');
        first.add('e');
        first.add('r');
        first.add('t');
        first.add('y');
        first.add('u');
        first.add('i');
        first.add('o');
        first.add('p');

        second.add('a');
        second.add('s');
        second.add('d');
        second.add('f');
        second.add('g');
        second.add('h');
        second.add('j');
        second.add('k');
        second.add('l');

        third.add('z');
        third.add('x');
        third.add('c');
        third.add('v');
        third.add('b');
        third.add('n');
        third.add('m');
    }

    public String[] findWords(String[] words) {
        ArrayList<String> rList = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            sb = new StringBuilder(words[i]);
            boolean checkResult = checkRow();
            if (checkResult) {
                rList.add(words[i]);
            }
        }
        String[] result = new String[rList.size()];
        result = rList.toArray(result);
        return result;
    }

    public boolean checkRow() {
        int j = 0;
        if (first.contains(Character.toLowerCase(sb.charAt(j)))) {
            for (j = 1; j < sb.length(); j++) {
                if (!first.contains(Character.toLowerCase(sb.charAt(j)))) {
                    return false;
                }
            }
        } else if (second.contains(Character.toLowerCase(sb.charAt(j)))) {
            for (j = 1; j < sb.length(); j++) {
                if (!second.contains(Character.toLowerCase(sb.charAt(j)))) {
                    return false;
                }
            }
        } else {
            for (j = 1; j < sb.length(); j++) {
                if (!third.contains(Character.toLowerCase(sb.charAt(j)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
