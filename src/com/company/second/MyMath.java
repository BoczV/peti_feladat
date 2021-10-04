package com.company.second;


import java.util.ArrayList;
import java.util.List;

public class MyMath {

    private static Integer getLargestOrSmallest(List<Integer> integerList, String smallestOrLargest){
        Integer result = integerList.get(0);
        for (Integer integer: integerList) {
            if(smallestOrLargest.equals("largest")){
                if(result < integer){
                    result = integer;
                }
            } else if (smallestOrLargest.equals("smallest")){
                if(result > integer){
                    result = integer;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return result;
    }

    public static List<Integer> getLargestAndSmallestFromList(List<Integer> integerList){
        List<Integer> result = new ArrayList<>();
        result.add(getLargestOrSmallest(integerList, "smallest"));
        result.add(getLargestOrSmallest(integerList, "largest"));
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(21);
        arrayList.add(10);
        List<Integer> smallestAndLargest = MyMath.getLargestAndSmallestFromList(arrayList);
        System.out.println(smallestAndLargest);
    }
}