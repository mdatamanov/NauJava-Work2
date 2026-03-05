package ru.atamanov.work2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2ArraySort {
    public static void main() {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(3.5, 2.2, 3.6, 4.2));
        System.out.println(array);
        ArrayList<Double> array2 = selectionSort(array);
        System.out.println(array2);
    }

    private static void swap(ArrayList<Double> arrayList, int ind1, int ind2){
        double temp = arrayList.get(ind1);
        arrayList.set(ind1, arrayList.get(ind2));
        arrayList.set(ind2, temp);
    }

    public static ArrayList<Double> selectionSort(ArrayList<Double> arrayList){
        for(int left = 0; left < arrayList.size(); left++){
            int minInd = left;
            for(int i = left; i < arrayList.size(); i++){
                if(arrayList.get(i)<arrayList.get(minInd)){
                    minInd = i;
                }
            }
            swap(arrayList, left, minInd);

        }
        return arrayList;
    }
}
