package com.chapter4;

public class ClassDependency {

    int new_number;

    ClassDependency(ClassRelationship r1) {
        //new_number = r1.getNumber();
        new_number = r1.incrementNumber();
    }
}
