package ru.konstantinpetrov.logariphmic;

public class Log {
    private Ln ln;

    public Log(Ln ln){
        this.ln=ln;
    }

    public double logExpansion(double x, int n, float base) {
        return ln.lnExpansion(x, n)/ ln.lnExpansion(base, n);
    }    
}
