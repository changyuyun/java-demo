package study.demo.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import study.demo.demo24_junit.Calculator;

public class CalculatorTest {
    //初始化方法
    @Before
    public void init() {
        System.out.println("init.....");
    }
    @After
    public void close() {
        System.out.println("close....");
    }
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int res = c.add(1,2);
        // System.out.println(res);
        //断言
        Assert.assertEquals(3, res);
    }
    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int res = c.sub(1,2);
        // System.out.println(res);
        //断言
        Assert.assertEquals(-1, res);
    }
}
