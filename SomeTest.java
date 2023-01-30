package com.sample.basicapp.external;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeTest {

    @Test
    public void correctText(){
        Assertions.assertEquals(1,1);
    }

    @Test
    public void  inCorrectTest(){
        Assertions.assertEquals(1,2);
    }


}
