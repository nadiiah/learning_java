package com.chapter4;

public class ClassRelationship extends Object {

    private int number;

    public ClassRelationship(int n) {
        number = n;
    }

    protected int getNumber() {
        return number;
    }

    int decrementNumber(int n) {
        n--;
        return n;
    }

    public int incrementNumber(int n) {
        n++;
        return n;
    }
}
