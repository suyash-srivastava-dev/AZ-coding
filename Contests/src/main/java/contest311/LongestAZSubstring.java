package contest311;

/**
 *
 * 2414. Length of the Longest Alphabetical Continuous Substring
 *
 * Input: s = "abacaba"
 * Output: 2
 * Explanation: There are 4 distinct continuous substrings: "a", "b", "c" and "ab".
 * "ab" is the longest continuous substring.
 *
 */
public class LongestAZSubstring {

    public int longestContinuousSubstring(String s) {

        char[] ch=s.toCharArray();
        int maxCount=1;
        int temp=1;
//        int lastValue=ch[0];
        for(int i=1;i<s.length();i++)
        {
            if(ch[i]==(++ch[i-1]))
            {
                temp++;
                maxCount=(temp>maxCount)?temp:maxCount;
            }
            else
            {
                temp=1;
            }

        }
        return maxCount;
    }

    public static void main(String[] args) {

    }
}