package com.example.partition.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Practitioner {

    public static List<List<Integer>> partition(List<Integer> list, int size) {
        final AtomicInteger counter = new AtomicInteger();
        return new ArrayList<>(
                list.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
                .values()
        );
    }
}
