package org.algorithmes.codingame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzHelperTest {

    @Test
    public void should_return_string(){
        //given
        final int givenNumber = 1;
        final String expectedResult = "1";
        //when
        final String actualResult = FizzBuzzHelper.convertToFizzBuzz(givenNumber);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_Fizz(){
        //given
        final int givenNumber = 3;
        final String expectedResult = "FIZZ";
        //when
        final String actualResult = FizzBuzzHelper.convertToFizzBuzz(givenNumber);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_BUZZ(){
        //given
        final int givenNumber = 5;
        final String expectedResult = "BUZZ";
        //when
        final String actualResult = FizzBuzzHelper.convertToFizzBuzz(givenNumber);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void should_return_FIZZBUZZ(){
        //given
        final int givenNumber = 15;
        final String expectedResult = "FIZZBUZZ";
        //when
        final String actualResult = FizzBuzzHelper.convertToFizzBuzz(givenNumber);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
