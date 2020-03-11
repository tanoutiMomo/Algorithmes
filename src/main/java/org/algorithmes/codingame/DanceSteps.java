package org.algorithmes.codingame;

public class DanceSteps {

    public int findPosition(int n) {
        int position = 0;
        int step1 = 1;
        position = position + step1;
        n = n - 1;
        int step2 = -2;
        position = position + step2;
        n -= 1;
        while( n > 0 )
        {
            position = position + ( step2 - step1 );
            int buffer = step1;
            step1 = step2;
            step2 = step2 - buffer;
            n -= 1;
        }
        return position;
    }

}
