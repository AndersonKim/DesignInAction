package com.design.behavior.strategy.comparator;

import java.util.Comparator;

public class CompareItemNumComparator implements Comparator<CompareItem> {
    @Override
    public int compare(CompareItem o1, CompareItem o2) {
        return o1.num-o2.num;
    }
}
