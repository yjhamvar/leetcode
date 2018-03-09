import java.util.ArrayList;
import java.util.List;

/*
 * [728] Self Dividing Numbers
 *
 * https://leetcode.com/problems/self-dividing-numbers/description/
 *
 * algorithms
 * Easy (66.80%)
 * Total Accepted:    24.8K
 * Total Submissions: 37.1K
 * Testcase Example:  '1\n22'
 *
 * 
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 * 
 * Example 1:
 * 
 * Input: 
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 
 * 
 * 
 * Note:
 * The boundaries of each input argument are 1 .
 * 
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int i = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (i = left; i <= right; i++) {
            int temp = i;
            if (i % 10 == i) {
                result.add(i);
            } else if (i % 10 == 0) {
                continue;
            } else {
                boolean flag = false;
                while (temp != 0) {
                    int div = temp % 10;
                    temp = temp / 10;
                    if (div == 0 || (i % div) != 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
