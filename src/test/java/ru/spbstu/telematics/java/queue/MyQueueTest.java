package ru.spbstu.telematics.java.queue;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class MyQueueTest
{
    @Test
    public void test_push_pop() throws Exception
    {
        MyQueue<Integer>a=new MyQueue<Integer>();
        ArrayList<Integer>b=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            a.push(i);
            b.add(i);
        }
        for(int i=0;i<10;i++)
        {
            Assert.assertEquals(b.get(i),a.pop());
        }
        Assert.assertNull(a.pop());
    }
    @Test
    public void test_iterator() throws Exception
    {
        MyQueue<Integer>a=new MyQueue<Integer>();
        ArrayList<Integer>b=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            a.push(i);
            b.add(i);
        }
        int n=0;
        for (int i:a)
        {
            Assert.assertEquals(i, (int) b.get(n));
            n++;
        }
    }
    @Test
    public void test_size() throws Exception
    {
        MyQueue<Integer>a=new MyQueue<Integer>();
        for(int i=0;i<10;i++)
        {
            a.push(i);
        }
        Assert.assertEquals(10, a.size());
    }
    @Test
    public void test_contains() throws Exception
    {
        MyQueue<Integer>a=new MyQueue<Integer>();
        for(int i=0;i<10;i++)
        {
            a.push(i);
        }
        for(int i=0;i<10;i++)
        {
            Assert.assertTrue(a.contains(i));
        }
        Assert.assertFalse(a.contains(10));
    }
    @Test
    public void test_constructor() throws Exception
    {
        ArrayList<Integer>b=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            b.add(i);
        }
        MyQueue<Integer>a=new MyQueue<>(b);
        for(int i=0;i<10;i++)
        {
            Assert.assertEquals(a.pop(),b.get(i));
        }
    }
}
