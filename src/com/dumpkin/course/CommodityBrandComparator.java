package com.dumpkin.course;

import java.util.Comparator;

public class CommodityBrandComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
