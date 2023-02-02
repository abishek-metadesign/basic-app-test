package com.sample.basicapp.external;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

public class SomeTest {

    @Test
    @Tags({@Tag("position=senior"),
            @Tag("points=3"),
            @Tag("name=This_is_a_test")})
    public void correctText(){
        Assertions.assertEquals(1,1);
    }

    @Test
    @Tags({@Tag("position=senior"),
            @Tag("points=3"),
            @Tag("name=This_is_a_test")})
    public void  inCorrectTest(){
        Assertions.assertEquals(1,2);
    }


}
