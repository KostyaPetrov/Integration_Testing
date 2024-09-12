package ru.konstantinpetrov.trigonometric;

public class Cosec {
    Sin sin;

    public Cosec(Sin sin){
        this.sin=sin;
    }
    

    public double cosecExpansion(double x, int n) {
        if(x==0){
            throw new IllegalArgumentException("x must not be 0");
        }else{
            return 1/sin.sineExpansion(x, n);
        }
        
    } 
}
