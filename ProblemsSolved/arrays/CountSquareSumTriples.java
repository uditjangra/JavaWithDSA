class answer3 {
    public int countTriples(int n) {
        int count = 0;
        if(n<=2){
            return 0;
        }else{

            for(int a = 1; a <= n; a++ ){
                for(int b = 1; b<=n;b++){
                    for(int c = 1; c <= n ; c++){
                        if(isTriple(a,b,c,n)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public boolean isTriple(int a, int b, int c, int n){
        double a2 = a * a;
        double b2 = b * b;
        double c2 = a2 + b2;
        if(c*c == c2 && c<=n){
            return true;
        }
        return false;
    }
}