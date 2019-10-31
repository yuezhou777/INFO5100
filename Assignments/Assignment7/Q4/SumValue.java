import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SumValue {

    /* generate array of random numbers */
    static void generateRandomArray(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
    }

    /* get sum of an array using 4 threads */
    static long sum(int[] arr) {
        int threadNum = 4;
        int avg = arr.length / threadNum;
        long sum = 0;
        List<SumThread> list = new ArrayList<>();

        try {
            for (int i = 0; i < threadNum; i++) {
                SumThread st = new SumThread(arr, avg * i, avg * (i + 1));
                st.start();
                list.add(st);
            }
            for (int i = 0; i < list.size(); i++) {
                list.get(i).join(); // let main thread wait for SumThread to complete
            }  
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i).getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
   
}

    