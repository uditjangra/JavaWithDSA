package arrays;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int rows = accounts.length;
            int columns = accounts[0].length;
            int max = 0;
            int sum = 0;
            for(int i = 0 ; i < rows;i++){
                sum = 0;
                for(int j = 0; j < columns;j++){
                    sum += accounts[i][j];
                }
                if(max<sum){
                    max = sum;
                }
            }
            return max;
        }
    }
}
