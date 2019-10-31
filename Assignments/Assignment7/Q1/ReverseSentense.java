/*
Write a program that read sentences from a file and reverse sentences word by word. After reverse, 
create a new file to save sentences. (Extreme corner case is not mandatory.)

Example:
Input file: the sky is blue.
Output file: blue is the sky.
*/
class ReverseSentense {
    public static String reverseSentense(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] splited = s.trim().split("\\s+"); 
        // delete the space at the beginning and end of s, then split
        //  the string by one or more spaces

        StringBuilder sb = new StringBuilder();
        for (int i = splited.length - 1; i >= 0; i--) {
            sb.append(splited[i] + " ");
        }
        // iterate from the end of s to add each word in right sequence

        return sb.toString().trim();
        // delete the last space of sb
    }

    public static void main(String[] args) {
        String s = "  hello world!  ";
        String res = reverseSentense(s);
        System.out.println(res); //"world! hello"
    }
}
