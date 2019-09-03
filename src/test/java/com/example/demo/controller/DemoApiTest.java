package com.example.demo.controller;

import org.junit.Test;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class DemoApiTest {

    @Test
    public void test() {
        ArrayList<Long> integers = (ArrayList<Long>) Arrays.asList(2L, 3L, 4L, 5L, 6L);
        getNumberOfPairs(5L, integers);

    }

    public void getNumberOfPairs(Long searchedNumber, ArrayList<Long> arrayList) {

        Long[] myList = (Long[]) arrayList.toArray();
        HashMap<Long, ArrayList<Long>> numberIndexesMap = new HashMap<>();
        long index = 0;
        for (Long a : arrayList) {
            ArrayList<Long> indexes = numberIndexesMap.get(a);
            if (indexes == null) {
                indexes = new ArrayList<>();
            }
            indexes.add(index);
            numberIndexesMap.put(a, indexes);
            index++;
        }
        int i = 0;
        int size = numberIndexesMap.size();
        while (i++ < size - 1) {
            Long numberFromMap = myList[i];
            long l = searchedNumber - numberFromMap;
            if (l == 0) {
                numberIndexesMap.get(numberFromMap);
                Pair.of(i, l);
            }
        }
    }

}