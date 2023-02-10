package com.sample.basicapp.external;

import com.sample.basicapp.testprinter.Position;
import com.sample.basicapp.testprinter.TestPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SomeTest {

    static TestPrinter testPrinter ;

    @BeforeAll
    public static void initAll(){
        testPrinter = new TestPrinter();
    }


    @Test
    public void correctText(){
        testPrinter.print(()->{
            Assertions.assertEquals(1,2);
        },2, Position.JUNIOR);
    }


    @Test
    public void correctTest(){
        testPrinter.print(()->{
            Assertions.assertEquals(1,2);
        },2, Position.JUNIOR);
    }




}
