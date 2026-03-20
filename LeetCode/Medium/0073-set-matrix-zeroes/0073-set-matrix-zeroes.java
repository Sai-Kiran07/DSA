import java.util.HashMap;
class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null) return;
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<Integer,Integer> rows = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> cols = new HashMap<Integer, Integer>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0) {
                    rows.put(i, 0);
                    cols.put(j, 0);
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(rows.containsKey(i) || cols.containsKey(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}