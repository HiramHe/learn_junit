package cn.edu.hust;

import org.junit.Assert;
import org.junit.Test;

public class Calculator_01_Test {

    @Test
    public void testAdd(){
        Calculator_01 calculator=new Calculator_01();
        int result=calculator.add(2,3);

        Assert.assertEquals(5,result);
    }

    @Test
    public void testSubstract(){
        Calculator_01 calculator=new Calculator_01();
        int result=calculator.substract(2,3);

        Assert.assertEquals(-1,result);
    }
}
