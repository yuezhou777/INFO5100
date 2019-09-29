import java.util.*;

public class Q7{
    /*
    Q7.
    Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
    Example 1:
    Input:
    [
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
    ]
    Output: [1,2,3,6,9,8,7,4,5]

    Example 2:
    Input:
    [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9,10,11,12]
    ]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    */
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] testOutput = spiralOrder(test);
        for(int i = 0; i < testOutput.length; i++){
            System.out.println(testOutput[i]);
        }
    }

    public static int[] spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int l = 0; //left wall
        int r = matrix[0].length - 1; //right wall
        int u = 0; //up wall
        int d = matrix.length - 1; //down wall

        while(l <= r && u <= d){
            for(int i = l; i <= r; ++i){
                result.add(matrix[u][i]);
            }
            for(int i = ++u; i <= d; ++i){
                result.add(matrix[i][r]);
            }
            for(int i = --r; i >= l; --i){
                result.add(matrix[d][i]);
            }
            for(int i = --d; i >= u; --i){
                result.add(matrix[i][l]);
                l++;
            }
        }

        int[] outPut = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            outPut[i] = result.get(i);
        }

        return outPut;
    }
}