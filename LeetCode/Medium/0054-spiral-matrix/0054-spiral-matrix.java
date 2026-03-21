import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;
        int rb = 0;
        int lb = n - 1;
        int ub = 1;
        int db = m - 1;
        
        while(rb <= lb){
            for(int right = rb; right <= lb; right++){
                list.add(matrix[row][col++]);
            }
            col--;
            if(ub > db) return list;
            
            for(int down = ub; down <= db; down++){
                list.add(matrix[++row][col]);
            }
            lb--;
            col = lb;
            if(lb < rb) break;
            
            for(int left = lb; left >= rb; left--){
                list.add(matrix[row][col--]);
            }
            row--;
            db--;
            col++;
            if(ub > db) return list;
            
            
            for(int up = db; up >= ub; up--){  
                list.add(matrix[row--][col]);
            }
            row++;
            rb++;
            ub++;
            col++;
        }
        return list;
    }
}