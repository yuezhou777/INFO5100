package Q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q4 {
    public static boolean isUnique (int[] arr) {
        if(arr.length == 1) {
            return true;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurs = new HashSet<>(map.values()); // get all unique occurences
        return occurs.size() == map.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(isUnique(arr));
    }
}
