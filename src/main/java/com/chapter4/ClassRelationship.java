package com.chapter4;

public class ClassRelationship extends Object {

    private int number;

    ClassRelationship(int n) {
        number = n;
    }

    protected int getNumber() {
        return number;
    }

    public int incrementNumber() {
        number++;
        return number;
    }
}
