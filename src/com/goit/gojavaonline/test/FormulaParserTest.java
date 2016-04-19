package com.goit.gojavaonline.test;


import com.goit.gojavaonline.FormulaParser;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;




public class FormulaParserTest {


    @Test
   public void testParseFormulaTextIntoBlocks() throws Exception {
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("[{-1, NUMBER}, {*, OPERATOR}, {5, NUMBER}, {*, OPERATOR}, {x, OTHER}, {+, OPERATOR}, {2, NUMBER}, {*, OPERATOR}, {x, OTHER}]");
        expectedList.add("[{12, NUMBER}, {*, OPERATOR}, {x, OTHER}, {-, OPERATOR}, {x, OTHER}, {^, OPERATOR}, {2, NUMBER}]");
        ArrayList<String> userInput = new ArrayList<>();
        userInput.add("-5*x +2*x");
        userInput.add("12*x-x^2");
        int i = 0;
        for(String s : userInput) {
            FormulaParser formulaParser = new FormulaParser(s);
            formulaParser.parseFormulaTextIntoBlocks();
            Assert.assertEquals(expectedList.get(i).toString(), formulaParser.getParsedFormulaText().toString());
            i++;
        }
    }

    @Test
   public void testConvertParsedTextIntoFormulaElements() throws Exception {

    }

    @Test
    public void testConvertFormulaToRPN() throws Exception {

    }
}