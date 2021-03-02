package com.chapter4;

public class ClassInheritence extends ClassRelationship {

    ClassInheritence(int n) {
        super(n);
    }

    int MultipleNumber (int mult){
        return getNumber()*mult;
    }
}
