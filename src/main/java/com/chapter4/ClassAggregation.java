package com.chapter4;

import java.util.List;

public class ClassAggregation {

    private List<ClassDependency> agg;

    int ClassAggregation() {
        return agg.size();
    }
}
