package ru.konstantinpetrov.trigonometric;

public class Sin {
    public float getFact(float val){
        float res=1;
        for(int i=1; i<=val;i++){
            res*=i;
        }
        return res;
    }



    public double sineExpansion(double x, int n) {
        double res=0;
        for(int i=1; i<n;  i++){
            res+=(Math.pow(-1, i-1)*Math.pow(x, 2*i-1))/getFact(2*i-1);
        }
        return res;

        
    }
}
