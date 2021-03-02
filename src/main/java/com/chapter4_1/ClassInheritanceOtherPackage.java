package com.chapter4_1;

import com.chapter4.ClassAggregation;
import com.chapter4.ClassRelationship;

public class ClassInheritanceOtherPackage extends ClassRelationship {

    ClassInheritanceOtherPackage(int n) {
        super(n);
    }

    //Impossible to create an object without parameters if constructor has parameters
    ClassAggregation a1 = new ClassAggregation();
    ClassRelationship r2 = new ClassRelationship(100500);

    public void useParentMethod() {
        int new_num = getNumber();
        new_num = incrementNumber(new_num);
        //Try to call method with default access modifier
        //new_num = decrementNumber(new_num);
        System.out.println(new_num);
    }
}
