public class SumThread extends Thread {
    int[] nums; // array being calculated
    int start; // start index of nums[]
    int end; // end index of nums[]
    long sum; // sum calculated by each thread

    public SumThread(int[] nums, int start, int end) {
        this.nums = nums;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
    }

}