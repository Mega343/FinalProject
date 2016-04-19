package com.goit.gojavaonline;

public class Main {

    public static void main(String[] args) {

        boolean read = true;
        double c = 1;
        Calculate calc = new Calculate();
        UserInput input = new UserInput();
        FormulaParser parser = new FormulaParser(input.userInputFormula());
        Function function = parser.parse();
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
        calc.extremumCalculate(a, b, c, e, function);

    }
}
