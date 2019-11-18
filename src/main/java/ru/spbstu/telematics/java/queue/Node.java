package ru.spbstu.telematics.java.queue;

class Node<T>
{
    private T item;
    private Node<T> next;
    Node(final T item)
    {
        this.item=item;
    }
    T getItem()
    {
        return item;
    }
    public void setItem(final T item)
    {
        this.item = item;
    }
    void linkNext(final Node<T> next)
    {
        this.next=next;
    }
    Node<T> getNext()
    {
        return next;
    }
}
