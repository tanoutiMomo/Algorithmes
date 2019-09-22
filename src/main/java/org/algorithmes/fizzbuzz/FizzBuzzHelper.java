/*
 * input : number
 * output rules :
 * multiply of 3 --> fizz
 * multiply of 5 --> buzz
 * sinon the given number.
 */

package org.algorithmes.fizzbuzz;

public class FizzBuzzHelper {

    public static String convertToFizzBuzz(final int givenNumber) {
        if( givenNumber % 15 == 0) {
            return "FIZZBUZZ";
        }
        else if(givenNumber % 3 == 0) {
            return "FIZZ";
        }
        else if(givenNumber % 5 == 0) {
            return "BUZZ";
        }
        return String.valueOf(givenNumber);
    }
}
