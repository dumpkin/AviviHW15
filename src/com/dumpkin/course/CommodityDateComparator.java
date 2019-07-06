package com.dumpkin.course;

import java.util.Comparator;

public class CommodityDateComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getExpireDate().compareTo(o2.getExpireDate());
    }
}
