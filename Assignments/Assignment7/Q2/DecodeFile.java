import java.util.Stack;

/*
Write a program that decode a file. Given an encoded file, create its decoded file. The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. 
Note that k is guaranteed to be a positive integer.
Assume that the string from input file is always valid; No extra white spaces, square brackets are well-formed, etc.
Furthermore, assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:
Input file: "3[a]2[bc]", output file: "aaabcbc".
Input file: "3[a2[c]]", output file: "accaccacc".
Input file: "2[abc]3[cd]ef", output file: "abcabccdcdcdef".
*/
class DecodeFile {
    public static String decodeFile(String s) {
        if (s == null || s.length() == 0) return s;
        String res = "";
        Stack<String> element = new Stack<>();
        Stack<Integer> count = new Stack<>();

        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                count.push(num);
            } else if (s.charAt(index) == '[') {
                element.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder sb = new StringBuilder();
                sb.append(element.pop());
                int times = count.pop();
                for (int i = 0; i < times; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                index++;
            } else {
                res += s.charAt(index);
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String res = decodeFile(s);
        System.out.println(res); // accaccacc
    }
}