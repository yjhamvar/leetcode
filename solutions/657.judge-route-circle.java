/*
 * [657] Judge Route Circle
 *
 * https://leetcode.com/problems/judge-route-circle/description/
 *
 * algorithms
 * Easy (68.41%)
 * Total Accepted:    63.5K
 * Total Submissions: 92.8K
 * Testcase Example:  '"UD"'
 *
 * 
 * Initially, there is a Robot at position (0, 0). Given a sequence of its
 * moves, judge if this robot makes a circle, which means it moves back to the
 * original place. 
 * 
 * 
 * 
 * The move sequence is represented by a string. And each move is represent by
 * a character. The valid robot moves are R (Right), L (Left), U (Up) and D
 * (down). The output should be true or false representing whether the robot
 * makes a circle.
 * 
 * 
 * Example 1:
 * 
 * Input: "UD"
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: "LL"
 * Output: false
 * 
 * 
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        StringBuilder sb = new StringBuilder(moves);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'L')
                x--;
            else if (sb.charAt(i) == 'R')
                x++;
            else if (sb.charAt(i) == 'U')
                y++;
            else
                y--;
        }
        if (x == 0 && y == 0)
            return true;
        else
            return false;
    }
}
