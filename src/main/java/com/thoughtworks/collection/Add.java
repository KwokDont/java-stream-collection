package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        if (leftBorder > rightBorder){
            int temp = rightBorder;
            rightBorder = leftBorder;
            leftBorder = temp;
        }
        //return IntStream.rangeClosed(leftBorder, rightBorder).filter(number -> number % 2 == 0).sum();
        return Stream.iterate(leftBorder, n -> n + 1).limit(rightBorder).filter(number -> number % 2 == 0).reduce(0, Integer::sum);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int min = rightBorder > leftBorder ? leftBorder : rightBorder;
        int max = rightBorder < leftBorder ? leftBorder : rightBorder;

        return IntStream.rangeClosed(min, max).filter(number -> number % 2 == 1).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map( n -> n*3+2).reduce(0,(a,b) -> a+b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num -> num%2 == 1 ? num = num*3+2 : num).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
