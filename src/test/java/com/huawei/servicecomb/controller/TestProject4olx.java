package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject4olx {

        Project4olxDelegate project4olxDelegate = new Project4olxDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project4olxDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}