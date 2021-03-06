package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void fooBarIfCaseReturnsRightString() {

        FooBar testFoo = new FooBarIfCase();
        //Выполнение метода при n = 5
        String resultString = testFoo.FooBar(5);
        //Правильный результат выполнения
        String rightResult = "1 2 Foo 4 Bar ";

        Assert.assertEquals(resultString, rightResult);
    }

    @Test
    public void fooBarReturnsInputMessage() {

        FooBar testFoo = new FooBarSwitch();
        // Ввод числа меньше или равного нулю, что не соответствует условиям задачи
        String resultString = testFoo.FooBar(-1);
        //Предполагаемый ответ от метода
        String rightResult = "Ввоимое число меньше или равно нулю";

        Assert.assertEquals(resultString, rightResult);

    }
    @Test
    public void fooBarRecursionTest(){
        FooBar testFoo = new FooBarRecursion();
        String resultString = testFoo.FooBar(15);
        String rightResult = "1 2 Foo 4 Bar Foo 7 8 Foo Bar 11 Foo 13 14 FooBar ";
        Assert.assertEquals(resultString, rightResult);
    }
    @Test
    public void fooBarMinimumBranchesTestReturnRightString(){
        FooBar testFoo = new FooBarMinimumBranches();
        String resultString = testFoo.FooBar(13);
        String rightResult = "1 2 Foo 4 Bar Foo 7 8 Foo Bar 11 Foo 13 ";
        Assert.assertEquals(resultString,rightResult);
    }
    @Test
    public void fooBarSwitchTestReturnRightString(){
        FooBar testFoo = new FooBarSwitch();
        String resultString = testFoo.FooBar(20);
        String rightResult = "1 2 Foo 4 Bar Foo 7 8 Foo Bar 11 Foo 13 14 FooBar 16 17 Foo 19 Bar ";
        Assert.assertEquals(resultString,rightResult);
    }
}
