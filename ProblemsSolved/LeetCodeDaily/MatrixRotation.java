package LeetCodeDaily;

public class MatrixRotation {
    static class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int len = mat.length;
            int c90=0,c180=0,c270=0,c0=0;
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    if(target[i][j]==mat[len-j-1][i]){
                        c90++;
                    }
                    if(target[i][j]==mat[len-i-1][len-j-1]){
                        c180++;
                    }
                    if(target[i][j]==mat[j][len-i-1]){
                        c270++;
                    }
                    if(target[i][j]==mat[i][j]){
                        c0++;
                    }
                }
            }
            if(c90==len*len||c180==len*len||c270==len*len||c0==len*len)
                return true;
            else return false;
        }
    }
}
