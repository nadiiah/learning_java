package com.chapter4;

import java.util.List;

public class ClassAggregation {

    private List<ClassDependency> agg;

    //empty constructor
    public ClassAggregation() { }

    int ClassAggregationMethod() {
        return agg.size();
    }
}
