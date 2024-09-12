package ru.konstantinpetrov.function;

import ru.konstantinpetrov.logariphmic.Log;
import ru.konstantinpetrov.trigonometric.Cosec;
import ru.konstantinpetrov.trigonometric.Sin;

public class Calculate {

    private Sin sin;
    private Cosec cosec;
    private Log log;

    public Calculate(Sin sin, Cosec cosec, Log log){
        this.sin=sin;
        this.cosec=cosec;
        this.log=log;
    }

    public double calc(float x, int n){
        if(x <= 0){
            return sin.sineExpansion(x, n) + cosec.cosecExpansion(x, n);
        }else{
            return (Math.pow(
                (
                (
                (
                (
                    log.logExpansion(x, n, 10) / log.logExpansion(x, n, 5)
                    )
                / log.logExpansion(x, n, 10)
                ) * 
            (log.logExpansion(Math.pow(x,3), n, 10))
            ) + 
            log.logExpansion(x, n, 2)
            ),2
            ));
        }
        
    }
}
