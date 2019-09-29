import java.util.*;
public class Q6{
    /*
    Q6. Given an input string , reverse the string word by word.
    Example:
    Input : “the sky is blue”
    Output : “blue is sky the”
    Assumptions:
    A word is defined as a sequence of non-space characters.
    The input string does not contain leading or trailing spaces.
    The words are always separated by a single space.
    */
    public static void main(String[] args) {
        String test = reverseStr("the sky is blue");
        System.out.println(test);
    }
    
    public static String reverseStr(String str){
        String[] splitWord = str.split(" ");
        String[] tempArr = new String[splitWord.length];
        
        for(int i = splitWord.length - 1; i >= 0; i--){
            tempArr[splitWord.length - 1 - i] = splitWord[i];
        }

        String reverseStr = Arrays.toString(tempArr);
        String reverseStrWithoutComma = reverseStr.replace(",","");
        return reverseStrWithoutComma;
    }
}
