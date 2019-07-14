package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        return IntStream.rangeClosed(min, max)
                .boxed()
                .filter(num -> num >= min && num <= max)
                .sorted((i, j) -> left < right ? i - j : j - i)
                .collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        return IntStream.rangeClosed(min, max)
                .boxed()
                .filter(num -> num >= min && num <= max && num % 2 == 0)
                .sorted((i, j) -> left < right ? i - j : j - i)
                .collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array)
                .reduce((now,then) -> then)
                .getAsInt();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
