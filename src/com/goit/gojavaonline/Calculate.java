package com.goit.gojavaonline;

public class Calculate {



    public double extremumCalculate(double a, double b, double c, double e, Function userInputFunction)  {


        double x = 0;
        double firstTempFunction, secondTempFunction;
        double resultFunction = 0;
        boolean accuracyLimit = false;

        while (!accuracyLimit) {
            x = (a + b) / 2;
            userInputFunction.setX(x - e);
            firstTempFunction = userInputFunction.calculate();
            userInputFunction.setX(x + e);
            secondTempFunction = userInputFunction.calculate();


            if (c * firstTempFunction < c * secondTempFunction) {
                b = x;
            } else {
                a = x;
            }
            if (Math.abs(b - a) < e) {
                x = (a + b) / 2;
                userInputFunction.setX(x);
                resultFunction = userInputFunction.calculate();
                accuracyLimit = true;
            } else {
                accuracyLimit = false;
            }
        }
        if(c == 1){
            System.out.println("Minimum is " + x + ". Value of the function in this point = " + resultFunction);
        }
        if(c == -1){
            System.out.println("Maximum is " + x + ". Value of the function in this point = " + resultFunction);
        }
         return resultFunction;
    }

}


