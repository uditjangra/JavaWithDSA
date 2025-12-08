package arrays;

class answer {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int i = 0;
        if(n == 1){
            return mat[0][0];
        }
        for(int x[] : mat){
            sum += x[i];
            i++;
        }
        int j = 1;
        for(int x[] : mat){
            sum += x[n - j];
            j++;
        }
        if(n%2==0){
            return sum;
        }else{
            return sum-mat[n/2][n/2];
        }
    }
}