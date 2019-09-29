import java.util.*;
import java.math.*;
public class Q5_1{
/*
    Q5.
    The count-and-say sequence is a sequence of integers with the first five terms as following:
    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221

    1 is read off as "one 1" or 11.
    11 is read off as "two 1s" or 21.
    21 is read off as "one 2, then one 1" or 1211.
    Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
    Note: Each term of the sequence of integers will be represented as a string.

    Example 1:
    Input: 1
    Output: "1"

    Example 2:
    Input: 4
    Output: "1211"
*/
    public static void main(String[] args) {
       String test = countAndSay(5);
       System.out.println(test);
    }

    public static String countAndSay(int n) {
        int count = 1;
        String outPut = "1";
        StringBuffer sb = new StringBuffer();

        for(int i = 1; i < n; i++){
            sb.setLength(0);
            count = 1;
            for(int j = 1; j < outPut.length(); j++){
                if(outPut.charAt(j) != outPut.charAt(j - 1)){
                    sb.append(count);
                    sb.append(outPut.charAt(j - 1));
                    count = 0;
                }
                count++;
            }
            if(count > 0){
                sb.append(count);
                sb.append(outPut.charAt(outPut.length() - 1));
            }
            outPut = sb.toString();
        }
        
        return outPut;
    }
}
