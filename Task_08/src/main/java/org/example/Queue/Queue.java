package org.example.Queue;

import org.example.LinkedList.LinkedList;

public class Queue<T> extends LinkedList<T> {
    public Queue() {
        super();
    }

    public boolean empty() {
        return (data.isEmpty());
    }

    public void pop() {

        if (!this.empty())
            data.remove(0);
        else
            System.out.println("Queue가 비어있습니다.\n");
    }

    public T front() {
        if (!this.empty())
            return (data.get(0));
        return (null);
    }
}
