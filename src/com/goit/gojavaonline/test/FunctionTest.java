package com.goit.gojavaonline.test;

import com.goit.gojavaonline.FormulaParser;
import com.goit.gojavaonline.Function;
import com.goit.gojavaonline.UserInput;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class FunctionTest {
    Function function = new Function();



    @Test (expected = UnsupportedOperationException.class )
    public void testCalculateException() throws Exception {
        function.calculate();

    }

    @Test
    public void testCalculate() throws Exception {

        FormulaParser parser = new FormulaParser("x*2");
        Function function = parser.parse();
        function.setX(5);
        double expectedResult = 10.0;

        double result = function.calculate();
        Assert.assertEquals(expectedResult, result);
    }
}