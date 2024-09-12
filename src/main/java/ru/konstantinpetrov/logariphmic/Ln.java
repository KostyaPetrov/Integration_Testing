package ru.konstantinpetrov.logariphmic;

public class Ln {
    public float getFact(float val){
        float res=1;
        for(int i=1; i<=val;i++){
            res*=i;
        }
        return res;
    }

    public double lnExpansion(double x, int n) {

        if (x <= 0) {
            throw new IllegalArgumentException("x must be greater than 0");
        }
        if (x == 1) {
            return 0;
        }
        
        if (x > 1) {
            return lnExpansion(x / 2, n) + Math.log(2);
        }
        
        double result = 0;
        double term = (x - 1);
        for (int i = 1; i <= n; i++) {
            result += term / i;
            term *= (x - 1);
        }
        
        return result;
    }
}
