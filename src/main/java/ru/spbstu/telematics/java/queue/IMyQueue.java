package ru.spbstu.telematics.java.queue;

public interface IMyQueue<T>
{
    int size();
    boolean contains(T obj);
    void push(T obj);
    T pop() throws Exception;
}