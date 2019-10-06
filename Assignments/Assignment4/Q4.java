import java.util.Arrays;
public class Q4{
    // Test
    public static void main(String[] args) {
        int[][] A = new int[][]{
            {1, 0, 0},
            {-1, 0, 3}
        };
        int[][] B = new int[][]{
            {7, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };

        int[][] res = multipleMatrix(A, B);
        for(int i = 0; i < A.length; i++){
            System.out.println(Arrays.toString(res[i]));
        }
    }

    // Solution
    public static int[][] multipleMatrix(int[][]A, int[][]B) {
        int[][]res = new int[A.length][B[0].length];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] == 0){
                    continue;
                }
                for(int k = 0; k < B[0].length; k++){
                    if(B[j][k] == 0){
                        continue;
                    }
                    res[i][k] += A[i][j] * B[j][k];
                }
            }
        }

        return res;
    }
    
}