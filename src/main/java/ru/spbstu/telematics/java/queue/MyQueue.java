package ru.spbstu.telematics.java.queue;

import java.util.Collection;
import java.util.Iterator;

public class MyQueue<T> implements IMyQueue<T>,Iterable<T>
{
    public class MyQueueIterator implements Iterator<T>
    {
        public boolean hasNext() {
            return inNode.getNext()!=null;
        }
        public T next() {
            inNode=inNode.getNext();
            return inNode.getItem();
        }
        public void remove() { }
        MyQueueIterator()
        {
            inNode=new Node<T>(null);
            inNode.linkNext(head);
        }
        private Node<T> inNode;
    }
    public Iterator<T> iterator()
    {
        return new MyQueueIterator();
    }
    public int size()
    {
        return size;
    }
    public boolean contains(T obj)
    {
        for (T item:this)
        {
            if(item.equals(obj))
            {
                return true;
            }
        }
        return false;
    }
    public void push(T obj)
    {
        Node<T> node = new Node<T>(obj);
        if(head==null)
        {
            head=tail=node;
        }
        else
        {
            tail.linkNext(node);
            tail=node;
        }
        ++size;
    }
    public T pop() throws Exception {
        if(head==null)
        {
            return null;
            //throw new Exception("No items in collection!");
        }
        else
        {
            Node<T> tempNode=head;
            head=head.getNext();
            --size;
            return tempNode.getItem();
        }
    }
    MyQueue()
    {
        head=null;
        tail=null;
        size=0;
    }
    MyQueue(Collection<? extends T> collection)
    {
        size=0;
        for(T obj:collection)
        {
            size++;
            push(obj);
        }
    }
    public T get(int index)
    {
        if(index<0||index>=size)
        {
            return null;
        }
        else
        {
            Node<T>p=head;
            for(int i=0;i<index;i++)
            {
                p=p.getNext();
            }
            return p.getItem();
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;
}
