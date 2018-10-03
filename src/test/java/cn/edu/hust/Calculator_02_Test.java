package cn.edu.hust;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calculator_02_Test {

    Calculator_02 calculator;

    //每次执行一个测试方法前，都重新初始化对象
    @Before
    public void setUp(){
        System.out.println("init");
        calculator=new Calculator_02();
    }
    @Test
    public void testAdd(){
        int result=calculator.add(2,3);

        Assert.assertEquals(5,result);
    }

    @Test
    public void testSubstract(){
        int result=calculator.substract(2,3);

        Assert.assertEquals(-1,result);
    }

    //清理动作
    @After
    public void clear(){
        System.out.println("clear");
    }
}
