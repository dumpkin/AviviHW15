package com.dumpkin.course;

import java.util.Comparator;

public class CommodityTypeComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getTypeOfProduct().compareTo(o2.getTypeOfProduct());
    }
}
