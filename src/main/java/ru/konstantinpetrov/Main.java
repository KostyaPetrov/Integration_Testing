package ru.konstantinpetrov;

import ru.konstantinpetrov.function.Calculate;
import ru.konstantinpetrov.logariphmic.Ln;
import ru.konstantinpetrov.logariphmic.Log;
import ru.konstantinpetrov.trigonometric.Cosec;
import ru.konstantinpetrov.trigonometric.Sin;

public class Main {
    private static double calc;

    public static void main(String[] args) {
        Sin sin = new Sin();
        Cosec cosec = new Cosec(sin);
        Ln ln=new Ln();
        Log log = new Log(ln);
        Calculate calculate=new Calculate(sin, cosec, log);
        calc = calculate.calc(-1, 5);
        System.out.println(calc);
        
    }
}

