public class Q5{
    // Test
    public static void main(String[] args) {
        String s = "IDID";
        int[] res = increaseAndDecrease(s);

        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

    // Solution
    public static int[] increaseAndDecrease(String s) {
        int len = s.length();
        int[] res = new int[len + 1];
        int low = 0;
        int high = len;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'I'){
                res[i] = low;
                low++;
            }else{
                res[i] = high;
                high--;
            }
        }

        res[len] = high;

        return res;
    }
}
