class Solution {
    public int countCommas(int n) {
        int commas = 1;
        if(n < 1000) return 0;
        else{
            int start = 1001;
            // while(start <= n){
            //     commas++;
            //     start++;
            // }
            commas += (n - start) + 1;
        }return commas;
    }
}















        // int lastdigit = n % 10;
        // while(n != 0){
        //     n = n / 10;
        //     counter++;
        //     if(counter == 3){
        //         commas++;
        //         counter = 0;
        //     }
        // }
        // return commas;