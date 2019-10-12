import java.util.Random;

class MyIndexOutOfBoundException extends Exception {
    int index, lowerBound, upperBound;

    MyIndexOutOfBoundException() {}

    MyIndexOutOfBoundException(int index, int lowerBound, int upperBound) {
        this.index = index;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public String toString() {
        return "Error Message: Index: " +this.index+ ", buter Lower Bound: " +this.lowerBound+ ", Upper Bound: " +this.upperBound;
    }

    public static void main(String[] args) {
        int[]a = {1, 2, 3, 4, 5};
        Random random = new Random();

        try {
            int i = random.nextInt(20);
            if (i > a.length - 1) {
                throw new MyIndexOutOfBoundException(i, 0, a.length - 1);
            }
        } catch (MyIndexOutOfBoundException e) {
            System.out.println(e);
        }
    }
}