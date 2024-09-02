package org.example.Stack;

import org.example.LinkedList.LinkedList;

public class Stack<T> extends LinkedList<T> {
    public Stack() {
        super();
    }
    @Override
    public void add(T element) {
        data.add(0, element);
    }

    public boolean empty() {
        return data.isEmpty();
    }

    public void pop() {
        if (!this.empty())
            data.remove(0);
        else
            System.out.println("Stack이 비어있습니다.\n");
    }

    public T top() {
        if (!this.empty())
            return (data.get(0));
        else {
            System.out.println("Stack이 비어있습니다.\n");
            return (null);
        }
    }
}
