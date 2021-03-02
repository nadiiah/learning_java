package com.chapter4;

public class ClassDependency {

    int new_number;

    ClassDependency(ClassRelationship r1) {
        //protected
        new_number = r1.getNumber();
        //public
        new_number = r1.incrementNumber(new_number);
        //default
        new_number = r1.decrementNumber(new_number);
        System.out.println(new_number);
    }
}
