package com.goit.gojavaonline;

public class Calculate {



    public double extremumCalc()  {
        boolean read = true;
        double c = 1;
        UserInput input = new UserInput();
        FormulaParser parser = new FormulaParser(input.userInputFormula());
        Function function1 = parser.parse();
        Function function2 = function1;
        System.out.println("Please, enter interval start: ");
        double a = input.userInput();
        System.out.println("Please, enter end of interval: ");
        double b = input.userInput();
        System.out.println("Enter accuracy of calculation \"E\"");
        double e = input.userInput();

        while (read) {
            System.out.println("Please, enter \"1\" if you want find Min or enter \"-1\" if you want find Max. ");
            c = input.userInput();
            if (c != -1 && c != 1) {
                System.out.println("You type wrong c");
                read = true;
            } else {
                read = false;
            }
        }


        double x = 0;
        double func1, func2;
        double func = 0;
        boolean test = true;

        while (test) {
            x = (a + b) / 2;
            function1.setX(x - e);
           func1 = function1.calculate();
            function2.setX(x + e);
           func2 = function2.calculate();


            if (c * func1 < c * func2) {
                b = x;
            } else {
                a = x;
            }
            if (Math.abs(b - a) < e) {
                x = (a + b) / 2;
               function1.setX(x);
                func = function1.calculate();
                test = false;
            } else {
                test = true;
            }
        }
        if(c == 1){
            System.out.println("Minimum is " + x + ". Value of the function in this point = " + func);
        }
        if(c == -1){
            System.out.println("Maximum is " + x + ". Value of the function in this point = " + func);
        }
         return func;
    }

}


