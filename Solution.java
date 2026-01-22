import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
        
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            // Step 1: Find minimum in the current row
            int minVal = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if minVal is maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                list.add(minVal);
            }
        }

        return list;
    }
}

    
