package ru.mirea.practice.n1to3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listing implements Iterable<Integer> {
    private final List<Integer> list;

    public Listing(List<Integer> lst) {

        list = new ArrayList<>(lst);
    }

    @Override
    public Iterator<Integer> iterator() {

        return new ListingIterator(list);
    }
}
