package com.goit.gojavaonline;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

    public double userInput(){
        boolean read = true;
        double userVariable = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(read) {

            try {
                userVariable = Double.parseDouble(reader.readLine());
                read = false;
            } catch (Exception e1) {
                System.out.println("Variable should be number. " + e1);
                read = true;
            }
        }
        return userVariable;
    }

    public String userInputFormula(){
        String formula = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter formula");
        try{
            formula = reader.readLine();
        }
        catch (Exception e){
            System.out.println("Something wrong" +e);
        }
        return formula;
    }
}
