package com.design.behavior.strategy.comparator;

import java.util.Comparator;

public class CompareItemNameComparator implements Comparator<CompareItem> {
    @Override
    public int compare(CompareItem o1, CompareItem o2) {
        return o1.name.length()-o2.name.length();
    }
}
