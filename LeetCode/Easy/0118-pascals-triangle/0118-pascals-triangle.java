import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // List<Integer> row = new ArrayList<>();
        List<List<Integer>> rows = new ArrayList<>(numRows);
        // rows.add(new ArrayList<Integer>(List.of(1)));
        for(int i = 1;i <= numRows;i++){
            List<Integer> row = new ArrayList<>(); 
            for(int j = 1;j <= i;j++){
                if(j == 1 || j == i){
                    row.add(1);
                }
                else{
                    row.add(rows.get(i-2).get(j-2) + rows.get(i-2).get(j-1)); //because list follows 0 based indexing and i am followin 1.
                }
            }
            rows.add(row);
        }
        return rows;
    }
}