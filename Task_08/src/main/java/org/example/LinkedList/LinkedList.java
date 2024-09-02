package org.example.LinkedList;

import org.example.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements List<T>, Iterable<T>, Iterator<T> {
    protected ArrayList<T> data;
    protected Iterator<T> iterator;

    public LinkedList() {
        this.data = new ArrayList<>();
        this.iterator = iterator();
    }

    @Override
    public void add(T element) {
        data.add(element);
    }

    @Override
    public T get(int i) {
        return (data.get(i));
    }

    @Override
    public void delete(int i) {
        data.remove(i);
    }

    @Override
    public Iterator<T> iterator() {
        return (data.iterator());
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public boolean hasNext() {
        return (iterator.hasNext());
    }

    @Override
    public T next() {
        return (iterator.next());
    }

}
